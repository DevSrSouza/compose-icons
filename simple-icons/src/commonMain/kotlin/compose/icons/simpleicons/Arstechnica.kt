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

public val SimpleIcons.Arstechnica: ImageVector
    get() {
        if (_arstechnica != null) {
            return _arstechnica!!
        }
        _arstechnica = Builder(name = "Arstechnica", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(8.842f, 15.656f)
                lineTo(7.745f, 15.656f)
                lineToRelative(-0.15f, -0.98f)
                arcToRelative(3.457f, 3.457f, 0.0f, false, true, -2.592f, 1.13f)
                curveToRelative(-1.33f, 0.0f, -2.16f, -0.798f, -2.16f, -2.044f)
                curveToRelative(0.0f, -1.828f, 1.561f, -2.56f, 4.636f, -2.876f)
                verticalLineToRelative(-0.315f)
                curveToRelative(0.0f, -0.931f, -0.548f, -1.247f, -1.396f, -1.247f)
                curveToRelative(-0.848f, 0.0f, -1.745f, 0.283f, -2.543f, 0.632f)
                lineToRelative(-0.183f, -1.18f)
                curveToRelative(0.881f, -0.35f, 1.712f, -0.615f, 2.842f, -0.615f)
                curveToRelative(1.779f, 0.0f, 2.643f, 0.714f, 2.643f, 2.36f)
                verticalLineToRelative(5.135f)
                close()
                moveTo(12.033f, 11.319f)
                verticalLineToRelative(4.337f)
                lineTo(10.67f, 15.656f)
                verticalLineToRelative(-7.33f)
                horizontalLineToRelative(1.097f)
                lineTo(12.0f, 9.824f)
                curveToRelative(0.515f, -0.831f, 1.363f, -1.58f, 2.576f, -1.646f)
                lineToRelative(0.216f, 1.313f)
                curveToRelative(-1.23f, 0.05f, -2.26f, 0.865f, -2.759f, 1.829f)
                close()
                moveTo(18.233f, 15.806f)
                arcToRelative(6.017f, 6.017f, 0.0f, false, true, -2.676f, -0.698f)
                lineToRelative(0.2f, -1.296f)
                arcToRelative(4.587f, 4.587f, 0.0f, false, false, 2.592f, 0.847f)
                curveToRelative(0.93f, 0.0f, 1.496f, -0.349f, 1.496f, -0.964f)
                reflectiveCurveToRelative(-0.416f, -0.93f, -1.745f, -1.246f)
                curveToRelative(-1.729f, -0.432f, -2.41f, -0.948f, -2.41f, -2.26f)
                curveToRelative(0.0f, -1.314f, 0.98f, -2.028f, 2.593f, -2.028f)
                arcToRelative(5.933f, 5.933f, 0.0f, false, true, 2.41f, 0.498f)
                lineToRelative(-0.217f, 1.297f)
                arcToRelative(4.687f, 4.687f, 0.0f, false, false, -2.227f, -0.632f)
                curveToRelative(-0.83f, 0.0f, -1.263f, 0.316f, -1.263f, 0.848f)
                reflectiveCurveToRelative(0.366f, 0.764f, 1.53f, 1.063f)
                curveToRelative(1.81f, 0.466f, 2.625f, 0.981f, 2.625f, 2.377f)
                reflectiveCurveToRelative(-1.014f, 2.194f, -2.908f, 2.194f)
                close()
                moveTo(7.479f, 11.934f)
                verticalLineToRelative(1.711f)
                curveToRelative(-0.615f, 0.632f, -1.479f, 1.03f, -2.177f, 1.03f)
                reflectiveCurveToRelative(-1.097f, -0.215f, -1.097f, -0.98f)
                curveToRelative(0.0f, -0.764f, 0.565f, -1.496f, 3.274f, -1.761f)
                close()
            }
        }
        .build()
        return _arstechnica!!
    }

private var _arstechnica: ImageVector? = null
