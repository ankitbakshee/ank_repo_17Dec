# ank_repo_17Dec

Spring boot POSTgreSQL - - - demo application

Features of postgresql

1. Object Relational Database management system (RDBMS)
  a. Objects can be related in a hierarchy: Parent -> child

2. Transactional RDBMS
Note: Transactional statements must execute: ALL or NONE
  a. SQL statements have implicit: BEGIN; COMMIT; statements
  b. SQL statements may also have explicit: BEGIN; COMMIT; statements
  
3. Note/Feature
  a. Developed originally at UC Berkeley
  
4. One process per connection - auto spawns per new connection
  a. managed by master process: 'postmaster'
  
5. Processes use only ONE CPU <scalability>
  a. Note: OS/Distro may spawn new connection on a different CPU/core.
  
6. Multiple helper processes, which appear as 'postgres' instances, run always
  a. stats collection: collect statistics of postgres
  b. Background writer: writes dbms instances
  c. Autovaccum - clean-up/ space reclaimer
  d. WALsender - write ahead log, saves againts sudden interruption/<loss of power>
  
7. Max DB size: Unlimited <limited by OS & available storage>
Note: Consider deploying on 64-bit platform
 
8. Max Table Size: 32TB - stored as multiple 1GB files
9. Max Row Size: 400GB
10. Max Col Size: 1GB
11. Max Indexes on a table: Unlimited
12. Max Identifier (DB objects (table|column names, etc.): 63-bytes)
Note: The limitation is extensible via source code.
13. Default Listener: TCP: 5432
 a. PostgreSQL can be installed as a non-privileged user
14. Users are distinct from OS users - i.e., MySQL
15. Users are shared across DBs
16. Inheritance
  a. Tables lower in hierarchy may inherit columns from higher tables
Caveat: No unique constraints or foreign key support
17. Case-insensitive commands - sans double quotes -i.e., 'select * from Syslog;'
18. Case-sensitive commands - with double quotes -i.e., 'select $ from 'Syslog';'
19. Three Primary files: $POSTGRESROOT/data/*.conf
  a. 'pg_hba.conf' - Controls host/user/DB connectivity
  b. 'postgresql.conf' - general settings
  c. 'pg_ident.conf' - user mappings <not important now a days>
20. Integrated log Rotation|Management - Log Collection  - 'postgresql.conf'
  a. Criteria Age | Size

  
