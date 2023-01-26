package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FolderCopy: ImageVector
    get() {
        if (_folderCopy != null) {
            return _folderCopy!!
        }
        _folderCopy = Builder(name = "FolderCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 15.0f)
                lineToRelative(19.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-17.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.0f)
                horizontalLineToRelative(-9.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(5.01f)
                lineTo(5.0f, 17.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _folderCopy!!
    }

private var _folderCopy: ImageVector? = null
