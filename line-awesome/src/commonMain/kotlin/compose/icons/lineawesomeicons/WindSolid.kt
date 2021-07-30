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

public val LineAwesomeIcons.WindSolid: ImageVector
    get() {
        if (_windSolid != null) {
            return _windSolid!!
        }
        _windSolid = Builder(name = "WindSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(12.7734f, 3.0f, 9.957f, 5.2578f, 9.2031f, 8.3438f)
                curveTo(7.957f, 8.8281f, 6.9492f, 9.7969f, 6.418f, 11.0156f)
                curveTo(2.9219f, 10.7578f, 0.0f, 13.5547f, 0.0f, 17.0f)
                curveTo(0.0f, 20.3086f, 2.6914f, 23.0f, 6.0f, 23.0f)
                lineTo(6.0f, 21.0f)
                curveTo(3.793f, 21.0f, 2.0f, 19.207f, 2.0f, 17.0f)
                curveTo(2.0f, 14.793f, 3.793f, 13.0f, 6.0f, 13.0f)
                curveTo(6.2773f, 13.0f, 6.5664f, 13.0352f, 6.8828f, 13.1055f)
                lineTo(7.8594f, 13.3281f)
                lineTo(8.0781f, 12.3477f)
                curveTo(8.3203f, 11.2422f, 9.1992f, 10.3555f, 10.3047f, 10.0938f)
                lineTo(10.9648f, 9.9375f)
                lineTo(11.0625f, 9.2656f)
                curveTo(11.418f, 6.832f, 13.543f, 5.0f, 16.0f, 5.0f)
                curveTo(17.8945f, 5.0f, 19.6055f, 6.0547f, 20.4609f, 7.75f)
                lineTo(20.8555f, 8.5313f)
                lineTo(21.6836f, 8.2422f)
                curveTo(22.1523f, 8.082f, 22.582f, 8.0f, 23.0f, 8.0f)
                curveTo(25.207f, 8.0f, 27.0f, 9.793f, 27.0f, 12.0f)
                curveTo(27.0f, 12.0391f, 26.9922f, 12.0742f, 26.9844f, 12.1094f)
                curveTo(26.9766f, 12.1797f, 26.9688f, 12.25f, 26.9648f, 12.3164f)
                lineTo(26.9023f, 13.0352f)
                lineTo(27.5664f, 13.3203f)
                curveTo(29.0469f, 13.9492f, 30.0f, 15.3945f, 30.0f, 17.0f)
                curveTo(30.0f, 19.207f, 28.207f, 21.0f, 26.0f, 21.0f)
                lineTo(23.457f, 21.0f)
                curveTo(23.7188f, 21.2891f, 23.9492f, 21.6016f, 24.1484f, 21.9375f)
                curveTo(24.3477f, 22.2734f, 24.5156f, 22.6289f, 24.6484f, 23.0f)
                lineTo(26.0f, 23.0f)
                curveTo(29.3086f, 23.0f, 32.0f, 20.3125f, 32.0f, 17.0f)
                curveTo(32.0f, 14.8359f, 30.8398f, 12.8672f, 28.9961f, 11.8008f)
                curveTo(28.8906f, 8.5859f, 26.2422f, 6.0f, 23.0f, 6.0f)
                curveTo(22.6094f, 6.0f, 22.2227f, 6.043f, 21.8281f, 6.125f)
                curveTo(20.5352f, 4.1797f, 18.3711f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(15.5f, 12.0f)
                curveTo(14.3633f, 12.0f, 13.3398f, 12.5508f, 12.7031f, 13.3984f)
                lineTo(14.3008f, 14.5977f)
                curveTo(14.5742f, 14.2344f, 15.0039f, 14.0f, 15.5f, 14.0f)
                curveTo(16.3398f, 14.0f, 17.0f, 14.6602f, 17.0f, 15.5f)
                curveTo(17.0f, 16.3398f, 16.3398f, 17.0f, 15.5f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 19.0f)
                lineTo(15.5f, 19.0f)
                curveTo(17.4219f, 19.0f, 19.0f, 17.4219f, 19.0f, 15.5f)
                curveTo(19.0f, 13.5781f, 17.4219f, 12.0f, 15.5f, 12.0f)
                close()
                moveTo(8.0f, 21.0f)
                lineTo(8.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                curveTo(11.5664f, 23.0f, 12.0f, 23.4336f, 12.0f, 24.0f)
                curveTo(12.0f, 24.5664f, 11.5664f, 25.0f, 11.0f, 25.0f)
                curveTo(10.625f, 25.0f, 10.3086f, 24.8008f, 10.1367f, 24.5f)
                lineTo(8.4063f, 25.5117f)
                curveTo(8.9297f, 26.3984f, 9.9023f, 27.0f, 11.0f, 27.0f)
                curveTo(12.6445f, 27.0f, 14.0f, 25.6445f, 14.0f, 24.0f)
                curveTo(14.0f, 23.6484f, 13.9258f, 23.3164f, 13.8125f, 23.0f)
                lineTo(19.0f, 23.0f)
                curveTo(20.1172f, 23.0f, 21.0f, 23.8828f, 21.0f, 25.0f)
                curveTo(21.0f, 26.1172f, 20.1172f, 27.0f, 19.0f, 27.0f)
                curveTo(18.1211f, 27.0f, 17.3867f, 26.4375f, 17.1133f, 25.6641f)
                lineTo(15.2266f, 26.3281f)
                curveTo(15.7773f, 27.8906f, 17.2656f, 29.0f, 19.0f, 29.0f)
                curveTo(21.1992f, 29.0f, 23.0f, 27.1992f, 23.0f, 25.0f)
                curveTo(23.0f, 22.8008f, 21.1992f, 21.0f, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _windSolid!!
    }

private var _windSolid: ImageVector? = null
