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

public val BoldGroup.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) {
            return _microphoneStage!!
        }
        _microphoneStage = Builder(name = "MicrophoneStage", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.6f, 140.8f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 115.2f, 33.4f)
                lineToRelative(-0.9f, 0.9f)
                lineToRelative(-0.9f, 0.9f)
                arcTo(75.9f, 75.9f, 0.0f, false, false, 92.0f, 88.0f)
                quadToRelative(0.0f, 3.3f, 0.3f, 6.6f)
                lineTo(18.4f, 195.4f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 2.0f, 25.9f)
                lineToRelative(14.3f, 14.3f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 25.9f, 2.0f)
                lineToRelative(100.8f, -73.9f)
                quadToRelative(3.3f, 0.3f, 6.6f, 0.3f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, 52.8f, -21.4f)
                lineToRelative(0.9f, -0.9f)
                close()
                moveTo(220.0f, 88.0f)
                arcToRelative(51.2f, 51.2f, 0.0f, false, true, -7.8f, 27.3f)
                lineTo(140.7f, 43.8f)
                arcTo(51.2f, 51.2f, 0.0f, false, true, 168.0f, 36.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 220.0f, 88.0f)
                close()
                moveTo(116.0f, 88.0f)
                arcToRelative(51.2f, 51.2f, 0.0f, false, true, 7.8f, -27.3f)
                lineToRelative(71.5f, 71.5f)
                arcTo(51.2f, 51.2f, 0.0f, false, true, 168.0f, 140.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 116.0f, 88.0f)
                close()
                moveTo(49.2f, 216.2f)
                lineToRelative(-9.4f, -9.4f)
                lineToRelative(61.0f, -83.3f)
                arcToRelative(76.9f, 76.9f, 0.0f, false, false, 31.7f, 31.7f)
                close()
            }
        }
        .build()
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
