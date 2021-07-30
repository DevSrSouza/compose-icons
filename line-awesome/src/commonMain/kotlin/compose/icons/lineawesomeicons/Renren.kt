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

public val LineAwesomeIcons.Renren: ImageVector
    get() {
        if (_renren != null) {
            return _renren!!
        }
        _renren = Builder(name = "Renren", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5625f, 7.0f)
                curveTo(3.2813f, 7.7188f, 0.0f, 11.4492f, 0.0f, 15.9375f)
                curveTo(0.0f, 18.168f, 0.8203f, 20.2031f, 2.1563f, 21.7813f)
                curveTo(5.3281f, 20.2461f, 7.5469f, 16.793f, 7.5625f, 12.75f)
                close()
                moveTo(10.5625f, 7.0f)
                lineTo(10.5625f, 12.6875f)
                curveTo(10.5625f, 16.7461f, 12.7891f, 20.2422f, 15.9688f, 21.7813f)
                curveTo(14.6328f, 20.2031f, 13.8125f, 18.168f, 13.8125f, 15.9375f)
                curveTo(13.8125f, 13.707f, 14.6289f, 11.6719f, 15.9688f, 10.0938f)
                curveTo(14.6172f, 8.4961f, 12.7148f, 7.3594f, 10.5625f, 7.0f)
                close()
                moveTo(15.9688f, 10.0938f)
                curveTo(17.3047f, 11.6719f, 18.1875f, 13.707f, 18.1875f, 15.9375f)
                curveTo(18.1875f, 18.168f, 17.3047f, 20.2031f, 15.9688f, 21.7813f)
                curveTo(19.1406f, 20.2461f, 21.4219f, 16.7891f, 21.4375f, 12.75f)
                lineTo(21.4375f, 7.0f)
                curveTo(19.2852f, 7.3633f, 17.3203f, 8.4961f, 15.9688f, 10.0938f)
                close()
                moveTo(24.4375f, 7.0f)
                lineTo(24.4375f, 12.6875f)
                curveTo(24.4375f, 16.7461f, 26.6641f, 20.2422f, 29.8438f, 21.7813f)
                curveTo(31.1797f, 20.2031f, 32.0f, 18.168f, 32.0f, 15.9375f)
                curveTo(32.0f, 11.4492f, 28.7188f, 7.7188f, 24.4375f, 7.0f)
                close()
                moveTo(9.0625f, 18.2188f)
                curveTo(8.5f, 20.5547f, 6.8203f, 22.5469f, 4.7188f, 23.875f)
                curveTo(6.0078f, 24.582f, 7.4883f, 25.0f, 9.0625f, 25.0f)
                curveTo(10.6367f, 25.0f, 12.1172f, 24.582f, 13.4063f, 23.875f)
                curveTo(11.3086f, 22.5469f, 9.625f, 20.5547f, 9.0625f, 18.2188f)
                close()
                moveTo(22.9375f, 18.2188f)
                curveTo(22.375f, 20.5547f, 20.6953f, 22.5469f, 18.5938f, 23.875f)
                curveTo(19.8828f, 24.582f, 21.3633f, 25.0f, 22.9375f, 25.0f)
                curveTo(24.5117f, 25.0f, 25.9922f, 24.582f, 27.2813f, 23.875f)
                curveTo(25.1836f, 22.5469f, 23.5f, 20.5547f, 22.9375f, 18.2188f)
                close()
            }
        }
        .build()
        return _renren!!
    }

private var _renren: ImageVector? = null
