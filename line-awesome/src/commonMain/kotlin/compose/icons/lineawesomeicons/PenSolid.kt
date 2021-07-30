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

public val LineAwesomeIcons.PenSolid: ImageVector
    get() {
        if (_penSolid != null) {
            return _penSolid!!
        }
        _penSolid = Builder(name = "PenSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9063f, 3.9688f)
                curveTo(22.8594f, 3.9688f, 21.8125f, 4.375f, 21.0f, 5.1875f)
                lineTo(5.1875f, 21.0f)
                lineTo(5.125f, 21.3125f)
                lineTo(4.0313f, 26.8125f)
                lineTo(3.7188f, 28.2813f)
                lineTo(5.1875f, 27.9688f)
                lineTo(10.6875f, 26.875f)
                lineTo(11.0f, 26.8125f)
                lineTo(26.8125f, 11.0f)
                curveTo(28.4375f, 9.375f, 28.4375f, 6.8125f, 26.8125f, 5.1875f)
                curveTo(26.0f, 4.375f, 24.9531f, 3.9688f, 23.9063f, 3.9688f)
                close()
                moveTo(23.9063f, 5.875f)
                curveTo(24.4102f, 5.875f, 24.918f, 6.1055f, 25.4063f, 6.5938f)
                curveTo(26.3789f, 7.5664f, 26.3789f, 8.6211f, 25.4063f, 9.5938f)
                lineTo(24.6875f, 10.2813f)
                lineTo(21.7188f, 7.3125f)
                lineTo(22.4063f, 6.5938f)
                curveTo(22.8945f, 6.1055f, 23.4023f, 5.875f, 23.9063f, 5.875f)
                close()
                moveTo(20.3125f, 8.7188f)
                lineTo(23.2813f, 11.6875f)
                lineTo(11.1875f, 23.7813f)
                curveTo(10.5313f, 22.5f, 9.5f, 21.4688f, 8.2188f, 20.8125f)
                close()
                moveTo(6.9375f, 22.4375f)
                curveTo(8.1367f, 22.9219f, 9.0781f, 23.8633f, 9.5625f, 25.0625f)
                lineTo(6.2813f, 25.7188f)
                close()
            }
        }
        .build()
        return _penSolid!!
    }

private var _penSolid: ImageVector? = null
