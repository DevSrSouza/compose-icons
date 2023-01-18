package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MailSharp: ImageVector
    get() {
        if (_mailSharp != null) {
            return _mailSharp!!
        }
        _mailSharp = Builder(name = "MailSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 80.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 96.0f)
                verticalLineTo(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 464.0f, 80.0f)
                close()
                moveTo(265.82f, 284.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.64f, 0.0f)
                lineTo(89.55f, 162.81f)
                lineToRelative(19.64f, -25.26f)
                lineTo(256.0f, 251.73f)
                lineTo(402.81f, 137.55f)
                lineToRelative(19.64f, 25.26f)
                close()
            }
        }
        .build()
        return _mailSharp!!
    }

private var _mailSharp: ImageVector? = null
