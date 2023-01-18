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

public val FillGroup.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) {
            return _speakerLow!!
        }
        _speakerLow = Builder(name = "SpeakerLow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.5f, 24.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.4f, 0.9f)
                lineTo(77.3f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(77.3f, 176.0f)
                lineToRelative(69.8f, 54.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 152.0f, 232.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.5f, -0.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f)
                lineTo(160.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 155.5f, 24.8f)
                close()
                moveTo(32.0f, 96.0f)
                lineTo(72.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(32.0f, 160.0f)
                close()
                moveTo(208.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -11.7f, 28.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, -2.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, -11.3f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 0.0f, -34.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 0.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 208.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
