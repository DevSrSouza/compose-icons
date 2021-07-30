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

public val LineAwesomeIcons.PencilRulerSolid: ImageVector
    get() {
        if (_pencilRulerSolid != null) {
            return _pencilRulerSolid!!
        }
        _pencilRulerSolid = Builder(name = "PencilRulerSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8125f, 3.0f)
                lineTo(8.125f, 3.7188f)
                lineTo(3.7188f, 8.125f)
                lineTo(3.0f, 8.8125f)
                lineTo(10.1875f, 16.0f)
                lineTo(5.1875f, 21.0f)
                lineTo(5.125f, 21.3125f)
                lineTo(4.0313f, 26.8125f)
                lineTo(3.7188f, 28.2813f)
                lineTo(5.1875f, 27.9688f)
                lineTo(10.6875f, 26.875f)
                lineTo(11.0f, 26.8125f)
                lineTo(16.0f, 21.8125f)
                lineTo(23.1563f, 28.9688f)
                lineTo(23.8438f, 28.25f)
                lineTo(28.25f, 23.8438f)
                lineTo(28.9688f, 23.1563f)
                lineTo(21.8125f, 16.0f)
                lineTo(26.75f, 11.0625f)
                curveTo(28.3594f, 9.4531f, 28.3594f, 6.8594f, 26.75f, 5.25f)
                curveTo(25.9453f, 4.4453f, 24.8945f, 4.0313f, 23.8438f, 4.0313f)
                curveTo(22.793f, 4.0313f, 21.7422f, 4.4453f, 20.9375f, 5.25f)
                lineTo(16.0f, 10.1875f)
                close()
                moveTo(8.8125f, 5.8438f)
                lineTo(10.75f, 7.8125f)
                lineTo(9.2813f, 9.2813f)
                lineTo(10.7188f, 10.7188f)
                lineTo(12.1875f, 9.25f)
                lineTo(14.5625f, 11.625f)
                lineTo(11.5938f, 14.5938f)
                lineTo(5.8125f, 8.8125f)
                close()
                moveTo(23.8438f, 5.9688f)
                curveTo(24.3633f, 5.9688f, 24.8906f, 6.2031f, 25.3438f, 6.6563f)
                curveTo(26.2461f, 7.5586f, 26.2461f, 8.7227f, 25.3438f, 9.625f)
                lineTo(24.6875f, 10.2813f)
                lineTo(21.7188f, 7.3125f)
                lineTo(22.375f, 6.6563f)
                curveTo(22.8281f, 6.2031f, 23.3242f, 5.9688f, 23.8438f, 5.9688f)
                close()
                moveTo(20.3125f, 8.7188f)
                lineTo(23.2813f, 11.6875f)
                lineTo(11.1875f, 23.7813f)
                curveTo(10.5273f, 22.5117f, 9.4883f, 21.4727f, 8.2188f, 20.8125f)
                close()
                moveTo(20.4063f, 17.4063f)
                lineTo(22.7813f, 19.7813f)
                lineTo(21.2813f, 21.2813f)
                lineTo(22.7188f, 22.7188f)
                lineTo(24.2188f, 21.2188f)
                lineTo(26.125f, 23.125f)
                lineTo(23.125f, 26.125f)
                lineTo(17.4063f, 20.4063f)
                close()
                moveTo(6.9375f, 22.4063f)
                curveTo(8.1367f, 22.9102f, 9.0898f, 23.8633f, 9.5938f, 25.0625f)
                lineTo(6.2813f, 25.7188f)
                close()
            }
        }
        .build()
        return _pencilRulerSolid!!
    }

private var _pencilRulerSolid: ImageVector? = null
