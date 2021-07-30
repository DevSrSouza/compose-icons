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

public val SimpleIcons.Ideal: ImageVector
    get() {
        if (_ideal != null) {
            return _ideal!!
        }
        _ideal = Builder(name = "Ideal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.975f, 2.61f)
                verticalLineToRelative(18.782f)
                horizontalLineToRelative(11.411f)
                curveToRelative(6.89f, 0.0f, 10.64f, -3.21f, 10.64f, -9.415f)
                curveToRelative(0.0f, -6.377f, -4.064f, -9.367f, -10.64f, -9.367f)
                lineTo(0.975f, 2.61f)
                close()
                moveTo(12.386f, 1.635f)
                curveTo(22.491f, 1.635f, 24.0f, 8.115f, 24.0f, 11.977f)
                curveToRelative(0.0f, 6.7f, -4.124f, 10.39f, -11.614f, 10.39f)
                lineTo(0.0f, 22.367f)
                lineTo(0.0f, 1.635f)
                horizontalLineToRelative(12.386f)
                close()
                moveTo(2.506f, 13.357f)
                horizontalLineToRelative(3.653f)
                verticalLineToRelative(6.503f)
                lineTo(2.506f, 19.86f)
                close()
                moveTo(6.602f, 10.082f)
                arcToRelative(2.27f, 2.27f, 0.0f, true, true, -4.54f, 0.0f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, 4.54f, 0.0f)
                moveToRelative(1.396f, -1.057f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.45f, 0.0f, 0.867f, -0.13f, 0.867f, -1.077f)
                curveToRelative(0.0f, -0.924f, -0.463f, -1.043f, -0.867f, -1.043f)
                horizontalLineToRelative(-0.65f)
                close()
                moveTo(18.848f, 7.971f)
                horizontalLineToRelative(1.053f)
                verticalLineToRelative(3.174f)
                horizontalLineToRelative(1.56f)
                curveToRelative(-0.428f, -5.758f, -4.958f, -7.002f, -9.074f, -7.002f)
                lineTo(7.999f, 4.143f)
                verticalLineToRelative(3.83f)
                horizontalLineToRelative(0.65f)
                curveToRelative(1.183f, 0.0f, 1.92f, 0.803f, 1.92f, 2.095f)
                curveToRelative(0.0f, 1.333f, -0.719f, 2.129f, -1.92f, 2.129f)
                horizontalLineToRelative(-0.65f)
                verticalLineToRelative(7.665f)
                horizontalLineToRelative(4.388f)
                curveToRelative(6.692f, 0.0f, 9.021f, -3.107f, 9.103f, -7.665f)
                horizontalLineToRelative(-2.64f)
                lineTo(18.85f, 7.97f)
                close()
                moveTo(15.918f, 10.329f)
                horizontalLineToRelative(0.76f)
                lineToRelative(-0.348f, -1.195f)
                horizontalLineToRelative(-0.063f)
                lineToRelative(-0.35f, 1.195f)
                close()
                moveTo(14.275f, 12.199f)
                lineToRelative(1.274f, -4.228f)
                horizontalLineToRelative(1.497f)
                lineToRelative(1.274f, 4.227f)
                horizontalLineToRelative(-1.095f)
                lineToRelative(-0.239f, -0.818f)
                lineTo(15.61f, 11.38f)
                lineToRelative(-0.24f, 0.818f)
                horizontalLineToRelative(-1.095f)
                close()
                moveTo(13.77f, 11.145f)
                verticalLineToRelative(1.052f)
                horizontalLineToRelative(-2.603f)
                lineTo(11.167f, 7.973f)
                horizontalLineToRelative(2.519f)
                verticalLineToRelative(1.052f)
                horizontalLineToRelative(-1.467f)
                verticalLineToRelative(0.49f)
                horizontalLineToRelative(1.387f)
                verticalLineToRelative(1.05f)
                lineTo(12.22f, 10.565f)
                verticalLineToRelative(0.58f)
                horizontalLineToRelative(1.55f)
                close()
            }
        }
        .build()
        return _ideal!!
    }

private var _ideal: ImageVector? = null
