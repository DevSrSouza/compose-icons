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

public val CssGgIcons.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 2.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 2.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.5f)
                curveTo(4.0f, 17.9183f, 7.5817f, 21.5f, 12.0f, 21.5f)
                curveTo(16.4183f, 21.5f, 20.0f, 17.9183f, 20.0f, 13.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.5f)
                curveTo(16.0f, 15.7091f, 14.2091f, 17.5f, 12.0f, 17.5f)
                curveTo(9.7909f, 17.5f, 8.0f, 15.7091f, 8.0f, 13.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
