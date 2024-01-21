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

public val SimpleIcons.Datefns: ImageVector
    get() {
        if (_datefns != null) {
            return _datefns!!
        }
        _datefns = Builder(name = "Datefns", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.065f, 6.534f)
                curveTo(0.355f, 8.246f, 0.0f, 10.068f, 0.0f, 11.999f)
                curveToRelative(0.0f, 1.932f, 0.355f, 3.754f, 1.065f, 5.466f)
                arcToRelative(13.768f, 13.768f, 0.0f, false, false, 3.068f, 4.549f)
                horizontalLineToRelative(2.685f)
                curveToRelative(-2.784f, -2.756f, -4.176f, -6.094f, -4.176f, -10.015f)
                curveToRelative(0.0f, -3.92f, 1.392f, -7.258f, 4.176f, -10.014f)
                lineTo(4.133f, 1.985f)
                arcToRelative(13.768f, 13.768f, 0.0f, false, false, -3.068f, 4.549f)
                close()
                moveTo(22.934f, 17.465f)
                curveToRelative(0.71f, -1.712f, 1.066f, -3.534f, 1.066f, -5.466f)
                curveToRelative(0.0f, -1.931f, -0.356f, -3.753f, -1.066f, -5.465f)
                arcToRelative(13.768f, 13.768f, 0.0f, false, false, -3.068f, -4.549f)
                horizontalLineToRelative(-2.685f)
                curveToRelative(2.784f, 2.756f, 4.176f, 6.094f, 4.176f, 10.014f)
                curveToRelative(0.0f, 3.921f, -1.392f, 7.259f, -4.176f, 10.015f)
                horizontalLineToRelative(2.685f)
                arcToRelative(13.768f, 13.768f, 0.0f, false, false, 3.068f, -4.549f)
                close()
                moveTo(11.63f, 3.299f)
                lineTo(9.854f, 3.299f)
                verticalLineToRelative(10.21f)
                horizontalLineToRelative(1.776f)
                verticalLineToRelative(-0.033f)
                lineToRelative(7.218f, -7.218f)
                lineToRelative(-1.151f, -1.151f)
                lineToRelative(-6.067f, 6.067f)
                lineTo(11.63f, 3.299f)
                close()
            }
        }
        .build()
        return _datefns!!
    }

private var _datefns: ImageVector? = null
