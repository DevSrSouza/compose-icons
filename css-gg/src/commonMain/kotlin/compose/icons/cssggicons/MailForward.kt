package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MailForward: ImageVector
    get() {
        if (_mailForward != null) {
            return _mailForward!!
        }
        _mailForward = Builder(name = "MailForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.6378f, 15.529f)
                lineTo(15.052f, 16.9432f)
                lineTo(20.0018f, 11.9934f)
                lineTo(15.052f, 7.0437f)
                lineTo(13.6378f, 8.4579f)
                lineTo(16.1363f, 10.9564f)
                horizontalLineTo(7.9982f)
                curveTo(5.7891f, 10.9564f, 3.9982f, 12.7472f, 3.9982f, 14.9564f)
                verticalLineTo(16.9564f)
                horizontalLineTo(5.9982f)
                verticalLineTo(14.9564f)
                curveTo(5.9982f, 13.8518f, 6.8937f, 12.9564f, 7.9982f, 12.9564f)
                horizontalLineTo(16.2104f)
                lineTo(13.6378f, 15.529f)
                close()
            }
        }
        .build()
        return _mailForward!!
    }

private var _mailForward: ImageVector? = null
