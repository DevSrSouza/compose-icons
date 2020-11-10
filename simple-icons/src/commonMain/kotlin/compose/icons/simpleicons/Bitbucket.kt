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

public val SimpleIcons.Bitbucket: VectorAsset
    get() {
        if (_bitbucket != null) {
            return _bitbucket!!
        }
        _bitbucket = VectorAssetBuilder(name = "Bitbucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.778f, 1.211f)
                curveToRelative(-0.424f, -0.006f, -0.772f, 0.334f, -0.778f, 0.758f)
                curveToRelative(0.0f, 0.045f, 0.002f, 0.09f, 0.01f, 0.134f)
                lineToRelative(3.263f, 19.811f)
                curveToRelative(0.084f, 0.499f, 0.515f, 0.867f, 1.022f, 0.872f)
                horizontalLineTo(19.95f)
                curveToRelative(0.382f, 0.004f, 0.708f, -0.271f, 0.77f, -0.646f)
                lineToRelative(3.27f, -20.03f)
                curveToRelative(0.068f, -0.418f, -0.216f, -0.813f, -0.635f, -0.881f)
                curveToRelative(-0.045f, -0.008f, -0.089f, -0.011f, -0.133f, -0.01f)
                lineTo(0.778f, 1.211f)
                close()
                moveTo(14.52f, 15.528f)
                horizontalLineTo(9.522f)
                lineTo(8.17f, 8.464f)
                horizontalLineToRelative(7.561f)
                lineToRelative(-1.211f, 7.064f)
                close()
            }
        }
        .build()
        return _bitbucket!!
    }

private var _bitbucket: VectorAsset? = null
