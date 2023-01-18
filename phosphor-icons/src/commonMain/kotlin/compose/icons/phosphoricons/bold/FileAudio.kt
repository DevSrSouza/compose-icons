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

public val BoldGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.5f, 79.5f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                lineTo(180.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 216.5f, 79.5f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(101.1f, 133.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -12.8f, 1.7f)
                lineTo(67.7f, 152.0f)
                lineTo(48.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(67.7f, 216.0f)
                lineToRelative(20.6f, 17.2f)
                arcTo(11.6f, 11.6f, 0.0f, false, false, 96.0f, 236.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 5.1f, -1.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 224.0f)
                lineTo(108.0f, 144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 101.1f, 133.1f)
                close()
                moveTo(84.0f, 198.4f)
                lineToRelative(-4.3f, -3.6f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 72.0f, 192.0f)
                lineTo(60.0f, 192.0f)
                lineTo(60.0f, 176.0f)
                lineTo(72.0f, 176.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.7f, -2.8f)
                lineToRelative(4.3f, -3.6f)
                close()
                moveTo(160.0f, 188.0f)
                arcToRelative(43.7f, 43.7f, 0.0f, false, true, -16.5f, 34.3f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 136.0f, 225.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -9.4f, -4.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 1.9f, -16.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -31.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 15.0f, -18.7f)
                arcTo(43.7f, 43.7f, 0.0f, false, true, 160.0f, 188.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
