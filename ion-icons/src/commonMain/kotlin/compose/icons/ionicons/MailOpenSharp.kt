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

public val IonIcons.MailOpenSharp: ImageVector
    get() {
        if (_mailOpenSharp != null) {
            return _mailOpenSharp!!
        }
        _mailOpenSharp = Builder(name = "MailOpenSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.05f, 168.36f)
                lineTo(263.24f, 65.69f)
                arcToRelative(16.37f, 16.37f, 0.0f, false, false, -14.48f, 0.0f)
                lineTo(41.0f, 168.36f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.0f, 14.31f)
                verticalLineTo(432.0f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, 16.19f, 16.0f)
                horizontalLineTo(463.81f)
                arcTo(16.09f, 16.09f, 0.0f, false, false, 480.0f, 432.0f)
                verticalLineTo(182.67f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 471.05f, 168.36f)
                close()
                moveTo(256.0f, 97.89f)
                lineToRelative(173.0f, 85.44f)
                lineTo(253.3f, 270.11f)
                lineToRelative(-173.0f, -85.44f)
                close()
            }
        }
        .build()
        return _mailOpenSharp!!
    }

private var _mailOpenSharp: ImageVector? = null
