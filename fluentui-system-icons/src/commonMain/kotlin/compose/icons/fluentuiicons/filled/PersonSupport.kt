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

public val FilledGroup.PersonSupport: ImageVector
    get() {
        if (_personSupport != null) {
            return _personSupport!!
        }
        _personSupport = Builder(name = "PersonSupport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9995f, 16.2461f)
                curveTo(19.9995f, 15.0041f, 18.9927f, 13.9972f, 17.7506f, 13.9972f)
                horizontalLineTo(6.2489f)
                curveTo(5.0069f, 13.9972f, 4.0f, 15.0041f, 4.0f, 16.2461f)
                verticalLineTo(17.1661f)
                curveTo(4.0f, 17.7382f, 4.1784f, 18.296f, 4.5104f, 18.7619f)
                curveTo(6.0525f, 20.9262f, 8.5755f, 21.9984f, 11.9965f, 21.9984f)
                curveTo(15.4167f, 21.9984f, 17.941f, 20.9267f, 19.4869f, 18.7635f)
                curveTo(19.8203f, 18.297f, 19.9995f, 17.7379f, 19.9995f, 17.1646f)
                verticalLineTo(16.2461f)
                close()
                moveTo(16.9965f, 7.0019f)
                curveTo(16.9965f, 4.2405f, 14.7579f, 2.002f, 11.9965f, 2.002f)
                curveTo(10.346f, 2.002f, 8.8822f, 2.8017f, 7.9717f, 4.0348f)
                curveTo(7.9009f, 4.0126f, 7.8256f, 4.0007f, 7.7476f, 4.0007f)
                lineTo(5.2498f, 4.0007f)
                curveTo(4.8355f, 4.0007f, 4.4998f, 4.3365f, 4.4998f, 4.7507f)
                lineTo(4.4998f, 10.2495f)
                curveTo(4.4998f, 11.7683f, 5.731f, 12.9995f, 7.2498f, 12.9995f)
                lineTo(7.4998f, 12.9995f)
                verticalLineTo(12.9952f)
                curveTo(7.5032f, 12.9952f, 7.5066f, 12.9952f, 7.51f, 12.9952f)
                curveTo(8.0609f, 12.9952f, 8.5075f, 12.5486f, 8.5075f, 11.9977f)
                curveTo(8.5075f, 11.4468f, 8.0609f, 11.0002f, 7.51f, 11.0002f)
                curveTo(7.1906f, 11.0002f, 6.9063f, 11.1503f, 6.7237f, 11.3837f)
                curveTo(6.2962f, 11.1851f, 5.9998f, 10.7519f, 5.9998f, 10.2495f)
                verticalLineTo(9.999f)
                horizontalLineTo(6.7476f)
                curveTo(7.1282f, 9.999f, 7.4805f, 9.8775f, 7.7677f, 9.6711f)
                curveTo(8.6537f, 11.0718f, 10.2165f, 12.002f, 11.9965f, 12.002f)
                curveTo(14.7579f, 12.002f, 16.9965f, 9.7634f, 16.9965f, 7.0019f)
                close()
                moveTo(6.9976f, 6.896f)
                curveTo(6.9968f, 6.9312f, 6.9965f, 6.9665f, 6.9965f, 7.0019f)
                curveTo(6.9965f, 7.0374f, 6.9968f, 7.0727f, 6.9976f, 7.1079f)
                verticalLineTo(8.249f)
                curveTo(6.9976f, 8.3871f, 6.8856f, 8.499f, 6.7476f, 8.499f)
                horizontalLineTo(5.9998f)
                lineTo(5.9998f, 5.5007f)
                horizontalLineTo(6.9976f)
                lineTo(6.9976f, 6.896f)
                close()
            }
        }
        .build()
        return _personSupport!!
    }

private var _personSupport: ImageVector? = null
