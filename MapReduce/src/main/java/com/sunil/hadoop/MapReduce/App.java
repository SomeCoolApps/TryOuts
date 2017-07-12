package com.sunil.hadoop.MapReduce;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocalFileSystem;
import org.apache.hadoop.fs.Path;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		String hdfsBasePath = "hdfs://localhost:9000/user/home_comp";

		System.out.println("Hello World!");

		Configuration conf = new Configuration(true);

		conf.set("fs.default.name", "hdfs://localhost:9000");

		FileSystem hdfs = FileSystem.get(conf);
		URI uri = URI.create(hdfsBasePath + "/test.txt");

		Path path = new Path(uri);

		FSDataInputStream readFile = hdfs.open(path);

		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		byte[] b = new byte[1];
		while (readFile.read(b) != -1) {
			bo.write(b);
		}
		System.out.println(new String(bo.toByteArray()));

		// Path d= new Path("");
		// hdfs.open(d);

		// public FSDataOutputStream create(Path f) create empty file.
		// public FSDataOutputStream append(Path f) will append existing file

		uri = URI.create(hdfsBasePath + "test.ini");
		// Configuration conf = new Configuration ();
		FileSystem file = FileSystem.get(uri, conf);
		FSDataOutputStream in = file.create(new Path(uri));
		in.close();

		LocalFileSystem lfs = hdfs.getLocal(conf);

	}
}
