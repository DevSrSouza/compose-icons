package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Glassdoor: ImageVector
    get() {
        if (_glassdoor != null) {
            return _glassdoor!!
        }
        _glassdoor = Builder(name = "Glassdoor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.144f, 20.572f)
                lineTo(3.43f, 20.572f)
                curveTo(3.43f, 22.465f, 4.963f, 24.0f, 6.856f, 24.0f)
                horizontalLineToRelative(10.286f)
                curveToRelative(1.893f, 0.0f, 3.428f, -1.535f, 3.428f, -3.428f)
                lineTo(20.57f, 6.492f)
                curveToRelative(0.0f, -0.07f, -0.054f, -0.125f, -0.124f, -0.125f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.067f, 0.0f, -0.123f, 0.056f, -0.123f, 0.126f)
                verticalLineToRelative(14.08f)
                close()
                moveTo(17.144f, 0.0f)
                curveToRelative(1.892f, 0.0f, 3.427f, 1.535f, 3.427f, 3.43f)
                lineTo(6.858f, 3.43f)
                verticalLineToRelative(14.078f)
                curveToRelative(0.0f, 0.068f, -0.056f, 0.125f, -0.125f, 0.125f)
                lineTo(3.554f, 17.633f)
                curveToRelative(-0.07f, 0.0f, -0.125f, -0.057f, -0.125f, -0.125f)
                lineTo(3.429f, 3.428f)
                curveTo(3.43f, 1.536f, 4.963f, 0.0f, 6.856f, 0.0f)
                horizontalLineToRelative(10.287f)
            }
        }
        .build()
        return _glassdoor!!
    }

private var _glassdoor: ImageVector? = null
