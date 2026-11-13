# Java File Organizer

This project is a Java-based file management utility that organizes files from a selected folder into category-based subfolders.

## Overview

The program scans a specified directory and moves files into subfolders depending on their extension. It helps keep folders clean and structured by grouping files like images, PDFs, videos, and text documents.

## Supported File Types

- `.jpg` / `.jpeg` -> `IMAGE`
- `.pdf` -> `PDF`
- `.mp4` -> `VIDEO`
- `.txt` -> `TXT`

## How it Works

1. The program takes a folder path from the code.
2. It checks whether the folder exists.
3. It lists all files inside the folder.
4. Based on each file's extension, it decides which category folder to place it in.
5. If the destination folder does not exist, it creates it automatically.
6. The file is then moved into the matching folder.

## Example

If a directory contains:

- `photo.jpg`
- `report.pdf`
- `video.mp4`
- `notes.txt`

The program will organize them into:

```text
MyDocument/
├── IMAGE/
│   └── photo.jpg
├── PDF/
│   └── report.pdf
├── VIDEO/
│   └── video.mp4
├── TXT/
│   └── notes.txt
```

## Project File

- `SortFile.java` - Main Java program

## Requirements

- Java JDK installed
- A valid folder path configured in the code

## Run the Program

```bash
javac SortFile.java
java SortFile
```

## Important Note

Update the following line in `SortFile.java` to point to the folder you want to organize:

```java
String folderPath = "C:\\Users\\Harsh\\OneDrive\\Documents\\My document";
```

This project is a simple example of file-system handling in Java using `File`, `Files`, and directory operations.
