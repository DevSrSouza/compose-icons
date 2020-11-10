package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Sparkfun: VectorAsset
    get() {
        if (_sparkfun != null) {
            return _sparkfun!!
        }
        _sparkfun = VectorAssetBuilder(name = "Sparkfun", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.805f, 3.852f)
                reflectiveCurveToRelative(0.34f, 1.441f, -0.746f, 1.64f)
                curveToRelative(-0.754f, 0.133f, -1.973f, -0.617f, -2.586f, -1.363f)
                curveToRelative(-0.758f, -0.922f, -0.66f, -1.649f, -0.075f, -2.29f)
                curveToRelative(0.883f, -0.98f, 2.399f, -0.6f, 2.399f, -0.6f)
                reflectiveCurveToRelative(-2.774f, -2.43f, -5.66f, -0.438f)
                curveToRelative(-2.57f, 1.77f, -1.832f, 4.18f, 0.488f, 6.285f)
                curveToRelative(2.09f, 1.902f, 0.422f, 3.988f, -1.688f, 3.719f)
                curveToRelative(-1.44f, -0.184f, -2.03f, -1.344f, -1.687f, -2.055f)
                curveToRelative(0.3f, -0.61f, 1.336f, -0.984f, 1.336f, -0.984f)
                reflectiveCurveToRelative(-1.191f, -0.48f, -2.59f, 0.046f)
                curveToRelative(-1.262f, 0.473f, -2.297f, 1.512f, -2.215f, 4.122f)
                verticalLineToRelative(12.078f)
                reflectiveCurveToRelative(1.301f, -1.602f, 2.832f, -3.235f)
                curveToRelative(1.711f, -1.84f, 2.492f, -3.082f, 4.25f, -2.937f)
                curveToRelative(3.328f, 0.207f, 5.735f, -1.274f, 7.371f, -3.645f)
                curveToRelative(3.141f, -4.562f, 0.68f, -9.66f, -1.43f, -10.343f)
                close()
                moveTo(17.805f, 3.852f)
            }
        }
        .build()
        return _sparkfun!!
    }

private var _sparkfun: VectorAsset? = null
