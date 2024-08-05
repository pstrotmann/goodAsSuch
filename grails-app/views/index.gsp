<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Plato</title>
</head>
<body>
<%--
<content tag="nav">
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Application Status <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Environment: ${grails.util.Environment.current.name}</a></li>
            <li class="dropdown-item"><a href="#">App profile: ${grailsApplication.config.getProperty('grails.profile')}</a></li>
            <li class="dropdown-item"><a href="#">App version:
                <g:meta name="info.app.version"/></a>
            </li>
            <li role="separator" class="dropdown-divider"></li>
            <li class="dropdown-item"><a href="#">Grails version:
                <g:meta name="info.app.grailsVersion"/></a>
            </li>
            <li class="dropdown-item"><a href="#">Groovy version: ${GroovySystem.getVersion()}</a></li>
            <li class="dropdown-item"><a href="#">JVM version: ${System.getProperty('java.version')}</a></li>
            <li role="separator" class="dropdown-divider"></li>
            <li class="dropdown-item"><a href="#">Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Artefacts <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Controllers: ${grailsApplication.controllerClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Domains: ${grailsApplication.domainClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Services: ${grailsApplication.serviceClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Tag Libraries: ${grailsApplication.tagLibClasses.size()}</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
        <ul class="dropdown-menu dropdown-menu-right">
            <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                <li class="dropdown-item"><a href="#">${plugin.name} - ${plugin.version}</a></li>
            </g:each>
        </ul>
    </li>
</content>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
    </div>
</div>
--%>
<div id="content" role="main">
    <div class="container">
        <section class="row colset-2-its">
        <h1>Der Politiker verpflichtet der Idee des Guten</h1>

        <p>
            Glückwunsch, Sie haben erfolgreich die πολιτεια Anwendung aufgerufen. Starten Sie mit dem anlegen eines <g:link controller="Politiker">Politikers</g:link> und schauen Sie was passiert.
        </p>
        <p>
            Zum technischen Background: Die Anwendung ist in Java, einer objektorientierten Programmiersprache, geschrieben. Diese erlaubt sowohl abstrakte Klasssen als auch instantiierbare
            Klassen zu implementieren. Abstrakte Klassen werden dazu verwendet, allgemeine Konzepte zu modellieren: Freiheit, Gleichheit, Brüderlichkeit. In der vorliegenden Anwendung ist die abstrakte
            Klasse <a href="https://github.com/pstrotmann/goodAsSuch/blob/master/src/main/groovy/goodassuch/dasGuteAnSich.groovy" target="_blank">dasGuteAnSich</a> implementiert. Diese erfüllt alles Gute, ausgedrückt durch die Java Klausel implements, siehe lat. impleo. Damit kann sie alle guten Eigenschaften vererben. Die instantiierbare Klasse Politiker erbt
            diese Eigenschaften, z.B.: Gerechtigkeit, Barmherzigkeit, Weisheit. Instanzen von Politiker sind veränderlich, im Gegensatz zu im Programm ewigen unveränderlichen abstrakten Klassen. Für die Instanz eines Politikers
            bedeutet veränderlich CRUD Funktionalität. Dabei steht das C für Create also das Entstehen, R für Retrieve, das Wahrnehmen, U für Update, die Veränderung und D für Delete, das Vergehen.
        </p>
        </section>
    </div>
</div>
</body>
</html>
