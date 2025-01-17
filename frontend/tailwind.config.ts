import type { Config } from "tailwindcss";

export default {
  content: [
    "./src/pages/**/*.{js,ts,jsx,tsx,mdx}",
    "./src/components/**/*.{js,ts,jsx,tsx,mdx}",
    "./src/app/**/*.{js,ts,jsx,tsx,mdx}",
  ],
  theme: {
    extend: {
      colors: {
        'red-500': '#AD343E',
        'gray-100': '#474747',
        'gray-200': '#5A5A5A',
        'gray-400': '#ADB29E',
        'gray-300': '#DBDFD0',
        'white-100': '#F9F9F7',
        'blue-100': '#7580FF',
      },
      maxWidth: {
        container: "77.5rem",
      },

      backgroundImage: {
        bannerImg: "url('/frutas.svg')",
      },
    },
  },
  plugins: [],
} satisfies Config;
