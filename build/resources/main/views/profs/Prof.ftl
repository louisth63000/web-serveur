<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list Profs as prof>
        <li>${prof.id} - ${prof.prenom} ${prof.nom}</li>
    </#list>
</ul>
</body>

</html>
 
