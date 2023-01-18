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

public val BoldGroup.FolderSimpleDotted: ImageVector
    get() {
        if (_folderSimpleDotted != null) {
            return _folderSimpleDotted!!
        }
        _folderSimpleDotted = Builder(name = "FolderSimpleDotted", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 80.0f)
                lineTo(20.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(93.3f, 44.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 12.0f, 4.0f)
                lineToRelative(29.9f, 22.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.4f, 16.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.8f, 2.4f)
                lineTo(92.0f, 68.0f)
                lineTo(44.0f, 68.0f)
                lineTo(44.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(88.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.6f)
                arcTo(19.4f, 19.4f, 0.0f, false, false, 39.4f, 220.0f)
                lineTo(88.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(160.0f, 196.0f)
                lineTo(128.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(224.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(44.0f)
                lineTo(200.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(16.9f)
                arcTo(19.2f, 19.2f, 0.0f, false, false, 236.0f, 200.9f)
                lineTo(236.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 140.0f)
                close()
                moveTo(216.0f, 68.0f)
                lineTo(168.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(32.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(44.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 164.0f)
                close()
            }
        }
        .build()
        return _folderSimpleDotted!!
    }

private var _folderSimpleDotted: ImageVector? = null
