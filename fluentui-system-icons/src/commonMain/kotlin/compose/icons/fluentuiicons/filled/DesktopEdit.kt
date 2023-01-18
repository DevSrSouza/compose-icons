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

public val FilledGroup.DesktopEdit: ImageVector
    get() {
        if (_desktopEdit != null) {
            return _desktopEdit!!
        }
        _desktopEdit = Builder(name = "DesktopEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0999f, 1.6695f)
                lineTo(13.1974f, 7.5719f)
                curveTo(12.8533f, 7.916f, 12.6092f, 8.3472f, 12.4911f, 8.8194f)
                lineTo(12.0334f, 10.6501f)
                curveTo(11.8344f, 11.4462f, 12.5556f, 12.1673f, 13.3517f, 11.9683f)
                lineTo(15.1824f, 11.5106f)
                curveTo(15.6545f, 11.3926f, 16.0857f, 11.1485f, 16.4299f, 10.8043f)
                lineTo(22.3323f, 4.9019f)
                curveTo(23.2249f, 4.0093f, 23.2249f, 2.5621f, 22.3323f, 1.6695f)
                curveTo(21.4397f, 0.7768f, 19.9925f, 0.7768f, 19.0999f, 1.6695f)
                close()
                moveTo(12.4903f, 6.8648f)
                lineTo(16.3555f, 2.9995f)
                horizontalLineTo(4.25f)
                lineTo(4.096f, 3.0047f)
                curveTo(2.9252f, 3.0839f, 2.0f, 4.0587f, 2.0f, 5.2495f)
                verticalLineTo(15.7518f)
                lineTo(2.0052f, 15.9058f)
                curveTo(2.0844f, 17.0766f, 3.0591f, 18.0018f, 4.25f, 18.0018f)
                lineTo(8.499f, 18.0015f)
                verticalLineTo(20.4995f)
                lineTo(6.75f, 20.5f)
                lineTo(6.6482f, 20.5068f)
                curveTo(6.2821f, 20.5565f, 6.0f, 20.8703f, 6.0f, 21.25f)
                curveTo(6.0f, 21.6642f, 6.3358f, 22.0f, 6.75f, 22.0f)
                horizontalLineTo(17.25f)
                lineTo(17.3518f, 21.9931f)
                curveTo(17.7178f, 21.9434f, 18.0f, 21.6296f, 18.0f, 21.25f)
                curveTo(18.0f, 20.8357f, 17.6642f, 20.5f, 17.25f, 20.5f)
                lineTo(15.499f, 20.4995f)
                verticalLineTo(18.0015f)
                lineTo(19.7488f, 18.0018f)
                lineTo(19.9029f, 17.9966f)
                curveTo(21.0737f, 17.9174f, 21.9988f, 16.9427f, 21.9988f, 15.7518f)
                verticalLineTo(6.6495f)
                lineTo(17.1369f, 11.5114f)
                curveTo(16.6646f, 11.9837f, 16.0729f, 12.3188f, 15.4249f, 12.4808f)
                lineTo(13.5942f, 12.9385f)
                curveTo(12.0656f, 13.3206f, 10.6811f, 11.936f, 11.0632f, 10.4075f)
                lineTo(11.5209f, 8.5768f)
                curveTo(11.6829f, 7.9289f, 12.018f, 7.3371f, 12.4903f, 6.8648f)
                close()
                moveTo(13.998f, 18.0015f)
                lineTo(13.999f, 20.5f)
                horizontalLineTo(9.999f)
                lineTo(9.998f, 18.0015f)
                horizontalLineTo(13.998f)
                close()
            }
        }
        .build()
        return _desktopEdit!!
    }

private var _desktopEdit: ImageVector? = null
