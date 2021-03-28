package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(12.292f, 2.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.584f, 0.0f)
                lineTo(0.458f, 6.81f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.38f)
                lineTo(4.25f, 9.793f)
                verticalLineToRelative(3.803f)
                arcToRelative(2.901f, 2.901f, 0.0f, false, false, -1.327f, 0.757f)
                curveToRelative(-0.579f, 0.58f, -0.923f, 1.41f, -0.923f, 2.43f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.248f, 0.128f, 0.486f, 0.335f, 0.624f)
                curveToRelative(0.06f, 0.04f, 0.117f, 0.073f, 0.22f, 0.124f)
                curveToRelative(0.124f, 0.062f, 0.297f, 0.138f, 0.52f, 0.213f)
                curveToRelative(0.448f, 0.149f, 1.09f, 0.288f, 1.925f, 0.288f)
                reflectiveCurveToRelative(1.477f, -0.14f, 1.925f, -0.288f)
                curveToRelative(0.223f, -0.075f, 0.396f, -0.15f, 0.52f, -0.213f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 0.21f, -0.117f)
                arcTo(0.762f, 0.762f, 0.0f, false, false, 8.0f, 21.28f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.018f, -0.344f, -1.85f, -0.923f, -2.428f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -1.327f, -0.758f)
                verticalLineToRelative(-3.17f)
                lineToRelative(5.958f, 2.516f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.584f, 0.0f)
                lineToRelative(5.208f, -2.2f)
                verticalLineToRelative(4.003f)
                arcToRelative(2.552f, 2.552f, 0.0f, false, true, -0.079f, 0.085f)
                arcToRelative(4.057f, 4.057f, 0.0f, false, true, -0.849f, 0.65f)
                curveToRelative(-0.826f, 0.488f, -2.255f, 1.021f, -4.572f, 1.021f)
                curveToRelative(-0.612f, 0.0f, -1.162f, -0.037f, -1.654f, -0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.192f, 1.487f)
                curveToRelative(0.56f, 0.072f, 1.173f, 0.113f, 1.846f, 0.113f)
                curveToRelative(2.558f, 0.0f, 4.254f, -0.592f, 5.334f, -1.23f)
                curveToRelative(0.538f, -0.316f, 0.914f, -0.64f, 1.163f, -0.896f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, 0.392f, -0.482f)
                horizontalLineToRelative(0.001f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 15.0f)
                verticalLineToRelative(-4.892f)
                lineToRelative(4.542f, -1.917f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.382f)
                lineToRelative(-11.25f, -4.75f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(-0.377f, 0.0f, -0.745f, 0.141f, -1.017f, 0.413f)
                curveToRelative(-0.265f, 0.265f, -0.483f, 0.7f, -0.483f, 1.368f)
                verticalLineToRelative(4.022f)
                curveToRelative(0.299f, 0.105f, 0.797f, 0.228f, 1.5f, 0.228f)
                reflectiveCurveToRelative(1.201f, -0.123f, 1.5f, -0.228f)
                lineTo(6.5f, 16.78f)
                curveToRelative(0.0f, -0.669f, -0.218f, -1.103f, -0.483f, -1.368f)
                arcTo(1.431f, 1.431f, 0.0f, false, false, 5.0f, 15.0f)
                close()
                moveTo(12.0f, 11.436f)
                lineTo(2.678f, 7.5f)
                lineTo(12.0f, 3.564f)
                lineTo(21.322f, 7.5f)
                lineTo(12.0f, 11.436f)
                close()
            }
        }
        .build()
        return _mortarBoard24!!
    }

private var _mortarBoard24: ImageVector? = null
