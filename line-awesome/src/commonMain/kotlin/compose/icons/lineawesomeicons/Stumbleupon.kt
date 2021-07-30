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

public val LineAwesomeIcons.Stumbleupon: ImageVector
    get() {
        if (_stumbleupon != null) {
            return _stumbleupon!!
        }
        _stumbleupon = Builder(name = "Stumbleupon", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(12.141f, 4.0f, 9.0f, 7.14f, 9.0f, 11.0f)
                lineTo(9.0f, 20.5f)
                curveTo(9.0f, 21.327f, 8.327f, 22.0f, 7.5f, 22.0f)
                curveTo(6.673f, 22.0f, 6.0f, 21.327f, 6.0f, 20.5f)
                lineTo(6.0f, 16.0f)
                lineTo(1.0f, 16.0f)
                lineTo(1.0f, 20.5f)
                curveTo(1.0f, 24.084f, 3.916f, 27.0f, 7.5f, 27.0f)
                curveTo(11.084f, 27.0f, 14.0f, 24.084f, 14.0f, 20.5f)
                lineTo(14.0f, 11.0f)
                curveTo(14.0f, 9.897f, 14.897f, 9.0f, 16.0f, 9.0f)
                curveTo(17.103f, 9.0f, 18.0f, 9.897f, 18.0f, 11.0f)
                lineTo(18.0f, 12.9219f)
                lineTo(19.8887f, 13.8008f)
                lineTo(23.0f, 12.877f)
                lineTo(23.0f, 11.0f)
                curveTo(23.0f, 7.14f, 19.859f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(26.0f, 16.0f)
                lineTo(26.0f, 20.5f)
                curveTo(26.0f, 21.327f, 25.327f, 22.0f, 24.5f, 22.0f)
                curveTo(23.673f, 22.0f, 23.0f, 21.327f, 23.0f, 20.5f)
                lineTo(23.0f, 16.0059f)
                lineTo(19.6523f, 17.002f)
                lineTo(18.0f, 16.2305f)
                lineTo(18.0f, 20.5f)
                curveTo(18.0f, 24.084f, 20.916f, 27.0f, 24.5f, 27.0f)
                curveTo(28.084f, 27.0f, 31.0f, 24.084f, 31.0f, 20.5f)
                lineTo(31.0f, 16.0f)
                lineTo(26.0f, 16.0f)
                close()
            }
        }
        .build()
        return _stumbleupon!!
    }

private var _stumbleupon: ImageVector? = null
