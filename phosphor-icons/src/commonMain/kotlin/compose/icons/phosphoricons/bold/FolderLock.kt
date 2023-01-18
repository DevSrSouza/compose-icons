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

public val BoldGroup.FolderLock: ImageVector
    get() {
        if (_folderLock != null) {
            return _folderLock!!
        }
        _folderLock = Builder(name = "FolderLock", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 152.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 164.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 152.0f)
                close()
                moveTo(180.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(180.0f, 152.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(164.0f, 196.0f)
                lineTo(164.0f, 176.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(216.0f, 68.0f)
                lineTo(133.4f, 68.0f)
                lineToRelative(-26.0f, -29.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -15.0f, -6.7f)
                lineTo(40.0f, 32.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 52.0f)
                lineTo(20.0f, 200.6f)
                arcTo(19.4f, 19.4f, 0.0f, false, false, 39.4f, 220.0f)
                horizontalLineToRelative(65.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(44.0f, 68.0f)
                lineTo(44.0f, 56.0f)
                lineTo(90.6f, 56.0f)
                lineToRelative(10.7f, 12.0f)
                close()
            }
        }
        .build()
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
