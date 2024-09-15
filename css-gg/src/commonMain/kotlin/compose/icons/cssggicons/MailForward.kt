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
                moveTo(13.638f, 15.529f)
                lineTo(15.052f, 16.943f)
                lineTo(20.002f, 11.993f)
                lineTo(15.052f, 7.044f)
                lineTo(13.638f, 8.458f)
                lineTo(16.136f, 10.956f)
                horizontalLineTo(7.998f)
                curveTo(5.789f, 10.956f, 3.998f, 12.747f, 3.998f, 14.956f)
                verticalLineTo(16.956f)
                horizontalLineTo(5.998f)
                verticalLineTo(14.956f)
                curveTo(5.998f, 13.852f, 6.894f, 12.956f, 7.998f, 12.956f)
                horizontalLineTo(16.21f)
                lineTo(13.638f, 15.529f)
                close()
            }
        }
        .build()
        return _mailForward!!
    }

private var _mailForward: ImageVector? = null
