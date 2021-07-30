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

public val SimpleIcons.Udacity: ImageVector
    get() {
        if (_udacity != null) {
            return _udacity!!
        }
        _udacity = Builder(name = "Udacity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                lineTo(0.0f, 4.8f)
                verticalLineToRelative(9.6f)
                curveTo(0.0f, 20.8f, 4.8f, 24.0f, 8.8f, 24.0f)
                curveToRelative(1.348f, 0.0f, 2.786f, -0.362f, 4.1f, -1.088f)
                lineToRelative(6.303f, -3.633f)
                curveTo(21.687f, 18.155f, 24.0f, 15.64f, 24.0f, 11.2f)
                lineTo(24.0f, 0.8f)
                lineTo(22.4f, 0.0f)
                lineTo(16.0f, 4.0f)
                verticalLineToRelative(10.4f)
                curveToRelative(0.0f, 1.6f, -0.3f, 2.898f, -0.785f, 3.948f)
                curveToRelative(-2.002f, -0.257f, -5.615f, -1.597f, -5.615f, -7.15f)
                lineTo(9.6f, 0.802f)
                close()
                moveTo(8.0f, 1.76f)
                verticalLineToRelative(9.44f)
                curveToRelative(0.0f, 5.342f, 3.346f, 7.9f, 6.313f, 8.597f)
                curveToRelative(-1.618f, 1.99f, -4.025f, 2.603f, -5.512f, 2.603f)
                curveToRelative(-2.4f, 0.0f, -7.2f, -1.6f, -7.2f, -8.0f)
                lineTo(1.601f, 5.6f)
                close()
                moveTo(22.4f, 1.8f)
                verticalLineToRelative(9.4f)
                curveToRelative(0.0f, 5.45f, -3.482f, 6.84f, -5.504f, 7.132f)
                curveToRelative(0.446f, -1.14f, 0.704f, -2.45f, 0.704f, -3.932f)
                lineTo(17.6f, 4.8f)
                close()
            }
        }
        .build()
        return _udacity!!
    }

private var _udacity: ImageVector? = null
