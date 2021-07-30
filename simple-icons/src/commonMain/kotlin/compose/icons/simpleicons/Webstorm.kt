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

public val SimpleIcons.Webstorm: ImageVector
    get() {
        if (_webstorm != null) {
            return _webstorm!!
        }
        _webstorm = Builder(name = "Webstorm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(17.889f, 2.889f)
                curveToRelative(1.444f, 0.0f, 2.667f, 0.444f, 3.667f, 1.278f)
                lineToRelative(-1.111f, 1.667f)
                curveToRelative(-0.889f, -0.611f, -1.722f, -1.0f, -2.556f, -1.0f)
                reflectiveCurveToRelative(-1.278f, 0.389f, -1.278f, 0.889f)
                verticalLineToRelative(0.056f)
                curveToRelative(0.0f, 0.667f, 0.444f, 0.889f, 2.111f, 1.333f)
                curveToRelative(2.0f, 0.556f, 3.111f, 1.278f, 3.111f, 3.0f)
                verticalLineToRelative(0.056f)
                curveToRelative(0.0f, 2.0f, -1.5f, 3.111f, -3.611f, 3.111f)
                curveToRelative(-1.5f, -0.056f, -3.0f, -0.611f, -4.167f, -1.667f)
                lineToRelative(1.278f, -1.556f)
                curveToRelative(0.889f, 0.722f, 1.833f, 1.222f, 2.944f, 1.222f)
                curveToRelative(0.889f, 0.0f, 1.389f, -0.333f, 1.389f, -0.944f)
                verticalLineToRelative(-0.056f)
                curveToRelative(0.0f, -0.556f, -0.333f, -0.833f, -2.0f, -1.278f)
                curveToRelative(-2.0f, -0.5f, -3.222f, -1.056f, -3.222f, -3.056f)
                verticalLineToRelative(-0.056f)
                curveToRelative(0.0f, -1.833f, 1.444f, -3.0f, 3.444f, -3.0f)
                close()
                moveTo(1.778f, 3.111f)
                horizontalLineToRelative(2.278f)
                lineToRelative(1.5f, 5.778f)
                lineToRelative(1.722f, -5.778f)
                horizontalLineToRelative(1.667f)
                lineToRelative(1.667f, 5.778f)
                lineToRelative(1.5f, -5.778f)
                horizontalLineToRelative(2.333f)
                lineToRelative(-2.833f, 9.944f)
                lineTo(9.723f, 13.055f)
                lineTo(8.112f, 7.277f)
                lineToRelative(-1.667f, 5.778f)
                lineTo(4.612f, 13.055f)
                lineTo(1.779f, 3.111f)
                close()
                moveTo(2.278f, 19.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.278f, 21.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _webstorm!!
    }

private var _webstorm: ImageVector? = null
