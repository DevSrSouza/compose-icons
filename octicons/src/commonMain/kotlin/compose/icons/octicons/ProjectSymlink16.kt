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

public val Octicons.ProjectSymlink16: ImageVector
    get() {
        if (_projectSymlink16 != null) {
            return _projectSymlink16!!
        }
        _projectSymlink16 = Builder(name = "ProjectSymlink16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                horizontalLineToRelative(12.5f)
                curveTo(15.216f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(14.5f, 6.5f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(6.5f, 5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(6.5f, 1.5f)
                close()
                moveTo(1.5f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 1.5f)
                lineTo(1.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 13.737f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.262f, -2.25f)
                lineTo(4.0f, 11.49f)
                verticalLineToRelative(1.938f)
                curveToRelative(0.0f, 0.218f, 0.26f, 0.331f, 0.42f, 0.183f)
                lineToRelative(2.883f, -2.677f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.366f)
                lineTo(4.42f, 7.89f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.42f, 0.183f)
                verticalLineTo(9.99f)
                lineToRelative(-0.23f, -0.001f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 0.0f, 13.738f)
                verticalLineToRelative(1.012f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.013f)
                close()
            }
        }
        .build()
        return _projectSymlink16!!
    }

private var _projectSymlink16: ImageVector? = null
