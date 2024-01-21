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

public val SimpleIcons.Prdotco: ImageVector
    get() {
        if (_prdotco != null) {
            return _prdotco!!
        }
        _prdotco = Builder(name = "Prdotco", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 4.67f)
                curveToRelative(1.876f, -0.0025f, 3.7518f, 0.7157f, 5.1832f, 2.1468f)
                curveToRelative(1.026f, 1.0238f, 1.6037f, 2.1895f, 1.898f, 3.2853f)
                lineToRelative(1.7906f, -1.7905f)
                curveToRelative(0.7157f, -0.7157f, 1.8761f, -0.7157f, 2.5916f, 0.0f)
                curveToRelative(0.7157f, 0.7155f, 0.7157f, 1.8758f, 0.0f, 2.5913f)
                lineToRelative(-6.2802f, 6.2803f)
                curveToRelative(-1.4314f, 1.4314f, -3.3073f, 2.1469f, -5.1832f, 2.1469f)
                curveToRelative(-1.8758f, 0.0f, -3.7517f, -0.7155f, -5.1831f, -2.147f)
                curveToRelative(-0.9442f, -0.944f, -1.5768f, -2.0815f, -1.898f, -3.2848f)
                lineTo(3.128f, 15.6886f)
                curveToRelative(-0.7154f, 0.716f, -1.8758f, 0.716f, -2.5915f, 0.0f)
                curveToRelative(-0.7153f, -0.7154f, -0.7153f, -1.8758f, 0.0f, -2.5915f)
                curveToRelative(2.092f, -2.0933f, 4.1908f, -4.1889f, 5.9512f, -5.9502f)
                curveToRelative(1.6938f, -1.8595f, 3.7695f, -2.4746f, 5.5121f, -2.477f)
                close()
                moveTo(14.5916f, 9.4084f)
                curveToRelative(-1.4314f, -1.4312f, -3.7521f, -1.4312f, -5.1834f, 0.0f)
                curveToRelative(-1.4313f, 1.4312f, -1.4313f, 3.7522f, 0.0f, 5.1834f)
                curveToRelative(1.4313f, 1.4312f, 3.7518f, 1.431f, 5.1831f, -2.0E-4f)
                curveToRelative(1.4313f, -1.4312f, 1.4313f, -3.752f, 3.0E-4f, -5.1832f)
                close()
            }
        }
        .build()
        return _prdotco!!
    }

private var _prdotco: ImageVector? = null
