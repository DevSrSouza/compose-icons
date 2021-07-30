package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Osi: ImageVector
    get() {
        if (_osi != null) {
            return _osi!!
        }
        _osi = Builder(name = "Osi", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 21.125f, 7.2148f, 25.5039f, 11.75f, 27.2188f)
                lineTo(12.6875f, 27.5938f)
                lineTo(13.0625f, 26.6563f)
                lineTo(15.5313f, 20.0938f)
                lineTo(15.875f, 19.1563f)
                lineTo(14.9375f, 18.8125f)
                curveTo(13.8047f, 18.3828f, 13.0f, 17.293f, 13.0f, 16.0f)
                curveTo(13.0f, 14.332f, 14.332f, 13.0f, 16.0f, 13.0f)
                curveTo(17.668f, 13.0f, 19.0f, 14.332f, 19.0f, 16.0f)
                curveTo(19.0f, 17.293f, 18.1953f, 18.3828f, 17.0625f, 18.8125f)
                lineTo(16.125f, 19.1563f)
                lineTo(16.4688f, 20.0938f)
                lineTo(18.9375f, 26.6563f)
                lineTo(19.3125f, 27.5938f)
                lineTo(20.25f, 27.2188f)
                curveTo(24.7852f, 25.5039f, 28.0f, 21.125f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 19.9219f, 23.6836f, 23.2031f, 20.4063f, 24.8438f)
                lineTo(18.5938f, 20.0625f)
                curveTo(19.9766f, 19.1719f, 21.0f, 17.7578f, 21.0f, 16.0f)
                curveTo(21.0f, 13.25f, 18.75f, 11.0f, 16.0f, 11.0f)
                curveTo(13.25f, 11.0f, 11.0f, 13.25f, 11.0f, 16.0f)
                curveTo(11.0f, 17.7578f, 12.0234f, 19.1719f, 13.4063f, 20.0625f)
                lineTo(11.5938f, 24.8438f)
                curveTo(8.3164f, 23.2031f, 6.0f, 19.9219f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _osi!!
    }

private var _osi: ImageVector? = null
