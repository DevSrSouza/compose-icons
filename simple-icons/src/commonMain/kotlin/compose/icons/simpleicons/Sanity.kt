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

public val SimpleIcons.Sanity: ImageVector
    get() {
        if (_sanity != null) {
            return _sanity!!
        }
        _sanity = Builder(name = "Sanity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.394f, 7.31f)
                arcToRelative(5.745f, 5.745f, 0.0f, false, true, -0.833f, -0.68f)
                curveToRelative(-0.913f, -0.91f, -1.38f, -2.067f, -1.38f, -3.568f)
                verticalLineToRelative(-0.575f)
                curveTo(6.699f, 0.929f, 9.039f, 0.0f, 11.828f, 0.0f)
                curveToRelative(5.394f, 0.0f, 8.515f, 2.8f, 9.285f, 6.74f)
                horizontalLineTo(16.22f)
                curveToRelative(-0.54f, -1.554f, -1.89f, -2.764f, -4.352f, -2.764f)
                curveToRelative(-2.422f, 0.0f, -4.136f, 1.276f, -4.473f, 3.334f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(4.683f, 3.062f)
                curveToRelative(0.0f, 3.236f, 2.034f, 5.162f, 6.106f, 6.177f)
                lineToRelative(4.316f, 0.983f)
                curveToRelative(3.854f, 0.87f, 6.2f, 3.03f, 6.2f, 6.55f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, true, -1.436f, 4.239f)
                curveToRelative(0.0f, -3.511f, -1.85f, -5.409f, -6.31f, -6.55f)
                lineToRelative(-4.236f, -0.946f)
                curveToRelative(-3.393f, -0.76f, -6.011f, -2.536f, -6.011f, -6.36f)
                arcToRelative(6.578f, 6.578f, 0.0f, false, true, 1.37f, -4.093f)
                close()
                moveTo(17.18f, 16.484f)
                curveToRelative(-0.292f, 2.235f, -2.092f, 3.495f, -4.698f, 3.495f)
                curveToRelative(-2.314f, 0.0f, -4.048f, -0.946f, -4.703f, -2.99f)
                horizontalLineTo(2.694f)
                curveTo(3.518f, 21.44f, 7.224f, 24.0f, 12.519f, 24.0f)
                curveToRelative(2.828f, 0.0f, 5.277f, -0.87f, 6.85f, -2.439f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0.0f, -1.66f, -0.433f, -2.876f, -1.342f, -3.816f)
                arcToRelative(5.508f, 5.508f, 0.0f, false, false, -0.847f, -0.71f)
                verticalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _sanity!!
    }

private var _sanity: ImageVector? = null
