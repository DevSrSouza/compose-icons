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

public val SimpleIcons.Monoprix: ImageVector
    get() {
        if (_monoprix != null) {
            return _monoprix!!
        }
        _monoprix = Builder(name = "Monoprix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.072f, 8.042f)
                curveTo(21.072f, 3.612f, 16.981f, 0.0f, 12.0f, 0.0f)
                curveTo(6.991f, 0.0f, 2.928f, 3.612f, 2.928f, 8.042f)
                reflectiveCurveTo(6.99f, 16.085f, 12.0f, 16.085f)
                curveToRelative(0.282f, 0.0f, 0.564f, -0.029f, 0.847f, -0.043f)
                curveToRelative(0.62f, 0.339f, 0.747f, 0.706f, 0.761f, 0.988f)
                curveToRelative(0.142f, 1.608f, -2.44f, 5.08f, -4.303f, 6.49f)
                lineToRelative(0.254f, 0.48f)
                curveToRelative(0.113f, -0.028f, 10.723f, -3.47f, 11.429f, -15.026f)
                curveToRelative(0.056f, -0.283f, 0.07f, -0.565f, 0.084f, -0.875f)
                verticalLineToRelative(-0.043f)
                close()
            }
        }
        .build()
        return _monoprix!!
    }

private var _monoprix: ImageVector? = null
