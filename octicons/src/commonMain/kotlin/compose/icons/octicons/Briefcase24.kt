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

public val Octicons.Briefcase24: ImageVector
    get() {
        if (_briefcase24 != null) {
            return _briefcase24!!
        }
        _briefcase24 = Builder(name = "Briefcase24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 1.75f)
                curveTo(7.5f, 0.784f, 8.284f, 0.0f, 9.25f, 0.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                lineTo(16.5f, 4.0f)
                horizontalLineToRelative(4.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(14.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 21.25f, 22.0f)
                lineTo(2.75f, 22.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 20.25f)
                lineTo(1.0f, 5.75f)
                curveTo(1.0f, 4.784f, 1.784f, 4.0f, 2.75f, 4.0f)
                lineTo(7.5f, 4.0f)
                close()
                moveTo(2.5f, 11.99f)
                verticalLineToRelative(8.26f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-8.26f)
                arcTo(4.235f, 4.235f, 0.0f, false, true, 18.75f, 13.0f)
                lineTo(5.25f, 13.0f)
                arcToRelative(4.235f, 4.235f, 0.0f, false, true, -2.75f, -1.01f)
                close()
                moveTo(21.5f, 8.75f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(2.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, 2.75f)
                horizontalLineToRelative(13.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, -2.75f)
                close()
                moveTo(15.0f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _briefcase24!!
    }

private var _briefcase24: ImageVector? = null
