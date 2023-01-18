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

public val RegularGroup.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) {
            return _speakerHigh!!
        }
        _speakerHigh = Builder(name = "SpeakerHigh", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(79.6f, 79.6f, 0.0f, false, true, -23.5f, 56.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, 2.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.3f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, -90.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.3f)
                arcTo(79.6f, 79.6f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(160.0f, 32.0f)
                lineTo(160.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.5f, 7.2f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.5f, 0.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.9f, -1.7f)
                lineTo(77.3f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 80.0f)
                lineTo(77.3f, 80.0f)
                lineToRelative(69.8f, -54.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 32.0f)
                close()
                moveTo(32.0f, 160.0f)
                lineTo(72.0f, 160.0f)
                lineTo(72.0f, 96.0f)
                lineTo(32.0f, 96.0f)
                close()
                moveTo(144.0f, 48.4f)
                lineTo(88.0f, 91.9f)
                verticalLineToRelative(72.2f)
                lineToRelative(56.0f, 43.5f)
                close()
                moveTo(184.9f, 99.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, 0.0f, 34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, 2.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 0.0f, -56.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 184.9f, 99.7f)
                close()
            }
        }
        .build()
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
