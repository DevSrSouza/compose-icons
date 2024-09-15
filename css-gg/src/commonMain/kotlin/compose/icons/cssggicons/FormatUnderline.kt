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

public val CssGgIcons.FormatUnderline: ImageVector
    get() {
        if (_formatUnderline != null) {
            return _formatUnderline!!
        }
        _formatUnderline = Builder(name = "FormatUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                curveTo(8.0f, 12.209f, 9.791f, 14.0f, 12.0f, 14.0f)
                curveTo(14.209f, 14.0f, 16.0f, 12.209f, 16.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 13.314f, 15.314f, 16.0f, 12.0f, 16.0f)
                curveTo(8.686f, 16.0f, 6.0f, 13.314f, 6.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                curveTo(6.448f, 18.0f, 6.0f, 18.448f, 6.0f, 19.0f)
                curveTo(6.0f, 19.552f, 6.448f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 20.0f, 18.0f, 19.552f, 18.0f, 19.0f)
                curveTo(18.0f, 18.448f, 17.552f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _formatUnderline!!
    }

private var _formatUnderline: ImageVector? = null
