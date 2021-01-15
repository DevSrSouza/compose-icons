package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Nokia: ImageVector
    get() {
        if (_nokia != null) {
            return _nokia!!
        }
        _nokia = Builder(name = "Nokia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.156f, 13.954f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.892f)
                horizontalLineToRelative(1.998f)
                lineToRelative(2.294f, 2.905f)
                verticalLineToRelative(-2.905f)
                horizontalLineToRelative(1.156f)
                verticalLineToRelative(3.892f)
                horizontalLineTo(3.489f)
                lineToRelative(-2.333f, -2.956f)
                verticalLineToRelative(2.956f)
                moveToRelative(9.82f, -1.204f)
                curveToRelative(0.0f, 0.54f, -0.097f, 0.728f, -0.257f, 0.907f)
                curveToRelative(-0.244f, 0.266f, -0.6f, 0.346f, -1.289f, 0.346f)
                horizontalLineTo(7.457f)
                curveToRelative(-0.686f, 0.0f, -1.044f, -0.08f, -1.289f, -0.346f)
                curveToRelative(-0.16f, -0.18f, -0.256f, -0.365f, -0.256f, -0.907f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.54f, 0.096f, -0.727f, 0.256f, -0.906f)
                curveToRelative(0.245f, -0.266f, 0.603f, -0.347f, 1.289f, -0.347f)
                horizontalLineTo(9.43f)
                curveToRelative(0.688f, 0.0f, 1.045f, 0.08f, 1.29f, 0.347f)
                curveToRelative(0.16f, 0.18f, 0.256f, 0.365f, 0.256f, 0.907f)
                verticalLineToRelative(1.5f)
                moveToRelative(-1.594f, 0.267f)
                curveToRelative(0.264f, 0.0f, 0.356f, -0.017f, 0.42f, -0.074f)
                curveToRelative(0.06f, -0.053f, 0.086f, -0.12f, 0.086f, -0.35f)
                verticalLineToRelative(-1.187f)
                curveToRelative(0.0f, -0.23f, -0.026f, -0.297f, -0.085f, -0.35f)
                curveToRelative(-0.065f, -0.059f, -0.157f, -0.074f, -0.42f, -0.074f)
                horizontalLineTo(7.505f)
                curveToRelative(-0.264f, 0.0f, -0.357f, 0.015f, -0.42f, 0.074f)
                curveToRelative(-0.06f, 0.053f, -0.085f, 0.12f, -0.085f, 0.35f)
                verticalLineToRelative(1.187f)
                curveToRelative(0.0f, 0.23f, 0.026f, 0.297f, 0.085f, 0.35f)
                curveToRelative(0.063f, 0.057f, 0.156f, 0.074f, 0.42f, 0.074f)
                horizontalLineToRelative(1.876f)
                moveToRelative(3.273f, -2.956f)
                verticalLineToRelative(3.892f)
                horizontalLineToRelative(-1.207f)
                verticalLineToRelative(-3.892f)
                horizontalLineToRelative(1.207f)
                moveToRelative(2.04f, 0.0f)
                horizontalLineToRelative(1.595f)
                lineToRelative(-2.152f, 1.82f)
                lineToRelative(2.427f, 2.072f)
                horizontalLineToRelative(-1.706f)
                lineToRelative(-2.204f, -2.03f)
                lineToRelative(2.04f, -1.861f)
                moveToRelative(2.092f, 0.0f)
                horizontalLineToRelative(1.208f)
                verticalLineToRelative(3.891f)
                horizontalLineToRelative(-1.208f)
                moveToRelative(5.812f, 0.0f)
                lineToRelative(-0.357f, -0.678f)
                horizontalLineToRelative(-2.337f)
                lineToRelative(-0.353f, 0.678f)
                horizontalLineToRelative(-1.334f)
                lineToRelative(2.14f, -3.892f)
                horizontalLineToRelative(1.502f)
                lineTo(24.0f, 13.954f)
                horizontalLineToRelative(-1.4f)
                moveToRelative(-2.275f, -1.523f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-0.75f, -1.41f)
                lineToRelative(-0.75f, 1.41f)
            }
        }
        .build()
        return _nokia!!
    }

private var _nokia: ImageVector? = null
