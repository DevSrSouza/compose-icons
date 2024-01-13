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

public val SimpleIcons.Fauna: ImageVector
    get() {
        if (_fauna != null) {
            return _fauna!!
        }
        _fauna = Builder(name = "Fauna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.864f, 5.034f)
                curveToRelative(-1.454f, 0.496f, -2.155f, 1.385f, -2.632f, 2.77f)
                curveToRelative(-0.123f, 0.369f, -0.43f, 0.778f, -0.777f, 1.053f)
                lineToRelative(1.193f, 1.306f)
                lineToRelative(-3.787f, -2.706f)
                lineTo(1.411f, 0.0f)
                reflectiveCurveToRelative(0.754f, 5.003f, 1.015f, 6.844f)
                curveToRelative(0.185f, 1.298f, 0.5f, 1.88f, 1.5f, 2.47f)
                lineToRelative(0.401f, 0.22f)
                lineToRelative(1.724f, 0.928f)
                lineToRelative(-1.024f, -0.543f)
                lineToRelative(4.726f, 2.636f)
                lineToRelative(-0.031f, 0.07f)
                lineToRelative(-5.087f, -2.407f)
                curveToRelative(0.27f, 0.944f, 0.793f, 2.761f, 1.016f, 3.564f)
                curveToRelative(0.238f, 0.865f, 0.508f, 1.18f, 1.331f, 1.487f)
                lineToRelative(1.516f, 0.566f)
                lineToRelative(0.94f, -0.378f)
                lineToRelative(-1.194f, 0.81f)
                lineTo(2.28f, 24.0f)
                curveToRelative(3.963f, -3.76f, 7.319f, -5.097f, 9.774f, -6.19f)
                curveToRelative(3.132f, -1.385f, 5.018f, -2.274f, 6.249f, -5.468f)
                curveToRelative(0.877f, -2.242f, 1.562f, -5.113f, 2.432f, -6.222f)
                lineToRelative(1.855f, -2.423f)
                reflectiveCurveToRelative(-3.84f, 1.039f, -4.726f, 1.337f)
                close()
            }
        }
        .build()
        return _fauna!!
    }

private var _fauna: ImageVector? = null
