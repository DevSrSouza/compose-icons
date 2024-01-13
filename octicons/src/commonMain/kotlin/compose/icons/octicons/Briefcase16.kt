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

public val Octicons.Briefcase16: ImageVector
    get() {
        if (_briefcase16 != null) {
            return _briefcase16!!
        }
        _briefcase16 = Builder(name = "Briefcase16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveTo(10.216f, 0.0f, 11.0f, 0.784f, 11.0f, 1.75f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(3.25f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 15.0f)
                lineTo(1.75f, 15.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 13.25f)
                verticalLineToRelative(-8.5f)
                curveTo(0.0f, 3.784f, 0.784f, 3.0f, 1.75f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 1.75f)
                curveTo(5.0f, 0.784f, 5.784f, 0.0f, 6.75f, 0.0f)
                close()
                moveTo(3.5f, 9.5f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, -2.0f, -0.627f)
                verticalLineToRelative(4.377f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(14.5f, 8.873f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, -2.0f, 0.627f)
                close()
                moveTo(1.75f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(1.5f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(14.5f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(1.75f, 4.5f)
                close()
                moveTo(9.5f, 3.0f)
                lineTo(9.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(6.5f, 3.0f)
                close()
            }
        }
        .build()
        return _briefcase16!!
    }

private var _briefcase16: ImageVector? = null
