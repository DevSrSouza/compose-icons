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

public val Octicons.MortarBoard16: ImageVector
    get() {
        if (_mortarBoard16 != null) {
            return _mortarBoard16!!
        }
        _mortarBoard16 = Builder(name = "MortarBoard16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.693f, 1.066f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.614f, 0.0f)
                lineToRelative(7.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.368f)
                lineTo(13.0f, 6.831f)
                verticalLineToRelative(2.794f)
                curveToRelative(0.0f, 1.024f, -0.81f, 1.749f, -1.66f, 2.173f)
                curveToRelative(-0.893f, 0.447f, -2.075f, 0.702f, -3.34f, 0.702f)
                curveToRelative(-0.278f, 0.0f, -0.55f, -0.012f, -0.816f, -0.036f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.133f, -1.494f)
                curveToRelative(0.22f, 0.02f, 0.45f, 0.03f, 0.683f, 0.03f)
                curveToRelative(1.082f, 0.0f, 2.025f, -0.221f, 2.67f, -0.543f)
                curveToRelative(0.69f, -0.345f, 0.83f, -0.682f, 0.83f, -0.832f)
                verticalLineTo(7.503f)
                lineTo(8.307f, 8.934f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.614f, 0.0f)
                lineTo(4.0f, 7.28f)
                verticalLineToRelative(1.663f)
                curveToRelative(0.296f, 0.105f, 0.575f, 0.275f, 0.812f, 0.512f)
                curveToRelative(0.438f, 0.438f, 0.688f, 1.059f, 0.688f, 1.796f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.737f, 0.25f, -1.358f, 0.688f, -1.796f)
                curveToRelative(0.237f, -0.237f, 0.516f, -0.407f, 0.812f, -0.512f)
                verticalLineTo(6.606f)
                lineTo(0.443f, 5.684f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.368f)
                close()
                moveTo(2.583f, 5.0f)
                lineTo(8.0f, 7.428f)
                lineTo(13.416f, 5.0f)
                lineTo(8.0f, 2.572f)
                close()
                moveTo(2.5f, 11.25f)
                verticalLineToRelative(2.25f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -0.388f, -0.125f, -0.611f, -0.25f, -0.735f)
                arcToRelative(0.697f, 0.697f, 0.0f, false, false, -0.5f, -0.203f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, -0.5f, 0.203f)
                curveToRelative(-0.125f, 0.124f, -0.25f, 0.347f, -0.25f, 0.735f)
                close()
            }
        }
        .build()
        return _mortarBoard16!!
    }

private var _mortarBoard16: ImageVector? = null
