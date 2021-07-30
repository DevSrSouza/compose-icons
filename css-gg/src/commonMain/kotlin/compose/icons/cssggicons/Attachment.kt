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

public val CssGgIcons.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = Builder(name = "Attachment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 0.0f)
                curveTo(16.7614f, 0.0f, 19.0f, 2.2386f, 19.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 20.866f, 15.866f, 24.0f, 12.0f, 24.0f)
                curveTo(8.134f, 24.0f, 5.0f, 20.866f, 5.0f, 17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 19.7614f, 9.2386f, 22.0f, 12.0f, 22.0f)
                curveTo(14.7614f, 22.0f, 17.0f, 19.7614f, 17.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.3431f, 15.6569f, 2.0f, 14.0f, 2.0f)
                curveTo(12.3431f, 2.0f, 11.0f, 3.3431f, 11.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.5523f, 11.4477f, 18.0f, 12.0f, 18.0f)
                curveTo(12.5523f, 18.0f, 13.0f, 17.5523f, 13.0f, 17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 18.6569f, 13.6569f, 20.0f, 12.0f, 20.0f)
                curveTo(10.3431f, 20.0f, 9.0f, 18.6569f, 9.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 2.2386f, 11.2386f, 0.0f, 14.0f, 0.0f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null
