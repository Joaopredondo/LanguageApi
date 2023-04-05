# LanguageApi

Através desse projeto foi possível criar uma api mostrando as principais linguagens utilizadas, onde é retornado um JSON com o nome da linguagem, imagem da logo e o ranking dela. Também foi criado o metodo post para adicionar novas linguagens e o delete para excluir.

Os dados das linguagens utilizadas foram guardadas no MongoDb, onde dessa forma foi retirados os dados do codigo e colocados o mesmo no mongo via cloud. 

Foi possivel também via docker e Fly publicar a api na cloud, onde a mesma pode ser acessada através do link: 
- https://language-api.fly.dev/languages
