package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) {
            return _microphoneStage!!
        }
        _microphoneStage = Builder(name = "MicrophoneStage", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.3f, 135.8f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -96.1f, -96.1f)
                lineToRelative(-0.3f, 0.2f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.2f, -0.2f, 0.3f)
                arcTo(67.7f, 67.7f, 0.0f, false, false, 100.0f, 88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.6f, 8.8f)
                lineTo(24.8f, 200.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 26.0f, 215.7f)
                lineTo(40.3f, 230.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 15.6f, 1.2f)
                lineToRelative(103.3f, -75.8f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 8.8f, 0.6f)
                arcToRelative(67.7f, 67.7f, 0.0f, false, false, 47.8f, -19.7f)
                lineToRelative(0.3f, -0.2f)
                close()
                moveTo(228.0f, 88.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, -14.9f, 39.5f)
                lineTo(128.5f, 42.9f)
                arcTo(59.9f, 59.9f, 0.0f, false, true, 228.0f, 88.0f)
                close()
                moveTo(51.2f, 224.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.2f, -0.4f)
                lineTo(31.7f, 210.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.4f, -5.2f)
                lineToRelative(71.5f, -97.5f)
                arcToRelative(68.2f, 68.2f, 0.0f, false, false, 45.9f, 45.9f)
                close()
                moveTo(108.0f, 88.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, 14.9f, -39.5f)
                lineToRelative(84.6f, 84.6f)
                arcTo(59.9f, 59.9f, 0.0f, false, true, 108.0f, 88.0f)
                close()
                moveTo(102.8f, 153.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-12.0f, 12.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(12.0f, -12.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 102.8f, 153.2f)
                close()
            }
        }
        .build()
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
