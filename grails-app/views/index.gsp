<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Plato</title>
</head>
<body>

<div id="content" role="main">
    <div class="container">
        <section class="row colset-2-its">
        <h1>Der Politiker</h1>
        <h1>Verpflichtet der Idee des Guten</h1>

        <p>
            Glückwunsch, Sie haben erfolgreich die πολιτεια Anwendung aufgerufen. Starten Sie mit dem Anzeigen der Liste bereits angelegter <g:link controller="Politiker">Politiker</g:link>, schauen Sie sich einzelne Politiker durch
            Klick in der entsprechenden Zeile an und schauen sein Regierungsprogramm durch Klick auf die entsprechende Schaltfläche an. Weiterhin sind Schaltflächen für Anlegen, Bearbeiten und Löschen eines Politikers vorgesehen.
        </p>
        <p>
            Zum technischen Background: Die Anwendung ist in Groovy, einem Java Dialekt und als solchem in einer objektorientierten Programmiersprache, geschrieben.
            Diese erlaubt nicht nur <a href="https://groovy-lang.org/objectorientation.html#_normal_class" target="_blank">instantiierbare</a>
            sondern auch <a href="https://info.johpie.de/stufe_q1/ib_abstrakte_klassen_groovy.pdf" target="_blank">abstrakte Klasssen</a>
            zu schreiben. Abstrakte Klassen modellieren allgemeine Konzepte: Freiheit, Gleichheit, Brüderlichkeit. In der vorliegenden Anwendung ist die abstrakte
            Klasse <a href="https://github.com/pstrotmann/goodAsSuch/blob/master/src/main/groovy/goodassuch/dasGute.groovy" target="_blank">dasGute</a> die zentrale Klasse.
            Diese erfüllt alles Gute, ausgedrückt durch die Java Klausel "implements", siehe lat. impleo. Damit kann sie alle guten Eigenschaften vererben.
            Die instantiierbare Klasse <a href="https://github.com/pstrotmann/goodAsSuch/blob/master/grails-app/domain/goodassuch/Politiker.groovy" target="_blank">Politiker</a> erbt
            diese Eigenschaften, z.B.: Gerechtigkeit, Barmherzigkeit, Weisheit, hier wieder ausgedrückt durch "implements". Instanzen von Politikern sind veränderlich, im Gegensatz zu der im Programm ewigen unveränderlichen abstrakten Klasse dasGute.
            Für die Instanz eines Politikers bedeutet veränderlich CRUD Funktionalität. Dabei steht das C für Create also das Entstehen, R für Retrieve, das Wahrnehmen, U für Update, die Veränderung und D für Delete, das Vergehen.
        </p>
        </section>
    </div>
</div>
</body>
</html>
