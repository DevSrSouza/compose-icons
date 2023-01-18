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

public val RegularGroup.MailWarning: ImageVector
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
                moveTo(5.25f, 4.0f)
                horizontalLineTo(13.9592f)
                lineTo(13.2098f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.3318f, 5.5f, 3.5788f, 6.2071f, 3.5058f, 7.1065f)
                lineTo(3.5f, 7.25f)
                verticalLineTo(7.679f)
                lineTo(11.3925f, 11.8328f)
                curveTo(11.8255f, 12.5197f, 12.5871f, 13.0f, 13.5083f, 13.0f)
                horizontalLineTo(13.6101f)
                lineTo(12.3493f, 13.6637f)
                curveTo(12.1619f, 13.7623f, 11.9431f, 13.7764f, 11.7468f, 13.706f)
                lineTo(11.6507f, 13.6637f)
                lineTo(3.5f, 9.374f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.6682f, 4.2071f, 18.4212f, 5.1065f, 18.4942f)
                lineTo(5.25f, 18.5f)
                horizontalLineTo(18.75f)
                curveTo(19.6682f, 18.5f, 20.4212f, 17.7929f, 20.4942f, 16.8935f)
                lineTo(20.5f, 16.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.4995f)
                curveTo(21.6723f, 13.0f, 21.8395f, 12.9831f, 22.0f, 12.9511f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(2.0f, 5.517f, 3.3565f, 4.1007f, 5.0656f, 4.0051f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        .build()
        return _mailWarning!!
    }

private var _mailWarning: ImageVector? = null
