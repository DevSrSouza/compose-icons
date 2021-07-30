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
                moveTo(8.4646f, 14.1213f)
                curveTo(8.074f, 14.5118f, 8.074f, 15.145f, 8.4646f, 15.5355f)
                curveTo(8.8551f, 15.926f, 9.4882f, 15.926f, 9.8788f, 15.5355f)
                lineTo(15.5356f, 9.8786f)
                curveTo(15.9262f, 9.4881f, 15.9262f, 8.8549f, 15.5356f, 8.4644f)
                curveTo(15.1451f, 8.0739f, 14.5119f, 8.0739f, 14.1214f, 8.4644f)
                lineTo(8.4646f, 14.1213f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.3432f, 17.6569f)
                curveTo(9.4673f, 20.781f, 14.5327f, 20.781f, 17.6569f, 17.6569f)
                curveTo(20.781f, 14.5327f, 20.781f, 9.4673f, 17.6569f, 6.3432f)
                curveTo(14.5327f, 3.219f, 9.4673f, 3.219f, 6.3432f, 6.3432f)
                curveTo(3.219f, 9.4673f, 3.219f, 14.5327f, 6.3432f, 17.6569f)
                close()
                moveTo(16.2426f, 16.2426f)
                curveTo(13.8995f, 18.5858f, 10.1005f, 18.5858f, 7.7574f, 16.2426f)
                curveTo(5.4142f, 13.8995f, 5.4142f, 10.1005f, 7.7574f, 7.7574f)
                curveTo(10.1005f, 5.4142f, 13.8995f, 5.4142f, 16.2426f, 7.7574f)
                curveTo(18.5858f, 10.1005f, 18.5858f, 13.8995f, 16.2426f, 16.2426f)
                close()
            }
        }
        .build()
        return _block!!
    }

private var _block: ImageVector? = null
