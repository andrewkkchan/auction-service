#!/usr/bin/env bash
#Create Offer
#To support additional features and transactions, create more accounts
GREEN='\033[0;32m'
NC='\033[0m' # No Color
echo -e "${GREEN}Creating Offer for Items to be Auctioned${NC}"
curl -X POST \
  http://localhost:3003/transaction/event \
  -H 'Content-Type: application/json' \
  -d '{
	"type" : "offer",
    "request" : {
        "itemKey" : "vase123",
        "offeror" :"andrew"
    }
}'
echo '\n'
echo -e "${GREEN}Creating Offer for Items to be Auctioned${NC}"
curl -X POST \
  http://localhost:3003/transaction/event \
  -H 'Content-Type: application/json' \
  -d '{
	"type" : "offer",
    "request" : {
        "itemKey" : "painting678",
        "offeror" :"john"
    }
}'
echo '\n'


