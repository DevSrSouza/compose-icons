package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 210.6f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(80.0f, 87.1f)
                verticalLineTo(128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 73.9f, 40.4f)
                lineToRelative(10.9f, 12.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 64.4f, 135.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.9f, 1.8f)
                arcTo(79.9f, 79.9f, 0.0f, false, false, 120.0f, 207.6f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(207.6f)
                arcToRelative(79.2f, 79.2f, 0.0f, false, false, 39.6f, -15.3f)
                lineToRelative(26.5f, 29.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 213.9f, 210.6f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineTo(104.7f)
                lineToRelative(46.9f, 51.6f)
                arcTo(31.6f, 31.6f, 0.0f, false, true, 128.0f, 160.0f)
                close()
                moveTo(87.2f, 38.8f)
                arcTo(47.5f, 47.5f, 0.0f, false, true, 128.0f, 16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineToRelative(60.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(64.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -32.0f, -32.0f)
                arcToRelative(31.7f, 31.7f, 0.0f, false, false, -27.2f, 15.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.1f, 2.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 87.2f, 38.8f)
                close()
                moveTo(187.6f, 151.3f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, false, 4.0f, -16.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.9f, 1.8f)
                arcToRelative(78.7f, 78.7f, 0.0f, false, true, -5.0f, 20.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -7.4f, 5.1f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, -2.9f, -0.5f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 187.6f, 151.3f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
