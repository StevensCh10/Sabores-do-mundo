import Image from "next/image";
import { GridContainer } from "../GridContainer";

export function SectionNavegation() {
  return (
    <section>
      <GridContainer>
        <h3 className="flex flex-col items-center text-4xl font-serif mt-10">
          Navegue pelo nosso cardápio
        </h3>

        <div className="grid grid-cols-4 gap-8 py-20">
          <div className="flex flex-col items-center border border-gray-300 p-6 rounded-lg">
            <Image src="cafe.svg" alt="Café" width={100} height={100} />
            <h4 className="text-xl font-bold mt-4">Café da manhã</h4>
            <p className="text-gray-600 text-center mt-2">
              Comece o dia com sabores únicos e opções deliciosas para um café
              da manhã perfeito.
            </p>
            <nav className="mt-4 text-red-500 font-semibold cursor-pointer hover:underline">
              Explorar cardápio
            </nav>
          </div>

          <div className="flex flex-col items-center border border-gray-300 p-6 rounded-lg">
            <Image src="pipoca.svg" alt="Pipoca" width={100} height={100} />
            <h4 className="text-xl font-bold mt-4">Pratos Principais</h4>
            <p className="text-gray-600 text-center mt-2">
              Descubra pratos principais que combinam tradição e inovação,
              confira nosso cardápio!
            </p>
            <nav className="mt-4 text-red-500 font-semibold cursor-pointer hover:underline">
              Explorar cardápio
            </nav>
          </div>

          <div className="flex flex-col items-center border border-gray-300 p-6 rounded-lg">
            <Image src="bebida.svg" alt="Bebidas" width={100} height={100} />
            <h4 className="text-xl font-bold mt-4">Bebidas</h4>
            <p className="text-gray-600 text-center mt-2">
              Refresque-se com nossas bebidas especiais, perfeitas para todo
              mundo.
            </p>
            <nav className="mt-4 text-red-500 font-semibold cursor-pointer hover:underline">
              Explorar cardápio
            </nav>
          </div>

          <div className="flex flex-col items-center border border-gray-300 p-6 rounded-lg">
            <Image src="bolo.svg" alt="Sobremesas" width={100} height={100} />
            <h4 className="text-xl font-bold mt-4">Sobremesas</h4>
            <p className="text-gray-600 text-center mt-2">
              Finalize sua refeição com nossas sobremesas irresistíveis, feitas
              para adoçar o seu dia.
            </p>
            <nav className="mt-4 text-red-500 font-semibold cursor-pointer hover:underline">
              Explorar cardápio
            </nav>
          </div>
        </div>
      </GridContainer>
    </section>
  );
}
