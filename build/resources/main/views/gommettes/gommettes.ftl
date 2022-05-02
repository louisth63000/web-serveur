<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list Gommettes as gommette>
        <li>${gommette.id} - ${gommette.description} ${gommette.couleur}</li>
        <form action="/gommettes/:id" method="post">
        <input type="hidden" value="${gommette.id}" name="id">
        <input type="hidden" value="${gommette.description}" name="description">
        <input type="hidden" value="${gommette.couleur}" name="couleur">
        <input type="submit" >
        </form>
    </#list>
</ul>
<h1>Ajout de gommette</h1>
<form action="/gommettes" method="post">
    <label for="name">Nom :</label>
    <input type="text" name="nom">
    <label for="name">Description :</label>
    <input type="text" name="description">
    <input type="submit" >
</form>

</body>

</html>
