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

public val SimpleIcons.Kofi: ImageVector
    get() {
        if (_kofi != null) {
            return _kofi!!
        }
        _kofi = Builder(name = "Kofi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.881f, 8.948f)
                curveToRelative(-0.773f, -4.085f, -4.859f, -4.593f, -4.859f, -4.593f)
                lineTo(0.723f, 4.355f)
                curveToRelative(-0.604f, 0.0f, -0.679f, 0.798f, -0.679f, 0.798f)
                reflectiveCurveToRelative(-0.082f, 7.324f, -0.022f, 11.822f)
                curveToRelative(0.164f, 2.424f, 2.586f, 2.672f, 2.586f, 2.672f)
                reflectiveCurveToRelative(8.267f, -0.023f, 11.966f, -0.049f)
                curveToRelative(2.438f, -0.426f, 2.683f, -2.566f, 2.658f, -3.734f)
                curveToRelative(4.352f, 0.24f, 7.422f, -2.831f, 6.649f, -6.916f)
                close()
                moveTo(12.819f, 12.459f)
                curveToRelative(-1.246f, 1.453f, -4.011f, 3.976f, -4.011f, 3.976f)
                reflectiveCurveToRelative(-0.121f, 0.119f, -0.31f, 0.023f)
                curveToRelative(-0.076f, -0.057f, -0.108f, -0.09f, -0.108f, -0.09f)
                curveToRelative(-0.443f, -0.441f, -3.368f, -3.049f, -4.034f, -3.954f)
                curveToRelative(-0.709f, -0.965f, -1.041f, -2.7f, -0.091f, -3.71f)
                curveToRelative(0.951f, -1.01f, 3.005f, -1.086f, 4.363f, 0.407f)
                curveToRelative(0.0f, 0.0f, 1.565f, -1.782f, 3.468f, -0.963f)
                curveToRelative(1.904f, 0.82f, 1.832f, 3.011f, 0.723f, 4.311f)
                close()
                moveTo(18.992f, 12.937f)
                curveToRelative(-0.928f, 0.116f, -1.682f, 0.028f, -1.682f, 0.028f)
                lineTo(17.31f, 7.284f)
                horizontalLineToRelative(1.77f)
                reflectiveCurveToRelative(1.971f, 0.551f, 1.971f, 2.638f)
                curveToRelative(0.0f, 1.913f, -0.985f, 2.667f, -2.059f, 3.015f)
                close()
            }
        }
        .build()
        return _kofi!!
    }

private var _kofi: ImageVector? = null
