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

public val Octicons.SidebarCollapse16: ImageVector
    get() {
        if (_sidebarCollapse16 != null) {
            return _sidebarCollapse16!!
        }
        _sidebarCollapse16 = Builder(name = "SidebarCollapse16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.823f, 7.823f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.354f)
                lineToRelative(-2.396f, 2.396f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 4.0f, 10.396f)
                verticalLineTo(5.604f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.427f, -0.177f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 0.0f)
                horizontalLineToRelative(12.5f)
                curveTo(15.216f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                verticalLineTo(1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                close()
                moveTo(1.5f, 1.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(11.0f, 14.5f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _sidebarCollapse16!!
    }

private var _sidebarCollapse16: ImageVector? = null
