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

public val IonIcons.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.59f, 227.05f)
                lineToRelative(-0.16f, -0.07f)
                lineTo(49.35f, 49.84f)
                arcTo(23.56f, 23.56f, 0.0f, false, false, 27.14f, 52.0f)
                arcTo(24.65f, 24.65f, 0.0f, false, false, 16.0f, 72.59f)
                verticalLineTo(185.88f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 19.52f, 23.57f)
                lineToRelative(232.93f, 43.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.86f)
                lineTo(35.53f, 303.45f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 16.0f, 327.0f)
                verticalLineTo(440.31f)
                arcTo(23.57f, 23.57f, 0.0f, false, false, 26.59f, 460.0f)
                arcToRelative(23.94f, 23.94f, 0.0f, false, false, 13.22f, 4.0f)
                arcToRelative(24.55f, 24.55f, 0.0f, false, false, 9.52f, -1.93f)
                lineTo(476.4f, 285.94f)
                lineToRelative(0.19f, -0.09f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -58.8f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
