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

public val SimpleIcons.Hockeyapp: ImageVector
    get() {
        if (_hockeyapp != null) {
            return _hockeyapp!!
        }
        _hockeyapp = Builder(name = "Hockeyapp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.794f, 15.002f)
                curveToRelative(0.075f, -0.057f, 0.181f, -0.007f, 0.194f, 0.083f)
                curveToRelative(0.006f, 0.057f, 0.012f, 0.114f, 0.012f, 0.171f)
                curveTo(22.0f, 16.842f, 18.669f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-6.669f, 0.0f, -10.0f, -2.158f, -10.0f, -3.737f)
                curveToRelative(0.0f, -0.057f, 0.006f, -0.115f, 0.013f, -0.166f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, true, 0.193f, -0.082f)
                curveToRelative(1.656f, 1.19f, 4.919f, 2.209f, 9.794f, 2.209f)
                curveToRelative(4.881f, 0.0f, 8.144f, -1.019f, 9.794f, -2.222f)
                close()
                moveTo(12.0f, 14.168f)
                curveToRelative(-5.406f, 0.0f, -8.988f, -1.229f, -10.738f, -2.649f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, false, -0.187f, 0.039f)
                curveToRelative(-0.094f, 0.178f, -0.137f, 0.369f, -0.137f, 0.56f)
                curveToRelative(0.0f, 1.75f, 3.687f, 4.087f, 11.062f, 4.087f)
                reflectiveCurveToRelative(11.063f, -2.33f, 11.063f, -4.087f)
                curveToRelative(0.0f, -0.198f, -0.044f, -0.382f, -0.138f, -0.56f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, false, -0.188f, -0.039f)
                curveToRelative(-1.75f, 1.42f, -5.33f, 2.649f, -10.737f, 2.649f)
                close()
                moveTo(24.0f, 8.438f)
                curveToRelative(0.0f, 2.018f, -4.0f, 4.711f, -12.0f, 4.711f)
                reflectiveCurveTo(0.0f, 10.456f, 0.0f, 8.438f)
                curveTo(0.0f, 6.42f, 4.0f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(12.0f, 1.42f, 12.0f, 3.438f)
                close()
                moveTo(20.5f, 8.12f)
                curveToRelative(0.0f, -1.013f, -2.831f, -1.592f, -8.5f, -1.592f)
                curveToRelative(-5.669f, 0.0f, -8.5f, 0.58f, -8.5f, 1.592f)
                reflectiveCurveToRelative(2.831f, 2.483f, 8.5f, 2.483f)
                curveToRelative(5.669f, 0.0f, 8.5f, -1.471f, 8.5f, -2.483f)
                close()
            }
        }
        .build()
        return _hockeyapp!!
    }

private var _hockeyapp: ImageVector? = null
