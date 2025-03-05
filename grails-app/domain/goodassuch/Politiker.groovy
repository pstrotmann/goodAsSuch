package goodassuch

class Politiker extends dasGute implements dieBarmherzigkeit, dieGerechtigkeit, dieWeisheit
{
    String name
    String geburtsort
    String geschlecht
    String ausbildung
    String herkunft

    def String [] regierungsprogramm() {
        def regPgm = []
        if (geschlecht =="f"){
            regPgm << handleBarmherzig()
            regPgm << handleGerecht()
            regPgm << handleWeise()
        }
        else {
            if (herkunft == "Sklave")
                regPgm << handleBarmherzig()
            if (herkunft == "Bürger")
                regPgm << handleGerecht()
            if (herkunft == "Adel")
                regPgm << handleWeise()
            }
        regPgm
    }

    def String handleBarmherzig() {
        return "Ich baue einen Sozialstaat auf. "
    }

    def String handleGerecht() {
        return "Ich erlasse gerechte Gesetze und sorge für Ihre Einhaltung. "
    }

    def String handleWeise() {
        return "Ich denke nach bevor ich handle und lasse mich beraten. "
    }

    static constraints = {
        name size: 5..25, matches: "[a-zA-Z]+"
        geburtsort inList: ['Athen','Sparta','Delphi','Kreta']
        geschlecht inList: ['m','f','d']
        ausbildung inList: ['Philosoph']
        herkunft inList: ['Sklave','Bürger','Adel']
    }
}
