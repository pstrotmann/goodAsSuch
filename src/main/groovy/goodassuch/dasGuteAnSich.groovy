package goodassuch

abstract class dasGuteAnSich implements allesGute
{
    String wert = "das höchste Ziel"
    String [] gleichnisse = ['Linie','Sonne','Höhle']
    String [] verkünder = ['Platon','Sokrates','Jesus','Buddah']

    def Boolean binMaßstabDesGuten() {
        println("Bin Maßstab des Guten.")
        return true
    }
}
