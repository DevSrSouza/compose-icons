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

public val Octicons.MortarBoard24: ImageVector
    get() {
        if (_mortarBoard24 != null) {
            return _mortarBoard24!!
        }
        _mortarBoard24 = Builder(name = "MortarBoard24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.292f, 2.06f)
                verticalLineToRelative(-0.001f)
                lineToRelative(11.25f, 4.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, 1.382f)
                lineTo(19.0f, 10.108f)
                verticalLineTo(15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.11f, 0.391f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, -0.392f, 0.482f)
                curveToRelative(-0.249f, 0.256f, -0.625f, 0.58f, -1.163f, 0.896f)
                curveToRelative(-1.08f, 0.638f, -2.776f, 1.23f, -5.334f, 1.23f)
                curveToRelative(-0.673f, 0.0f, -1.286f, -0.041f, -1.846f, -0.113f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.192f, -1.487f)
                curveToRelative(0.492f, 0.063f, 1.042f, 0.1f, 1.654f, 0.1f)
                curveToRelative(2.317f, 0.0f, 3.746f, -0.533f, 4.572f, -1.021f)
                curveToRelative(0.31f, -0.178f, 0.596f, -0.397f, 0.849f, -0.65f)
                lineToRelative(0.079f, -0.085f)
                verticalLineTo(10.74f)
                lineToRelative(-5.208f, 2.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.584f, 0.0f)
                lineTo(5.75f, 10.424f)
                verticalLineToRelative(3.17f)
                curveToRelative(0.502f, 0.129f, 0.96f, 0.391f, 1.327f, 0.758f)
                curveToRelative(0.579f, 0.578f, 0.923f, 1.41f, 0.923f, 2.428f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.761f, 0.761f, 0.0f, false, true, -0.345f, 0.634f)
                arcToRelative(2.157f, 2.157f, 0.0f, false, true, -0.21f, 0.117f)
                arcToRelative(3.923f, 3.923f, 0.0f, false, true, -0.52f, 0.213f)
                arcTo(6.121f, 6.121f, 0.0f, false, true, 5.0f, 22.532f)
                arcToRelative(6.092f, 6.092f, 0.0f, false, true, -1.925f, -0.288f)
                arcToRelative(4.065f, 4.065f, 0.0f, false, true, -0.52f, -0.213f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, true, -0.22f, -0.124f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, true, -0.335f, -0.624f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.02f, 0.344f, -1.85f, 0.923f, -2.43f)
                arcToRelative(2.904f, 2.904f, 0.0f, false, true, 1.327f, -0.757f)
                verticalLineTo(9.793f)
                lineTo(0.458f, 8.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.38f)
                lineToRelative(11.25f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.584f, 0.0f)
                close()
                moveTo(12.0f, 11.436f)
                lineTo(21.322f, 7.5f)
                lineTo(12.0f, 3.564f)
                lineTo(2.678f, 7.5f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(-0.377f, 0.0f, -0.745f, 0.141f, -1.017f, 0.413f)
                curveToRelative(-0.265f, 0.265f, -0.483f, 0.7f, -0.483f, 1.368f)
                verticalLineToRelative(4.022f)
                curveToRelative(0.299f, 0.105f, 0.797f, 0.228f, 1.5f, 0.228f)
                reflectiveCurveToRelative(1.201f, -0.123f, 1.5f, -0.228f)
                verticalLineTo(16.78f)
                curveToRelative(0.0f, -0.669f, -0.218f, -1.103f, -0.483f, -1.368f)
                arcTo(1.433f, 1.433f, 0.0f, false, false, 5.0f, 15.0f)
                close()
            }
        }
        .build()
        return _mortarBoard24!!
    }

private var _mortarBoard24: ImageVector? = null
