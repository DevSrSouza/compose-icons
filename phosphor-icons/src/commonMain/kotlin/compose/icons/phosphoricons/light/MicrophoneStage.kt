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

public val LightGroup.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) {
            return _microphoneStage!!
        }
        _microphoneStage = Builder(name = "MicrophoneStage", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.8f, 137.2f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, -99.0f, -99.0f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-0.3f, 0.3f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 98.0f, 88.0f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, false, 0.5f, 8.3f)
                lineTo(23.2f, 198.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.4f, 18.2f)
                lineToRelative(14.3f, 14.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, 4.1f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, 8.3f, -2.7f)
                lineToRelative(102.6f, -75.3f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, false, 8.3f, 0.5f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 49.2f, -20.2f)
                lineToRelative(0.3f, -0.3f)
                close()
                moveTo(226.0f, 88.0f)
                arcToRelative(57.8f, 57.8f, 0.0f, false, true, -13.0f, 36.5f)
                lineTo(131.5f, 43.0f)
                arcTo(57.9f, 57.9f, 0.0f, false, true, 226.0f, 88.0f)
                close()
                moveTo(50.0f, 223.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.6f, -0.2f)
                lineTo(33.1f, 208.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.2f, -2.6f)
                lineToRelative(69.2f, -94.4f)
                arcToRelative(70.8f, 70.8f, 0.0f, false, false, 42.3f, 42.3f)
                close()
                moveTo(110.0f, 88.0f)
                arcToRelative(57.8f, 57.8f, 0.0f, false, true, 13.0f, -36.5f)
                lineTo(204.5f, 133.0f)
                arcTo(57.9f, 57.9f, 0.0f, false, true, 110.0f, 88.0f)
                close()
                moveTo(104.2f, 151.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-12.0f, 12.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(12.0f, -12.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 104.2f, 151.8f)
                close()
            }
        }
        .build()
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
