package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.DropInvert: ImageVector
    get() {
        if (_dropInvert != null) {
            return _dropInvert!!
        }
        _dropInvert = Builder(name = "DropInvert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0001f, 1.1361f)
                lineTo(5.636f, 7.5f)
                curveTo(2.1213f, 11.0147f, 2.1213f, 16.7132f, 5.636f, 20.2279f)
                curveTo(7.3934f, 21.9853f, 9.6968f, 22.864f, 12.0001f, 22.864f)
                curveTo(12.288f, 22.864f, 12.5759f, 22.8502f, 12.8627f, 22.8228f)
                curveTo(14.8706f, 22.6306f, 16.8264f, 21.7657f, 18.3641f, 20.2279f)
                curveTo(21.8788f, 16.7132f, 21.8788f, 11.0147f, 18.3641f, 7.5f)
                lineTo(12.0001f, 1.1361f)
                close()
                moveTo(7.0503f, 8.9142f)
                lineTo(12.0f, 3.9645f)
                lineTo(12.0001f, 20.864f)
                curveTo(10.2086f, 20.864f, 8.4171f, 20.1806f, 7.0503f, 18.8137f)
                curveTo(4.3166f, 16.0801f, 4.3166f, 11.6479f, 7.0503f, 8.9142f)
                close()
            }
        }
        .build()
        return _dropInvert!!
    }

private var _dropInvert: ImageVector? = null
