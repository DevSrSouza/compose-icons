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

public val RegularGroup.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) {
            return _microphoneStage!!
        }
        _microphoneStage = Builder(name = "MicrophoneStage", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.5f, 138.2f)
                arcTo(71.9f, 71.9f, 0.0f, false, false, 117.8f, 36.5f)
                lineToRelative(-0.7f, 0.6f)
                lineToRelative(-0.6f, 0.7f)
                arcTo(71.6f, 71.6f, 0.0f, false, false, 96.0f, 88.0f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, 0.4f, 7.7f)
                lineToRelative(-74.8f, 102.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.6f, 20.8f)
                lineToRelative(14.3f, 14.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.8f, 1.6f)
                lineToRelative(102.0f, -74.8f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, 7.7f, 0.4f)
                arcToRelative(71.6f, 71.6f, 0.0f, false, false, 50.2f, -20.5f)
                lineToRelative(0.7f, -0.6f)
                close()
                moveTo(224.0f, 88.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, true, -11.2f, 33.5f)
                lineTo(134.5f, 43.2f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 224.0f, 88.0f)
                close()
                moveTo(48.8f, 221.5f)
                lineTo(34.5f, 207.2f)
                lineToRelative(67.1f, -91.4f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, false, 38.6f, 38.6f)
                close()
                moveTo(112.0f, 88.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, true, 11.2f, -33.5f)
                lineToRelative(78.3f, 78.3f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 112.0f, 88.0f)
                close()
                moveTo(105.7f, 150.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-12.0f, 12.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(12.0f, -12.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 105.7f, 150.3f)
                close()
            }
        }
        .build()
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
