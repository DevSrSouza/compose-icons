package compose.icons.lineaicons.basicelaboration

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicElaborationGroup

public val BasicElaborationGroup.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0f, 18.0f)
                lineToRelative(0.0f, 36.0f)
                lineToRelative(-62.0f, 0.0f)
                lineToRelative(0.0f, -44.0f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 41.0f)
                lineToRelative(-6.125f, 4.0f)
                lineToRelative(2.125f, -7.0f)
                lineToRelative(-6.0f, -4.0f)
                lineToRelative(7.213f, 0.0f)
                lineToRelative(2.787f, -8.0f)
                lineToRelative(3.0f, 8.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(-6.0f, 4.0f)
                lineToRelative(1.938f, 7.0f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
