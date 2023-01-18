package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.4f, 221.9f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-26.5f, -29.1f)
                arcTo(79.2f, 79.2f, 0.0f, false, true, 136.0f, 207.6f)
                lineTo(136.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 207.6f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, true, -71.5f, -70.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.9f, -1.8f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 100.4f, 45.3f)
                lineToRelative(-10.9f, -12.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 128.0f)
                lineTo(80.0f, 87.1f)
                lineTo(42.1f, 45.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.9f, 34.6f)
                lineToRelative(160.0f, 176.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 213.4f, 221.9f)
                close()
                moveTo(162.1f, 129.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.9f, 2.6f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, false, 2.9f, -0.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.1f, -7.5f)
                lineTo(176.0f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                arcTo(47.5f, 47.5f, 0.0f, false, false, 87.2f, 38.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.8f, 9.6f)
                close()
                moveTo(192.2f, 161.7f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 2.9f, 0.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 7.4f, -5.1f)
                arcToRelative(78.7f, 78.7f, 0.0f, false, false, 5.0f, -20.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.9f, -1.8f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, -4.0f, 16.2f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 192.2f, 161.7f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
