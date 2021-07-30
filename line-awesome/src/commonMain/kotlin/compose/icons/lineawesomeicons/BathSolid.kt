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

public val LineAwesomeIcons.BathSolid: ImageVector
    get() {
        if (_bathSolid != null) {
            return _bathSolid!!
        }
        _bathSolid = Builder(name = "BathSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 4.0f)
                curveTo(23.7891f, 4.0f, 22.0f, 5.7891f, 22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                lineTo(26.0f, 8.0f)
                lineTo(24.0f, 8.0f)
                curveTo(24.0f, 6.8086f, 24.8086f, 6.0f, 26.0f, 6.0f)
                curveTo(27.1914f, 6.0f, 28.0f, 6.8086f, 28.0f, 8.0f)
                lineTo(28.0f, 14.0f)
                lineTo(1.0f, 14.0f)
                lineTo(1.0f, 16.0f)
                lineTo(2.1875f, 16.0f)
                lineTo(3.7188f, 23.5938f)
                lineTo(3.7188f, 23.625f)
                curveTo(3.9492f, 24.6563f, 4.7148f, 25.5039f, 5.7188f, 25.8438f)
                lineTo(5.0f, 28.0f)
                lineTo(7.0f, 28.0f)
                lineTo(7.6563f, 26.0f)
                lineTo(24.3438f, 26.0f)
                lineTo(25.0f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(26.2813f, 25.8438f)
                curveTo(27.3281f, 25.5234f, 28.1406f, 24.6836f, 28.375f, 23.625f)
                lineTo(28.375f, 23.5938f)
                lineTo(29.8125f, 16.0f)
                lineTo(31.0f, 16.0f)
                lineTo(31.0f, 14.0f)
                lineTo(30.0f, 14.0f)
                lineTo(30.0f, 8.0f)
                curveTo(30.0f, 5.7891f, 28.2109f, 4.0f, 26.0f, 4.0f)
                close()
                moveTo(4.2188f, 16.0f)
                lineTo(27.8125f, 16.0f)
                lineTo(26.4063f, 23.2188f)
                curveTo(26.2891f, 23.6523f, 25.9219f, 24.0f, 25.4063f, 24.0f)
                lineTo(6.6875f, 24.0f)
                curveTo(6.1523f, 24.0f, 5.7891f, 23.6445f, 5.6875f, 23.1875f)
                close()
            }
        }
        .build()
        return _bathSolid!!
    }

private var _bathSolid: ImageVector? = null
