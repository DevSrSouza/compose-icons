package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.3f, 164.3f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -2.5f, -0.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.9f, -8.0f)
                arcToRelative(65.3f, 65.3f, 0.0f, false, false, 5.7f, -20.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.9f, 1.4f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, true, -6.7f, 24.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 193.3f, 164.3f)
                close()
                moveTo(212.0f, 220.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.0f, 1.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.4f, -2.0f)
                lineToRelative(-27.7f, -30.4f)
                arcTo(78.1f, 78.1f, 0.0f, false, true, 134.0f, 205.8f)
                lineTo(134.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 205.8f)
                arcToRelative(77.9f, 77.9f, 0.0f, false, true, -71.5f, -69.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.9f, -1.4f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, false, 105.4f, 45.4f)
                lineToRelative(-13.6f, -14.9f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 82.0f, 128.0f)
                lineTo(82.0f, 86.3f)
                lineTo(43.6f, 44.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.8f, -8.0f)
                lineTo(159.3f, 153.6f)
                horizontalLineToRelative(0.0f)
                lineTo(212.4f, 212.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 212.0f, 220.4f)
                close()
                moveTo(146.1f, 156.8f)
                lineTo(94.0f, 99.5f)
                lineTo(94.0f, 128.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 52.1f, 28.8f)
                close()
                moveTo(90.8f, 48.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.3f, -2.0f)
                arcTo(33.6f, 33.6f, 0.0f, false, true, 128.0f, 30.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, 34.0f, 34.0f)
                verticalLineToRelative(60.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 64.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 88.9f, 39.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 90.8f, 48.1f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
