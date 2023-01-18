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

public val BoldGroup.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.5f, 79.5f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 216.5f, 79.5f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(155.0f, 154.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.8f, -1.7f)
                lineToRelative(-21.9f, 7.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 104.0f, 148.0f)
                lineTo(48.0f, 148.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.1f, -11.5f)
                lineToRelative(21.8f, 7.9f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 4.1f, 0.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 6.9f, -2.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 5.1f, -9.8f)
                lineTo(160.0f, 164.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 155.0f, 154.3f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 172.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(0.0f)
                lineTo(100.0f, 204.0f)
                close()
                moveTo(136.0f, 196.0f)
                lineTo(124.0f, 191.6f)
                verticalLineToRelative(-7.0f)
                lineToRelative(12.0f, -4.0f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
