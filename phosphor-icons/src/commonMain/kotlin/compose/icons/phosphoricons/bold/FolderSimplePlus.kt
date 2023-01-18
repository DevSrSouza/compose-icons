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

public val BoldGroup.FolderSimplePlus: ImageVector
    get() {
        if (_folderSimplePlus != null) {
            return _folderSimplePlus!!
        }
        _folderSimplePlus = Builder(name = "FolderSimplePlus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                lineTo(132.0f, 68.0f)
                lineTo(105.3f, 48.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -12.0f, -4.0f)
                lineTo(40.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.9f, 220.0f)
                arcTo(19.2f, 19.2f, 0.0f, false, false, 236.0f, 200.9f)
                lineTo(236.0f, 88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 68.0f)
                lineTo(92.0f, 68.0f)
                lineToRelative(26.7f, 20.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 12.0f, 4.0f)
                lineTo(212.0f, 92.0f)
                close()
                moveTo(128.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(140.0f, 156.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 156.0f)
                lineTo(104.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(116.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 108.0f)
                close()
            }
        }
        .build()
        return _folderSimplePlus!!
    }

private var _folderSimplePlus: ImageVector? = null