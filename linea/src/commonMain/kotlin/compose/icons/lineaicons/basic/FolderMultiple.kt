package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.FolderMultiple: ImageVector
    get() {
        if (_folderMultiple != null) {
            return _folderMultiple!!
        }
        _folderMultiple = Builder(name = "FolderMultiple", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 22.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-55.0f, 0.0f)
                lineToRelative(0.0f, -39.0f)
                lineToRelative(18.629f, 0.0f)
                lineToRelative(7.097f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(18.629f, 0.0f)
                lineToRelative(7.097f, 7.0f)
                lineToRelative(29.274f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-5.0f, 0.0f)
            }
        }
        .build()
        return _folderMultiple!!
    }

private var _folderMultiple: ImageVector? = null
