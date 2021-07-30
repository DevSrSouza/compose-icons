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

public val CssGgIcons.DropOpacity: ImageVector
    get() {
        if (_dropOpacity != null) {
            return _dropOpacity!!
        }
        _dropOpacity = Builder(name = "DropOpacity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.9451f, 21.9559f)
                curveTo(12.5884f, 23.5927f, 8.4248f, 23.0167f, 5.636f, 20.2279f)
                curveTo(2.1213f, 16.7132f, 2.1213f, 11.0147f, 5.636f, 7.4999f)
                lineTo(11.9999f, 1.136f)
                lineTo(18.3639f, 7.4999f)
                curveTo(19.2521f, 8.3881f, 19.9158f, 9.4158f, 20.3551f, 10.5124f)
                curveTo(21.6543f, 13.7553f, 20.9906f, 17.6012f, 18.364f, 20.2278f)
                curveTo(17.6381f, 20.9538f, 16.8189f, 21.5298f, 15.9451f, 21.9559f)
                close()
                moveTo(7.0502f, 8.9142f)
                lineTo(11.9999f, 3.9644f)
                lineTo(16.9497f, 8.9142f)
                curveTo(18.274f, 10.2385f, 18.9568f, 11.9615f, 18.998f, 13.6968f)
                horizontalLineTo(5.0019f)
                curveTo(5.0431f, 11.9615f, 5.7259f, 10.2385f, 7.0502f, 8.9142f)
                close()
            }
        }
        .build()
        return _dropOpacity!!
    }

private var _dropOpacity: ImageVector? = null
