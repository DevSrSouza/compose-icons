package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FolderDelete: ImageVector
    get() {
        if (_folderDelete != null) {
            return _folderDelete!!
        }
        _folderDelete = Builder(name = "FolderDelete", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(16.5f, 10.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(16.5f, 15.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _folderDelete!!
    }

private var _folderDelete: ImageVector? = null
