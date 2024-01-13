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

public val Octicons.FileDirectorySymlink24: ImageVector
    get() {
        if (_fileDirectorySymlink24 != null) {
            return _fileDirectorySymlink24!!
        }
        _fileDirectorySymlink24 = Builder(name = "FileDirectorySymlink24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 3.784f, 2.784f, 3.0f, 3.75f, 3.0f)
                horizontalLineToRelative(4.971f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.447f, 0.765f)
                lineToRelative(1.404f, 2.063f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.207f, 0.11f)
                horizontalLineToRelative(8.471f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineTo(19.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 21.0f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(15.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(7.688f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-8.471f)
                arcToRelative(1.751f, 1.751f, 0.0f, false, true, -1.447f, -0.766f)
                lineTo(8.928f, 4.609f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.207f, -0.109f)
                horizontalLineTo(3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.308f, 12.5f)
                lineToRelative(-2.104f, -2.236f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.092f, -1.028f)
                lineToRelative(3.294f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.028f)
                lineToRelative(-3.294f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.092f, -1.028f)
                lineTo(9.308f, 14.0f)
                horizontalLineTo(4.09f)
                arcToRelative(2.59f, 2.59f, 0.0f, false, false, -2.59f, 2.59f)
                verticalLineToRelative(3.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.16f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, 4.09f, -4.09f)
                horizontalLineToRelative(5.218f)
                close()
            }
        }
        .build()
        return _fileDirectorySymlink24!!
    }

private var _fileDirectorySymlink24: ImageVector? = null
