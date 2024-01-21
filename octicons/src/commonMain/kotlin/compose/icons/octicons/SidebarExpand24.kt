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

public val Octicons.SidebarExpand24: ImageVector
    get() {
        if (_sidebarExpand24 != null) {
            return _sidebarExpand24!!
        }
        _sidebarExpand24 = Builder(name = "SidebarExpand24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.28f, 9.53f)
                lineTo(8.81f, 12.0f)
                lineToRelative(2.47f, 2.47f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.275f, 0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.215f, 0.734f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 22.0f)
                lineTo(3.75f, 22.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 20.25f)
                lineTo(2.0f, 3.75f)
                curveTo(2.0f, 2.784f, 2.784f, 2.0f, 3.75f, 2.0f)
                close()
                moveTo(3.5f, 3.75f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                lineTo(15.0f, 20.5f)
                verticalLineToRelative(-17.0f)
                lineTo(3.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(16.5f, 20.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(20.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(16.5f, 3.5f)
                close()
            }
        }
        .build()
        return _sidebarExpand24!!
    }

private var _sidebarExpand24: ImageVector? = null
