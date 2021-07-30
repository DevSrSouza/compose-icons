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

public val LineAwesomeIcons.TwitterSquare: ImageVector
    get() {
        if (_twitterSquare != null) {
            return _twitterSquare!!
        }
        _twitterSquare = Builder(name = "TwitterSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(18.6895f, 10.6289f)
                curveTo(16.9395f, 10.6289f, 15.4817f, 12.2073f, 15.8887f, 14.1543f)
                curveTo(13.5087f, 14.0323f, 11.3876f, 12.8953f, 9.9746f, 11.1543f)
                curveTo(9.7256f, 11.5783f, 9.5859f, 12.0676f, 9.5859f, 12.6016f)
                curveTo(9.5849f, 13.5616f, 10.0643f, 14.4582f, 10.8633f, 14.9902f)
                curveTo(10.3953f, 14.9732f, 9.9494f, 14.8429f, 9.5684f, 14.6289f)
                lineTo(9.5684f, 14.6621f)
                curveTo(9.5684f, 16.0571f, 10.5522f, 17.2135f, 11.8652f, 17.4805f)
                curveTo(11.4102f, 17.5995f, 11.0123f, 17.5992f, 10.5703f, 17.5332f)
                curveTo(10.9333f, 18.6712f, 11.992f, 19.4974f, 13.252f, 19.5234f)
                curveTo(12.268f, 20.2934f, 11.0344f, 20.748f, 9.6914f, 20.748f)
                curveTo(9.4554f, 20.748f, 9.232f, 20.7408f, 9.0f, 20.7148f)
                curveTo(10.269f, 21.5288f, 11.7782f, 22.0f, 13.4063f, 22.0f)
                curveTo(18.6822f, 22.0f, 21.5703f, 17.6289f, 21.5703f, 13.8359f)
                curveTo(21.5703f, 13.7129f, 21.5695f, 13.5878f, 21.5605f, 13.4648f)
                curveTo(22.1205f, 13.0578f, 22.61f, 12.5496f, 22.998f, 11.9766f)
                curveTo(22.482f, 12.1996f, 21.9237f, 12.3628f, 21.3457f, 12.4238f)
                curveTo(21.9407f, 12.0698f, 22.3915f, 11.5087f, 22.6055f, 10.8438f)
                curveTo(22.0545f, 11.1718f, 21.4322f, 11.4122f, 20.7852f, 11.5352f)
                curveTo(20.2602f, 10.9752f, 19.5165f, 10.6289f, 18.6895f, 10.6289f)
                close()
            }
        }
        .build()
        return _twitterSquare!!
    }

private var _twitterSquare: ImageVector? = null
