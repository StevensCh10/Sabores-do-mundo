import { GridContainer } from "../GridContainer";
import Image from "next/image";

export function Footer() {
  return (
    <footer className="bg-gray-100">
      <GridContainer>
        <div className="flex justify-between items-start py-20">
          {/* Bloco da esquerda */}
          <div className="flex flex-col space-y-4">
            <div className="flex items-center space-x-4">
              <Image src="/logo2.svg" alt="Logo 2" width={56} height={55} />
              <h4 className="text-white text-xl font-semibold">
                Sabores do Mundo
              </h4>
            </div>
            <p className="text-gray-400">
              Onde jantar não é só sobre comer, mas <br />
              sobre viver uma experiência completa.
            </p>
            <div className="flex space-x-4">
              <div className="w-8 h-8 rounded-full bg-red-500 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
                <Image
                  src="/twitter.svg"
                  width={15}
                  height={15}
                  alt="Twitter"
                />
              </div>
              <div className="w-8 h-8 rounded-full bg-red-500 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
                <Image
                  src="/facebook.svg"
                  width={15}
                  height={15}
                  alt="Facebook"
                />
              </div>
              <div className="w-8 h-8 rounded-full bg-red-500 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
                <Image
                  src="/instagram.svg"
                  width={15}
                  height={15}
                  alt="Instagram"
                />
              </div>
              <div className="w-8 h-8 rounded-full bg-red-500 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
                <Image src="/github.svg" width={15} height={15} alt="GitHub" />
              </div>
            </div>
          </div>

          {/* Bloco da direita */}
          <div className="flex flex-col items-start space-y-4">
            <div className="flex items-center space-x-2">
              <p className="text-white font-semibold">Nos siga no Instagram:</p>
              <a href="/" className="text-blue-100 hover:underline">
                @saboresdomundorestaurante
              </a>
            </div>
            <div className="grid grid-cols-2 gap-4">
              <Image src="food1.svg" width={194} height={170} alt="Comidas" />
              <Image src="food2.svg" width={194} height={170} alt="Comidas" />
              <Image src="food3.svg" width={194} height={170} alt="Comidas" />
              <Image src="food4.svg" width={194} height={170} alt="Comidas" />
            </div>
          </div>
        </div>
      </GridContainer>
    </footer>
  );
}
