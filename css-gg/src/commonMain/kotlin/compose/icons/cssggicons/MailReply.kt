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

public val CssGgIcons.MailReply: ImageVector
    get() {
        if (_mailReply != null) {
            return _mailReply!!
        }
        _mailReply = Builder(name = "MailReply", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3623f, 15.529f)
                lineTo(8.948f, 16.9432f)
                lineTo(3.9983f, 11.9934f)
                lineTo(8.948f, 7.0437f)
                lineTo(10.3623f, 8.4579f)
                lineTo(7.8638f, 10.9564f)
                horizontalLineTo(16.0018f)
                curveTo(18.2109f, 10.9564f, 20.0018f, 12.7472f, 20.0018f, 14.9564f)
                verticalLineTo(16.9564f)
                horizontalLineTo(18.0018f)
                verticalLineTo(14.9564f)
                curveTo(18.0018f, 13.8518f, 17.1063f, 12.9564f, 16.0018f, 12.9564f)
                horizontalLineTo(7.7896f)
                lineTo(10.3623f, 15.529f)
                close()
            }
        }
        .build()
        return _mailReply!!
    }

private var _mailReply: ImageVector? = null
