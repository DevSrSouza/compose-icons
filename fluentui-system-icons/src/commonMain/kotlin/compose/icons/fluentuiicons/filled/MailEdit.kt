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

public val FilledGroup.MailEdit: ImageVector
    get() {
        if (_mailEdit != null) {
            return _mailEdit!!
        }
        _mailEdit = Builder(name = "MailEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.2603f)
                verticalLineTo(7.608f)
                lineTo(12.348f, 12.6644f)
                curveTo(12.13f, 12.7785f, 11.87f, 12.7785f, 11.652f, 12.6644f)
                lineTo(2.0f, 7.608f)
                verticalLineTo(15.75f)
                lineTo(2.0051f, 15.9344f)
                curveTo(2.1007f, 17.6435f, 3.517f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(11.717f)
                curveTo(11.9006f, 18.5781f, 12.1624f, 18.1927f, 12.4903f, 17.8648f)
                lineTo(18.3927f, 11.9624f)
                curveTo(19.3679f, 10.9871f, 20.8037f, 10.7531f, 22.0f, 11.2603f)
                close()
                moveTo(18.75f, 3.0f)
                horizontalLineTo(5.25f)
                lineTo(5.0641f, 3.0052f)
                curveTo(3.4643f, 3.0954f, 2.1739f, 4.3427f, 2.0162f, 5.9236f)
                lineTo(12.0f, 11.1533f)
                lineTo(21.9838f, 5.9236f)
                curveTo(21.8201f, 4.2819f, 20.4347f, 3.0f, 18.75f, 3.0f)
                close()
                moveTo(19.0999f, 12.6695f)
                lineTo(13.1974f, 18.5719f)
                curveTo(12.8533f, 18.916f, 12.6092f, 19.3472f, 12.4911f, 19.8194f)
                lineTo(12.0334f, 21.6501f)
                curveTo(11.8344f, 22.4462f, 12.5556f, 23.1674f, 13.3517f, 22.9683f)
                lineTo(15.1824f, 22.5106f)
                curveTo(15.6545f, 22.3926f, 16.0857f, 22.1485f, 16.4299f, 21.8043f)
                lineTo(22.3323f, 15.9019f)
                curveTo(23.2249f, 15.0093f, 23.2249f, 13.5621f, 22.3323f, 12.6695f)
                curveTo(21.4397f, 11.7768f, 19.9925f, 11.7768f, 19.0999f, 12.6695f)
                close()
            }
        }
        .build()
        return _mailEdit!!
    }

private var _mailEdit: ImageVector? = null
