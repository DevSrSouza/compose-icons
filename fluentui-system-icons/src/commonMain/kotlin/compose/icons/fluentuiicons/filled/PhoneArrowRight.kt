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

public val FilledGroup.PhoneArrowRight: ImageVector
    get() {
        if (_phoneArrowRight != null) {
            return _phoneArrowRight!!
        }
        _phoneArrowRight = Builder(name = "PhoneArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                curveTo(14.9926f, 2.0f, 16.0f, 3.0074f, 16.0f, 4.25f)
                lineTo(16.0007f, 10.0189f)
                curveTo(12.6441f, 10.2739f, 10.0f, 13.0782f, 10.0f, 16.5f)
                curveTo(10.0f, 17.0166f, 10.0603f, 17.5191f, 10.1741f, 18.0008f)
                lineTo(8.75f, 18.0f)
                curveTo(8.3358f, 18.0f, 8.0f, 18.3358f, 8.0f, 18.75f)
                curveTo(8.0f, 19.1297f, 8.2822f, 19.4435f, 8.6482f, 19.4932f)
                lineTo(8.75f, 19.5f)
                lineTo(10.7328f, 19.5011f)
                curveTo(11.2663f, 20.5244f, 12.0643f, 21.3879f, 13.036f, 22.0011f)
                lineTo(6.25f, 22.0f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(16.5f, 11.0f)
                curveTo(19.5376f, 11.0f, 22.0f, 13.4624f, 22.0f, 16.5f)
                curveTo(22.0f, 19.5376f, 19.5376f, 22.0f, 16.5f, 22.0f)
                curveTo(13.4624f, 22.0f, 11.0f, 19.5376f, 11.0f, 16.5f)
                curveTo(11.0f, 13.4624f, 13.4624f, 11.0f, 16.5f, 11.0f)
                close()
                moveTo(16.7157f, 13.5886f)
                lineTo(16.6464f, 13.6464f)
                lineTo(16.5886f, 13.7157f)
                curveTo(16.4705f, 13.8862f, 16.4705f, 14.1138f, 16.5886f, 14.2843f)
                lineTo(16.6464f, 14.3536f)
                lineTo(18.2917f, 15.999f)
                lineTo(13.4937f, 16.0f)
                lineTo(13.4038f, 16.0081f)
                curveTo(13.1997f, 16.0451f, 13.0388f, 16.206f, 13.0018f, 16.4101f)
                lineTo(12.9937f, 16.5f)
                lineTo(13.0018f, 16.5899f)
                curveTo(13.0388f, 16.794f, 13.1997f, 16.9549f, 13.4038f, 16.9919f)
                lineTo(13.4937f, 17.0f)
                lineTo(18.2937f, 16.999f)
                lineTo(16.6464f, 18.6464f)
                lineTo(16.5886f, 18.7157f)
                curveTo(16.4536f, 18.9106f, 16.4729f, 19.18f, 16.6464f, 19.3536f)
                curveTo(16.82f, 19.5271f, 17.0894f, 19.5464f, 17.2843f, 19.4114f)
                lineTo(17.3536f, 19.3536f)
                lineTo(19.8832f, 16.8212f)
                lineTo(19.9202f, 16.7711f)
                lineTo(19.9622f, 16.691f)
                lineTo(19.9882f, 16.6083f)
                lineTo(19.9981f, 16.5444f)
                verticalLineTo(16.4557f)
                lineTo(19.9883f, 16.392f)
                lineTo(19.9624f, 16.3094f)
                lineTo(19.9205f, 16.2293f)
                lineTo(19.8832f, 16.1788f)
                lineTo(17.3536f, 13.6464f)
                lineTo(17.2843f, 13.5886f)
                curveTo(17.1382f, 13.4873f, 16.9501f, 13.4729f, 16.7919f, 13.5452f)
                lineTo(16.7157f, 13.5886f)
                close()
            }
        }
        .build()
        return _phoneArrowRight!!
    }

private var _phoneArrowRight: ImageVector? = null
