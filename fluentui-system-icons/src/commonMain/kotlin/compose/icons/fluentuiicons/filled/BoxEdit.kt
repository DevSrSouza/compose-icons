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

public val FilledGroup.BoxEdit: ImageVector
    get() {
        if (_boxEdit != null) {
            return _boxEdit!!
        }
        _boxEdit = Builder(name = "BoxEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                verticalLineTo(17.6062f)
                lineTo(18.3927f, 11.9633f)
                curveTo(19.3679f, 10.9881f, 20.8037f, 10.7541f, 22.0f, 11.2613f)
                verticalLineTo(7.1912f)
                close()
                moveTo(11.2498f, 10.7651f)
                verticalLineTo(20.6623f)
                lineTo(11.0632f, 21.4085f)
                curveTo(11.0444f, 21.4839f, 11.0298f, 21.559f, 11.0194f, 21.6335f)
                curveTo(10.8746f, 21.5943f, 10.7315f, 21.5462f, 10.5911f, 21.4892f)
                lineTo(3.0925f, 18.4493f)
                curveTo(2.4321f, 18.1815f, 2.0f, 17.5401f, 2.0f, 16.8275f)
                verticalLineTo(7.1913f)
                lineTo(11.2498f, 10.7651f)
                close()
                moveTo(2.6327f, 5.8277f)
                lineTo(11.9998f, 9.4468f)
                lineTo(15.9168f, 7.9335f)
                lineTo(6.3743f, 4.2225f)
                lineTo(3.0925f, 5.553f)
                curveTo(2.9231f, 5.6217f, 2.7687f, 5.715f, 2.6327f, 5.8277f)
                close()
                moveTo(19.0999f, 12.6704f)
                lineTo(13.1974f, 18.5729f)
                curveTo(12.8533f, 18.917f, 12.6092f, 19.3482f, 12.4911f, 19.8203f)
                lineTo(12.0334f, 21.651f)
                curveTo(11.8344f, 22.4472f, 12.5556f, 23.1683f, 13.3517f, 22.9693f)
                lineTo(15.1824f, 22.5116f)
                curveTo(15.6545f, 22.3936f, 16.0857f, 22.1494f, 16.4299f, 21.8053f)
                lineTo(22.3323f, 15.9029f)
                curveTo(23.2249f, 15.0103f, 23.2249f, 13.5631f, 22.3323f, 12.6704f)
                curveTo(21.4397f, 11.7778f, 19.9925f, 11.7778f, 19.0999f, 12.6704f)
                close()
            }
        }
        .build()
        return _boxEdit!!
    }

private var _boxEdit: ImageVector? = null
