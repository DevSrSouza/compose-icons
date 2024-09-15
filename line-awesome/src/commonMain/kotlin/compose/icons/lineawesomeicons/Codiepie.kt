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

public val LineAwesomeIcons.Codiepie: ImageVector
    get() {
        if (_codiepie != null) {
            return _codiepie!!
        }
        _codiepie = Builder(name = "Codiepie", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.043f, 3.0f)
                curveTo(8.863f, 3.0f, 3.043f, 8.82f, 3.043f, 16.0f)
                curveTo(3.043f, 23.18f, 8.863f, 29.0f, 16.043f, 29.0f)
                curveTo(21.477f, 29.0f, 26.016f, 25.664f, 27.959f, 20.93f)
                lineTo(17.125f, 16.0f)
                lineTo(27.658f, 10.191f)
                curveTo(25.524f, 5.931f, 21.132f, 3.0f, 16.043f, 3.0f)
                close()
                moveTo(16.043f, 5.0f)
                curveTo(19.577f, 5.0f, 22.813f, 6.666f, 24.867f, 9.447f)
                lineTo(21.285f, 11.422f)
                curveTo(20.004f, 9.94f, 18.113f, 9.0f, 16.0f, 9.0f)
                curveTo(12.134f, 9.0f, 9.0f, 12.134f, 9.0f, 16.0f)
                curveTo(9.0f, 19.866f, 12.134f, 23.0f, 16.0f, 23.0f)
                curveTo(18.278f, 23.0f, 20.292f, 21.905f, 21.568f, 20.219f)
                lineTo(25.229f, 21.885f)
                curveTo(23.247f, 25.044f, 19.813f, 27.0f, 16.043f, 27.0f)
                curveTo(9.978f, 27.0f, 5.043f, 22.065f, 5.043f, 16.0f)
                curveTo(5.043f, 9.935f, 9.977f, 5.0f, 16.043f, 5.0f)
                close()
                moveTo(24.0f, 13.0f)
                lineTo(24.0f, 18.0f)
                lineTo(26.0f, 18.0f)
                lineTo(26.0f, 16.0f)
                lineTo(26.5f, 16.0f)
                curveTo(27.328f, 16.0f, 28.0f, 15.328f, 28.0f, 14.5f)
                curveTo(28.0f, 13.672f, 27.328f, 13.0f, 26.5f, 13.0f)
                lineTo(26.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                close()
            }
        }
        .build()
        return _codiepie!!
    }

private var _codiepie: ImageVector? = null
