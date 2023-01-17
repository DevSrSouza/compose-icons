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

public val SimpleIcons.Xo: ImageVector
    get() {
        if (_xo != null) {
            return _xo!!
        }
        _xo = Builder(name = "Xo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.629f, 5.698f)
                lineToRelative(4.275f, 5.367f)
                lineToRelative(4.274f, -5.367f)
                horizontalLineToRelative(1.613f)
                lineToRelative(-5.089f, 6.384f)
                lineToRelative(4.958f, 6.219f)
                horizontalLineToRelative(-1.613f)
                lineTo(5.903f, 13.1f)
                lineToRelative(-4.142f, 5.201f)
                lineTo(0.131f, 18.301f)
                lineToRelative(4.957f, -6.219f)
                lineTo(0.0f, 5.698f)
                horizontalLineToRelative(1.629f)
                close()
                moveTo(18.109f, 5.616f)
                curveTo(21.423f, 5.616f, 24.0f, 8.632f, 24.0f, 12.0f)
                curveToRelative(0.0f, 3.425f, -2.613f, 6.331f, -5.883f, 6.383f)
                curveToRelative(-3.301f, -0.1f, -5.804f, -2.878f, -5.911f, -6.164f)
                lineTo(12.202f, 12.0f)
                curveToRelative(0.0f, -3.436f, 2.637f, -6.384f, 5.907f, -6.384f)
                close()
                moveTo(18.109f, 6.884f)
                curveToRelative(-2.59f, 0.0f, -4.639f, 2.4f, -4.639f, 5.116f)
                curveToRelative(0.078f, 2.736f, 1.983f, 4.996f, 4.444f, 5.111f)
                lineToRelative(0.195f, 0.004f)
                curveToRelative(2.583f, 0.0f, 4.623f, -2.406f, 4.623f, -5.115f)
                curveToRelative(0.0f, -2.752f, -2.086f, -5.116f, -4.623f, -5.116f)
                close()
                moveTo(19.053f, 10.594f)
                curveToRelative(0.507f, 0.0f, 1.1f, 0.662f, 0.702f, 1.473f)
                curveToRelative(-0.297f, 0.605f, -1.373f, 1.192f, -1.609f, 1.315f)
                lineToRelative(-0.045f, 0.024f)
                reflectiveCurveToRelative(-1.32f, -0.658f, -1.655f, -1.339f)
                curveToRelative(-0.397f, -0.811f, 0.196f, -1.473f, 0.703f, -1.473f)
                curveToRelative(0.56f, 0.0f, 0.952f, 0.535f, 0.952f, 0.535f)
                reflectiveCurveToRelative(0.391f, -0.535f, 0.952f, -0.535f)
                close()
            }
        }
        .build()
        return _xo!!
    }

private var _xo: ImageVector? = null
