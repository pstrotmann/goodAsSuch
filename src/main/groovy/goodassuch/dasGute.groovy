package goodassuch

abstract class dasGute implements allesGute
{
    String wert = "das höchste Ziel"
    String [] gleichnisse = ['Linie','Sonne','Höhle']
    String [] propheten = ['Platon','Sokrates','Jesus','Buddah']

    def Boolean binMaßstabDesGuten() {
        println("Bin Maßstab des Guten.")
        return true
    }
}
