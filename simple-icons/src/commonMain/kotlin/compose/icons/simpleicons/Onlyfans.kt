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

public val SimpleIcons.Onlyfans: ImageVector
    get() {
        if (_onlyfans != null) {
            return _onlyfans!!
        }
        _onlyfans = Builder(name = "Onlyfans", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.628f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(11.988f, 1.256f)
                curveToRelative(5.942f, -0.007f, 10.755f, 4.805f, 10.755f, 10.741f)
                reflectiveCurveTo(17.93f, 22.746f, 11.995f, 22.745f)
                curveToRelative(-5.936f, 0.0f, -10.749f, -4.812f, -10.749f, -10.748f)
                curveToRelative(0.0f, -5.927f, 4.799f, -10.735f, 10.742f, -10.741f)
                close()
                moveTo(11.668f, 5.823f)
                arcToRelative(4.496f, 4.496f, 0.0f, false, false, -3.164f, 1.299f)
                arcToRelative(4.338f, 4.338f, 0.0f, false, false, -1.317f, 3.117f)
                verticalLineToRelative(0.979f)
                lineToRelative(-0.556f, 1.003f)
                verticalLineToRelative(1.444f)
                arcToRelative(4.842f, 4.842f, 0.0f, false, false, 1.465f, 3.462f)
                arcToRelative(5.031f, 5.031f, 0.0f, false, false, 3.53f, 1.44f)
                horizontalLineToRelative(0.896f)
                curveToRelative(1.316f, 0.0f, 2.58f, -0.517f, 3.52f, -1.44f)
                arcToRelative(4.834f, 4.834f, 0.0f, false, false, 1.467f, -3.462f)
                lineTo(17.509f, 12.22f)
                lineToRelative(-0.55f, -1.003f)
                verticalLineToRelative(-0.98f)
                arcToRelative(4.35f, 4.35f, 0.0f, false, false, -1.32f, -3.116f)
                arcToRelative(4.496f, 4.496f, 0.0f, false, false, -3.166f, -1.299f)
                close()
                moveTo(11.668f, 7.793f)
                horizontalLineToRelative(0.805f)
                arcToRelative(2.496f, 2.496f, 0.0f, false, true, 1.75f, 0.724f)
                curveToRelative(0.465f, 0.452f, 0.728f, 1.073f, 0.73f, 1.722f)
                lineToRelative(0.003f, 1.01f)
                horizontalLineToRelative(-5.77f)
                verticalLineToRelative(-1.01f)
                curveToRelative(0.002f, -0.649f, 0.265f, -1.27f, 0.73f, -1.722f)
                arcToRelative(2.499f, 2.499f, 0.0f, false, true, 1.751f, -0.725f)
                close()
                moveTo(12.132f, 12.989f)
                horizontalLineToRelative(0.03f)
                curveToRelative(1.534f, -0.023f, 1.95f, 2.104f, 0.519f, 2.66f)
                horizontalLineToRelative(-0.086f)
                verticalLineToRelative(1.156f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, true, -0.232f, 0.426f)
                horizontalLineToRelative(-0.511f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.24f, -0.434f)
                lineTo(11.612f, 15.65f)
                curveToRelative(-1.43f, -0.556f, -1.015f, -2.683f, 0.52f, -2.66f)
                close()
            }
        }
        .build()
        return _onlyfans!!
    }

private var _onlyfans: ImageVector? = null
