import Image from "next/image";
import { GridContainer } from "../GridContainer";

export function SectionFeedbacks() {
  return (
    <section>
      <GridContainer>
        <h3 className="flex flex-col items-center text-6xl font-serif pt-20">O que nossos clientes dizem</h3>

        <div className="flex justify-center space-x-6 pt-10 pb-20">
          {/* Card 1 */}
          <div className="bg-white-100 p-6 rounded-lg shadow-lg w-80 flex flex-col justify-between">
            <h4 className="text-red-500 text-xl font-semibold text-center">
              “O melhor restaurante”
            </h4>
            <p className="text-gray-600 mt-4 text-center">
              Tem comida para caramba! A comida no prato só não cai mais do que
              o Santa cai de divisão.
            </p>
            <hr className="my-4 border-gray-300" />
            <div className="flex items-center space-x-4">
              <Image
                src="pedro.svg"
                alt="Pedro"
                width={70}
                height={70}
                className="rounded-full"
              />
              <div>
                <small className="block font-bold">Pedro Silva</small>
                <small className="block text-gray-400">Recife, PE</small>
              </div>
            </div>
          </div>

          {/* Card 2 */}
          <div className="bg-white-100 p-6 rounded-lg shadow-lg w-80 flex flex-col justify-between">
            <h4 className="text-red-500 text-xl font-semibold text-center">
              “Simplesmente delicioso”
            </h4>
            <p className="text-gray-600 mt-4 text-center">
              Comida deliciosa de mais! o unico problema é que fica muito longe
              daqui de Casa Amarela.
            </p>
            <hr className="my-4 border-gray-300" />
            <div className="flex items-center space-x-4">
              <Image
                src="andre.svg"
                alt="Andre"
                width={70}
                height={70}
                className="rounded-full"
              />
              <div>
                <small className="block font-bold">André Costa</small>
                <small className="block text-gray-400">Casa Amarela, PE</small>
              </div>
            </div>
          </div>

          {/* Card 3 */}
          <div className="bg-white-100 p-6 rounded-lg shadow-lg w-80 flex flex-col justify-between">
            <h4 className="text-red-500 text-xl font-semibold text-center">
              “Restaurante diferenciado”
            </h4>
            <p className="text-gray-600 mt-4 text-center">
              Pensa em um restaurante maravilhoso. Além de comida de qualidade
              também tem comida em quantidade, perfeito!
            </p>
            <hr className="my-4 border-gray-300" />
            <div className="flex items-center space-x-4">
              <Image
                src="stevens.svg"
                alt="Stevens"
                width={70}
                height={70}
                className="rounded-full"
              />
              <div>
                <small className="block font-bold">Stevens Gatito</small>
                <small className="block text-gray-400">Casa Amarela, PE</small>
              </div>
            </div>
          </div>
        </div>
      </GridContainer>
    </section>
  );
}
