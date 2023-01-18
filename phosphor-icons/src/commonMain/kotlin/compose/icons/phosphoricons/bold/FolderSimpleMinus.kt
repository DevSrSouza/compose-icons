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

public val BoldGroup.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) {
            return _folderSimpleMinus!!
        }
        _folderSimpleMinus = Builder(name = "FolderSimpleMinus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 132.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                close()
                moveTo(236.0f, 88.0f)
                lineTo(236.0f, 200.9f)
                arcTo(19.2f, 19.2f, 0.0f, false, true, 216.9f, 220.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(93.3f, 44.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 12.0f, 4.0f)
                lineTo(132.0f, 68.0f)
                horizontalLineToRelative(84.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 236.0f, 88.0f)
                close()
                moveTo(212.0f, 92.0f)
                lineTo(130.7f, 92.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -12.0f, -4.0f)
                lineTo(92.0f, 68.0f)
                lineTo(44.0f, 68.0f)
                lineTo(44.0f, 196.0f)
                lineTo(212.0f, 196.0f)
                close()
            }
        }
        .build()
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
