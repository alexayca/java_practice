To the right of the text ‘Enter text:’ is an editable area where the user can enter or change text. If one clicks on the button ‘Analyse’ then a small analysis of the text is performed and the result is displayed in the following way. The text is converted to capital letters and copied into the area to the right of ‘Current text:’. The number of occurrences of the letter ‘E’ in upper or lower case is displayed to the right of ‘No. of Es in current text:’. At the same time the content of the user editable area is erased.

```mermaid
classDiagram

TextAnalysisFrame --|> SimpleFrame
TextAnalysisFrame --> BorderLayout
TextAnalysisFrame --> JButton
TextAnalysisFrame -->TextAnalysisListener

TextAnalysisPanel --|> JPanel
TextAnalysisPanel --> JLabel
TextAnalysisPanel --> JTextField
TextAnalysisPanel --> TextAnalysisModel

TextAnalysisListener ..|> ActionListener
TextAnalysisListener --> TextAnalysisPanel
TextAnalysisListener --> ActionEvent

TextAnalysisDriver --> TextAnalysisFrame
TextAnalysisModel --> TextAnalyisModelTest


class SimpleFrame{
    +showIt()
}

class ActionListener
<<interface>> ActionListener

class TextAnalysisDriver{
    main(String[] )$
}

class TextAnalysisFrame{
    +TextAnalysisFrame()
}

class TextAnalysisListener{
    - TextAnalysisPanel taPanel
    +TextAnalysisListener()
    +actionPerformed(ActionEvent)
}

class TextAnalysisModel
TextAnalysisModel : - int totalNumberOfEs
TextAnalysisModel : - int currentNumberOfEs
TextAnalysisModel : - int totalNumberOfTexts
TextAnalysisModel : - String currentText
TextAnalysisModel : + TextAnalysisModel()
TextAnalysisModel : + analyse(String) void
TextAnalysisModel : + getCurrentNumberOfEs() int
TextAnalysisModel : + getCurrentText() String
TextAnalysisModel : + getTotalNumberOfEs() int
TextAnalysisModel : + getTotalNumberOfTexts() int

class TextAnalyisModelTest

class TextAnalysisPanel{
     -JLabel lastTextLabel
     -JLabel numberOfEsLabel
     -JLabel numberOfTextsLabel
     -JTextField inputField
     -TextAnalysisModel analysisModel
     +TextAnalysisPanel()
     +startAnalysisAndDisplayResult()
}

```

