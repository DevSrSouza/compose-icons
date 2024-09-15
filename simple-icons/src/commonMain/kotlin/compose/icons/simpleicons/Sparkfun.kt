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

public val SimpleIcons.Sparkfun: ImageVector
    get() {
        if (_sparkfun != null) {
            return _sparkfun!!
        }
        _sparkfun = Builder(name = "Sparkfun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.053f, 3.836f)
                reflectiveCurveToRelative(0.34f, 1.441f, -0.746f, 1.64f)
                curveToRelative(-0.754f, 0.133f, -1.973f, -0.617f, -2.586f, -1.363f)
                curveToRelative(-0.758f, -0.922f, -0.66f, -1.649f, -0.075f, -2.29f)
                curveToRelative(0.883f, -0.98f, 2.399f, -0.6f, 2.399f, -0.6f)
                reflectiveCurveToRelative(-2.774f, -2.431f, -5.661f, -0.438f)
                curveToRelative(-2.571f, 1.77f, -1.832f, 4.181f, 0.488f, 6.286f)
                curveToRelative(2.09f, 1.902f, 0.422f, 3.989f, -1.688f, 3.72f)
                curveToRelative(-1.44f, -0.184f, -2.03f, -1.344f, -1.687f, -2.055f)
                curveToRelative(0.3f, -0.61f, 1.336f, -0.984f, 1.336f, -0.984f)
                reflectiveCurveToRelative(-1.191f, -0.48f, -2.591f, 0.046f)
                curveTo(4.98f, 8.27f, 3.945f, 9.309f, 4.027f, 11.92f)
                lineTo(4.027f, 24.0f)
                reflectiveCurveToRelative(1.301f, -1.602f, 2.833f, -3.236f)
                curveToRelative(1.711f, -1.84f, 2.492f, -3.083f, 4.251f, -2.938f)
                curveToRelative(3.329f, 0.207f, 5.736f, -1.274f, 7.372f, -3.646f)
                curveToRelative(3.142f, -4.563f, 0.68f, -9.662f, -1.43f, -10.345f)
                close()
                moveTo(17.053f, 3.836f)
            }
        }
        .build()
        return _sparkfun!!
    }

private var _sparkfun: ImageVector? = null
