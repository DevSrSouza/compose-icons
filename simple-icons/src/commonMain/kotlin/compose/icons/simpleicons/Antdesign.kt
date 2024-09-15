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

public val SimpleIcons.Antdesign: ImageVector
    get() {
        if (_antdesign != null) {
            return _antdesign!!
        }
        _antdesign = Builder(name = "Antdesign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.451f, 6.681f)
                curveToRelative(0.509f, -0.506f, 0.509f, -1.332f, 0.0f, -1.838f)
                lineToRelative(-1.873f, -1.873f)
                lineToRelative(0.003f, 0.003f)
                curveToRelative(-0.496f, -0.496f, -1.348f, -1.348f, -2.553f, -2.551f)
                curveToRelative(-0.568f, -0.555f, -1.487f, -0.549f, -2.05f, 0.013f)
                lineTo(0.426f, 10.979f)
                arcToRelative(1.443f, 1.443f, 0.0f, false, false, 0.0f, 2.047f)
                lineToRelative(10.549f, 10.541f)
                arcToRelative(1.451f, 1.451f, 0.0f, false, false, 2.05f, 0.0f)
                lineToRelative(4.424f, -4.421f)
                curveToRelative(0.509f, -0.506f, 0.509f, -1.332f, 0.0f, -1.838f)
                arcToRelative(1.305f, 1.305f, 0.0f, false, false, -1.841f, 0.0f)
                lineToRelative(-3.349f, 3.355f)
                curveToRelative(-0.139f, 0.139f, -0.356f, 0.139f, -0.496f, 0.0f)
                lineToRelative(-8.427f, -8.419f)
                curveToRelative(-0.139f, -0.139f, -0.139f, -0.356f, 0.0f, -0.496f)
                lineTo(11.76f, 3.329f)
                curveToRelative(0.011f, -0.011f, 0.024f, -0.019f, 0.035f, -0.03f)
                curveToRelative(0.139f, -0.11f, 0.332f, -0.099f, 0.461f, 0.03f)
                lineToRelative(3.355f, 3.352f)
                curveToRelative(0.509f, 0.509f, 1.334f, 0.509f, 1.841f, 0.0f)
                close()
                moveTo(9.206f, 12.056f)
                arcToRelative(2.848f, 2.846f, 0.0f, true, false, 5.696f, 0.0f)
                arcToRelative(2.848f, 2.846f, 0.0f, true, false, -5.696f, 0.0f)
                close()
                moveTo(23.574f, 11.021f)
                lineToRelative(-3.293f, -3.277f)
                curveToRelative(-0.509f, -0.506f, -1.334f, -0.506f, -1.841f, 0.003f)
                arcToRelative(1.297f, 1.297f, 0.0f, false, false, 0.0f, 1.838f)
                lineToRelative(2.224f, 2.221f)
                curveToRelative(0.139f, 0.139f, 0.139f, 0.356f, 0.0f, 0.496f)
                lineToRelative(-2.192f, 2.189f)
                arcToRelative(1.297f, 1.297f, 0.0f, false, false, 0.0f, 1.838f)
                arcToRelative(1.305f, 1.305f, 0.0f, false, false, 1.841f, 0.0f)
                lineToRelative(3.263f, -3.261f)
                arcToRelative(1.445f, 1.445f, 0.0f, false, false, -0.003f, -2.047f)
                close()
            }
        }
        .build()
        return _antdesign!!
    }

private var _antdesign: ImageVector? = null
