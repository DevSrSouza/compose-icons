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

public val SimpleIcons.Matrix: ImageVector
    get() {
        if (_matrix != null) {
            return _matrix!!
        }
        _matrix = Builder(name = "Matrix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.632f, 0.55f)
                verticalLineToRelative(22.9f)
                lineTo(2.28f, 23.45f)
                lineTo(2.28f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(2.28f)
                verticalLineToRelative(0.55f)
                close()
                moveTo(7.675f, 7.81f)
                verticalLineToRelative(1.157f)
                horizontalLineToRelative(0.033f)
                curveToRelative(0.309f, -0.443f, 0.683f, -0.784f, 1.117f, -1.024f)
                curveToRelative(0.433f, -0.245f, 0.936f, -0.365f, 1.5f, -0.365f)
                curveToRelative(0.54f, 0.0f, 1.033f, 0.107f, 1.481f, 0.314f)
                curveToRelative(0.448f, 0.208f, 0.785f, 0.582f, 1.02f, 1.108f)
                curveToRelative(0.254f, -0.374f, 0.6f, -0.706f, 1.034f, -0.992f)
                curveToRelative(0.434f, -0.287f, 0.95f, -0.43f, 1.546f, -0.43f)
                curveToRelative(0.453f, 0.0f, 0.872f, 0.056f, 1.26f, 0.167f)
                curveToRelative(0.388f, 0.11f, 0.716f, 0.286f, 0.993f, 0.53f)
                curveToRelative(0.276f, 0.245f, 0.489f, 0.559f, 0.646f, 0.951f)
                curveToRelative(0.152f, 0.392f, 0.23f, 0.863f, 0.23f, 1.417f)
                verticalLineToRelative(5.728f)
                horizontalLineToRelative(-2.349f)
                lineTo(16.186f, 11.52f)
                curveToRelative(0.0f, -0.286f, -0.01f, -0.559f, -0.032f, -0.812f)
                arcToRelative(1.755f, 1.755f, 0.0f, false, false, -0.18f, -0.66f)
                arcToRelative(1.106f, 1.106f, 0.0f, false, false, -0.438f, -0.448f)
                curveToRelative(-0.194f, -0.11f, -0.457f, -0.166f, -0.785f, -0.166f)
                curveToRelative(-0.332f, 0.0f, -0.6f, 0.064f, -0.803f, 0.189f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, -0.48f, 0.499f)
                arcToRelative(1.946f, 1.946f, 0.0f, false, false, -0.231f, 0.696f)
                arcToRelative(5.56f, 5.56f, 0.0f, false, false, -0.06f, 0.785f)
                verticalLineToRelative(4.768f)
                horizontalLineToRelative(-2.35f)
                verticalLineToRelative(-4.8f)
                curveToRelative(0.0f, -0.254f, -0.004f, -0.503f, -0.018f, -0.752f)
                arcToRelative(2.074f, 2.074f, 0.0f, false, false, -0.143f, -0.688f)
                arcToRelative(1.052f, 1.052f, 0.0f, false, false, -0.415f, -0.503f)
                curveToRelative(-0.194f, -0.125f, -0.476f, -0.19f, -0.854f, -0.19f)
                curveToRelative(-0.111f, 0.0f, -0.259f, 0.024f, -0.439f, 0.074f)
                curveToRelative(-0.18f, 0.051f, -0.36f, 0.143f, -0.53f, 0.282f)
                curveToRelative(-0.171f, 0.138f, -0.319f, 0.337f, -0.439f, 0.595f)
                curveToRelative(-0.12f, 0.259f, -0.18f, 0.6f, -0.18f, 1.02f)
                verticalLineToRelative(4.966f)
                lineTo(5.46f, 16.375f)
                lineTo(5.46f, 7.81f)
                close()
                moveTo(23.368f, 23.45f)
                lineTo(23.368f, 0.55f)
                lineTo(21.72f, 0.55f)
                lineTo(21.72f, 0.0f)
                lineTo(24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-2.28f)
                verticalLineToRelative(-0.55f)
                close()
            }
        }
        .build()
        return _matrix!!
    }

private var _matrix: ImageVector? = null
