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

public val SimpleIcons.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.152f, 6.896f)
                curveToRelative(-0.948f, 0.0f, -2.415f, -1.078f, -3.96f, -1.04f)
                curveToRelative(-2.04f, 0.027f, -3.91f, 1.183f, -4.961f, 3.014f)
                curveToRelative(-2.117f, 3.675f, -0.546f, 9.103f, 1.519f, 12.09f)
                curveToRelative(1.013f, 1.454f, 2.208f, 3.09f, 3.792f, 3.039f)
                curveToRelative(1.52f, -0.065f, 2.09f, -0.987f, 3.935f, -0.987f)
                curveToRelative(1.831f, 0.0f, 2.35f, 0.987f, 3.96f, 0.948f)
                curveToRelative(1.637f, -0.026f, 2.676f, -1.48f, 3.676f, -2.948f)
                curveToRelative(1.156f, -1.688f, 1.636f, -3.325f, 1.662f, -3.415f)
                curveToRelative(-0.039f, -0.013f, -3.182f, -1.221f, -3.22f, -4.857f)
                curveToRelative(-0.026f, -3.04f, 2.48f, -4.494f, 2.597f, -4.559f)
                curveToRelative(-1.429f, -2.09f, -3.623f, -2.324f, -4.39f, -2.376f)
                curveToRelative(-2.0f, -0.156f, -3.675f, 1.09f, -4.61f, 1.09f)
                close()
                moveTo(15.53f, 3.83f)
                curveToRelative(0.843f, -1.012f, 1.4f, -2.427f, 1.245f, -3.83f)
                curveToRelative(-1.207f, 0.052f, -2.662f, 0.805f, -3.532f, 1.818f)
                curveToRelative(-0.78f, 0.896f, -1.454f, 2.338f, -1.273f, 3.714f)
                curveToRelative(1.338f, 0.104f, 2.715f, -0.688f, 3.559f, -1.701f)
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
