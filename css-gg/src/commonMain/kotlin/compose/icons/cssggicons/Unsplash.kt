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

public val CssGgIcons.Unsplash: ImageVector
    get() {
        if (_unsplash != null) {
            return _unsplash!!
        }
        _unsplash = Builder(name = "Unsplash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _unsplash!!
    }

private var _unsplash: ImageVector? = null
