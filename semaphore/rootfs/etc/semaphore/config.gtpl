{
  "tmp_path": "/config/data/tmp",
  "bolt": {
    "host": "/config/data/semaphore.bolt"
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
  "port": "{{ .port }}",
  "web_host": "{{ .public_url }}"
}