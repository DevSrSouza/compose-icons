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
                moveTo(6.2253f, 4.8111f)
                curveTo(5.8348f, 4.4206f, 5.2016f, 4.4206f, 4.8111f, 4.8111f)
                curveTo(4.4206f, 5.2016f, 4.4206f, 5.8348f, 4.8111f, 6.2253f)
                lineTo(10.5858f, 12.0f)
                lineTo(4.8111f, 17.7747f)
                curveTo(4.4206f, 18.1652f, 4.4206f, 18.7984f, 4.8111f, 19.1889f)
                curveTo(5.2017f, 19.5794f, 5.8348f, 19.5794f, 6.2253f, 19.1889f)
                lineTo(12.0f, 13.4142f)
                lineTo(17.7747f, 19.1889f)
                curveTo(18.1652f, 19.5794f, 18.7984f, 19.5794f, 19.1889f, 19.1889f)
                curveTo(19.5794f, 18.7984f, 19.5794f, 18.1652f, 19.1889f, 17.7747f)
                lineTo(13.4142f, 12.0f)
                lineTo(19.189f, 6.2253f)
                curveTo(19.5795f, 5.8348f, 19.5795f, 5.2016f, 19.189f, 4.8111f)
                curveTo(18.7985f, 4.4206f, 18.1653f, 4.4206f, 17.7748f, 4.8111f)
                lineTo(12.0f, 10.5858f)
                lineTo(6.2253f, 4.8111f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
