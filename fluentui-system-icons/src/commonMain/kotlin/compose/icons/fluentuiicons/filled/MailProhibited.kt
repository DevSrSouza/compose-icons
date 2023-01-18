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

public val FilledGroup.MailProhibited: ImageVector
    get() {
        if (_mailProhibited != null) {
            return _mailProhibited!!
        }
        _mailProhibited = Builder(name = "MailProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                close()
                moveTo(13.5f, 6.5f)
                curveTo(13.5f, 7.3335f, 13.755f, 8.1075f, 14.1911f, 8.7482f)
                lineTo(19.7482f, 3.1911f)
                curveTo(19.1075f, 2.755f, 18.3335f, 2.5f, 17.5f, 2.5f)
                curveTo(15.2909f, 2.5f, 13.5f, 4.2909f, 13.5f, 6.5f)
                close()
                moveTo(17.5f, 10.5f)
                curveTo(19.7091f, 10.5f, 21.5f, 8.7091f, 21.5f, 6.5f)
                curveTo(21.5f, 5.6665f, 21.245f, 4.8925f, 20.8089f, 4.2518f)
                lineTo(15.2518f, 9.8089f)
                curveTo(15.8925f, 10.245f, 16.6665f, 10.5f, 17.5f, 10.5f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(19.2465f, 13.0f, 20.8321f, 12.3112f, 22.0f, 11.1904f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(8.608f)
                lineTo(11.652f, 13.6644f)
                curveTo(11.87f, 13.7785f, 12.13f, 13.7785f, 12.348f, 13.6644f)
                lineTo(14.7649f, 12.3983f)
                curveTo(15.5963f, 12.7844f, 16.523f, 13.0f, 17.5f, 13.0f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineTo(11.4982f)
                curveTo(11.1772f, 4.7696f, 11.0f, 5.6141f, 11.0f, 6.5f)
                curveTo(11.0f, 8.4925f, 11.8966f, 10.2757f, 13.3083f, 11.468f)
                lineTo(12.0f, 12.1533f)
                lineTo(2.0162f, 6.9236f)
                curveTo(2.1739f, 5.3427f, 3.4643f, 4.0954f, 5.0641f, 4.0052f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        .build()
        return _mailProhibited!!
    }

private var _mailProhibited: ImageVector? = null
