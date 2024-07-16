CONVERSOR DE DIVISAS

Este es un nuevo desafío que nos trae Alura Latam y Oracle Next Education para poner en practica los conocimientos adquiridos en el curso Java Orientado a Objetos.

Usamos lo visto acerca de Java orientado a Objetos, listas y colecciones de datos, consumo de APIs, todo para desarrollar una aplicación que pueda
convertir diversas divisas predeterminadas (USD, MXN, JPY, KRW, GBP, RUB), y también cualquier divisa que se necesite, simplemente proporcionando el
código de la divisa que se requiera (las tres letras distintivas, por ejemplo MXN), y el código de la divisa equivalente. 

Para su desarrollo utilicé
Java 22
IntelliJ IDEA
ExangeRate API
Librería Gson

El proyecto se compone de tres clases
Principal  donde se hacen los test y se presenta el menú de opciones de las diversas divisas a convertir
ConsultaDeDivisas  en la cual se utiliza el 
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("http://foo.com/"))
      .build();
para realizar la solicitud HTTP a la API de Exange Rate y obtener las tasas de cambio actualzadas al día de hoy, 
para poder realizar el cambio de divisas que el usuario requiera. 
ConversorDeDivisas  clase que se encarga de todos los cálculos matemáticos de la conversión de divisas.
Divisas  que es un Record en el cual se guardan los datos de las tasas de cambios que se obtienen de la API ExangeRate.
