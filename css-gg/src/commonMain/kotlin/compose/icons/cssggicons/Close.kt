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

public val CssGgIcons.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.225f, 4.811f)
                curveTo(5.835f, 4.421f, 5.202f, 4.421f, 4.811f, 4.811f)
                curveTo(4.421f, 5.202f, 4.421f, 5.835f, 4.811f, 6.225f)
                lineTo(10.586f, 12.0f)
                lineTo(4.811f, 17.775f)
                curveTo(4.421f, 18.165f, 4.421f, 18.798f, 4.811f, 19.189f)
                curveTo(5.202f, 19.579f, 5.835f, 19.579f, 6.225f, 19.189f)
                lineTo(12.0f, 13.414f)
                lineTo(17.775f, 19.189f)
                curveTo(18.165f, 19.579f, 18.798f, 19.579f, 19.189f, 19.189f)
                curveTo(19.579f, 18.798f, 19.579f, 18.165f, 19.189f, 17.775f)
                lineTo(13.414f, 12.0f)
                lineTo(19.189f, 6.225f)
                curveTo(19.58f, 5.835f, 19.58f, 5.202f, 19.189f, 4.811f)
                curveTo(18.799f, 4.421f, 18.165f, 4.421f, 17.775f, 4.811f)
                lineTo(12.0f, 10.586f)
                lineTo(6.225f, 4.811f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
