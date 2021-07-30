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

public val LineAwesomeIcons.BasketballBallSolid: ImageVector
    get() {
        if (_basketballBallSolid != null) {
            return _basketballBallSolid!!
        }
        _basketballBallSolid = Builder(name = "BasketballBallSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(14.875f, 5.0625f)
                curveTo(14.918f, 5.0586f, 14.957f, 5.0664f, 15.0f, 5.0625f)
                lineTo(15.0f, 15.0f)
                lineTo(11.9375f, 15.0f)
                curveTo(11.7227f, 12.1875f, 10.6289f, 9.6211f, 8.9063f, 7.5938f)
                curveTo(10.5508f, 6.2031f, 12.6055f, 5.293f, 14.875f, 5.0625f)
                close()
                moveTo(17.0f, 5.0625f)
                curveTo(19.3164f, 5.2695f, 21.418f, 6.1758f, 23.0938f, 7.5938f)
                curveTo(21.3711f, 9.6211f, 20.2773f, 12.1875f, 20.0625f, 15.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(7.5f, 9.0313f)
                curveTo(8.8672f, 10.6875f, 9.7305f, 12.7383f, 9.9375f, 15.0f)
                lineTo(5.0625f, 15.0f)
                curveTo(5.2656f, 12.7383f, 6.1406f, 10.6875f, 7.5f, 9.0313f)
                close()
                moveTo(24.5f, 9.0313f)
                curveTo(25.8594f, 10.6875f, 26.7344f, 12.7383f, 26.9375f, 15.0f)
                lineTo(22.0625f, 15.0f)
                curveTo(22.2695f, 12.7383f, 23.1328f, 10.6875f, 24.5f, 9.0313f)
                close()
                moveTo(5.0625f, 17.0f)
                lineTo(9.9375f, 17.0f)
                curveTo(9.7305f, 19.2617f, 8.8672f, 21.3125f, 7.5f, 22.9688f)
                curveTo(6.1406f, 21.3125f, 5.2656f, 19.2617f, 5.0625f, 17.0f)
                close()
                moveTo(11.9375f, 17.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 26.9375f)
                curveTo(12.6836f, 26.7305f, 10.582f, 25.8242f, 8.9063f, 24.4063f)
                curveTo(10.6289f, 22.3789f, 11.7227f, 19.8125f, 11.9375f, 17.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(20.0625f, 17.0f)
                curveTo(20.2773f, 19.8125f, 21.3711f, 22.3789f, 23.0938f, 24.4063f)
                curveTo(21.418f, 25.8242f, 19.3164f, 26.7305f, 17.0f, 26.9375f)
                close()
                moveTo(22.0625f, 17.0f)
                lineTo(26.9375f, 17.0f)
                curveTo(26.7344f, 19.2617f, 25.8594f, 21.3125f, 24.5f, 22.9688f)
                curveTo(23.1328f, 21.3125f, 22.2695f, 19.2617f, 22.0625f, 17.0f)
                close()
            }
        }
        .build()
        return _basketballBallSolid!!
    }

private var _basketballBallSolid: ImageVector? = null
