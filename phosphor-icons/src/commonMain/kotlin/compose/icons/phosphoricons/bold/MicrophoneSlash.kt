package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.9f, 31.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(76.0f, 88.6f)
                verticalLineTo(120.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.0f, 52.0f)
                arcToRelative(52.6f, 52.6f, 0.0f, false, false, 20.1f, -4.0f)
                lineToRelative(11.3f, 12.4f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 60.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 80.0f, 91.2f)
                verticalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(211.2f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 35.9f, -12.7f)
                lineToRelative(23.2f, 25.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.8f, -17.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(29.9f, 32.9f)
                close()
                moveTo(90.7f, 45.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.5f, -17.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 180.0f, 64.0f)
                verticalLineToRelative(48.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(64.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, -20.4f, 8.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 90.7f, 45.3f)
                close()
                moveTo(191.0f, 145.6f)
                arcToRelative(67.5f, 67.5f, 0.0f, false, false, 5.0f, -25.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(92.6f, 92.6f, 0.0f, false, true, -6.7f, 34.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.3f, -9.0f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
