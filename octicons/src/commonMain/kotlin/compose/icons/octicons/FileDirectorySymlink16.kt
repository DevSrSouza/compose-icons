package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.FileDirectorySymlink16: ImageVector
    get() {
        if (_fileDirectorySymlink16 != null) {
            return _fileDirectorySymlink16!!
        }
        _fileDirectorySymlink16 = Builder(name = "FileDirectorySymlink16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.75f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.4f, 0.7f)
                lineToRelative(0.9f, 1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.2f, 0.1f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 15.0f)
                horizontalLineTo(5.375f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(8.875f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(7.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.4f, -0.7f)
                lineToRelative(-0.9f, -1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.2f, -0.1f)
                horizontalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 12.237f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.262f, -2.249f)
                lineTo(4.0f, 9.989f)
                verticalLineToRelative(1.938f)
                curveToRelative(0.0f, 0.218f, 0.26f, 0.331f, 0.42f, 0.183f)
                lineToRelative(2.883f, -2.677f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.366f)
                lineTo(4.42f, 6.39f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.42f, 0.183f)
                verticalLineToRelative(1.916f)
                lineToRelative(-0.229f, -0.001f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 0.0f, 12.237f)
                verticalLineToRelative(1.013f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.013f)
                close()
            }
        }
        .build()
        return _fileDirectorySymlink16!!
    }

private var _fileDirectorySymlink16: ImageVector? = null
