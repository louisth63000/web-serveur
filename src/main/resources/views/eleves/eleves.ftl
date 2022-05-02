<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list Eleves as eleve>
        <li>${eleve.id} - ${eleve.nom} ${eleve.prenom} -${eleve.datedenaissance} -${eleve.classe}</li>
    </#list>
</ul>

</body>

</html>
