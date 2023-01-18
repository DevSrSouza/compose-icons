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

public val FilledGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
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
                verticalLineTo(21.6883f)
                curveTo(12.9736f, 21.6426f, 13.1943f, 21.5762f, 13.4089f, 21.4892f)
                lineTo(20.9075f, 18.4493f)
                curveTo(21.5679f, 18.1815f, 22.0f, 17.5401f, 22.0f, 16.8275f)
                verticalLineTo(7.1912f)
                close()
                moveTo(11.2498f, 21.6882f)
                verticalLineTo(10.7651f)
                lineTo(2.0f, 7.1913f)
                verticalLineTo(16.8275f)
                curveTo(2.0f, 17.5401f, 2.4321f, 18.1815f, 3.0925f, 18.4493f)
                lineTo(10.5911f, 21.4892f)
                curveTo(10.8056f, 21.5762f, 11.0261f, 21.6425f, 11.2498f, 21.6882f)
                close()
                moveTo(2.6327f, 5.8277f)
                lineTo(11.9998f, 9.4468f)
                lineTo(15.9168f, 7.9335f)
                lineTo(6.3743f, 4.2225f)
                lineTo(3.0925f, 5.553f)
                curveTo(2.9231f, 5.6217f, 2.7687f, 5.715f, 2.6327f, 5.8277f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
