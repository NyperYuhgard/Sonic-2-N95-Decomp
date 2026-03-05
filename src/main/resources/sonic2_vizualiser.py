import struct
import os
from typing import List, Optional, Tuple, Dict
import pygame

class Filenames:
    """Todas las rutas de archivos del juego (basado en Filenames.java)"""
    
    # MAP_FILENAME - Chunks de 128x128
    MAP_FILENAME = [
        "/MAP00.bin", 
        "/MAP00.bin", 
        "", 
        "",
        "/MAP04.bin", 
        "/MAP04.bin", 
        "/MAP10.bin", 
        "/MAP00.bin",
        "", 
        "", 
        "/MAP0A.bin", 
        "/MAP0B.bin",
        "/MAP0C.bin", 
        "/MAP0D.bin", 
        "/MAP0D.bin", 
        "/MAP0F.bin", 
        "/MAP10.bin"
    ]
    
    # ZONEMAP_FILENAME - Layout del nivel
    ZONEMAP_FILENAME = [
        ["/ZONE000C.bin", "/ZONE001C.bin"],  # Zona 0 (Emerald Hill)
        [],  # Zona 1
        [],  # Zona 2
        [],  # Zona 3
        ["/ZONE040C.bin", "/ZONE041C.bin"],  # Zona 4
        ["/ZONE050C.bin"],  # Zona 5
        ["/ZONE060C.bin"],  # Zona 6
        ["/ZONE070C.bin", "/ZONE071C.bin"],  # Zona 7
        [],  # Zona 8
        [],  # Zona 9
        ["/ZONE0A0C.bin", "/ZONE0A1C.bin"],  # Zona 10
        ["/ZONE0B0C.bin", "/ZONE0B1C.bin"],  # Zona 11
        ["/ZONE0C0C.bin", "/ZONE0C1C.bin"],  # Zona 12 (Casino Night)
        ["/ZONE0D0C.bin", "/ZONE0D1C.bin"],  # Zona 13 (Chemical Plant)
        ["/ZONE0E0C.bin"],  # Zona 14
        ["/ZONE0F0C.bin", "/ZONE0F1C.bin"],  # Zona 15 (Aquatic Ruin)
        ["/ZONE100C.bin"]  # Zona 16
    ]
    
    # PRI_FILENAME - Prioridades
    PRI_FILENAME = [
        "/PRI00.bin", "/PRI07.bin", "", "",
        "/PRI04.bin", "/PRI04.bin", "/PRI06.bin", "/PRI07.bin",
        "", "", "/PRI0A.bin", "/PRI0B.bin",
        "/PRI0C.bin", "/PRI0D.bin", "/PRI0E.bin", "/PRI0F.bin", "/PRI10.bin"
    ]
    
    # TILEMAP_FILENAME - Mapa de tiles
    TILEMAP_FILENAME = [
        "/TILE00.bin", "/TILE07.bin", "", "", "", "", "", "/TILE07.bin",
        "", "", "", "", "/TILE0C.bin", "/TILE0D.bin", "", "/TILE0F.bin", ""
    ]
    
    # BLK_FILENAME - Tilesets gráficos (PNG)
    BLK_FILENAME = [
        "/EMERALD_HILL.png",   
        "/HILL_TOP.png",      
        "", 
        "", 
        "", 
        "", 
        "", 
        "/HILL_TOP.png",
        "", 
        "", 
        "", 
        "MYSTIC_CAVE.png", 
        "/CASINO_NIGHT.png", 
        "/CHEMICAL_PLANT.png",
        "", 
        "/AQUATIC_RUIN.png", 
        ""
    ]
    
    # SC_FILENAME - Colisiones [zona][0=SC, 1=SB]
    SC_FILENAME = [
        ["/ZONE00SC.bin", "/ZONE00SB.bin"],  # Zona 0
        ["/ZONE00SC.bin", "/ZONE00SB.bin"],  # Zona 1
        [],  # Zona 2
        [],  # Zona 3
        ["/ZONE04SC.bin", "/ZONE04SC.bin"],  # Zona 4
        ["/ZONE04SC.bin", "/ZONE04SC.bin"],  # Zona 5
        ["/ZONE10SC.bin", "/ZONE10SB.bin"],  # Zona 6
        ["/ZONE00SC.bin", "/ZONE00SB.bin"],  # Zona 7
        [],  # Zona 8
        [],  # Zona 9
        ["/ZONE0ASC.bin", "/ZONE0ASC.bin"],  # Zona 10
        ["/ZONE0BSC.bin", "/ZONE0BSC.bin"],  # Zona 11
        ["/ZONE0CSC.bin", "/ZONE0CSB.bin"],  # Zona 12
        ["/ZONE0DSC.bin", "/ZONE0DSB.bin"],  # Zona 13
        ["/ZONE0DSC.bin", "/ZONE0DSB.bin"],  # Zona 14
        ["/ZONE0FSC.bin", "/ZONE0FSB.bin"],  # Zona 15
        ["/ZONE10SC.bin", "/ZONE10SB.bin"]   # Zona 16
    ]
    
    # ACTION_FILENAME - Objetos/enemigos
    ACTION_FILENAME = [
        ["/ST0_0.bin", "/ST0_1.bin"],  # Zona 0
        ["/ST1_0.bin"],  # Zona 1
        [],  # Zona 2
        [],  # Zona 3
        ["/ST4_0.bin", "/ST4_1.bin"],  # Zona 4
        ["/ST5_0.bin"],  # Zona 5
        ["/ST6_0.bin"],  # Zona 6
        ["/ST7_0.bin", "/ST7_1.bin"],  # Zona 7
        [],  # Zona 8
        [],  # Zona 9
        ["/STA_0.bin", "/STA_1.bin"],  # Zona 10
        ["/STB_0.bin", "/STB_1.bin"],  # Zona 11
        ["/STC_0.bin", "/STC_1.bin"],  # Zona 12
        ["/STD_0.bin", "/STD_1.bin"],  # Zona 13
        ["/STE_0.bin"],  # Zona 14
        ["/STF_0.bin", "/STF_1.bin"],  # Zona 15
        ["/ST10_0.bin"]  # Zona 16
    ]
    
    # RING_FILENAME - Anillos
    RING_FILENAME = [
        ["/ring0_0.bin", "/ring0_1.bin"],  # Zona 0
        [],  # Zona 1
        [],  # Zona 2
        [],  # Zona 3
        ["/ring4_0.bin", "/ring4_1.bin"],  # Zona 4
        ["/ring5_0.bin"],  # Zona 5
        ["/ring6_0.bin"],  # Zona 6
        ["/ring7_0.bin", "/ring7_1.bin"],  # Zona 7
        [],  # Zona 8
        [],  # Zona 9
        ["/ringA_0.bin", "/ringA_1.bin"],  # Zona 10
        ["/ringB_0.bin", "/ringB_1.bin"],  # Zona 11
        ["/ringC_0.bin", "/ringC_1.bin"],  # Zona 12
        ["/ringD_0.bin", "/ringD_1.bin"],  # Zona 13
        ["/ringE_0.bin"],  # Zona 14
        ["/ringF_0.bin", "/ringF_1.bin"],  # Zona 15
        ["/ring10_0.bin"]  # Zona 16
    ]

