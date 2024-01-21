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

public val Octicons.FileDirectoryOpenFill16: ImageVector
    get() {
        if (_fileDirectoryOpenFill16 != null) {
            return _fileDirectoryOpenFill16!!
        }
        _fileDirectoryOpenFill16 = Builder(name = "FileDirectoryOpenFill16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.513f, 1.513f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.75f, 1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0.0f, 1.07f, 0.26f, 1.4f, 0.7f)
                lineToRelative(0.9f, 1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.2f, 0.1f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(11.978f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.994f, 1.117f)
                lineTo(15.0f, 13.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 15.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 13.25f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.464f, 0.184f, -0.91f, 0.513f, -1.237f)
                close()
            }
        }
        .build()
        return _fileDirectoryOpenFill16!!
    }

private var _fileDirectoryOpenFill16: ImageVector? = null
