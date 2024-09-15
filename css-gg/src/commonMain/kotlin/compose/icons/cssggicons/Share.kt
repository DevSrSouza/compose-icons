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

public val CssGgIcons.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                curveTo(19.657f, 9.0f, 21.0f, 7.657f, 21.0f, 6.0f)
                curveTo(21.0f, 4.343f, 19.657f, 3.0f, 18.0f, 3.0f)
                curveTo(16.343f, 3.0f, 15.0f, 4.343f, 15.0f, 6.0f)
                curveTo(15.0f, 6.125f, 15.008f, 6.249f, 15.023f, 6.371f)
                lineTo(8.083f, 9.841f)
                curveTo(7.543f, 9.32f, 6.809f, 9.0f, 6.0f, 9.0f)
                curveTo(4.343f, 9.0f, 3.0f, 10.343f, 3.0f, 12.0f)
                curveTo(3.0f, 13.657f, 4.343f, 15.0f, 6.0f, 15.0f)
                curveTo(6.809f, 15.0f, 7.543f, 14.68f, 8.083f, 14.159f)
                lineTo(15.023f, 17.629f)
                curveTo(15.008f, 17.751f, 15.0f, 17.875f, 15.0f, 18.0f)
                curveTo(15.0f, 19.657f, 16.343f, 21.0f, 18.0f, 21.0f)
                curveTo(19.657f, 21.0f, 21.0f, 19.657f, 21.0f, 18.0f)
                curveTo(21.0f, 16.343f, 19.657f, 15.0f, 18.0f, 15.0f)
                curveTo(17.191f, 15.0f, 16.457f, 15.32f, 15.917f, 15.841f)
                lineTo(8.977f, 12.371f)
                curveTo(8.992f, 12.249f, 9.0f, 12.125f, 9.0f, 12.0f)
                curveTo(9.0f, 11.875f, 8.992f, 11.751f, 8.977f, 11.629f)
                lineTo(15.917f, 8.159f)
                curveTo(16.457f, 8.68f, 17.191f, 9.0f, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
