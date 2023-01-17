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

public val SimpleIcons.Beatport: ImageVector
    get() {
        if (_beatport != null) {
            return _beatport!!
        }
        _beatport = Builder(name = "Beatport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.668f, 24.0f)
                curveToRelative(-3.857f, 0.0f, -6.935f, -3.039f, -6.935f, -6.974f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, 1.812f, -4.714f)
                lineToRelative(-4.714f, 4.714f)
                lineToRelative(-2.474f, -2.474f)
                lineToRelative(5.319f, -5.26f)
                curveToRelative(0.72f, -0.72f, 1.09f, -1.656f, 1.09f, -2.688f)
                lineTo(8.766f, 0.0f)
                horizontalLineToRelative(3.487f)
                verticalLineToRelative(6.604f)
                curveToRelative(0.0f, 2.026f, -0.72f, 3.74f, -2.123f, 5.143f)
                lineToRelative(-0.156f, 0.156f)
                arcToRelative(6.945f, 6.945f, 0.0f, false, true, 4.694f, -1.812f)
                curveToRelative(3.955f, 0.0f, 6.975f, 3.136f, 6.975f, 6.935f)
                arcTo(6.943f, 6.943f, 0.0f, false, true, 14.668f, 24.0f)
                close()
                moveTo(14.668f, 13.286f)
                curveToRelative(-2.123f, 0.0f, -3.779f, 1.753f, -3.779f, 3.74f)
                curveToRelative(0.0f, 2.045f, 1.675f, 3.78f, 3.78f, 3.78f)
                arcToRelative(3.804f, 3.804f, 0.0f, false, false, 3.818f, -3.78f)
                curveToRelative(0.0f, -2.065f, -1.715f, -3.74f, -3.819f, -3.74f)
                close()
            }
        }
        .build()
        return _beatport!!
    }

private var _beatport: ImageVector? = null
