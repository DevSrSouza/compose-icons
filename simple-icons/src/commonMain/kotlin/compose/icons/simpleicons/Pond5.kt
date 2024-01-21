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

public val SimpleIcons.Pond5: ImageVector
    get() {
        if (_pond5 != null) {
            return _pond5!!
        }
        _pond5 = Builder(name = "Pond5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.504f, 11.385f)
                horizontalLineToRelative(0.755f)
                curveToRelative(0.92f, 0.0f, 1.747f, 0.286f, 1.741f, 1.388f)
                curveToRelative(0.0f, 1.047f, -0.932f, 1.412f, -1.717f, 1.412f)
                curveToRelative(-0.993f, 0.0f, -1.75f, -0.359f, -1.754f, -1.37f)
                verticalLineToRelative(-0.14f)
                horizontalLineToRelative(0.944f)
                verticalLineToRelative(0.14f)
                curveToRelative(0.0f, 0.384f, 0.442f, 0.53f, 0.798f, 0.53f)
                curveToRelative(0.233f, 0.0f, 0.784f, -0.085f, 0.784f, -0.572f)
                curveToRelative(0.006f, -0.475f, -0.508f, -0.572f, -0.797f, -0.572f)
                horizontalLineToRelative(-1.644f)
                lineTo(20.614f, 9.875f)
                horizontalLineToRelative(3.146f)
                verticalLineToRelative(0.853f)
                horizontalLineToRelative(-2.256f)
                close()
                moveTo(17.337f, 14.13f)
                horizontalLineToRelative(-1.76f)
                lineTo(15.577f, 9.87f)
                horizontalLineToRelative(1.76f)
                curveToRelative(1.478f, 0.0f, 2.134f, 0.985f, 2.134f, 2.1f)
                curveToRelative(0.0f, 1.113f, -0.632f, 2.16f, -2.134f, 2.16f)
                close()
                moveTo(17.337f, 10.728f)
                horizontalLineToRelative(-0.816f)
                verticalLineToRelative(2.526f)
                horizontalLineToRelative(0.816f)
                curveToRelative(0.932f, 0.0f, 1.19f, -0.682f, 1.19f, -1.297f)
                curveToRelative(0.0f, -0.615f, -0.295f, -1.23f, -1.19f, -1.23f)
                close()
                moveTo(11.282f, 11.868f)
                verticalLineToRelative(2.262f)
                horizontalLineToRelative(-0.955f)
                lineTo(10.327f, 9.81f)
                lineToRelative(0.134f, -0.023f)
                lineToRelative(2.598f, 2.33f)
                lineTo(13.059f, 9.869f)
                horizontalLineToRelative(0.957f)
                verticalLineToRelative(4.333f)
                lineToRelative(-0.1f, 0.017f)
                lineToRelative(-2.634f, -2.351f)
                close()
                moveTo(6.851f, 14.235f)
                curveToRelative(-1.374f, 0.0f, -2.319f, -0.848f, -2.319f, -2.235f)
                curveToRelative(0.0f, -1.388f, 0.945f, -2.235f, 2.319f, -2.235f)
                curveToRelative(1.373f, 0.0f, 2.318f, 0.847f, 2.318f, 2.235f)
                curveToRelative(0.0f, 1.387f, -0.944f, 2.234f, -2.318f, 2.234f)
                close()
                moveTo(6.851f, 10.617f)
                curveToRelative(-0.816f, 0.0f, -1.38f, 0.61f, -1.38f, 1.382f)
                curveToRelative(0.0f, 0.798f, 0.564f, 1.376f, 1.38f, 1.376f)
                curveToRelative(0.834f, 0.0f, 1.38f, -0.584f, 1.38f, -1.376f)
                curveToRelative(0.0f, -0.779f, -0.546f, -1.382f, -1.38f, -1.382f)
                close()
                moveTo(2.024f, 12.925f)
                horizontalLineToRelative(-0.587f)
                verticalLineToRelative(-0.87f)
                horizontalLineToRelative(0.587f)
                curveToRelative(0.46f, 0.0f, 0.686f, -0.299f, 0.686f, -0.64f)
                curveToRelative(0.0f, -0.34f, -0.232f, -0.645f, -0.686f, -0.645f)
                lineTo(0.957f, 10.77f)
                verticalLineToRelative(3.36f)
                lineTo(0.0f, 14.13f)
                lineTo(0.0f, 9.87f)
                horizontalLineToRelative(2.024f)
                curveToRelative(1.097f, 0.0f, 1.642f, 0.705f, 1.642f, 1.527f)
                curveToRelative(0.0f, 0.852f, -0.552f, 1.516f, -1.643f, 1.528f)
                close()
            }
        }
        .build()
        return _pond5!!
    }

private var _pond5: ImageVector? = null
