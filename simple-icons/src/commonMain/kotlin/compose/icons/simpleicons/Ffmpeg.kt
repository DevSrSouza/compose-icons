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

public val SimpleIcons.Ffmpeg: ImageVector
    get() {
        if (_ffmpeg != null) {
            return _ffmpeg!!
        }
        _ffmpeg = Builder(name = "Ffmpeg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.72f, 17.91f)
                verticalLineTo(6.5f)
                lineToRelative(-0.53f, -0.49f)
                lineTo(9.05f, 18.52f)
                lineToRelative(-1.29f, -0.06f)
                lineTo(24.0f, 1.53f)
                lineToRelative(-0.33f, -0.95f)
                lineToRelative(-11.93f, 1.0f)
                lineToRelative(-5.75f, 6.6f)
                verticalLineToRelative(-0.23f)
                lineToRelative(4.7f, -5.39f)
                lineToRelative(-1.38f, -0.77f)
                lineToRelative(-9.11f, 0.77f)
                verticalLineToRelative(2.85f)
                lineToRelative(1.91f, 0.46f)
                verticalLineToRelative(0.01f)
                lineToRelative(0.19f, -0.01f)
                lineToRelative(-0.56f, 0.66f)
                verticalLineToRelative(10.6f)
                curveToRelative(0.609f, -0.126f, 1.22f, -0.241f, 1.83f, -0.36f)
                lineTo(14.12f, 5.22f)
                lineToRelative(0.83f, -0.04f)
                lineTo(0.0f, 21.44f)
                lineToRelative(9.67f, 0.82f)
                lineToRelative(1.35f, -0.77f)
                lineToRelative(6.82f, -6.74f)
                verticalLineToRelative(2.15f)
                lineToRelative(-5.72f, 5.57f)
                lineToRelative(11.26f, 0.95f)
                lineToRelative(0.35f, -0.94f)
                verticalLineToRelative(-3.16f)
                lineToRelative(-3.29f, -0.18f)
                curveToRelative(0.434f, -0.403f, 0.858f, -0.816f, 1.28f, -1.23f)
                close()
            }
        }
        .build()
        return _ffmpeg!!
    }

private var _ffmpeg: ImageVector? = null
