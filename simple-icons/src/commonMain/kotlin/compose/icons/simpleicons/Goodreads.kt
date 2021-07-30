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

public val SimpleIcons.Goodreads: ImageVector
    get() {
        if (_goodreads != null) {
            return _goodreads!!
        }
        _goodreads = Builder(name = "Goodreads", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.43f, 23.995f)
                curveToRelative(-3.608f, -0.208f, -6.274f, -2.077f, -6.448f, -5.078f)
                curveToRelative(0.695f, 0.007f, 1.375f, -0.013f, 2.07f, -0.006f)
                curveToRelative(0.224f, 1.342f, 1.065f, 2.43f, 2.683f, 3.026f)
                curveToRelative(1.583f, 0.496f, 3.737f, 0.46f, 5.082f, -0.174f)
                curveToRelative(1.351f, -0.636f, 2.145f, -1.822f, 2.503f, -3.577f)
                curveToRelative(0.212f, -1.042f, 0.236f, -1.734f, 0.231f, -2.92f)
                lineToRelative(-0.005f, -1.631f)
                horizontalLineToRelative(-0.059f)
                curveToRelative(-1.245f, 2.564f, -3.315f, 3.53f, -5.59f, 3.475f)
                curveToRelative(-5.74f, -0.054f, -7.68f, -4.534f, -7.528f, -8.606f)
                curveToRelative(0.01f, -5.241f, 3.22f, -8.537f, 7.557f, -8.495f)
                curveToRelative(2.354f, -0.14f, 4.605f, 1.362f, 5.554f, 3.37f)
                lineToRelative(0.059f, 0.002f)
                lineToRelative(0.002f, -2.918f)
                lineToRelative(2.099f, 0.004f)
                lineToRelative(-0.002f, 15.717f)
                curveToRelative(-0.193f, 7.04f, -4.376f, 7.89f, -8.209f, 7.811f)
                close()
                moveTo(17.53f, 8.362f)
                curveToRelative(-0.096f, -3.26f, -1.601f, -6.62f, -5.503f, -6.645f)
                curveToRelative(-3.954f, -0.017f, -5.625f, 3.592f, -5.604f, 6.85f)
                curveToRelative(-0.013f, 3.439f, 1.643f, 6.305f, 4.703f, 6.762f)
                curveToRelative(4.532f, 0.591f, 6.551f, -3.411f, 6.404f, -6.967f)
                close()
            }
        }
        .build()
        return _goodreads!!
    }

private var _goodreads: ImageVector? = null
