package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Voidlinux: ImageVector
    get() {
        if (_voidlinux != null) {
            return _voidlinux!!
        }
        _voidlinux = Builder(name = "Voidlinux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.818f, 12.0f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, -3.82f, 3.82f)
                arcTo(3.82f, 3.82f, 0.0f, false, true, 8.178f, 12.0f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, 3.82f, -3.82f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, 3.82f, 3.82f)
                close()
                moveTo(18.997f, 21.73f)
                lineTo(16.271f, 19.005f)
                arcTo(8.212f, 8.212f, 0.0f, false, true, 12.0f, 20.212f)
                arcTo(8.212f, 8.212f, 0.0f, false, true, 3.788f, 12.0f)
                arcToRelative(8.212f, 8.212f, 0.0f, false, true, 1.209f, -4.269f)
                lineToRelative(-2.73f, -2.73f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.997f, -2.27f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.997f, 2.27f)
                lineTo(7.73f, 4.994f)
                arcTo(8.212f, 8.212f, 0.0f, false, true, 12.0f, 3.788f)
                arcTo(8.212f, 8.212f, 0.0f, false, true, 20.212f, 12.0f)
                arcToRelative(8.212f, 8.212f, 0.0f, false, true, -1.209f, 4.269f)
                lineToRelative(2.73f, 2.73f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 12.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _voidlinux!!
    }

private var _voidlinux: ImageVector? = null
