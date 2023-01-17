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

public val Octicons.FileDirectoryFill24: ImageVector
    get() {
        if (_fileDirectoryFill24 != null) {
            return _fileDirectoryFill24!!
        }
        _fileDirectoryFill24 = Builder(name = "FileDirectoryFill24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 3.784f, 2.784f, 3.0f, 3.75f, 3.0f)
                horizontalLineToRelative(4.971f)
                curveToRelative(0.58f, 0.0f, 1.12f, 0.286f, 1.447f, 0.765f)
                lineToRelative(1.404f, 2.063f)
                curveToRelative(0.046f, 0.069f, 0.124f, 0.11f, 0.207f, 0.11f)
                horizontalLineToRelative(8.471f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineTo(19.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 21.0f)
                horizontalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 19.25f)
                close()
            }
        }
        .build()
        return _fileDirectoryFill24!!
    }

private var _fileDirectoryFill24: ImageVector? = null