class Sonic2Level:
    """Renderizador de niveles de Sonic 2 basado en GameState.java"""
    
    # Constantes del juego
    TILE_SIZE = 16  # Los tiles son de 16x16 en el renderizado final
    CHUNK_SIZE = 128  # Cada chunk es 128x128 píxeles
    VIEWPORT_OFFSET = 40  # Offset del viewport
    
    # Nombres de zonas para mostrar
    ZONE_NAMES = {
        0: "Emerald Hill",
        1: "Zone 1 (Used in Sonic 2 Dash Ending)",
        2: "Zone 2",
        3: "Zone 3",
        4: "Metropolis",
        5: "Metropolis Act 3", 
        6: "Wing Fortress",
        7: "Hill Top",
        8: "Zone 8",
        9: "Zone 9",
        10: "Oil Ocean",
        11: "Mystic Cave",
        12: "Casino Night",
        13: "Chemical Plant",
        14: "Death Egg",
        15: "Aquatic Ruin",
        16: "Sky Chase"
    }
    
    def __init__(self, base_path: str = ".", zoom: int = 2):
        self.base_path = base_path
        self.zoom = zoom
        
        # Tamaño de pantalla (se actualizará cuando se redimensione)
        self.base_width = 320
        self.base_height = 240
        self.screen_width = self.base_width * zoom
        self.screen_height = self.base_height * zoom
        
        # Datos cargados
        self.tileset = None
        self.chunk_map = None
        self.tilemap = None
        self.priority = None
        self.collision_a = None
        self.collision_b = None
        self.zone_layout = None
        
        # Estado
        self.camera_x = 0
        self.camera_y = 0
        self.zone_number = 0
        self.act_number = 0
        
        # Mini-mapa
        self.show_minimap = True
        self.minimap_rect = None
        
        # Debug
        self.debug_tile = None
        self.show_debug_grid = False
        
        # Modo de interpretación del tilemap
        self.tilemap_mode = 1  # 1=directo, 2=restar 1, 3=absoluto, 4=offset
        
    def analyze_tilemap(self):
        """Analiza el tilemap para encontrar patrones"""
        if not self.tilemap:
            print("No hay tilemap cargado")
            return
        
        print("\n=== ANÁLISIS DEL TILEMAP ===")
        print(f"Longitud: {len(self.tilemap)}")
        
        # Estadísticas básicas
        zero_count = sum(1 for v in self.tilemap if v == 0)
        negative_count = sum(1 for v in self.tilemap if v < 0)
        positive_count = sum(1 for v in self.tilemap if v > 0)
        
        print(f"Ceros: {zero_count}")
        print(f"Negativos: {negative_count}")
        print(f"Positivos: {positive_count}")
        
        if positive_count > 0:
            max_val = max(v for v in self.tilemap if v > 0)
            min_val = min(v for v in self.tilemap if v > 0)
            print(f"Rango positivos: {min_val} - {max_val}")
        
        # Mostrar los primeros 50 valores
        print("\nPrimeros 50 valores:")
        for i in range(min(50, len(self.tilemap))):
            val = self.tilemap[i]
            print(f"  [{i:3d}] = {val:5d} (0x{val:04x})")
        
        # Buscar qué tiles podrían ser las palmeras
        print("\nBuscando tiles de palmeras (rangos típicos):")
        palm_ranges = [(100, 150), (200, 250), (300, 350)]
        for start, end in palm_ranges:
            found = [i for i in range(start, min(end, len(self.tilemap))) 
                    if self.tilemap[i] != 0]
            if found:
                print(f"  Rango {start}-{end}: {len(found)} tiles no-cero")
                for i in found[:5]:
                    print(f"    tilemap[{i}] = {self.tilemap[i]}")
    
    def load_zone_data(self, zone_number: int):
        """Carga todos los datos necesarios para una zona"""
        self.zone_number = zone_number
        
        print(f"\n=== Cargando Zona {zone_number} ===")
        
        # Cargar tileset
        blk_file = Filenames.BLK_FILENAME[zone_number]
        if blk_file:
            full_path = self.base_path + blk_file
            try:
                self.tileset = pygame.image.load(full_path)
                print(f"✓ Tileset cargado: {blk_file}")
                print(f"  Dimensiones: {self.tileset.get_width()}x{self.tileset.get_height()}")
                print(f"  Tiles totales: {self.tileset.get_width()//16 * self.tileset.get_height()//16}")
            except Exception as e:
                print(f"✗ Error cargando tileset: {e}")
        
        # Cargar chunk map (MAP*.bin)
        map_file = Filenames.MAP_FILENAME[zone_number]
        if map_file:
            self.chunk_map = self._load_byte_array(map_file)
            if self.chunk_map:
                chunks_count = len(self.chunk_map) // 256
                print(f"✓ Chunk map cargado: {map_file} ({len(self.chunk_map)} bytes, {chunks_count} chunks)")
        
        # Cargar tilemap (TILE*.bin)
        tile_file = Filenames.TILEMAP_FILENAME[zone_number]
        if tile_file:
            self.tilemap = self._load_int_array(tile_file)
            if self.tilemap:
                print(f"✓ Tilemap cargado: {tile_file} ({len(self.tilemap)} ints)")
                self.analyze_tilemap()
        
        # Cargar prioridades
        pri_file = Filenames.PRI_FILENAME[zone_number]
        if pri_file:
            pri_data = self._load_byte_array(pri_file)
            if pri_data:
                self.priority = self._decode_priority(pri_data)
                print(f"✓ Prioridades cargadas: {pri_file}")
        
        # Cargar colisiones
        if zone_number < len(Filenames.SC_FILENAME):
            sc_files = Filenames.SC_FILENAME[zone_number]
            if sc_files and len(sc_files) >= 2:
                self.collision_a = self._load_byte_array(sc_files[0])
                self.collision_b = self._load_byte_array(sc_files[1])
                if self.collision_a:
                    print(f"✓ Colisión A cargada: {sc_files[0]}")
                if self.collision_b:
                    print(f"✓ Colisión B cargada: {sc_files[1]}")
    
    def load_act(self, act_number: int):
        """Carga los datos específicos del acto"""
        self.act_number = act_number
        
        zone_name = self.ZONE_NAMES.get(self.zone_number, f"Zona{self.zone_number}")
        print(f"\n=== Cargando {zone_name} Acto {act_number} ===")
        
        # Cargar layout de la zona (ZONE*.bin)
        if self.zone_number < len(Filenames.ZONEMAP_FILENAME):
            act_files = Filenames.ZONEMAP_FILENAME[self.zone_number]
            if act_number < len(act_files):
                layout_file = act_files[act_number]
                if layout_file:
                    self.zone_layout = self._load_byte_array(layout_file)
                    if self.zone_layout:
                        print(f"✓ Layout cargado: {layout_file} ({len(self.zone_layout)} bytes)")
                        sample = [self.zone_layout[i] for i in range(min(20, len(self.zone_layout)))]
                        print(f"  Primeros valores: {sample}")
    
    def _load_byte_array(self, filename: str) -> Optional[bytes]:
        """Carga un archivo binario"""
        full_path = self.base_path + filename
        try:
            with open(full_path, 'rb') as f:
                length_bytes = f.read(4)
                if not length_bytes:
                    return None
                length = struct.unpack('>I', length_bytes)[0]
                return f.read(length)
        except FileNotFoundError:
            print(f"Archivo no encontrado: {full_path}")
            return None
        except Exception as e:
            print(f"Error cargando {filename}: {e}")
            return None
    
    def _load_int_array(self, filename: str) -> Optional[List[int]]:
        """Carga un array de enteros"""
        full_path = self.base_path + filename
        try:
            with open(full_path, 'rb') as f:
                length_bytes = f.read(4)
                if not length_bytes:
                    return None
                length = struct.unpack('>I', length_bytes)[0]
                result = []
                for _ in range(length):
                    int_bytes = f.read(4)
                    if len(int_bytes) != 4:
                        break
                    result.append(struct.unpack('>i', int_bytes)[0])
                return result
        except FileNotFoundError:
            print(f"Archivo no encontrado: {full_path}")
            return None
        except Exception as e:
            print(f"Error cargando {filename}: {e}")
            return None
    
    def _decode_priority(self, pri_data: bytes) -> List[int]:
        """Decodifica prioridades"""
        priority = []
        for byte in pri_data:
            for bit in range(7, -1, -1):
                if byte & (1 << bit):
                    priority.append(15)
                else:
                    priority.append(0)
        return priority
    
    def get_block_number(self, world_x: int, world_y: int) -> int:
        """Obtiene el número de bloque en coordenadas mundiales"""
        if not self.zone_layout or not self.chunk_map:
            return 0
        
        try:
            chunk_x = (world_x >> 7) & 127
            chunk_y = (world_y << 1) & 3840
            layout_index = chunk_x | chunk_y
            
            if layout_index < len(self.zone_layout):
                chunk_id = self.zone_layout[layout_index] & 0xFF
                
                tile_x_in_chunk = ((world_x & 127) >> 4)
                tile_y_in_chunk = ((world_y & 127) >> 4)
                
                block_index = (chunk_id << 7) + \
                             (tile_x_in_chunk << 1) + \
                             (tile_y_in_chunk << 4)
                
                if block_index + 1 < len(self.chunk_map):
                    block_num = (self.chunk_map[block_index] << 8) | \
                                 self.chunk_map[block_index + 1]
                    
                    if self.debug_tile and block_num == self.debug_tile:
                        print(f"Tile {hex(block_num)} en ({world_x},{world_y})")
                        print(f"  chunk_id: {chunk_id}, layout_index: {layout_index}")
                        print(f"  tile_x: {tile_x_in_chunk}, tile_y: {tile_y_in_chunk}")
                        print(f"  block_index: {block_index}")
                    
                    return block_num & 0xFFFF
        except Exception:
            pass
        
        return 0
    
    def get_tile_index(self, block_num: int) -> int:
        """Obtiene el índice de tile real aplicando el tilemap según el modo seleccionado"""
        tile_index = block_num & 0x3FF
        
        if not self.tilemap or tile_index >= len(self.tilemap):
            return tile_index
        
        mapped = self.tilemap[tile_index]
        
        # Probar diferentes modos de interpretación
        if self.tilemap_mode == 1:  # Modo directo
            return mapped & 0x3FF if mapped > 0 else 0
            
        elif self.tilemap_mode == 2:  # Restar 1
            if mapped > 0:
                return (mapped - 1) & 0x3FF
            return 0
            
        elif self.tilemap_mode == 3:  # Valor absoluto
            return abs(mapped) & 0x3FF
            
        elif self.tilemap_mode == 4:  # Usar original para ciertos rangos
            if 100 <= tile_index <= 200:  # Rango de palmeras
                return tile_index
            return mapped & 0x3FF if mapped > 0 else 0
            
        elif self.tilemap_mode == 5:  # Offset
            if mapped != 0:
                return (tile_index + mapped) & 0x3FF
            return tile_index
        
        return tile_index
    
    def draw_block(self, screen: pygame.Surface, block_num: int, screen_x: int, screen_y: int):
        """Dibuja un bloque con zoom aplicado"""
        if screen_x < -self.TILE_SIZE * self.zoom or \
           screen_x > self.screen_width or \
           screen_y < -self.TILE_SIZE * self.zoom or \
           screen_y > self.screen_height:
            return
        
        tile_index = self.get_tile_index(block_num)
        
        if tile_index == 0 or not self.tileset:
            if self.show_debug_grid and block_num != 0:
                s = pygame.Surface((self.TILE_SIZE * self.zoom, self.TILE_SIZE * self.zoom))
                s.set_alpha(128)
                s.fill((255, 0, 0))
                screen.blit(s, (screen_x, screen_y))
            return
        
        flip = (block_num >> 10) & 3
        
        # Calcular posición en el tileset
        tiles_per_row = self.tileset.get_width() // self.TILE_SIZE
        tile_x = (tile_index % tiles_per_row) * self.TILE_SIZE
        tile_y = (tile_index // tiles_per_row) * self.TILE_SIZE
        
        if tile_x + self.TILE_SIZE > self.tileset.get_width() or \
           tile_y + self.TILE_SIZE > self.tileset.get_height():
            if self.show_debug_grid:
                s = pygame.Surface((self.TILE_SIZE * self.zoom, self.TILE_SIZE * self.zoom))
                s.set_alpha(128)
                s.fill((255, 0, 255))
                screen.blit(s, (screen_x, screen_y))
            return
        
        try:
            tile_surface = self.tileset.subsurface(tile_x, tile_y, self.TILE_SIZE, self.TILE_SIZE)
            
            if flip == 1:
                tile_surface = pygame.transform.flip(tile_surface, True, False)
            elif flip == 2:
                tile_surface = pygame.transform.flip(tile_surface, False, True)
            elif flip == 3:
                tile_surface = pygame.transform.flip(tile_surface, True, True)
            
            if self.zoom != 1:
                tile_surface = pygame.transform.scale(
                    tile_surface, 
                    (self.TILE_SIZE * self.zoom, self.TILE_SIZE * self.zoom)
                )
            
            screen.blit(tile_surface, (screen_x, screen_y))
            
        except Exception:
            if self.show_debug_grid:
                s = pygame.Surface((self.TILE_SIZE * self.zoom, self.TILE_SIZE * self.zoom))
                s.set_alpha(128)
                s.fill((255, 255, 0))
                screen.blit(s, (screen_x, screen_y))
    
    def render(self, screen: pygame.Surface, camera_x: int, camera_y: int):
        """Renderiza el nivel completo con zoom"""
        self.camera_x = camera_x
        self.camera_y = camera_y
        
        if not all([self.tileset, self.zone_layout, self.chunk_map]):
            font = pygame.font.Font(None, 24)
            text = font.render("Faltan datos del nivel", True, (255, 255, 255))
            screen.blit(text, (10, 10))
            return
        
        cam_x_aligned = camera_x & 0xFFF0
        cam_y_aligned = (camera_y + self.VIEWPORT_OFFSET) & 0xFFF0
        
        tiles_horiz = (self.screen_width // (self.TILE_SIZE * self.zoom)) + 2
        tiles_vert = (self.screen_height // (self.TILE_SIZE * self.zoom)) + 2
        
        start_y = cam_y_aligned
        end_y = cam_y_aligned + (tiles_vert * self.TILE_SIZE)
        start_x = cam_x_aligned
        end_x = cam_x_aligned + (tiles_horiz * self.TILE_SIZE)
        
        rendered = 0
        problem_tiles = []
        
        for world_y in range(start_y, end_y, self.TILE_SIZE):
            for world_x in range(start_x, end_x, self.TILE_SIZE):
                block_num = self.get_block_number(world_x, world_y)
                
                if block_num != 0:
                    tile_index = self.get_tile_index(block_num)
                    
                    if tile_index == 0 and block_num != 0:
                        problem_tiles.append((block_num, world_x, world_y))
                    
                    screen_x = (world_x - camera_x) * self.zoom
                    screen_y = (world_y - camera_y - self.VIEWPORT_OFFSET) * self.zoom
                    
                    self.draw_block(screen, block_num, screen_x, screen_y)
                    rendered += 1
        
        if not hasattr(self, '_frame_counter'):
            self._frame_counter = 0
        self._frame_counter += 1
        
        if self._frame_counter % 60 == 0:
            print(f"Renderizados {rendered} bloques | Zoom: {self.zoom}x | Modo tilemap: {self.tilemap_mode}")
            if problem_tiles:
                print(f"  Tiles problemáticos: {len(problem_tiles)}")
                for block, x, y in problem_tiles[:5]:
                    print(f"    Block {hex(block)} en ({x},{y})")
    
    def draw_minimap(self, screen: pygame.Surface):
        """Dibuja un minimapa del nivel completo"""
        if not self.zone_layout or not self.chunk_map:
            return
        
        minimap_width = 160
        minimap_height = 120
        margin = 10
        
        minimap_x = screen.get_width() - minimap_width - margin
        minimap_y = margin
        
        if not hasattr(self, '_minimap_surface'):
            self._minimap_surface = pygame.Surface((minimap_width, minimap_height))
        
        self._minimap_surface.fill((0, 0, 0))
        
        layout_width = 128
        layout_height = 128
        scale_x = minimap_width / layout_width
        scale_y = minimap_height / layout_height
        
        for y in range(layout_height):
            for x in range(layout_width):
                if y * layout_width + x < len(self.zone_layout):
                    chunk_id = self.zone_layout[y * layout_width + x]
                    if chunk_id != 0:
                        color = ((chunk_id * 50) % 256, 
                                (chunk_id * 30) % 256, 
                                (chunk_id * 70) % 256)
                        pygame.draw.rect(
                            self._minimap_surface, 
                            color,
                            (int(x * scale_x), int(y * scale_y), 
                             max(1, int(scale_x + 0.5)), 
                             max(1, int(scale_y + 0.5)))
                        )
        
        camera_chunk_x = self.camera_x // self.CHUNK_SIZE
        camera_chunk_y = self.camera_y // self.CHUNK_SIZE
        camera_width = (self.base_width * self.zoom) // (self.CHUNK_SIZE * self.zoom)
        camera_height = (self.base_height * self.zoom) // (self.CHUNK_SIZE * self.zoom)
        
        pygame.draw.rect(
            self._minimap_surface,
            (255, 255, 255),
            (int(camera_chunk_x * scale_x), 
             int(camera_chunk_y * scale_y),
             int(camera_width * scale_x),
             int(camera_height * scale_y)),
            1
        )
        
        pygame.draw.rect(self._minimap_surface, (255, 255, 255), 
                        self._minimap_surface.get_rect(), 1)
        
        screen.blit(self._minimap_surface, (minimap_x, minimap_y))
        self.minimap_rect = pygame.Rect(minimap_x, minimap_y, 
                                       minimap_width, minimap_height)

def main():
    """Función principal"""
    # Configuración inicial
    ZOOM_LEVEL = 3  # Aumentado a 3x para mejor visualización
    WINDOW_WIDTH = 320 * ZOOM_LEVEL
    WINDOW_HEIGHT = 240 * ZOOM_LEVEL
    
    pygame.init()
    screen = pygame.display.set_mode((WINDOW_WIDTH, WINDOW_HEIGHT), pygame.RESIZABLE)
    pygame.display.set_caption(f"Sonic 2 Level Viewer - {ZOOM_LEVEL}x Zoom (Redimensionable)")
    clock = pygame.time.Clock()
    
    level = Sonic2Level(base_path="./", zoom=ZOOM_LEVEL)
    
    # Variables de navegación
    current_zone = 0
    current_act = 0
    available_zones = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
    
    # Cargar nivel inicial
    level.load_zone_data(current_zone)
    level.load_act(current_act)
    
    camera_x = 1500
    camera_y = 700
    
    running = True
    show_info = True
    move_speed = 8 * ZOOM_LEVEL
    
    try:
        font = pygame.font.Font(None, 16 * ZOOM_LEVEL)
        small_font = pygame.font.Font(None, 12 * ZOOM_LEVEL)
    except:
        font = pygame.font.Font(None, 24)
        small_font = pygame.font.Font(None, 18)
    
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            elif event.type == pygame.VIDEORESIZE:
                # Redimensionar ventana
                screen = pygame.display.set_mode((event.w, event.h), pygame.RESIZABLE)
                # Actualizar tamaño de pantalla en el nivel
                level.screen_width = event.w
                level.screen_height = event.h
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_i:
                    show_info = not show_info
                elif event.key == pygame.K_m:
                    level.show_minimap = not level.show_minimap
                elif event.key == pygame.K_g:
                    level.show_debug_grid = not level.show_debug_grid
                elif event.key == pygame.K_r:
                    level.load_zone_data(current_zone)
                    level.load_act(current_act)
                elif event.key == pygame.K_1:
                    camera_x, camera_y = 0, 0
                elif event.key == pygame.K_2:
                    camera_x, camera_y = 1500, 700
                elif event.key == pygame.K_3:
                    camera_x, camera_y = 3000, 700
                elif event.key == pygame.K_d:
                    world_x = camera_x + 100
                    world_y = camera_y + 100
                    block = level.get_block_number(world_x, world_y)
                    level.debug_tile = block
                    print(f"Debug activado para tile {hex(block)} en ({world_x},{world_y})")
                elif event.key == pygame.K_t:
                    # Cambiar modo de tilemap
                    level.tilemap_mode = (level.tilemap_mode % 5) + 1
                    print(f"Modo tilemap cambiado a: {level.tilemap_mode}")
                elif event.key == pygame.K_PAGEUP:
                    # Siguiente zona
                    idx = available_zones.index(current_zone)
                    idx = (idx + 1) % len(available_zones)
                    current_zone = available_zones[idx]
                    current_act = 0
                    level.load_zone_data(current_zone)
                    level.load_act(current_act)
                    camera_x, camera_y = 1500, 700
                elif event.key == pygame.K_PAGEDOWN:
                    # Zona anterior
                    idx = available_zones.index(current_zone)
                    idx = (idx - 1) % len(available_zones)
                    current_zone = available_zones[idx]
                    current_act = 0
                    level.load_zone_data(current_zone)
                    level.load_act(current_act)
                    camera_x, camera_y = 1500, 700
                elif event.key == pygame.K_HOME:
                    # Primer acto
                    acts = Filenames.ZONEMAP_FILENAME[current_zone]
                    if acts:
                        current_act = 0
                        level.load_act(current_act)
                        camera_x, camera_y = 1500, 700
                elif event.key == pygame.K_END:
                    # Último acto
                    acts = Filenames.ZONEMAP_FILENAME[current_zone]
                    if acts:
                        current_act = len(acts) - 1
                        level.load_act(current_act)
                        camera_x, camera_y = 1500, 700
        
        # Control de cámara - SOLO con flechas (sin WASD)
        keys = pygame.key.get_pressed()
        if keys[pygame.K_RIGHT]:
            camera_x += move_speed
        if keys[pygame.K_LEFT]:
            camera_x -= move_speed
        if keys[pygame.K_DOWN]:
            camera_y += move_speed
        if keys[pygame.K_UP]:
            camera_y -= move_speed
        
        # Renderizar
        screen.fill((100, 150, 200))
        
        try:
            level.render(screen, camera_x, camera_y)
        except Exception as e:
            print(f"Error en render: {e}")
            import traceback
            traceback.print_exc()
        
        if level.show_minimap:
            level.draw_minimap(screen)
        
        if show_info:
            zone_name = level.ZONE_NAMES.get(current_zone, f"Zona {current_zone}")
            acts = Filenames.ZONEMAP_FILENAME[current_zone]
            act_text = f"{current_act + 1}/{len(acts)}" if acts else "0/0"
            
            info_lines = [
                f"Camera: ({camera_x}, {camera_y})",
                f"Zona: {current_zone} - {zone_name}",
                f"Acto: {act_text}",
                f"Zoom: {level.zoom}x (redimensionable)",
                f"Tilemap mode: {level.tilemap_mode}",
                f"Debug Grid: {'ON' if level.show_debug_grid else 'OFF'}",
                f"Ventana: {screen.get_width()}x{screen.get_height()}",
                "",
                "Navegación:",
                "PgUp/PgDn: cambiar zona",
                "Inicio/Fin: primer/último acto",
                "T: cambiar modo tilemap",
                "",
                "Controles:",
                "Flechas: mover cámara (NO WASD)",
                "G: grid debug",
                "M: minimapa",
                "I: info",
                "R: recargar",
                "D: debug tile",
                "1/2/3: posiciones",
                "",
                "Ventana redimensionable:",
                "Arrastra los bordes"
            ]
            
            y = 10
            for text in info_lines:
                if text:
                    if text.startswith("Navegación:") or text.startswith("Controles:") or text.startswith("Ventana redimensionable:"):
                        # Títulos en amarillo
                        surf = font.render(text, True, (255, 255, 0))
                    else:
                        surf = small_font.render(text, True, (255, 255, 255))
                    
                    # Fondo semitransparente
                    pygame.draw.rect(screen, (0, 0, 0, 180), 
                                   (5, y-2, surf.get_width()+6, surf.get_height()+4))
                    screen.blit(surf, (8, y))
                    y += surf.get_height() + 2
                else:
                    y += 5
        
        pygame.display.flip()
        clock.tick(60)
    
    pygame.quit()

if __name__ == "__main__":
    main()
