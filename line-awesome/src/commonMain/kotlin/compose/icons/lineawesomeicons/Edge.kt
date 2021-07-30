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

public val LineAwesomeIcons.Edge: ImageVector
    get() {
        if (_edge != null) {
            return _edge!!
        }
        _edge = Builder(name = "Edge", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9609f, 10.8281f)
                curveTo(7.3438f, 12.457f, 5.8477f, 14.7695f, 5.8477f, 14.7695f)
                curveTo(5.8477f, 14.7695f, 6.2344f, 9.918f, 9.9609f, 7.0742f)
                curveTo(11.4414f, 5.9453f, 13.4688f, 5.0f, 16.1914f, 5.0f)
                curveTo(17.2148f, 5.0f, 19.3594f, 5.1797f, 21.293f, 6.3711f)
                curveTo(23.2266f, 7.5625f, 24.0078f, 8.5586f, 24.8789f, 10.0234f)
                curveTo(25.2539f, 10.6523f, 25.5625f, 11.4648f, 25.7539f, 12.2461f)
                curveTo(26.1094f, 13.7109f, 26.1523f, 15.4609f, 26.1523f, 15.4609f)
                lineTo(26.1523f, 17.7695f)
                lineTo(12.3359f, 17.7695f)
                curveTo(12.3359f, 17.7695f, 12.0f, 22.4102f, 18.3555f, 22.4102f)
                curveTo(20.5625f, 22.4102f, 21.3398f, 22.0625f, 22.0664f, 21.8477f)
                curveTo(23.2031f, 21.5117f, 24.3008f, 20.7617f, 24.3008f, 20.7617f)
                lineTo(24.3047f, 25.3984f)
                curveTo(24.3047f, 25.3984f, 21.7031f, 27.0f, 17.7734f, 27.0f)
                curveTo(16.668f, 27.0f, 15.5039f, 26.9063f, 14.3789f, 26.543f)
                curveTo(13.3945f, 26.2227f, 11.3398f, 25.3633f, 9.9609f, 23.3477f)
                curveTo(9.4727f, 22.6367f, 8.9453f, 21.6875f, 8.6836f, 20.7617f)
                curveTo(8.3984f, 19.7578f, 8.4023f, 18.7852f, 8.4023f, 18.2461f)
                curveTo(8.4023f, 16.2422f, 9.0898f, 14.3281f, 10.2773f, 12.9414f)
                curveTo(11.8164f, 11.1484f, 13.7656f, 10.3594f, 13.7656f, 10.3594f)
                curveTo(13.7656f, 10.3594f, 13.1328f, 11.0977f, 12.7422f, 12.0195f)
                curveTo(12.3516f, 12.9414f, 12.2422f, 13.8672f, 12.2422f, 13.8672f)
                lineTo(20.0469f, 13.8672f)
                curveTo(20.0469f, 13.8672f, 20.5039f, 9.2031f, 15.6328f, 9.2031f)
                curveTo(13.7969f, 9.2031f, 11.543f, 9.8438f, 9.9609f, 10.8281f)
                close()
            }
        }
        .build()
        return _edge!!
    }

private var _edge: ImageVector? = null
