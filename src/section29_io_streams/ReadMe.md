# InputStream Class
This abstract class is the superclass of all classes representing an input stream of bytes.


## Known Implementation Class
1. FileInputStream
2. BufferedInputStream

# InputStream Methods


### Method And Their Description

Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking by the next invocation of a method for this input stream.
```java
int read(); 
```

Reads some number of bytes from the input stream and stores them into the buffer array b.
```java
int read(byte[] b); 
```


Reads up to len bytes of data from the input stream into an array of bytes.
```java
read(byte[] b, int off, int len);
```

Closes this input stream and releases any system resources associated with the stream.
```java
void close(); 
```

Closes this input stream and releases any system resources associated with the stream.
```java
void close(); 
```