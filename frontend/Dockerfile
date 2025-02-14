# Etapa de build
FROM node:20 AS build
WORKDIR /app

# Copia arquivos e instala dependências
COPY package*.json ./
RUN npm install

COPY . .
RUN npm run build

# Etapa de execução
FROM node:20
WORKDIR /app

COPY --from=build /app ./
RUN npm install --omit=dev  # Remove pacotes desnecessários

EXPOSE 3000
CMD ["npm", "run", "start"]