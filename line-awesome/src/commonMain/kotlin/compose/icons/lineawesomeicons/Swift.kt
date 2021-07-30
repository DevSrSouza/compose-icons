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

public val LineAwesomeIcons.Swift: ImageVector
    get() {
        if (_swift != null) {
            return _swift!!
        }
        _swift = Builder(name = "Swift", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9375f, 5.0f)
                curveTo(6.7734f, 5.0f, 5.0f, 6.7734f, 5.0f, 8.9375f)
                lineTo(5.0f, 23.0625f)
                curveTo(5.0f, 25.2266f, 6.7734f, 27.0f, 8.9375f, 27.0f)
                lineTo(23.0625f, 27.0f)
                curveTo(25.2266f, 27.0f, 27.0f, 25.2266f, 27.0f, 23.0625f)
                lineTo(27.0f, 8.9375f)
                curveTo(27.0f, 6.7734f, 25.2266f, 5.0f, 23.0625f, 5.0f)
                close()
                moveTo(8.9375f, 7.0f)
                lineTo(23.0625f, 7.0f)
                curveTo(24.1445f, 7.0f, 25.0f, 7.8555f, 25.0f, 8.9375f)
                lineTo(25.0f, 23.0625f)
                curveTo(25.0f, 24.1445f, 24.1445f, 25.0f, 23.0625f, 25.0f)
                lineTo(8.9375f, 25.0f)
                curveTo(7.8555f, 25.0f, 7.0f, 24.1445f, 7.0f, 23.0625f)
                lineTo(7.0f, 8.9375f)
                curveTo(7.0f, 7.8555f, 7.8555f, 7.0f, 8.9375f, 7.0f)
                close()
                moveTo(17.625f, 9.5f)
                curveTo(17.625f, 9.5f, 20.1289f, 12.6602f, 18.8438f, 16.2188f)
                curveTo(18.8438f, 16.2188f, 14.3359f, 13.0234f, 12.0625f, 10.7188f)
                curveTo(12.0625f, 10.7188f, 14.8906f, 14.8164f, 15.9063f, 15.6563f)
                curveTo(15.9063f, 15.6563f, 14.2109f, 14.7539f, 10.2813f, 11.4063f)
                curveTo(10.2813f, 11.4063f, 14.8164f, 17.3008f, 16.9375f, 18.5313f)
                curveTo(16.9375f, 18.5313f, 13.7109f, 20.7227f, 9.0f, 17.625f)
                curveTo(9.0f, 17.625f, 11.4609f, 22.0f, 16.6875f, 22.0f)
                curveTo(19.0352f, 22.0f, 19.7422f, 20.7813f, 20.9063f, 20.7813f)
                curveTo(22.1172f, 20.7813f, 22.8438f, 22.0f, 22.8438f, 22.0f)
                curveTo(23.5508f, 20.2734f, 21.7813f, 18.3125f, 21.7813f, 18.3125f)
                curveTo(21.7813f, 18.3125f, 23.7773f, 13.6836f, 17.625f, 9.5f)
                close()
            }
        }
        .build()
        return _swift!!
    }

private var _swift: ImageVector? = null
