package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Phpstorm: ImageVector
    get() {
        if (_phpstorm != null) {
            return _phpstorm!!
        }
        _phpstorm = Builder(name = "Phpstorm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.833f, 6.611f)
                verticalLineToRelative(-0.055f)
                curveToRelative(0.0f, -1.0f, -0.667f, -1.5f, -1.778f, -1.5f)
                lineTo(4.389f, 5.056f)
                verticalLineToRelative(3.056f)
                horizontalLineToRelative(1.722f)
                curveToRelative(1.111f, -0.001f, 1.722f, -0.668f, 1.722f, -1.501f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(2.167f, 3.111f)
                horizontalLineToRelative(4.056f)
                curveToRelative(2.389f, 0.0f, 3.833f, 1.389f, 3.833f, 3.445f)
                verticalLineToRelative(0.055f)
                curveToRelative(0.0f, 2.333f, -1.778f, 3.5f, -4.056f, 3.5f)
                lineTo(4.333f, 10.111f)
                verticalLineToRelative(3.0f)
                lineTo(2.167f, 13.111f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(11.278f, 21.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.278f, 21.0f)
                close()
                moveTo(18.5f, 10.222f)
                curveToRelative(0.0f, 2.0f, -1.5f, 3.111f, -3.667f, 3.111f)
                curveToRelative(-1.5f, -0.056f, -3.0f, -0.611f, -4.222f, -1.667f)
                lineToRelative(1.278f, -1.556f)
                curveToRelative(0.89f, 0.722f, 1.833f, 1.222f, 3.0f, 1.222f)
                curveToRelative(0.889f, 0.0f, 1.444f, -0.333f, 1.444f, -0.944f)
                verticalLineToRelative(-0.056f)
                curveToRelative(0.0f, -0.555f, -0.333f, -0.833f, -2.0f, -1.277f)
                curveTo(12.333f, 8.555f, 11.0f, 8.0f, 11.0f, 6.0f)
                verticalLineToRelative(-0.056f)
                curveToRelative(0.0f, -1.833f, 1.444f, -3.0f, 3.5f, -3.0f)
                curveToRelative(1.444f, 0.0f, 2.723f, 0.444f, 3.723f, 1.278f)
                lineToRelative(-1.167f, 1.667f)
                curveToRelative(-0.889f, -0.611f, -1.777f, -1.0f, -2.611f, -1.0f)
                curveToRelative(-0.833f, 0.0f, -1.278f, 0.389f, -1.278f, 0.889f)
                verticalLineToRelative(0.056f)
                curveToRelative(0.0f, 0.667f, 0.445f, 0.889f, 2.167f, 1.333f)
                curveToRelative(2.0f, 0.556f, 3.167f, 1.278f, 3.167f, 3.0f)
                verticalLineToRelative(0.055f)
                close()
            }
        }
        .build()
        return _phpstorm!!
    }

private var _phpstorm: ImageVector? = null
