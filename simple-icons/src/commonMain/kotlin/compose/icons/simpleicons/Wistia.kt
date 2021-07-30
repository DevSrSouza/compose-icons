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

public val SimpleIcons.Wistia: ImageVector
    get() {
        if (_wistia != null) {
            return _wistia!!
        }
        _wistia = Builder(name = "Wistia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.69f, 6.605f)
                curveToRelative(0.507f, -3.094f, -1.24f, -3.944f, -1.24f, -3.944f)
                reflectiveCurveToRelative(0.073f, 2.519f, -4.555f, 3.053f)
                curveTo(13.787f, 6.188f, 0.0f, 5.83f, 0.0f, 5.83f)
                lineToRelative(4.43f, 5.081f)
                curveToRelative(1.2f, 1.378f, 1.838f, 1.537f, 3.187f, 1.633f)
                curveToRelative(1.349f, 0.09f, 4.327f, 0.058f, 6.345f, -0.096f)
                curveToRelative(2.206f, -0.169f, 5.35f, -0.888f, 7.477f, -2.535f)
                curveToRelative(1.09f, -0.843f, 2.039f, -2.016f, 2.25f, -3.308f)
                moveToRelative(0.284f, 3.205f)
                reflectiveCurveToRelative(-0.556f, 1.105f, -3.33f, 2.853f)
                curveToRelative(-1.182f, 0.744f, -3.637f, 1.535f, -6.793f, 1.84f)
                curveToRelative(-1.705f, 0.166f, -4.842f, 0.031f, -6.188f, 0.031f)
                curveToRelative(-1.354f, 0.0f, -1.974f, 0.285f, -3.187f, 1.652f)
                lineTo(0.0f, 21.23f)
                reflectiveCurveToRelative(1.55f, 0.008f, 2.72f, 0.008f)
                curveToRelative(1.17f, 0.0f, 8.488f, 0.425f, 11.735f, -0.468f)
                curveToRelative(10.546f, -2.899f, 9.518f, -10.96f, 9.518f, -10.96f)
                close()
            }
        }
        .build()
        return _wistia!!
    }

private var _wistia: ImageVector? = null
