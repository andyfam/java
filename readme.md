# I/O

## Byte Stream

1. Always remember to close the Streams, so the best practises is to put the `close code` in final block, because the input or output file may not be opened correctly, so check if the references is null before close the streams.
2. Use Byte Stream only for primitive I/O, better to use more specific class (e.g. use character stream for .txt files).