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

public val SimpleIcons.PrDotCo: ImageVector
    get() {
        if (_prDotCo != null) {
            return _prDotCo!!
        }
        _prDotCo = Builder(name = "PrDotCo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.67f)
                curveToRelative(1.876f, -0.002f, 3.752f, 0.716f, 5.183f, 2.147f)
                curveToRelative(1.026f, 1.024f, 1.604f, 2.19f, 1.898f, 3.285f)
                lineToRelative(1.791f, -1.791f)
                curveToRelative(0.716f, -0.716f, 1.876f, -0.716f, 2.592f, 0.0f)
                curveToRelative(0.716f, 0.715f, 0.716f, 1.876f, 0.0f, 2.591f)
                lineToRelative(-6.28f, 6.28f)
                curveToRelative(-1.431f, 1.431f, -3.307f, 2.147f, -5.183f, 2.147f)
                curveToRelative(-1.876f, 0.0f, -3.752f, -0.715f, -5.183f, -2.147f)
                curveToRelative(-0.944f, -0.944f, -1.577f, -2.082f, -1.898f, -3.285f)
                lineTo(3.128f, 15.689f)
                curveToRelative(-0.715f, 0.716f, -1.876f, 0.716f, -2.592f, 0.0f)
                curveToRelative(-0.715f, -0.715f, -0.715f, -1.876f, 0.0f, -2.592f)
                curveToRelative(2.092f, -2.093f, 4.191f, -4.189f, 5.951f, -5.95f)
                curveToRelative(1.694f, -1.86f, 3.77f, -2.475f, 5.512f, -2.477f)
                close()
                moveTo(14.592f, 9.408f)
                curveToRelative(-1.431f, -1.431f, -3.752f, -1.431f, -5.183f, 0.0f)
                curveToRelative(-1.431f, 1.431f, -1.431f, 3.752f, 0.0f, 5.183f)
                curveToRelative(1.431f, 1.431f, 3.752f, 1.431f, 5.183f, -0.0f)
                curveToRelative(1.431f, -1.431f, 1.431f, -3.752f, 0.0f, -5.183f)
                close()
            }
        }
        .build()
        return _prDotCo!!
    }

private var _prDotCo: ImageVector? = null
