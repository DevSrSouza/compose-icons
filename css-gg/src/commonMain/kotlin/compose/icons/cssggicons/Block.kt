package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Block: ImageVector
    get() {
        if (_block != null) {
            return _block!!
        }
        _block = Builder(name = "Block", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.465f, 14.121f)
                curveTo(8.074f, 14.512f, 8.074f, 15.145f, 8.465f, 15.535f)
                curveTo(8.855f, 15.926f, 9.488f, 15.926f, 9.879f, 15.535f)
                lineTo(15.536f, 9.879f)
                curveTo(15.926f, 9.488f, 15.926f, 8.855f, 15.536f, 8.464f)
                curveTo(15.145f, 8.074f, 14.512f, 8.074f, 14.121f, 8.464f)
                lineTo(8.465f, 14.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.343f, 17.657f)
                curveTo(9.467f, 20.781f, 14.533f, 20.781f, 17.657f, 17.657f)
                curveTo(20.781f, 14.533f, 20.781f, 9.467f, 17.657f, 6.343f)
                curveTo(14.533f, 3.219f, 9.467f, 3.219f, 6.343f, 6.343f)
                curveTo(3.219f, 9.467f, 3.219f, 14.533f, 6.343f, 17.657f)
                close()
                moveTo(16.243f, 16.243f)
                curveTo(13.899f, 18.586f, 10.101f, 18.586f, 7.757f, 16.243f)
                curveTo(5.414f, 13.899f, 5.414f, 10.101f, 7.757f, 7.757f)
                curveTo(10.101f, 5.414f, 13.899f, 5.414f, 16.243f, 7.757f)
                curveTo(18.586f, 10.101f, 18.586f, 13.899f, 16.243f, 16.243f)
                close()
            }
        }
        .build()
        return _block!!
    }

private var _block: ImageVector? = null
