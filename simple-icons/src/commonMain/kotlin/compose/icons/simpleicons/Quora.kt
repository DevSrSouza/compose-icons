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

public val SimpleIcons.Quora: VectorAsset
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = VectorAssetBuilder(name = "Quora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.738f, 18.701f)
                curveToRelative(-0.831f, -1.635f, -1.805f, -3.287f, -3.708f, -3.287f)
                curveToRelative(-0.362f, 0.0f, -0.727f, 0.061f, -1.059f, 0.209f)
                lineToRelative(-0.646f, -1.289f)
                curveToRelative(0.786f, -0.678f, 2.058f, -1.214f, 3.693f, -1.214f)
                curveToRelative(2.544f, 0.0f, 3.851f, 1.229f, 4.888f, 2.792f)
                curveToRelative(0.613f, -1.335f, 0.904f, -3.14f, 0.904f, -5.375f)
                curveToRelative(0.0f, -5.582f, -1.744f, -8.447f, -5.822f, -8.447f)
                curveToRelative(-4.018f, 0.0f, -5.757f, 2.865f, -5.757f, 8.447f)
                curveToRelative(0.0f, 5.553f, 1.739f, 8.389f, 5.757f, 8.389f)
                curveToRelative(0.64f, 0.0f, 1.22f, -0.069f, 1.75f, -0.225f)
                close()
                moveTo(13.734f, 20.648f)
                curveToRelative(-0.881f, 0.237f, -1.817f, 0.366f, -2.743f, 0.366f)
                curveToRelative(-5.352f, 0.0f, -10.59f, -4.269f, -10.59f, -10.478f)
                curveTo(0.402f, 4.271f, 5.639f, 0.0f, 10.991f, 0.0f)
                curveToRelative(5.441f, 0.0f, 10.628f, 4.238f, 10.628f, 10.537f)
                curveToRelative(0.0f, 3.504f, -1.635f, 6.351f, -4.01f, 8.191f)
                curveToRelative(0.764f, 1.148f, 1.543f, 1.914f, 2.652f, 1.914f)
                curveToRelative(1.199f, 0.0f, 1.68f, -0.915f, 1.77f, -1.649f)
                horizontalLineToRelative(1.557f)
                curveToRelative(0.092f, 0.974f, -0.402f, 5.007f, -4.766f, 5.007f)
                curveToRelative(-2.652f, 0.0f, -4.047f, -1.528f, -5.096f, -3.328f)
                lineToRelative(0.008f, -0.024f)
                close()
            }
        }
        .build()
        return _quora!!
    }

private var _quora: VectorAsset? = null
