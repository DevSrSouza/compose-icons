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

public val SimpleIcons.Progate: ImageVector
    get() {
        if (_progate != null) {
            return _progate!!
        }
        _progate = Builder(name = "Progate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.056f, 24.0f)
                arcToRelative(17.14f, 17.14f, 0.0f, false, true, -3.457f, -0.698f)
                curveToRelative(-1.244f, -0.364f, -2.899f, -1.0f, -2.913f, -2.319f)
                curveToRelative(0.0f, -0.946f, 0.54f, -1.755f, 1.675f, -2.477f)
                arcToRelative(15.827f, 15.827f, 0.0f, false, true, 1.6f, -0.844f)
                arcToRelative(39.6f, 39.6f, 0.0f, false, true, 2.2f, -0.928f)
                lineTo(9.161f, 4.98f)
                lineToRelative(-4.41f, -0.476f)
                verticalLineToRelative(12.652f)
                arcToRelative(0.848f, 0.848f, 0.0f, false, true, -0.895f, 0.846f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -0.904f, -0.846f)
                lineTo(2.952f, 3.496f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, true, 0.904f, -0.903f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.096f, 0.014f)
                lineToRelative(6.198f, 0.67f)
                arcToRelative(0.902f, 0.902f, 0.0f, false, true, 0.8f, 0.9f)
                verticalLineToRelative(11.826f)
                arcToRelative(61.194f, 61.194f, 0.0f, false, false, 2.399f, -1.03f)
                curveToRelative(2.27f, -1.036f, 3.799f, -2.091f, 4.668f, -3.237f)
                curveToRelative(1.056f, -1.374f, 1.218f, -3.075f, 1.168f, -4.259f)
                arcToRelative(6.264f, 6.264f, 0.0f, false, false, -1.254f, -3.515f)
                arcToRelative(5.498f, 5.498f, 0.0f, false, false, -2.095f, -1.725f)
                arcToRelative(6.208f, 6.208f, 0.0f, false, false, -1.663f, -0.486f)
                curveToRelative(-0.6f, -0.082f, -0.896f, -0.51f, -0.864f, -0.938f)
                curveToRelative(0.032f, -0.427f, 0.384f, -0.75f, 0.888f, -0.8f)
                curveToRelative(0.863f, -0.071f, 1.503f, 0.147f, 2.375f, 0.536f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, true, 2.86f, 2.32f)
                arcToRelative(8.167f, 8.167f, 0.0f, false, true, 1.6f, 4.522f)
                arcToRelative(8.967f, 8.967f, 0.0f, false, true, -0.485f, 3.481f)
                arcToRelative(7.36f, 7.36f, 0.0f, false, true, -1.088f, 1.966f)
                curveToRelative(-1.584f, 2.065f, -4.39f, 3.34f, -5.31f, 3.764f)
                curveToRelative(-0.868f, 0.4f, -2.8f, 1.2f, -3.18f, 1.352f)
                lineTo(10.969f, 23.1f)
                arcToRelative(0.908f, 0.908f, 0.0f, false, true, -0.31f, 0.682f)
                arcToRelative(0.918f, 0.918f, 0.0f, false, true, -0.567f, 0.218f)
                close()
                moveTo(9.16f, 18.682f)
                curveToRelative(-0.552f, 0.2f, -1.4f, 0.512f, -1.72f, 0.66f)
                curveToRelative(-0.32f, 0.147f, -1.215f, 0.565f, -1.61f, 0.91f)
                curveToRelative(-0.1f, 0.085f, -0.417f, 0.385f, -0.339f, 0.629f)
                curveToRelative(0.078f, 0.244f, 0.446f, 0.374f, 1.904f, 0.766f)
                curveToRelative(0.518f, 0.14f, 1.125f, 0.274f, 1.765f, 0.4f)
                close()
            }
        }
        .build()
        return _progate!!
    }

private var _progate: ImageVector? = null
