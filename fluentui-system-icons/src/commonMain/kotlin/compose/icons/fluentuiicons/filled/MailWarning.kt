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

public val FilledGroup.MailWarning: ImageVector
    get() {
        if (_mailWarning != null) {
            return _mailWarning!!
        }
        _mailWarning = Builder(name = "MailWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.161f, 1.8301f)
                lineTo(12.1641f, 9.8284f)
                curveTo(11.6654f, 10.8262f, 12.3913f, 12.0f, 13.507f, 12.0f)
                horizontalLineTo(21.5008f)
                curveTo(22.6165f, 12.0f, 23.3424f, 10.8263f, 22.8437f, 9.8284f)
                lineTo(18.8468f, 1.8301f)
                curveTo(18.2938f, 0.7233f, 16.7141f, 0.7233f, 16.161f, 1.8301f)
                close()
                moveTo(18.0043f, 4.4956f)
                verticalLineTo(7.4974f)
                curveTo(18.0043f, 7.7737f, 17.7803f, 7.9976f, 17.5039f, 7.9976f)
                curveTo(17.2276f, 7.9976f, 17.0035f, 7.7737f, 17.0035f, 7.4974f)
                verticalLineTo(4.4956f)
                curveTo(17.0035f, 4.2193f, 17.2276f, 3.9954f, 17.5039f, 3.9954f)
                curveTo(17.7803f, 3.9954f, 18.0043f, 4.2193f, 18.0043f, 4.4956f)
                close()
                moveTo(17.5039f, 9.9988f)
                curveTo(17.2276f, 9.9988f, 17.0035f, 9.7748f, 17.0035f, 9.4985f)
                curveTo(17.0035f, 9.2222f, 17.2276f, 8.9982f, 17.5039f, 8.9982f)
                curveTo(17.7803f, 8.9982f, 18.0043f, 9.2222f, 18.0043f, 9.4985f)
                curveTo(18.0043f, 9.7748f, 17.7803f, 9.9988f, 17.5039f, 9.9988f)
                close()
                moveTo(21.4995f, 13.0f)
                horizontalLineTo(13.6162f)
                lineTo(12.348f, 13.6644f)
                curveTo(12.13f, 13.7785f, 11.87f, 13.7785f, 11.652f, 13.6644f)
                lineTo(2.0f, 8.608f)
                verticalLineTo(16.75f)
                lineTo(2.0051f, 16.9344f)
                curveTo(2.1007f, 18.6435f, 3.517f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(18.75f)
                lineTo(18.9344f, 19.9949f)
                curveTo(20.6435f, 19.8992f, 22.0f, 18.483f, 22.0f, 16.75f)
                verticalLineTo(12.9511f)
                curveTo(21.8395f, 12.9831f, 21.6723f, 13.0f, 21.4995f, 13.0f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineTo(13.9592f)
                lineTo(11.2708f, 9.3809f)
                curveTo(10.851f, 10.2213f, 10.9521f, 11.1365f, 11.3948f, 11.8363f)
                lineTo(2.0162f, 6.9236f)
                curveTo(2.1739f, 5.3427f, 3.4643f, 4.0954f, 5.0641f, 4.0052f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        .build()
        return _mailWarning!!
    }

private var _mailWarning: ImageVector? = null
