docker-compose down --remove-orphans
cd usuarios
./build-image.sh
cd ..
cd publicaciones
./build-image.sh
cd ..
cd discovery-server
./build-image.sh
cd ..
cd comentarios
./build-image.sh
cd ..
cd mensajes
./build-image.sh
cd ..
cd noticias
./build-image.sh
cd ..


docker-compose up --build
