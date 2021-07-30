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

public val LineAwesomeIcons.SkiingSolid: ImageVector
    get() {
        if (_skiingSolid != null) {
            return _skiingSolid!!
        }
        _skiingSolid = Builder(name = "SkiingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveTo(22.3555f, 4.0f, 21.0f, 5.3555f, 21.0f, 7.0f)
                curveTo(21.0f, 8.6445f, 22.3555f, 10.0f, 24.0f, 10.0f)
                curveTo(25.6445f, 10.0f, 27.0f, 8.6445f, 27.0f, 7.0f)
                curveTo(27.0f, 5.3555f, 25.6445f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(8.0313f, 4.2188f)
                lineTo(6.875f, 5.8125f)
                lineTo(13.1875f, 10.4063f)
                curveTo(13.0781f, 10.5234f, 12.9492f, 10.6328f, 12.8438f, 10.75f)
                curveTo(11.5469f, 12.168f, 11.8086f, 14.4648f, 13.4063f, 15.5313f)
                lineTo(17.0938f, 17.9688f)
                lineTo(13.2813f, 20.2188f)
                lineTo(5.5f, 15.75f)
                lineTo(4.5f, 17.5f)
                lineTo(22.0313f, 27.5625f)
                curveTo(22.0625f, 27.5742f, 22.0938f, 27.5859f, 22.125f, 27.5938f)
                curveTo(22.125f, 27.5938f, 22.832f, 27.9375f, 23.75f, 28.0f)
                curveTo(24.668f, 28.0625f, 25.9727f, 27.7969f, 26.8125f, 26.6563f)
                lineTo(25.2188f, 25.4688f)
                curveTo(24.8516f, 25.9688f, 24.4258f, 26.0352f, 23.9063f, 26.0f)
                curveTo(23.4375f, 25.9688f, 23.1055f, 25.8438f, 23.0313f, 25.8125f)
                lineTo(22.9375f, 25.7813f)
                lineTo(15.25f, 21.375f)
                lineTo(18.0938f, 19.6875f)
                curveTo(19.3242f, 18.957f, 19.3789f, 17.1094f, 18.1875f, 16.3125f)
                lineTo(14.5313f, 13.875f)
                curveTo(13.918f, 13.4648f, 13.8164f, 12.6367f, 14.3125f, 12.0938f)
                curveTo(14.8398f, 11.5156f, 15.4258f, 10.8945f, 15.9688f, 10.375f)
                curveTo(16.75f, 9.625f, 17.7773f, 9.2813f, 18.5938f, 9.125f)
                curveTo(18.8125f, 9.082f, 18.9688f, 9.2305f, 18.9688f, 9.4688f)
                lineTo(19.0f, 13.4688f)
                lineTo(19.0f, 13.9375f)
                lineTo(19.4063f, 14.25f)
                lineTo(23.375f, 17.2813f)
                lineTo(24.5938f, 15.7188f)
                lineTo(21.0f, 12.9688f)
                lineTo(20.9688f, 9.4688f)
                curveTo(20.9609f, 8.0273f, 19.6211f, 6.8789f, 18.1875f, 7.1563f)
                curveTo(17.125f, 7.3633f, 15.75f, 7.8281f, 14.5938f, 8.9375f)
                close()
                moveTo(24.0f, 6.0f)
                curveTo(24.5625f, 6.0f, 25.0f, 6.4375f, 25.0f, 7.0f)
                curveTo(25.0f, 7.5625f, 24.5625f, 8.0f, 24.0f, 8.0f)
                curveTo(23.4375f, 8.0f, 23.0f, 7.5625f, 23.0f, 7.0f)
                curveTo(23.0f, 6.4375f, 23.4375f, 6.0f, 24.0f, 6.0f)
                close()
            }
        }
        .build()
        return _skiingSolid!!
    }

private var _skiingSolid: ImageVector? = null
