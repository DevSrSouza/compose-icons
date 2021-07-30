package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Calibrate: ImageVector
    get() {
        if (_calibrate != null) {
            return _calibrate!!
        }
        _calibrate = Builder(name = "Calibrate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0503f, 5.0f)
                curveTo(14.51f, 5.0f, 16.7393f, 5.9868f, 18.3638f, 7.586f)
                lineTo(14.1208f, 11.8291f)
                curveTo(13.5824f, 11.3154f, 12.8531f, 11.0f, 12.0503f, 11.0f)
                curveTo(11.1963f, 11.0f, 10.4256f, 11.3568f, 9.8793f, 11.9295f)
                lineTo(5.6362f, 7.6865f)
                curveTo(7.2687f, 6.0282f, 9.5394f, 5.0f, 12.0503f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0503f, 19.0f)
                curveTo(13.7071f, 19.0f, 15.0503f, 17.6569f, 15.0503f, 16.0f)
                curveTo(15.0503f, 14.3431f, 13.7071f, 13.0f, 12.0503f, 13.0f)
                curveTo(10.3934f, 13.0f, 9.0503f, 14.3431f, 9.0503f, 16.0f)
                curveTo(9.0503f, 17.6569f, 10.3934f, 19.0f, 12.0503f, 19.0f)
                close()
            }
        }
        .build()
        return _calibrate!!
    }

private var _calibrate: ImageVector? = null
