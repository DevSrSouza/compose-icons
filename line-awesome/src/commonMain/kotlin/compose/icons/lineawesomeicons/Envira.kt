package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Envira: ImageVector
    get() {
        if (_envira != null) {
            return _envira!!
        }
        _envira = Builder(name = "Envira", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                curveTo(7.614f, 13.976f, 7.3625f, 18.1814f, 11.8965f, 21.6934f)
                curveTo(15.8665f, 24.7185f, 19.836f, 23.9295f, 22.0078f, 23.6074f)
                lineTo(25.3984f, 27.0f)
                lineTo(27.3984f, 27.0f)
                lineTo(23.418f, 23.0195f)
                curveTo(23.393f, 20.6125f, 29.01f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(8.084f, 7.002f)
                curveTo(8.2194f, 7.0131f, 8.5336f, 7.1234f, 9.1309f, 7.3984f)
                curveTo(13.1299f, 9.2474f, 14.5385f, 11.9898f, 16.0625f, 14.7988f)
                curveTo(17.1585f, 16.8208f, 19.0805f, 19.9006f, 20.4355f, 20.8926f)
                curveTo(21.7915f, 21.8756f, 23.2724f, 22.602f, 20.1484f, 21.291f)
                curveTo(17.0144f, 19.98f, 14.7308f, 16.2594f, 13.2168f, 13.4414f)
                curveTo(12.0528f, 11.2794f, 11.0539f, 9.2881f, 8.8809f, 7.8281f)
                curveTo(8.8809f, 7.8281f, 7.6777f, 6.9685f, 8.084f, 7.002f)
                close()
            }
        }
        .build()
        return _envira!!
    }

private var _envira: ImageVector? = null
