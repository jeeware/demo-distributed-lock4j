## MongoDB
`docker run -d --name mongo_replicaset -v ~/data/db:/data/db -p 27017:27017 mongo --replSet rs0`

`docker exec -it mongo_replicaset mongo`

`rs.initiate({ _id: "rs0", members: [ { _id: 0, host : "localhost:27017" } ] } )`

`rs.conf()` // pour verifier

## Oracle
`docker run --user=oracle --env=ORACLE_PASSWORD=my@Passw0rd --env=ORACLE_DATABASE=counters -p 1521:1521 --name=oracle-xe-test -d gvenzl/oracle-xe:21.3.0-slim`