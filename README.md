# Taskexecution
ЧТОБЫ СКАЧАТЬ С ГИТХАБА ПРОЕКТ:
	Нажмите кнопку "Clone or download" и выберете подходящий вариант (например скачать ZIP архив).
	
ПОСЛЕ СКАЧКИ: 
	Разархивируйте архив в удобную вам папку.
Запускаете Eclipse и импортируете проект через вкладку File -> Import -> General -> Existing Projects into Worcspace
После импорта вы должны видеть папку проекта в эклипсе. 
Делаем следующее: ПКМ по основной папке проекта -> Build Path -> Configure Build Path...
В открывшемся окне выбираем вкладку Libraries, в ней нужно настроить пути до библиотек с помощью кнопки Edit...
Далее в проекте находим файл build.properties в котором для переменной appserver.home нужно указать путь до вашего сервера.

НАСТРОЙКА СЕРВЕРА TOMCAT:
	Во вкладке Servers добавьте свой сервер: ПКМ по пустому месту -> New -> Server (У меня стоял Tomcat v8.0)
Если вкладки Servers нет то добавим ее при помощи верхнего меню: Windows -> Show View -> Servers
После добавления вашего сервера в список:
ПКМ по серверу -> Add end Remove 
В окне выбираем Remove All (если активна).
Двойной щелчок ЛКМ по серверу -> в окне во вкладке Server Locations выбираем пункт Use Tomcat installation
В этой же вкладке в пункте Server path должен стоять тот же путь что вы указали в build.properties для переменной appserver.home
Далее заходим в папку с вашим Tomcat -> conf -> tomcat-users.xml -> Между тегами <tomcat-users> укажите следующее:

  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <role rolename="manager-jmx"/>
  <role rolename="manager-status"/>
  
  <user password="s3cret" roles="manager-script" username="tomcat"/>

ЗАПУСК ПРОЕКТА:
	В Eclipse ПКМ по build.xml -> Run As -> Ant Build... -> в окне поставить галочки перед usage, build, deploy.
Запустите сервер.
Перейдите по ссылке http://localhost:8080/springapp/hello.htm

ГОТОВО!
