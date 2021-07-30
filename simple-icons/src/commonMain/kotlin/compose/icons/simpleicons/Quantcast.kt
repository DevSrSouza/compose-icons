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

public val SimpleIcons.Quantcast: ImageVector
    get() {
        if (_quantcast != null) {
            return _quantcast!!
        }
        _quantcast = Builder(name = "Quantcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.791f, 11.1f)
                curveToRelative(0.0f, -3.574f, 1.92f, -7.18f, 6.21f, -7.18f)
                curveToRelative(4.288f, 0.0f, 6.208f, 3.606f, 6.208f, 7.18f)
                curveToRelative(0.0f, 1.55f, -0.362f, 3.106f, -1.121f, 4.371f)
                lineToRelative(-4.906f, -0.005f)
                lineToRelative(1.507f, 2.601f)
                arcTo(6.607f, 6.607f, 0.0f, false, true, 12.0f, 18.28f)
                curveToRelative(-4.29f, 0.0f, -6.209f, -3.606f, -6.209f, -7.18f)
                moveToRelative(9.96f, 10.53f)
                lineTo(17.124f, 24.0f)
                horizontalLineToRelative(4.911f)
                lineToRelative(-2.607f, -4.496f)
                curveToRelative(2.36f, -2.14f, 3.57f, -5.283f, 3.57f, -8.404f)
                curveTo(22.998f, 5.584f, 19.221f, 0.0f, 12.0f, 0.0f)
                curveTo(4.78f, 0.0f, 1.002f, 5.584f, 1.002f, 11.1f)
                curveToRelative(0.0f, 5.515f, 3.778f, 11.1f, 10.998f, 11.1f)
                curveToRelative(1.377f, 0.0f, 2.627f, -0.205f, 3.75f, -0.572f)
                close()
            }
        }
        .build()
        return _quantcast!!
    }

private var _quantcast: ImageVector? = null
