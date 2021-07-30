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

public val LineAwesomeIcons.LeafSolid: ImageVector
    get() {
        if (_leafSolid != null) {
            return _leafSolid!!
        }
        _leafSolid = Builder(name = "LeafSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.0313f, 4.0f)
                lineTo(24.0f, 4.4688f)
                curveTo(20.8203f, 5.8711f, 16.2266f, 6.3984f, 12.3125f, 7.7813f)
                curveTo(10.3555f, 8.4727f, 8.543f, 9.3945f, 7.1875f, 10.875f)
                curveTo(5.832f, 12.3555f, 5.0f, 14.3945f, 5.0f, 17.0f)
                curveTo(5.0f, 19.6953f, 6.5859f, 21.543f, 8.0625f, 22.5938f)
                curveTo(8.6914f, 23.043f, 9.3008f, 23.3672f, 9.8125f, 23.5938f)
                curveTo(9.1953f, 24.7383f, 8.7383f, 25.7695f, 8.4375f, 26.6563f)
                curveTo(7.8906f, 28.2539f, 7.8047f, 29.5039f, 7.8438f, 30.4063f)
                curveTo(7.8828f, 31.3086f, 8.0f, 31.9258f, 8.0f, 31.9063f)
                lineTo(10.0f, 32.0938f)
                curveTo(10.0625f, 31.3711f, 9.875f, 30.9922f, 9.8438f, 30.3125f)
                curveTo(9.8125f, 29.6328f, 9.8711f, 28.6992f, 10.3438f, 27.3125f)
                curveTo(11.2891f, 24.543f, 13.9102f, 19.9844f, 20.7188f, 12.6875f)
                lineTo(19.2813f, 11.3125f)
                curveTo(15.1992f, 15.6875f, 12.5625f, 19.0977f, 10.8438f, 21.8438f)
                curveTo(10.4063f, 21.668f, 9.8203f, 21.3984f, 9.2188f, 20.9688f)
                curveTo(8.0586f, 20.1445f, 7.0f, 18.9375f, 7.0f, 17.0f)
                curveTo(7.0f, 14.7969f, 7.6289f, 13.3438f, 8.6563f, 12.2188f)
                curveTo(9.6836f, 11.0938f, 11.1797f, 10.2891f, 12.9688f, 9.6563f)
                curveTo(16.207f, 8.5117f, 20.2148f, 7.9336f, 23.6563f, 6.6563f)
                curveTo(23.9766f, 7.8711f, 25.0f, 12.0313f, 25.0f, 18.5313f)
                curveTo(25.0f, 22.2188f, 24.1367f, 24.332f, 23.125f, 25.5f)
                curveTo(22.1133f, 26.668f, 20.8945f, 27.0f, 19.8125f, 27.0f)
                curveTo(18.7344f, 27.0f, 17.5703f, 26.4492f, 16.5625f, 25.75f)
                curveTo(15.5547f, 25.0508f, 14.8594f, 24.3203f, 14.1563f, 23.875f)
                lineTo(13.0938f, 25.5625f)
                curveTo(13.2734f, 25.6758f, 14.2695f, 26.5977f, 15.4375f, 27.4063f)
                curveTo(16.6055f, 28.2148f, 18.0859f, 29.0f, 19.8125f, 29.0f)
                curveTo(21.3516f, 29.0f, 23.2344f, 28.457f, 24.6563f, 26.8125f)
                curveTo(26.0781f, 25.168f, 27.0f, 22.5273f, 27.0f, 18.5313f)
                curveTo(27.0f, 10.7109f, 25.3438f, 5.0938f, 25.3438f, 5.0938f)
                close()
            }
        }
        .build()
        return _leafSolid!!
    }

private var _leafSolid: ImageVector? = null
