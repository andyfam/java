# I/O

## Byte Stream

1. Always remember to close the Streams, so the best practises is to put the `close code` in final block, because the input or output file may not be opened correctly, so check if the references is null before close the streams.
2. Use Byte Stream only for primitive I/O, better to use more specific class (e.g. use character stream for .txt files).

## Character Stream

1. If you want to read or write characters other than bytes, the best stream to use is Character Stream which can transfer the underlying bytes to or from  the local character sets.
2. There are general-purpose Character Streams, InputStreamReader and OutputStreamWriter, which could be used in socket scinario, and also specific ones like FileReader and FileWriter used for file formats.
3. For line-oriented purpose, we can use BufferedReader and PrintWriter.

## Buffered Stream

1. Unbuffered I/O triggers disk access, network activities for every read or write operation which cost expensively.
2. Buffered I/O Streams read or write data through memory and the native operation only be triggered when the memory is empty or full.

## Scanning and Formatting

1. Sometimes we need to break the input into tokens or output something with specific format, this is the place where the Scanning and Formatting kick in.
2. By default, scanner uses white space (e.g. blank, tab, line termination) to separate tokens.
3. Sometimes, we need identify individual tokens, like numerics, scanner supporting identifying all numeric formats, but we need to specify the `local`.