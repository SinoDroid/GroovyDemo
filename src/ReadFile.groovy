//
// Groovy

import java.io.File

new File("resources/text.txt").eachLine { line ->
    println "${line}"
}

new File("resources/text.txt").withPrintWriter { printWriter ->
    printWriter.println('The first content of file')
}

new File("resources/text.txt").withWriterAppend { writerAppender ->
    writerAppender.println 'a line'
}
