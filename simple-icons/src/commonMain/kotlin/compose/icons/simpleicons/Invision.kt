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

public val SimpleIcons.Invision: ImageVector
    get() {
        if (_invision != null) {
            return _invision!!
        }
        _invision = Builder(name = "Invision", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.265f, 15.108f)
                arcToRelative(4.715f, 4.715f, 0.0f, false, false, -0.124f, 1.036f)
                curveToRelative(0.0f, 1.215f, 0.658f, 2.021f, 2.058f, 2.021f)
                curveToRelative(1.16f, 0.0f, 2.102f, -0.69f, 2.78f, -1.803f)
                lineToRelative(-0.415f, 1.661f)
                horizontalLineToRelative(2.304f)
                lineToRelative(1.319f, -5.28f)
                curveToRelative(0.329f, -1.338f, 0.966f, -2.032f, 1.934f, -2.032f)
                curveToRelative(0.761f, 0.0f, 1.235f, 0.473f, 1.235f, 1.255f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, true, -0.103f, 0.742f)
                lineToRelative(-0.679f, 2.427f)
                arcToRelative(3.63f, 3.63f, 0.0f, false, false, -0.144f, 1.03f)
                curveToRelative(0.0f, 1.151f, 0.679f, 1.996f, 2.099f, 1.996f)
                curveToRelative(1.214f, 0.0f, 2.182f, -0.781f, 2.716f, -2.654f)
                lineToRelative(-0.905f, -0.35f)
                curveToRelative(-0.453f, 1.255f, -0.844f, 1.482f, -1.152f, 1.482f)
                curveToRelative(-0.308f, 0.0f, -0.474f, -0.206f, -0.474f, -0.618f)
                arcToRelative(2.737f, 2.737f, 0.0f, false, true, 0.103f, -0.638f)
                lineToRelative(0.66f, -2.366f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, false, 0.226f, -1.5f)
                curveToRelative(0.0f, -1.771f, -1.07f, -2.695f, -2.368f, -2.695f)
                curveToRelative(-1.214f, 0.0f, -2.449f, 1.096f, -3.066f, 2.249f)
                lineTo(13.721f, 9.0f)
                horizontalLineToRelative(-3.518f)
                lineToRelative(-0.495f, 1.824f)
                horizontalLineToRelative(1.648f)
                lineToRelative(-1.014f, 4.055f)
                curveToRelative(-0.797f, 1.77f, -2.26f, 1.799f, -2.443f, 1.758f)
                curveToRelative(-0.302f, -0.068f, -0.494f, -0.183f, -0.494f, -0.576f)
                arcToRelative(3.847f, 3.847f, 0.0f, false, true, 0.144f, -0.942f)
                lineToRelative(1.544f, -6.124f)
                lineTo(5.184f, 8.995f)
                lineToRelative(-0.493f, 1.824f)
                horizontalLineToRelative(1.625f)
                close()
                moveTo(8.167f, 7.723f)
                arcToRelative(1.38f, 1.38f, 0.0f, true, false, -1.4f, -1.38f)
                arcToRelative(1.384f, 1.384f, 0.0f, false, false, 1.4f, 1.38f)
                close()
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                close()
            }
        }
        .build()
        return _invision!!
    }

private var _invision: ImageVector? = null
