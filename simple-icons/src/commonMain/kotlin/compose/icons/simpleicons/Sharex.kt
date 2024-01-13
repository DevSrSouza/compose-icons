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

public val SimpleIcons.Sharex: ImageVector
    get() {
        if (_sharex != null) {
            return _sharex!!
        }
        _sharex = Builder(name = "Sharex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.217f, 15.774f)
                verticalLineToRelative(0.054f)
                curveToRelative(0.083f, 3.469f, 2.543f, 6.416f, 5.99f, 7.607f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(1.095f, 0.377f, 2.246f, 0.568f, 3.404f, 0.565f)
                curveToRelative(5.159f, 0.0f, 9.347f, -3.697f, 9.389f, -8.275f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, false, -0.563f, -2.668f)
                curveToRelative(-1.19f, 3.446f, -4.138f, 5.906f, -7.607f, 5.987f)
                horizontalLineToRelative(-0.176f)
                curveToRelative(-2.01f, 0.0f, -3.854f, -0.8f, -5.294f, -2.13f)
                curveToRelative(-1.656f, -1.53f, -2.78f, -3.765f, -3.01f, -6.295f)
                curveToRelative(-1.3f, 1.407f, -2.093f, 3.2f, -2.13f, 5.155f)
                close()
                moveTo(8.227f, 5.217f)
                lineTo(8.17f, 5.217f)
                curveToRelative(-3.36f, 0.08f, -6.23f, 2.39f, -7.49f, 5.669f)
                lineToRelative(-0.117f, 0.32f)
                arcTo(10.408f, 10.408f, 0.0f, false, false, 0.0f, 14.608f)
                curveToRelative(0.0f, 5.159f, 3.697f, 9.347f, 8.275f, 9.389f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, false, 2.668f, -0.563f)
                curveToRelative(-3.446f, -1.19f, -5.906f, -4.138f, -5.987f, -7.607f)
                verticalLineToRelative(-0.176f)
                curveToRelative(0.0f, -2.01f, 0.8f, -3.854f, 2.13f, -5.296f)
                curveToRelative(1.53f, -1.656f, 3.765f, -2.78f, 6.296f, -3.01f)
                curveToRelative(-1.407f, -1.3f, -3.2f, -2.093f, -5.155f, -2.129f)
                close()
                moveTo(15.828f, 18.783f)
                lineTo(16.152f, 18.768f)
                curveToRelative(3.327f, -0.223f, 6.129f, -2.636f, 7.283f, -5.974f)
                arcTo(10.36f, 10.36f, 0.0f, false, false, 24.0f, 9.392f)
                curveToRelative(0.0f, -5.16f, -3.697f, -9.347f, -8.275f, -9.39f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, false, -2.668f, 0.563f)
                curveToRelative(3.446f, 1.19f, 5.906f, 4.14f, 5.987f, 7.607f)
                verticalLineToRelative(0.176f)
                curveToRelative(0.0f, 2.01f, -0.8f, 3.854f, -2.13f, 5.294f)
                curveToRelative(-1.53f, 1.656f, -3.765f, 2.78f, -6.295f, 3.01f)
                curveToRelative(1.407f, 1.3f, 3.2f, 2.094f, 5.155f, 2.13f)
                close()
                moveTo(0.002f, 8.275f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, false, 0.563f, 2.668f)
                curveToRelative(1.19f, -3.446f, 4.14f, -5.906f, 7.607f, -5.987f)
                horizontalLineToRelative(0.176f)
                curveToRelative(2.01f, 0.0f, 3.854f, 0.8f, 5.294f, 2.13f)
                curveToRelative(0.334f, 0.31f, 0.643f, 0.643f, 0.925f, 0.999f)
                curveToRelative(1.146f, 1.436f, 1.9f, 3.27f, 2.085f, 5.297f)
                curveToRelative(1.3f, -1.407f, 2.094f, -3.2f, 2.13f, -5.155f)
                lineTo(18.782f, 8.17f)
                curveTo(18.7f, 4.703f, 16.24f, 1.756f, 12.795f, 0.564f)
                arcTo(10.408f, 10.408f, 0.0f, false, false, 9.393f, 0.0f)
                curveTo(4.23f, 0.0f, 0.045f, 3.697f, 0.002f, 8.275f)
                close()
            }
        }
        .build()
        return _sharex!!
    }

private var _sharex: ImageVector? = null
