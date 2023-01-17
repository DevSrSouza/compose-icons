package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(306.7f, 325.1f)
                lineTo(162.4f, 380.6f)
                curveTo(142.1f, 388.1f, 123.9f, 369.0f, 131.4f, 349.6f)
                lineTo(186.9f, 205.3f)
                curveTo(190.1f, 196.8f, 196.8f, 190.1f, 205.3f, 186.9f)
                lineTo(349.6f, 131.4f)
                curveTo(369.0f, 123.9f, 388.1f, 142.1f, 380.6f, 162.4f)
                lineTo(325.1f, 306.7f)
                curveTo(321.9f, 315.2f, 315.2f, 321.9f, 306.7f, 325.1f)
                verticalLineTo(325.1f)
                close()
                moveTo(255.1f, 224.0f)
                curveTo(238.3f, 224.0f, 223.1f, 238.3f, 223.1f, 256.0f)
                curveTo(223.1f, 273.7f, 238.3f, 288.0f, 255.1f, 288.0f)
                curveTo(273.7f, 288.0f, 288.0f, 273.7f, 288.0f, 256.0f)
                curveTo(288.0f, 238.3f, 273.7f, 224.0f, 255.1f, 224.0f)
                verticalLineTo(224.0f)
                close()
                moveTo(512.0f, 256.0f)
                curveTo(512.0f, 397.4f, 397.4f, 512.0f, 256.0f, 512.0f)
                curveTo(114.6f, 512.0f, 0.0f, 397.4f, 0.0f, 256.0f)
                curveTo(0.0f, 114.6f, 114.6f, 0.0f, 256.0f, 0.0f)
                curveTo(397.4f, 0.0f, 512.0f, 114.6f, 512.0f, 256.0f)
                close()
                moveTo(256.0f, 48.0f)
                curveTo(141.1f, 48.0f, 48.0f, 141.1f, 48.0f, 256.0f)
                curveTo(48.0f, 370.9f, 141.1f, 464.0f, 256.0f, 464.0f)
                curveTo(370.9f, 464.0f, 464.0f, 370.9f, 464.0f, 256.0f)
                curveTo(464.0f, 141.1f, 370.9f, 48.0f, 256.0f, 48.0f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
