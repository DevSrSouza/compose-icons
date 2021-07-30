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

public val LineAwesomeIcons.Behance: ImageVector
    get() {
        if (_behance != null) {
            return _behance!!
        }
        _behance = Builder(name = "Behance", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.75f)
                lineTo(1.0f, 25.25f)
                lineTo(9.9375f, 25.25f)
                curveTo(10.7656f, 25.25f, 16.4688f, 25.082f, 16.4688f, 19.875f)
                curveTo(16.4688f, 16.6211f, 14.2305f, 15.5156f, 13.0938f, 15.1875f)
                curveTo(13.9297f, 14.793f, 15.5938f, 13.8555f, 15.5938f, 11.3438f)
                curveTo(15.5938f, 9.9453f, 15.3945f, 6.75f, 9.6875f, 6.75f)
                close()
                moveTo(21.375f, 8.4688f)
                lineTo(21.375f, 10.1563f)
                lineTo(28.2813f, 10.1563f)
                lineTo(28.2813f, 8.4688f)
                close()
                moveTo(5.0625f, 9.9063f)
                lineTo(8.875f, 9.9063f)
                curveTo(9.2344f, 9.9063f, 11.6563f, 9.7148f, 11.6563f, 12.0313f)
                curveTo(11.6563f, 14.0117f, 9.9063f, 14.2188f, 9.1875f, 14.2188f)
                lineTo(5.0625f, 14.2188f)
                close()
                moveTo(25.0f, 11.6875f)
                curveTo(19.7773f, 11.6875f, 18.6875f, 16.2227f, 18.6875f, 18.1875f)
                curveTo(18.6875f, 24.0195f, 23.4688f, 24.6875f, 25.0f, 24.6875f)
                curveTo(29.1289f, 24.6875f, 30.3008f, 22.0156f, 30.7813f, 20.5313f)
                lineTo(27.7813f, 20.5313f)
                curveTo(27.6641f, 20.9141f, 26.7891f, 22.1563f, 25.125f, 22.1563f)
                curveTo(22.3359f, 22.1563f, 22.0938f, 19.9766f, 22.0938f, 19.0f)
                lineTo(30.9688f, 19.0f)
                curveTo(31.1484f, 15.625f, 29.6719f, 11.6875f, 25.0f, 11.6875f)
                close()
                moveTo(24.9063f, 14.2188f)
                curveTo(25.7383f, 14.2188f, 26.4102f, 14.4609f, 26.8125f, 14.9063f)
                curveTo(27.2148f, 15.3555f, 27.5117f, 16.0117f, 27.5938f, 16.875f)
                lineTo(22.0938f, 16.875f)
                curveTo(22.1094f, 16.6367f, 22.1641f, 16.3633f, 22.25f, 16.0625f)
                curveTo(22.3359f, 15.7539f, 22.4688f, 15.4609f, 22.6875f, 15.1875f)
                curveTo(22.9063f, 14.918f, 23.2109f, 14.6836f, 23.5625f, 14.5f)
                curveTo(23.9219f, 14.3125f, 24.3672f, 14.2188f, 24.9063f, 14.2188f)
                close()
                moveTo(5.0625f, 17.0f)
                lineTo(9.4688f, 17.0f)
                curveTo(10.3438f, 17.0f, 12.4063f, 17.1367f, 12.4063f, 19.6563f)
                curveTo(12.4063f, 22.0977f, 9.8086f, 22.0938f, 9.4063f, 22.0938f)
                lineTo(5.0625f, 22.0938f)
                close()
            }
        }
        .build()
        return _behance!!
    }

private var _behance: ImageVector? = null
