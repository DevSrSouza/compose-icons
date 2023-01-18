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

public val ThinGroup.FileZip: ImageVector
    get() {
        if (_fileZip != null) {
            return _fileZip!!
        }
        _fileZip = Builder(name = "FileZip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 88.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.2f, -2.9f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(212.0f, 88.1f)
                close()
                moveTo(156.0f, 41.7f)
                lineTo(198.3f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
                moveTo(184.0f, 164.0f)
                lineTo(168.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.0f, 204.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                close()
                moveTo(184.0f, 196.0f)
                lineTo(172.0f, 196.0f)
                lineTo(172.0f, 172.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(132.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(92.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.5f, -2.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.2f, -4.1f)
                lineTo(80.5f, 172.0f)
                lineTo(56.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(88.0f, 164.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.5f, 2.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.2f, 4.1f)
                lineTo(63.5f, 212.0f)
                lineTo(88.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 216.0f)
                close()
            }
        }
        .build()
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
