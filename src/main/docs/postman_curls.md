# 🧪 Fancy Name Generator API – Postman Examples

This file includes example `cURL` requests for testing both GET and POST endpoints of the Fancy Name Generator API using Postman or CLI.

---

## 🎯 GET Request Example

```bash
curl --request GET \
  --url 'https://vigilant-rotary-phone-4ppv96pwp6rh5rr-8080.app.github.dev/generate?name=Sankalp&style=pirate&gender=male'
```


## 🎯 POST Request Example

```bash
  curl --request POST \
  --url 'https://vigilant-rotary-phone-4ppv96pwp6rh5rr-8080.app.github.dev/generate' \
  --header 'Content-Type: application/json' \
  --data '{
    "name": "Sankalp",
    "style": "fantasy",
    "gender": "male"
}'
```
