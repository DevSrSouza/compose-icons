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

public val SharpGroup.FolderSpecial: ImageVector
    get() {
        if (_folderSpecial != null) {
            return _folderSpecial!!
        }
        _folderSpecial = Builder(name = "FolderSpecial", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 6.0f)
                close()
                moveTo(17.94f, 17.0f)
                lineTo(15.0f, 15.28f)
                lineTo(12.06f, 17.0f)
                lineToRelative(0.78f, -3.33f)
                lineToRelative(-2.59f, -2.24f)
                lineToRelative(3.41f, -0.29f)
                lineTo(15.0f, 8.0f)
                lineToRelative(1.34f, 3.14f)
                lineToRelative(3.41f, 0.29f)
                lineToRelative(-2.59f, 2.24f)
                lineToRelative(0.78f, 3.33f)
                close()
            }
        }
        .build()
        return _folderSpecial!!
    }

private var _folderSpecial: ImageVector? = null