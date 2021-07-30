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

public val SimpleIcons.Codeship: ImageVector
    get() {
        if (_codeship != null) {
            return _codeship!!
        }
        _codeship = Builder(name = "Codeship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.334f)
                curveToRelative(0.824f, 0.0f, 1.636f, 0.191f, 2.373f, 0.56f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.294f, 0.474f)
                verticalLineToRelative(1.519f)
                arcToRelative(15.985f, 15.985f, 0.0f, false, false, -5.334f, 0.0f)
                lineTo(9.333f, 2.368f)
                curveToRelative(0.0f, -0.2f, 0.114f, -0.384f, 0.294f, -0.474f)
                arcTo(5.304f, 5.304f, 0.0f, false, true, 12.0f, 1.334f)
                close()
                moveTo(17.143f, 5.929f)
                curveToRelative(0.114f, 0.043f, 0.19f, 0.152f, 0.19f, 0.274f)
                verticalLineToRelative(2.122f)
                arcTo(20.956f, 20.956f, 0.0f, false, false, 12.0f, 6.648f)
                curveToRelative(-1.951f, 0.344f, -3.794f, 0.943f, -5.333f, 1.677f)
                lineTo(6.667f, 6.203f)
                curveToRelative(0.0f, -0.122f, 0.076f, -0.231f, 0.19f, -0.274f)
                arcToRelative(14.648f, 14.648f, 0.0f, false, true, 5.038f, -0.933f)
                curveToRelative(1.926f, -0.024f, 3.725f, 0.37f, 5.248f, 0.933f)
                close()
                moveTo(12.0f, 8.0f)
                reflectiveCurveToRelative(3.752f, 0.625f, 6.411f, 2.482f)
                curveToRelative(0.145f, 0.101f, 0.18f, 0.299f, 0.084f, 0.448f)
                curveToRelative(-1.104f, 1.74f, -1.97f, 3.922f, -2.596f, 5.838f)
                curveToRelative(1.252f, -1.28f, 2.24f, -2.085f, 4.1f, -2.101f)
                curveToRelative(0.9f, 0.0f, 1.598f, 0.202f, 2.185f, 0.516f)
                curveTo(20.42f, 20.618f, 15.503f, 22.72f, 12.0f, 22.667f)
                curveToRelative(-4.337f, 0.02f, -8.32f, -2.702f, -9.914f, -6.723f)
                curveToRelative(0.8f, -0.709f, 1.74f, -1.277f, 3.247f, -1.277f)
                curveToRelative(0.92f, 0.0f, 1.626f, 0.212f, 2.22f, 0.537f)
                curveToRelative(-0.554f, -1.475f, -1.236f, -2.994f, -2.048f, -4.274f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.084f, -0.448f)
                curveTo(8.248f, 8.625f, 12.0f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 9.333f)
                curveToRelative(-1.333f, 2.0f, 0.0f, 8.0f, 0.0f, 8.0f)
                reflectiveCurveToRelative(1.333f, -6.0f, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _codeship!!
    }

private var _codeship: ImageVector? = null
