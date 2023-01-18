package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2802f, 5.0345f)
                lineTo(11.1757f, 4.93f)
                curveTo(9.0766f, 2.8309f, 5.6734f, 2.8309f, 3.5743f, 4.93f)
                curveTo(1.4752f, 7.0291f, 1.4752f, 10.4323f, 3.5743f, 12.5314f)
                lineTo(11.4697f, 20.4268f)
                curveTo(11.7626f, 20.7197f, 12.2374f, 20.7197f, 12.5303f, 20.4268f)
                lineTo(20.4318f, 12.5299f)
                curveTo(22.5262f, 10.4239f, 22.5298f, 7.0302f, 20.4303f, 4.9307f)
                curveTo(18.3274f, 2.8279f, 14.9226f, 2.8279f, 12.8197f, 4.9307f)
                lineTo(12.031f, 5.7211f)
                lineTo(10.1484f, 8.7543f)
                lineTo(13.829f, 11.9748f)
                curveTo(13.9332f, 12.066f, 13.9949f, 12.1962f, 13.9995f, 12.3345f)
                curveTo(14.0041f, 12.4728f, 13.9512f, 12.6068f, 13.8533f, 12.7047f)
                lineTo(11.3533f, 15.2047f)
                curveTo(11.158f, 15.4f, 10.8415f, 15.4f, 10.6462f, 15.2047f)
                curveTo(10.4509f, 15.0094f, 10.4509f, 14.6928f, 10.6462f, 14.4976f)
                lineTo(12.7683f, 12.3755f)
                lineTo(9.1705f, 9.2274f)
                curveTo(8.9863f, 9.0662f, 8.9459f, 8.7954f, 9.0749f, 8.5875f)
                lineTo(11.2802f, 5.0345f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
