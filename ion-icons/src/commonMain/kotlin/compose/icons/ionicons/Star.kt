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

public val IonIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.0f, 480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.39f, -3.0f)
                lineTo(256.0f, 383.76f)
                lineTo(127.39f, 477.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -24.55f, -18.08f)
                lineTo(153.0f, 310.35f)
                lineTo(23.0f, 221.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 192.0f)
                horizontalLineTo(192.38f)
                lineToRelative(48.4f, -148.95f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 30.44f, 0.0f)
                lineToRelative(48.4f, 149.0f)
                horizontalLineTo(480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.05f, 29.2f)
                lineTo(359.0f, 310.35f)
                lineToRelative(50.13f, 148.53f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 394.0f, 480.0f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
