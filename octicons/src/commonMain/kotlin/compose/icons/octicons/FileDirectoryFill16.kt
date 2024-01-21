package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FileDirectoryFill16: ImageVector
    get() {
        if (_fileDirectoryFill16 != null) {
            return _fileDirectoryFill16!!
        }
        _fileDirectoryFill16 = Builder(name = "FileDirectoryFill16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.75f)
                verticalLineToRelative(10.5f)
                curveTo(0.0f, 14.216f, 0.784f, 15.0f, 1.75f, 15.0f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 16.0f, 13.25f)
                verticalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 3.0f)
                horizontalLineTo(7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.2f, -0.1f)
                lineToRelative(-0.9f, -1.2f)
                curveTo(6.07f, 1.26f, 5.55f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(1.75f)
                close()
            }
        }
        .build()
        return _fileDirectoryFill16!!
    }

private var _fileDirectoryFill16: ImageVector? = null
