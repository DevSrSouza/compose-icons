package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1213f, 9.8787f)
                lineTo(10.2044f, 11.9617f)
                lineTo(10.2106f, 11.9555f)
                lineTo(11.6631f, 13.408f)
                lineTo(11.6693f, 13.4142f)
                lineTo(13.7907f, 15.5355f)
                curveTo(15.7433f, 17.4882f, 18.9091f, 17.4882f, 20.8617f, 15.5355f)
                curveTo(22.8144f, 13.5829f, 22.8144f, 10.4171f, 20.8617f, 8.4645f)
                curveTo(18.9091f, 6.5118f, 15.7433f, 6.5118f, 13.7907f, 8.4645f)
                lineTo(13.0773f, 9.1779f)
                lineTo(14.4915f, 10.5921f)
                lineTo(15.2049f, 9.8787f)
                curveTo(16.3764f, 8.7071f, 18.2759f, 8.7071f, 19.4475f, 9.8787f)
                curveTo(20.6191f, 11.0503f, 20.6191f, 12.9497f, 19.4475f, 14.1213f)
                curveTo(18.2759f, 15.2929f, 16.3764f, 15.2929f, 15.2049f, 14.1213f)
                lineTo(13.1326f, 12.0491f)
                lineTo(13.1263f, 12.0554f)
                lineTo(9.5355f, 8.4645f)
                curveTo(7.5829f, 6.5118f, 4.4171f, 6.5118f, 2.4645f, 8.4645f)
                curveTo(0.5118f, 10.4171f, 0.5118f, 13.5829f, 2.4645f, 15.5355f)
                curveTo(4.4171f, 17.4882f, 7.5829f, 17.4882f, 9.5355f, 15.5355f)
                lineTo(10.2488f, 14.8222f)
                lineTo(8.8346f, 13.408f)
                lineTo(8.1213f, 14.1213f)
                curveTo(6.9497f, 15.2929f, 5.0503f, 15.2929f, 3.8787f, 14.1213f)
                curveTo(2.7071f, 12.9497f, 2.7071f, 11.0503f, 3.8787f, 9.8787f)
                curveTo(5.0503f, 8.7071f, 6.9497f, 8.7071f, 8.1213f, 9.8787f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
