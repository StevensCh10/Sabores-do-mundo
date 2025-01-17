import Image from "next/image";
import { GridContainer } from "../GridContainer";

export function SectionFood() {
  return (
    <section className="bg-white-100">
      <GridContainer>
        <div className="flex items-start space-x-5 py-20">
          <div className="grid grid-cols-2 gap-4">
            <Image
              src="chef.svg"
              alt="Chef"
              width={400}
              height={533}
              className="rounded-lg object-cover"
            />
            <div className="grid grid-cols-1 gap-4">
              <div>
                <Image
                  src="curry.svg"
                  alt="Curry"
                  width={200}
                  height={200}
                  className="rounded-lg object-cover mt-20 mb-5"
                />
                <Image
                  src="skewer.svg"
                  alt="Espetinhos"
                  width={200}
                  height={200}
                  className="rounded-lg object-cover"
                />
              </div>
            </div>
          </div>

          <div className="flex flex-col space-y-6">
            <h4 className="text-6xl font-serif leading-tight">
              A comida mais <br /> rápida da cidade
            </h4>
            <p className="text-gray-600">
              Entrega de comida mais rápida da cidade, tudo isso ao seu dispor e
              a todo momento.
            </p>

            <div className="space-y-4">
              <div className="flex items-center space-x-4">
                <Image src="time.svg" alt="Time" width={24} height={24} />
                <p className="text-gray-600">Entrega em 30 minutos</p>
              </div>
              <div className="flex items-center space-x-4">
                <Image src="price.svg" alt="Price" width={24} height={24} />
                <p className="text-gray-600">Melhor oferta e preços</p>
              </div>
              <div className="flex items-center space-x-4">
                <Image src="car.svg" alt="Car" width={24} height={24} />
                <p className="text-gray-600">Serviços on-line disponíveis</p>
              </div>
            </div>
          </div>
        </div>
      </GridContainer>
    </section>
  );
}
