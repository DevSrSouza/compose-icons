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

public val SimpleIcons.Tide: ImageVector
    get() {
        if (_tide != null) {
            return _tide!!
        }
        _tide = Builder(name = "Tide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.694f, 12.509f)
                horizontalLineToRelative(3.393f)
                curveToRelative(-0.206f, -0.846f, -0.883f, -1.272f, -1.647f, -1.272f)
                curveToRelative(-0.883f, 0.0f, -1.5f, 0.48f, -1.746f, 1.272f)
                close()
                moveTo(20.44f, 16.989f)
                curveToRelative(-2.238f, 0.0f, -3.679f, -1.57f, -3.679f, -3.648f)
                curveToRelative(0.0f, -2.024f, 1.501f, -3.662f, 3.693f, -3.662f)
                curveToRelative(2.211f, 0.0f, 3.546f, 1.532f, 3.546f, 3.569f)
                curveToRelative(0.0f, 0.273f, -0.027f, 0.626f, -0.027f, 0.672f)
                horizontalLineToRelative(-5.346f)
                curveToRelative(0.206f, 0.886f, 0.87f, 1.465f, 1.853f, 1.465f)
                curveToRelative(0.844f, 0.0f, 1.461f, -0.366f, 1.853f, -0.932f)
                lineToRelative(1.421f, 0.872f)
                curveToRelative(-0.677f, 1.025f, -1.76f, 1.665f, -3.314f, 1.665f)
                moveToRelative(-6.179f, -3.634f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -1.906f, -1.884f)
                curveToRelative(-1.036f, 0.0f, -1.84f, 0.846f, -1.84f, 1.884f)
                curveToRelative(0.0f, 1.052f, 0.804f, 1.884f, 1.84f, 1.884f)
                curveToRelative(1.09f, 0.0f, 1.906f, -0.832f, 1.906f, -1.884f)
                close()
                moveTo(14.235f, 16.312f)
                curveToRelative(-0.492f, 0.386f, -1.256f, 0.613f, -2.046f, 0.613f)
                arcToRelative(3.546f, 3.546f, 0.0f, false, true, -3.533f, -3.569f)
                curveToRelative(0.0f, -2.024f, 1.62f, -3.608f, 3.533f, -3.608f)
                curveToRelative(0.79f, 0.0f, 1.554f, 0.246f, 2.046f, 0.626f)
                verticalLineToRelative(-2.91f)
                horizontalLineToRelative(1.892f)
                verticalLineToRelative(9.368f)
                horizontalLineToRelative(-1.892f)
                verticalLineToRelative(-0.52f)
                moveTo(7.796f, 9.814f)
                lineTo(5.904f, 9.814f)
                verticalLineToRelative(7.01f)
                horizontalLineToRelative(1.892f)
                verticalLineToRelative(-7.01f)
                moveToRelative(-2.922f, 0.0f)
                verticalLineToRelative(1.697f)
                lineTo(2.91f, 11.511f)
                verticalLineToRelative(2.816f)
                curveToRelative(0.0f, 0.626f, 0.285f, 0.872f, 0.93f, 0.872f)
                lineTo(4.88f, 15.199f)
                verticalLineToRelative(1.625f)
                lineTo(3.706f, 16.824f)
                curveToRelative(-1.853f, 0.0f, -2.69f, -0.832f, -2.69f, -2.404f)
                verticalLineToRelative(-2.91f)
                lineTo(0.0f, 11.51f)
                lineTo(0.0f, 9.814f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, 1.01f, -1.012f)
                lineTo(1.01f, 8.01f)
                horizontalLineToRelative(1.892f)
                verticalLineToRelative(1.804f)
                horizontalLineToRelative(1.972f)
                moveToRelative(3.124f, -1.657f)
                curveToRelative(0.0f, 0.632f, -0.511f, 1.145f, -1.142f, 1.145f)
                curveToRelative(-0.63f, 0.0f, -1.142f, -0.513f, -1.142f, -1.145f)
                curveToRelative(0.0f, -0.633f, 0.511f, -1.145f, 1.142f, -1.145f)
                arcToRelative(1.135f, 1.135f, 0.0f, false, true, 1.142f, 1.145f)
                close()
            }
        }
        .build()
        return _tide!!
    }

private var _tide: ImageVector? = null
