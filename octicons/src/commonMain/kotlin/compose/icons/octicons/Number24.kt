package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Number24: ImageVector
    get() {
        if (_number24 != null) {
            return _number24!!
        }
        _number24 = Builder(name = "Number24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.003f, 7.754f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(5.232f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.53f, 1.28f)
                lineToRelative(-2.776f, 2.777f)
                curveToRelative(0.55f, 0.097f, 1.057f, 0.253f, 1.492f, 0.483f)
                curveToRelative(0.905f, 0.477f, 1.504f, 1.284f, 1.504f, 2.418f)
                curveToRelative(0.0f, 0.966f, -0.471f, 1.75f, -1.172f, 2.27f)
                curveToRelative(-0.687f, 0.511f, -1.587f, 0.77f, -2.521f, 0.77f)
                curveToRelative(-1.367f, 0.0f, -2.274f, -0.528f, -2.667f, -0.756f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.755f, -1.297f)
                curveToRelative(0.331f, 0.193f, 0.953f, 0.553f, 1.912f, 0.553f)
                curveToRelative(0.673f, 0.0f, 1.243f, -0.188f, 1.627f, -0.473f)
                curveToRelative(0.37f, -0.275f, 0.566f, -0.635f, 0.566f, -1.067f)
                curveToRelative(0.0f, -0.5f, -0.219f, -0.836f, -0.703f, -1.091f)
                curveToRelative(-0.538f, -0.284f, -1.375f, -0.443f, -2.471f, -0.443f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, -1.28f)
                lineToRelative(2.643f, -2.644f)
                horizontalLineToRelative(-3.421f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(7.88f, 15.215f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -1.446f, 0.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.37f, -0.61f)
                arcToRelative(2.899f, 2.899f, 0.0f, false, true, 2.986f, -1.71f)
                curveToRelative(0.589f, 0.06f, 1.139f, 0.323f, 1.557f, 0.743f)
                curveToRelative(0.434f, 0.446f, 0.685f, 1.058f, 0.685f, 1.778f)
                curveToRelative(0.0f, 1.641f, -1.254f, 2.437f, -2.12f, 2.986f)
                curveToRelative(-0.538f, 0.341f, -1.18f, 0.694f, -1.495f, 1.273f)
                lineTo(9.75f, 20.505f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                curveToRelative(0.0f, -1.799f, 1.337f, -2.63f, 2.243f, -3.21f)
                curveToRelative(1.032f, -0.659f, 1.55f, -1.031f, 1.55f, -1.8f)
                curveToRelative(0.0f, -0.355f, -0.116f, -0.584f, -0.26f, -0.732f)
                arcToRelative(1.071f, 1.071f, 0.0f, false, false, -0.652f, -0.298f)
                close()
                moveTo(8.114f, 2.094f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.386f, 0.656f)
                lineTo(8.5f, 9.0f)
                horizontalLineToRelative(1.252f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(5.75f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 4.103f)
                lineToRelative(-0.853f, 0.533f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -0.795f, -1.272f)
                lineToRelative(2.0f, -1.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.762f, -0.02f)
                close()
            }
        }
        .build()
        return _number24!!
    }

private var _number24: ImageVector? = null
