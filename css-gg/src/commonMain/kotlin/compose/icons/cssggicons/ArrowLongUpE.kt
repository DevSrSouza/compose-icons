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

public val CssGgIcons.ArrowLongUpE: ImageVector
    get() {
        if (_arrowLongUpE != null) {
            return _arrowLongUpE!!
        }
        _arrowLongUpE = Builder(name = "ArrowLongUpE", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0321f, 1.0132f)
                lineTo(16.2425f, 5.2878f)
                lineTo(14.8177f, 6.6913f)
                lineTo(13.014f, 4.8602f)
                lineTo(12.9436f, 16.9774f)
                lineTo(14.9425f, 16.9869f)
                lineTo(14.914f, 22.9868f)
                lineTo(8.9141f, 22.9583f)
                lineTo(8.9426f, 16.9584f)
                lineTo(10.9436f, 16.9679f)
                lineTo(11.0142f, 4.8232f)
                lineTo(9.1611f, 6.6485f)
                lineTo(7.7576f, 5.2237f)
                lineTo(12.0321f, 1.0132f)
                close()
                moveTo(10.9236f, 20.9678f)
                lineTo(12.9236f, 20.9773f)
                lineTo(12.9331f, 18.9773f)
                lineTo(10.9331f, 18.9678f)
                lineTo(10.9236f, 20.9678f)
                close()
            }
        }
        .build()
        return _arrowLongUpE!!
    }

private var _arrowLongUpE: ImageVector? = null
