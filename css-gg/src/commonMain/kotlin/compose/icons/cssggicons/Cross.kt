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

public val CssGgIcons.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                curveTo(13.0f, 5.4477f, 12.5523f, 5.0f, 12.0f, 5.0f)
                curveTo(11.4477f, 5.0f, 11.0f, 5.4477f, 11.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 9.0f, 6.0f, 9.4477f, 6.0f, 10.0f)
                curveTo(6.0f, 10.5523f, 6.4477f, 11.0f, 7.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 18.5523f, 11.4477f, 19.0f, 12.0f, 19.0f)
                curveTo(12.5523f, 19.0f, 13.0f, 18.5523f, 13.0f, 18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 10.5523f, 18.0f, 10.0f)
                curveTo(18.0f, 9.4477f, 17.5523f, 9.0f, 17.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
