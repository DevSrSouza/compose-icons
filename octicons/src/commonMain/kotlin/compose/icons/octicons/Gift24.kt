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

public val Octicons.Gift24: ImageVector
    get() {
        if (_gift24 != null) {
            return _gift24!!
        }
        _gift24 = Builder(name = "Gift24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 3.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 7.5f, 0.0f)
                curveToRelative(1.455f, 0.0f, 3.436f, 0.901f, 4.5f, 3.11f)
                curveTo(13.064f, 0.901f, 15.044f, 0.0f, 16.5f, 0.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 3.0f, 6.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.698f, -0.409f, 1.301f, -1.0f, 1.582f)
                verticalLineToRelative(8.418f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 22.0f)
                lineTo(3.75f, 22.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 20.25f)
                verticalLineToRelative(-8.418f)
                curveToRelative(-0.591f, -0.282f, -1.0f, -0.884f, -1.0f, -1.582f)
                verticalLineToRelative(-2.5f)
                curveTo(1.0f, 6.784f, 1.784f, 6.0f, 2.75f, 6.0f)
                lineTo(4.5f, 6.0f)
                arcToRelative(3.733f, 3.733f, 0.0f, false, true, -0.75f, -2.25f)
                close()
                moveTo(20.5f, 12.0f)
                horizontalLineToRelative(-7.75f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(11.25f, 20.5f)
                lineTo(11.25f, 12.0f)
                lineTo(3.5f, 12.0f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
                moveTo(21.25f, 10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(2.75f, 10.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
                moveTo(18.75f, 3.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 16.5f, 1.5f)
                curveToRelative(-1.15f, 0.0f, -3.433f, 1.007f, -3.72f, 4.5f)
                horizontalLineToRelative(3.72f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 2.25f, -2.25f)
                close()
                moveTo(11.22f, 6.0f)
                curveToRelative(-0.287f, -3.493f, -2.57f, -4.5f, -3.72f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                close()
            }
        }
        .build()
        return _gift24!!
    }

private var _gift24: ImageVector? = null
