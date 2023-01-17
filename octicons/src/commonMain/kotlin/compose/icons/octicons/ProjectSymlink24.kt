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

public val Octicons.ProjectSymlink24: ImageVector
    get() {
        if (_projectSymlink24 != null) {
            return _projectSymlink24!!
        }
        _projectSymlink24 = Builder(name = "ProjectSymlink24", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.784f, 2.784f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 22.0f)
                lineTo(9.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(20.5f, 9.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(3.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 12.0f)
                close()
                moveTo(9.0f, 7.5f)
                horizontalLineToRelative(11.5f)
                lineTo(20.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(9.0f, 3.5f)
                close()
                moveTo(3.5f, 7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.308f, 14.5f)
                lineToRelative(-2.104f, -2.236f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.092f, -1.028f)
                lineToRelative(3.294f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.028f)
                lineToRelative(-3.294f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.092f, -1.028f)
                lineTo(9.308f, 16.0f)
                horizontalLineTo(6.09f)
                arcToRelative(2.59f, 2.59f, 0.0f, false, false, -2.59f, 2.59f)
                verticalLineToRelative(2.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.66f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, 4.09f, -4.09f)
                horizontalLineToRelative(3.218f)
                close()
            }
        }
        .build()
        return _projectSymlink24!!
    }

private var _projectSymlink24: ImageVector? = null
