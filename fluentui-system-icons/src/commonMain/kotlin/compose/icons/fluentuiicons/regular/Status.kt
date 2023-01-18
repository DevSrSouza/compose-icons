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

public val RegularGroup.Status: ImageVector
    get() {
        if (_status != null) {
            return _status!!
        }
        _status = Builder(name = "Status", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.9999f)
                curveTo(13.1135f, 2.9999f, 14.1797f, 3.2021f, 15.164f, 3.5718f)
                lineTo(13.9808f, 4.7643f)
                curveTo(13.3498f, 4.5919f, 12.6856f, 4.4999f, 12.0f, 4.4999f)
                curveTo(7.8579f, 4.4999f, 4.5f, 7.8578f, 4.5f, 11.9999f)
                curveTo(4.5f, 13.4248f, 4.8973f, 14.7892f, 5.6358f, 15.9703f)
                curveTo(5.9376f, 16.453f, 6.2937f, 16.9002f, 6.6964f, 17.3029f)
                curveTo(7.0985f, 17.7051f, 7.5449f, 18.0607f, 8.0267f, 18.3623f)
                curveTo(9.2084f, 19.102f, 10.5739f, 19.4999f, 12.0f, 19.4999f)
                curveTo(16.1421f, 19.4999f, 19.5f, 16.1421f, 19.5f, 11.9999f)
                curveTo(19.5f, 11.3433f, 19.4156f, 10.7064f, 19.2571f, 10.0994f)
                lineTo(20.4505f, 8.8961f)
                curveTo(20.8059f, 9.8636f, 21.0f, 10.9091f, 21.0f, 11.9999f)
                curveTo(21.0f, 16.9705f, 16.9706f, 20.9999f, 12.0f, 20.9999f)
                curveTo(10.2904f, 20.9999f, 8.6495f, 20.5217f, 7.2308f, 19.6337f)
                curveTo(6.6529f, 19.272f, 6.1177f, 18.8456f, 5.6357f, 18.3635f)
                curveTo(5.1529f, 17.8807f, 4.726f, 17.3445f, 4.364f, 16.7656f)
                curveTo(3.4774f, 15.3477f, 3.0f, 13.7081f, 3.0f, 11.9999f)
                curveTo(3.0f, 7.0294f, 7.0294f, 2.9999f, 12.0f, 2.9999f)
                close()
                moveTo(21.0602f, 2.6719f)
                lineTo(21.2062f, 2.8078f)
                curveTo(22.2817f, 3.884f, 22.285f, 5.6271f, 21.2135f, 6.7072f)
                lineTo(14.9096f, 13.0616f)
                curveTo(14.7291f, 13.2436f, 14.5049f, 13.3763f, 14.2585f, 13.447f)
                lineTo(10.0461f, 14.6559f)
                curveTo(9.7806f, 14.7321f, 9.5037f, 14.5786f, 9.4275f, 14.3132f)
                curveTo(9.4017f, 14.2231f, 9.4017f, 14.1275f, 9.4275f, 14.0374f)
                lineTo(10.6378f, 9.8178f)
                curveTo(10.7074f, 9.5752f, 10.837f, 9.3541f, 11.0147f, 9.175f)
                lineTo(17.3236f, 2.8151f)
                curveTo(18.3448f, 1.7857f, 19.9803f, 1.7364f, 21.0602f, 2.6719f)
                close()
                moveTo(18.3886f, 3.8715f)
                lineTo(12.0796f, 10.2314f)
                lineTo(11.3669f, 12.7163f)
                lineTo(13.8447f, 12.0052f)
                lineTo(20.1486f, 5.6508f)
                curveTo(20.6057f, 5.1899f, 20.6349f, 4.4651f, 20.2371f, 3.9705f)
                lineTo(20.1415f, 3.8644f)
                curveTo(19.6555f, 3.3823f, 18.8707f, 3.3855f, 18.3886f, 3.8715f)
                close()
            }
        }
        .build()
        return _status!!
    }

private var _status: ImageVector? = null
