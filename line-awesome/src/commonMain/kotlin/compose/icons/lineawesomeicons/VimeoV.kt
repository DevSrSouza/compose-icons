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

public val LineAwesomeIcons.VimeoV: ImageVector
    get() {
        if (_vimeoV != null) {
            return _vimeoV!!
        }
        _vimeoV = Builder(name = "VimeoV", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.9883f, 10.4102f)
                curveTo(27.8828f, 12.7539f, 26.25f, 15.957f, 23.0938f, 20.0273f)
                curveTo(19.8281f, 24.2734f, 17.0703f, 26.3984f, 14.8125f, 26.3984f)
                curveTo(13.4102f, 26.3984f, 12.2266f, 25.1055f, 11.2617f, 22.5195f)
                curveTo(10.6133f, 20.1445f, 9.9688f, 17.7734f, 9.3242f, 15.4023f)
                curveTo(8.6055f, 12.8125f, 7.8359f, 11.5195f, 7.0117f, 11.5195f)
                curveTo(6.832f, 11.5195f, 6.2031f, 11.8984f, 5.1289f, 12.6523f)
                lineTo(4.0f, 11.1953f)
                curveTo(5.1836f, 10.1523f, 6.3516f, 9.1094f, 7.5039f, 8.0664f)
                curveTo(9.082f, 6.6992f, 10.2695f, 5.9805f, 11.0586f, 5.9063f)
                curveTo(12.9258f, 5.7266f, 14.0781f, 7.0039f, 14.5078f, 9.7422f)
                curveTo(14.9727f, 12.6992f, 15.2969f, 14.5352f, 15.4766f, 15.2539f)
                curveTo(16.0156f, 17.707f, 16.6094f, 18.9297f, 17.2578f, 18.9297f)
                curveTo(17.7578f, 18.9297f, 18.5117f, 18.1367f, 19.5195f, 16.5469f)
                curveTo(20.5234f, 14.9531f, 21.0625f, 13.7461f, 21.1367f, 12.9141f)
                curveTo(21.2773f, 11.543f, 20.7383f, 10.8555f, 19.5195f, 10.8555f)
                curveTo(18.9453f, 10.8555f, 18.3516f, 10.9844f, 17.7422f, 11.2461f)
                curveTo(18.9219f, 7.3789f, 21.1758f, 5.4961f, 24.5039f, 5.6055f)
                curveTo(26.9688f, 5.6758f, 28.1289f, 7.2773f, 27.9883f, 10.4102f)
                close()
            }
        }
        .build()
        return _vimeoV!!
    }

private var _vimeoV: ImageVector? = null
