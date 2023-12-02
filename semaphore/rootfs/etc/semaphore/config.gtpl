{
  "bolt": {
    "host": "/config/data/semaphore.bolt",
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
  "tmp_path": "/config/data/tmp",
  "access_key_encryption": "&#@89879n3@&*N&w343@#@*^$",
  "web_host": "{{ .public_url }}",
}