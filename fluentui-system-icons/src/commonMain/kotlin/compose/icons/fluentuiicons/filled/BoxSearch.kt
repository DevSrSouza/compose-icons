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

public val FilledGroup.BoxSearch: ImageVector
    get() {
        if (_boxSearch != null) {
            return _boxSearch!!
        }
        _boxSearch = Builder(name = "BoxSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4089f, 2.513f)
                curveTo(12.5053f, 2.1467f, 11.4947f, 2.1467f, 10.5911f, 2.513f)
                lineTo(8.4006f, 3.4011f)
                lineTo(17.9928f, 7.1314f)
                lineTo(21.3671f, 5.8276f)
                curveTo(21.2312f, 5.7149f, 21.0769f, 5.6217f, 20.9075f, 5.553f)
                lineTo(13.4089f, 2.513f)
                close()
                moveTo(22.0f, 7.1912f)
                lineTo(12.7498f, 10.7651f)
                verticalLineTo(12.4778f)
                curveTo(13.7323f, 11.5616f, 15.0507f, 11.001f, 16.5f, 11.001f)
                curveTo(19.5212f, 11.001f, 21.9734f, 13.4369f, 21.9998f, 16.4518f)
                lineTo(22.0f, 7.1912f)
                close()
                moveTo(11.2498f, 14.8574f)
                curveTo(11.0875f, 15.3764f, 11.0f, 15.9285f, 11.0f, 16.501f)
                curveTo(11.0f, 17.0735f, 11.0875f, 17.6256f, 11.2498f, 18.1446f)
                verticalLineTo(21.6882f)
                curveTo(11.0261f, 21.6425f, 10.8056f, 21.5762f, 10.5911f, 21.4892f)
                lineTo(3.0925f, 18.4493f)
                curveTo(2.4321f, 18.1815f, 2.0f, 17.5401f, 2.0f, 16.8275f)
                verticalLineTo(7.1913f)
                lineTo(11.2498f, 10.7651f)
                verticalLineTo(14.8574f)
                close()
                moveTo(2.6327f, 5.8277f)
                lineTo(11.9998f, 9.4468f)
                lineTo(15.9168f, 7.9335f)
                lineTo(6.3743f, 4.2225f)
                lineTo(3.0925f, 5.553f)
                curveTo(2.9231f, 5.6217f, 2.7687f, 5.715f, 2.6327f, 5.8277f)
                close()
                moveTo(20.1681f, 19.1084f)
                curveTo(20.6919f, 18.3728f, 21.0f, 17.4728f, 21.0f, 16.501f)
                curveTo(21.0f, 14.0157f, 18.9853f, 12.001f, 16.5f, 12.001f)
                curveTo(14.0147f, 12.001f, 12.0f, 14.0157f, 12.0f, 16.501f)
                curveTo(12.0f, 18.9863f, 14.0147f, 21.001f, 16.5f, 21.001f)
                curveTo(17.4719f, 21.001f, 18.3718f, 20.6929f, 19.1074f, 20.169f)
                lineTo(21.7197f, 22.7813f)
                curveTo(22.0126f, 23.0742f, 22.4874f, 23.0742f, 22.7803f, 22.7813f)
                curveTo(23.0732f, 22.4884f, 23.0732f, 22.0135f, 22.7803f, 21.7206f)
                lineTo(20.1681f, 19.1084f)
                close()
                moveTo(19.5f, 16.501f)
                curveTo(19.5f, 18.1578f, 18.1569f, 19.501f, 16.5f, 19.501f)
                curveTo(14.8431f, 19.501f, 13.5f, 18.1578f, 13.5f, 16.501f)
                curveTo(13.5f, 14.8441f, 14.8431f, 13.501f, 16.5f, 13.501f)
                curveTo(18.1569f, 13.501f, 19.5f, 14.8441f, 19.5f, 16.501f)
                close()
            }
        }
        .build()
        return _boxSearch!!
    }

private var _boxSearch: ImageVector? = null
