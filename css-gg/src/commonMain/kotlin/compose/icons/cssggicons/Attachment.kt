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
                curveTo(16.761f, 0.0f, 19.0f, 2.239f, 19.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 20.866f, 15.866f, 24.0f, 12.0f, 24.0f)
                curveTo(8.134f, 24.0f, 5.0f, 20.866f, 5.0f, 17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 19.761f, 9.239f, 22.0f, 12.0f, 22.0f)
                curveTo(14.761f, 22.0f, 17.0f, 19.761f, 17.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.343f, 15.657f, 2.0f, 14.0f, 2.0f)
                curveTo(12.343f, 2.0f, 11.0f, 3.343f, 11.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.552f, 11.448f, 18.0f, 12.0f, 18.0f)
                curveTo(12.552f, 18.0f, 13.0f, 17.552f, 13.0f, 17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 18.657f, 13.657f, 20.0f, 12.0f, 20.0f)
                curveTo(10.343f, 20.0f, 9.0f, 18.657f, 9.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 2.239f, 11.239f, 0.0f, 14.0f, 0.0f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null
