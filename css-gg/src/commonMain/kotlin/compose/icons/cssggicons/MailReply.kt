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
                moveTo(10.362f, 15.529f)
                lineTo(8.948f, 16.943f)
                lineTo(3.998f, 11.993f)
                lineTo(8.948f, 7.044f)
                lineTo(10.362f, 8.458f)
                lineTo(7.864f, 10.956f)
                horizontalLineTo(16.002f)
                curveTo(18.211f, 10.956f, 20.002f, 12.747f, 20.002f, 14.956f)
                verticalLineTo(16.956f)
                horizontalLineTo(18.002f)
                verticalLineTo(14.956f)
                curveTo(18.002f, 13.852f, 17.106f, 12.956f, 16.002f, 12.956f)
                horizontalLineTo(7.79f)
                lineTo(10.362f, 15.529f)
                close()
            }
        }
        .build()
        return _mailReply!!
    }

private var _mailReply: ImageVector? = null
