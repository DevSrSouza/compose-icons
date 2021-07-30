package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Dolby: ImageVector
    get() {
        if (_dolby != null) {
            return _dolby!!
        }
        _dolby = Builder(name = "Dolby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(0.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 9.7909f, 8.2091f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                curveTo(8.2091f, 16.0f, 10.0f, 14.2091f, 10.0f, 12.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                curveTo(15.7909f, 8.0f, 14.0f, 9.7909f, 14.0f, 12.0f)
                curveTo(14.0f, 14.2091f, 15.7909f, 16.0f, 18.0f, 16.0f)
                close()
            }
        }
        .build()
        return _dolby!!
    }

private var _dolby: ImageVector? = null
