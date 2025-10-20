{
  "port": "43002",
  "tmp_path": "/data/tmp",
  "sqlite": {
    "host": "/config/data/semaphore.sqlite"
  },
  "mysql": {
    "name": "{{ .db_name }}",
    "host": "{{ .db_host }}:{{ .db_port }}",
    "user": "{{ .db_user }}",
    "pass": "{{ .db_password }}"
  },
  "postgres": {
    "name": "{{ .db_name }}",
    "host": "{{ .db_host }}:{{ .db_port }}",
    "user": "{{ .db_user }}",
    "pass": "{{ .db_password }}"
  },
  "dialect": "{{ .db_type }}",
  "web_host": "{{ .public_url }}"
}
