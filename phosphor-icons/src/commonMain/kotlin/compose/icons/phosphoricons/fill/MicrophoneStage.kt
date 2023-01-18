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

public val FillGroup.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) {
            return _microphoneStage!!
        }
        _microphoneStage = Builder(name = "MicrophoneStage", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.0f, 46.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.1f, 0.5f)
                arcTo(71.9f, 71.9f, 0.0f, false, false, 96.0f, 88.0f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, 0.4f, 7.7f)
                lineToRelative(-74.8f, 102.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.6f, 20.8f)
                lineToRelative(14.3f, 14.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.8f, 1.6f)
                lineToRelative(102.0f, -74.8f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, 7.7f, 0.4f)
                arcToRelative(71.9f, 71.9f, 0.0f, false, false, 41.1f, -12.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.5f, -6.1f)
                close()
                moveTo(113.7f, 153.7f)
                lineTo(93.7f, 173.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(20.0f, -20.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
                moveTo(227.1f, 129.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.1f, 0.5f)
                lineTo(126.4f, 35.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.5f, -6.1f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 227.1f, 129.1f)
                close()
            }
        }
        .build()
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
