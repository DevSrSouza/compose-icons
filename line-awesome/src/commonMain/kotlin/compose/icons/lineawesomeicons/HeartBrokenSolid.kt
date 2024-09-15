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

public val LineAwesomeIcons.HeartBrokenSolid: ImageVector
    get() {
        if (_heartBrokenSolid != null) {
            return _heartBrokenSolid!!
        }
        _heartBrokenSolid = Builder(name = "HeartBrokenSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 4.0f)
                curveTo(5.362f, 4.0f, 2.0f, 7.404f, 2.0f, 11.5f)
                curveTo(2.0f, 12.928f, 2.652f, 14.153f, 3.252f, 15.049f)
                curveTo(3.852f, 15.944f, 4.465f, 16.545f, 4.465f, 16.545f)
                lineTo(16.0f, 28.082f)
                lineTo(27.535f, 16.545f)
                curveTo(27.535f, 16.545f, 30.0f, 14.357f, 30.0f, 11.5f)
                curveTo(30.0f, 7.404f, 26.638f, 4.0f, 22.5f, 4.0f)
                curveTo(20.93f, 4.0f, 19.527f, 4.523f, 18.391f, 5.148f)
                lineTo(18.061f, 5.33f)
                lineTo(16.004f, 11.0f)
                lineTo(19.625f, 11.0f)
                lineTo(16.0f, 17.215f)
                lineTo(16.0f, 13.0f)
                lineTo(12.453f, 13.0f)
                lineTo(13.998f, 5.359f)
                lineTo(13.326f, 5.014f)
                curveTo(12.249f, 4.459f, 10.952f, 4.0f, 9.5f, 4.0f)
                close()
                moveTo(9.5f, 6.0f)
                curveTo(10.278f, 6.0f, 10.996f, 6.309f, 11.707f, 6.602f)
                lineTo(10.008f, 15.0f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 21.0f)
                lineTo(16.109f, 21.0f)
                lineTo(22.0f, 10.895f)
                lineTo(22.0f, 9.0f)
                lineTo(18.855f, 9.0f)
                lineTo(19.648f, 6.816f)
                curveTo(20.522f, 6.374f, 21.486f, 6.0f, 22.5f, 6.0f)
                curveTo(25.542f, 6.0f, 28.0f, 8.496f, 28.0f, 11.5f)
                curveTo(28.0f, 13.045f, 26.131f, 15.121f, 26.131f, 15.121f)
                lineTo(26.129f, 15.123f)
                lineTo(16.0f, 25.252f)
                lineTo(5.871f, 15.123f)
                lineTo(5.869f, 15.121f)
                curveTo(5.869f, 15.121f, 5.397f, 14.657f, 4.914f, 13.936f)
                curveTo(4.431f, 13.214f, 4.0f, 12.272f, 4.0f, 11.5f)
                curveTo(4.0f, 8.496f, 6.458f, 6.0f, 9.5f, 6.0f)
                close()
            }
        }
        .build()
        return _heartBrokenSolid!!
    }

private var _heartBrokenSolid: ImageVector? = null
