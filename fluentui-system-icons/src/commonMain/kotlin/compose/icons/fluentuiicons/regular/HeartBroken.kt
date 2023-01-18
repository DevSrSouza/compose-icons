package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 5.7533f)
                lineTo(12.8197f, 4.9307f)
                curveTo(14.9226f, 2.8279f, 18.3274f, 2.8279f, 20.4303f, 4.9307f)
                curveTo(22.5298f, 7.0302f, 22.5262f, 10.4239f, 20.4318f, 12.5299f)
                lineTo(12.5303f, 20.4268f)
                curveTo(12.2374f, 20.7197f, 11.7626f, 20.7197f, 11.4697f, 20.4268f)
                lineTo(3.5743f, 12.5314f)
                curveTo(1.4752f, 10.4323f, 1.4752f, 7.0291f, 3.5743f, 4.93f)
                curveTo(5.6734f, 2.8309f, 9.0766f, 2.8309f, 11.1757f, 4.93f)
                lineTo(11.999f, 5.7533f)
                close()
                moveTo(12.0f, 18.8358f)
                lineTo(19.3682f, 11.4722f)
                curveTo(20.8807f, 9.9513f, 20.8833f, 7.5051f, 19.3697f, 5.9914f)
                curveTo(17.9194f, 4.5412f, 15.612f, 4.4773f, 14.0862f, 5.7997f)
                curveTo(14.0829f, 5.8031f, 14.0794f, 5.8066f, 14.076f, 5.81f)
                lineTo(13.0684f, 6.809f)
                lineTo(12.5457f, 7.3352f)
                curveTo(12.5182f, 7.3641f, 12.489f, 7.3902f, 12.4584f, 7.4137f)
                lineTo(11.222f, 8.6394f)
                lineTo(14.0177f, 11.3101f)
                curveTo(14.1637f, 11.4496f, 14.2473f, 11.642f, 14.2496f, 11.8439f)
                curveTo(14.2519f, 12.0457f, 14.1727f, 12.24f, 14.03f, 12.3828f)
                lineTo(11.53f, 14.8828f)
                curveTo(11.2371f, 15.1757f, 10.7622f, 15.1757f, 10.4693f, 14.8828f)
                curveTo(10.1764f, 14.5899f, 10.1764f, 14.115f, 10.4693f, 13.8221f)
                lineTo(12.4267f, 11.8647f)
                lineTo(9.6287f, 9.1917f)
                curveTo(9.4823f, 9.0519f, 9.3986f, 8.8588f, 9.3968f, 8.6564f)
                curveTo(9.3949f, 8.4539f, 9.4749f, 8.2593f, 9.6187f, 8.1168f)
                lineTo(10.9356f, 6.8112f)
                lineTo(10.115f, 5.9907f)
                curveTo(8.6018f, 4.4774f, 6.1482f, 4.4774f, 4.635f, 5.9907f)
                curveTo(3.1217f, 7.5039f, 3.1217f, 9.9575f, 4.635f, 11.4707f)
                lineTo(12.0f, 18.8358f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
