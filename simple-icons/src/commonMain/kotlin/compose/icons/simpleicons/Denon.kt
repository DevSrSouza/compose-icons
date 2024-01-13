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

public val SimpleIcons.Denon: ImageVector
    get() {
        if (_denon != null) {
            return _denon!!
        }
        _denon = Builder(name = "Denon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.365f, 11.237f)
                lineToRelative(3.394f, 3.361f)
                verticalLineToRelative(-5.07f)
                horizontalLineToRelative(-0.778f)
                verticalLineToRelative(3.16f)
                lineTo(8.58f, 9.406f)
                verticalLineToRelative(5.077f)
                horizontalLineToRelative(0.779f)
                lineTo(9.359f, 11.27f)
                lineToRelative(0.006f, -0.033f)
                moveToRelative(-4.497f, 3.245f)
                lineTo(4.868f, 9.528f)
                horizontalLineToRelative(2.79f)
                verticalLineToRelative(0.773f)
                lineTo(5.646f, 10.301f)
                verticalLineToRelative(1.164f)
                horizontalLineToRelative(1.558f)
                verticalLineToRelative(0.772f)
                lineTo(5.646f, 12.237f)
                verticalLineToRelative(1.472f)
                horizontalLineToRelative(1.999f)
                verticalLineToRelative(0.773f)
                lineTo(4.868f, 14.482f)
                moveTo(20.58f, 11.23f)
                lineTo(24.0f, 14.58f)
                lineTo(24.0f, 9.528f)
                horizontalLineToRelative(-0.779f)
                verticalLineToRelative(3.2f)
                lineToRelative(-0.005f, -0.015f)
                lineToRelative(-3.422f, -3.311f)
                verticalLineToRelative(5.08f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(-3.234f)
                lineToRelative(-0.003f, -0.019f)
                moveTo(0.78f, 13.747f)
                verticalLineToRelative(-3.503f)
                horizontalLineToRelative(0.688f)
                reflectiveCurveToRelative(1.755f, -0.032f, 1.755f, 1.77f)
                curveToRelative(0.0f, 1.647f, -1.593f, 1.733f, -1.593f, 1.733f)
                lineTo(0.78f, 13.747f)
                close()
                moveTo(0.0f, 9.527f)
                verticalLineToRelative(4.955f)
                horizontalLineToRelative(1.655f)
                reflectiveCurveToRelative(2.336f, -0.193f, 2.336f, -2.496f)
                curveToRelative(0.0f, -2.374f, -2.343f, -2.458f, -2.343f, -2.458f)
                lineTo(0.0f, 9.528f)
                close()
                moveTo(14.416f, 11.979f)
                curveToRelative(0.0f, 0.552f, 0.187f, 1.006f, 0.56f, 1.361f)
                curveToRelative(0.713f, 0.724f, 1.931f, 0.702f, 2.618f, -0.01f)
                curveToRelative(0.724f, -0.689f, 0.724f, -1.991f, 0.007f, -2.676f)
                curveToRelative(-0.675f, -0.726f, -1.966f, -0.724f, -2.645f, 0.0f)
                curveToRelative(-0.36f, 0.357f, -0.54f, 0.8f, -0.54f, 1.325f)
                close()
                moveTo(13.652f, 11.969f)
                curveToRelative(0.0f, -0.702f, 0.26f, -1.306f, 0.777f, -1.81f)
                curveToRelative(0.981f, -1.004f, 2.724f, -1.016f, 3.702f, 0.006f)
                curveToRelative(1.026f, 0.965f, 1.032f, 2.706f, -0.003f, 3.66f)
                curveToRelative(-0.961f, 0.964f, -2.596f, 1.015f, -3.624f, 0.084f)
                curveToRelative(-0.568f, -0.493f, -0.852f, -1.14f, -0.852f, -1.94f)
                close()
            }
        }
        .build()
        return _denon!!
    }

private var _denon: ImageVector? = null
