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

public val SimpleIcons.Construct3: ImageVector
    get() {
        if (_construct3 != null) {
            return _construct3!!
        }
        _construct3 = Builder(name = "Construct3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.392f, 0.0f)
                curveToRelative(-6.752f, 0.0f, -12.0f, 5.498f, -12.0f, 12.0f)
                curveToRelative(0.0f, 6.574f, 5.313f, 12.0f, 12.0f, 12.0f)
                curveToRelative(4.283f, 0.0f, 8.087f, -2.254f, 10.217f, -5.704f)
                arcToRelative(0.571f, 0.571f, 0.0f, false, false, -0.2f, -0.795f)
                lineToRelative(-5.55f, -3.204f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, false, -0.76f, 0.177f)
                arcToRelative(4.453f, 4.453f, 0.0f, false, true, -3.707f, 1.983f)
                curveToRelative(-2.458f, 0.0f, -4.458f, -2.0f, -4.458f, -4.457f)
                curveToRelative(0.0f, -2.458f, 2.0f, -4.457f, 4.458f, -4.457f)
                curveToRelative(1.491f, 0.0f, 2.877f, 0.741f, 3.707f, 1.983f)
                arcToRelative(0.571f, 0.571f, 0.0f, false, false, 0.76f, 0.177f)
                lineToRelative(5.55f, -3.204f)
                arcToRelative(0.571f, 0.571f, 0.0f, false, false, 0.2f, -0.795f)
                arcTo(11.998f, 11.998f, 0.0f, false, false, 12.392f, 0.0f)
                close()
                moveTo(12.392f, 3.527f)
                curveToRelative(3.048f, 0.0f, 5.72f, 1.61f, 7.213f, 4.026f)
                lineToRelative(-2.99f, 1.726f)
                curveToRelative(-0.037f, 0.021f, -0.085f, 0.013f, -0.108f, -0.026f)
                arcToRelative(4.942f, 4.942f, 0.0f, false, false, -4.115f, -2.2f)
                arcTo(4.953f, 4.953f, 0.0f, false, false, 7.445f, 12.0f)
                curveToRelative(0.0f, 0.9f, 0.241f, 1.745f, 0.663f, 2.473f)
                lineToRelative(-2.342f, 1.353f)
                arcToRelative(0.327f, 0.327f, 0.0f, false, false, -0.112f, 0.458f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, false, 6.738f, 3.7f)
                arcToRelative(7.978f, 7.978f, 0.0f, false, false, 6.789f, -3.781f)
                lineToRelative(2.983f, 1.722f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, 0.028f, 0.113f)
                arcToRelative(11.447f, 11.447f, 0.0f, false, true, -9.8f, 5.472f)
                curveTo(6.045f, 23.51f, 0.882f, 18.346f, 0.882f, 12.0f)
                curveToRelative(0.0f, -2.095f, 0.562f, -4.06f, 1.544f, -5.754f)
                lineToRelative(2.35f, 1.356f)
                curveToRelative(0.15f, 0.088f, 0.345f, 0.04f, 0.439f, -0.11f)
                arcToRelative(8.467f, 8.467f, 0.0f, false, true, 7.177f, -3.966f)
                close()
                moveTo(22.965f, 8.95f)
                arcToRelative(0.666f, 0.666f, 0.0f, false, false, -0.336f, 0.088f)
                lineToRelative(-4.149f, 2.395f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, false, 0.0f, 1.131f)
                lineToRelative(4.149f, 2.396f)
                curveToRelative(0.434f, 0.25f, 0.98f, -0.064f, 0.98f, -0.566f)
                verticalLineToRelative(-4.79f)
                arcToRelative(0.655f, 0.655f, 0.0f, false, false, -0.644f, -0.654f)
                close()
                moveTo(22.302f, 10.735f)
                verticalLineToRelative(2.528f)
                lineTo(20.112f, 12.0f)
                close()
            }
        }
        .build()
        return _construct3!!
    }

private var _construct3: ImageVector? = null
