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

public val FilledGroup.MailOpenPerson: ImageVector
    get() {
        if (_mailOpenPerson != null) {
            return _mailOpenPerson!!
        }
        _mailOpenPerson = Builder(name = "MailOpenPerson", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6532f, 14.1649f)
                lineTo(2.0f, 9.127f)
                verticalLineTo(16.75f)
                lineTo(2.0053f, 16.9344f)
                curveTo(2.1009f, 18.6435f, 3.5171f, 20.0f, 5.2502f, 20.0f)
                horizontalLineTo(13.002f)
                curveTo(13.0007f, 19.9583f, 13.0f, 19.9167f, 13.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(13.0f, 18.2401f, 14.2419f, 17.0f, 15.7727f, 17.0f)
                horizontalLineTo(16.0505f)
                curveTo(15.4022f, 16.3647f, 15.0f, 15.4793f, 15.0f, 14.5f)
                curveTo(15.0f, 13.7234f, 15.2529f, 13.0059f, 15.6809f, 12.4254f)
                lineTo(12.3471f, 14.1649f)
                curveTo(12.1297f, 14.2784f, 11.8706f, 14.2784f, 11.6532f, 14.1649f)
                close()
                moveTo(11.6168f, 2.1054f)
                lineTo(3.1002f, 7.1693f)
                lineTo(2.9299f, 7.2813f)
                curveTo(2.7656f, 7.4003f, 2.6199f, 7.5397f, 2.4954f, 7.6949f)
                lineTo(12.0002f, 12.6541f)
                lineTo(21.5049f, 7.6949f)
                curveTo(21.3389f, 7.488f, 21.1352f, 7.3091f, 20.9001f, 7.1693f)
                lineTo(12.3835f, 2.1054f)
                lineTo(12.279f, 2.0538f)
                curveTo(12.0644f, 1.9677f, 11.8193f, 1.9849f, 11.6168f, 2.1054f)
                close()
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _mailOpenPerson!!
    }

private var _mailOpenPerson: ImageVector? = null
