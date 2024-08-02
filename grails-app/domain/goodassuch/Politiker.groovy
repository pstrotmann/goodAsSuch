package goodassuch

class Politiker implements dieBarmherzigkeit, dieGerechtigkeit, dieWeisheit
{
    String name
    String geburtsort
    String geschlecht
    String ausbildung
    String herkunft

    def regierungsprogramm() {
        println("Mein Regierungsprogramm:")

        if (geschlecht =="f"){
            handleBarmherzig()
            handleGerecht()
            handleWeise()
        }
        else {
            if (herkunft == "Sklave")
                handleBarmherzig()
            if (herkunft == "Bürger")
                handleGerecht()
            if (herkunft == "Adel")
                handleWeise()
            }
    }

    def handleBarmherzig() {
        println("Ich baue einen Sozialstaat auf.")
    }

    def handleGerecht() {
        println("Ich erlasse gerechte Gesetze und sorge für Ihre Einhaltung.")
    }

    def handleWeise() {
        println("Ich denke nach bevor ich handle und lasse mich beraten.")

    }

    static constraints = {
        name size: 5..25, matches: "[a-zA-Z]+"
        geburtsort inList: ['Athen','Sparta','Delphi','Kreta']
        geschlecht inList: ['m','f']
        ausbildung inList: ['Philosoph']
        herkunft inList: ['Sklave','Bürger','Adel']
    }
}
