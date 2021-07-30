package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Unsplash: ImageVector
    get() {
        if (_unsplash != null) {
            return _unsplash!!
        }
        _unsplash = Builder(name = "Unsplash", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 230.17f)
                verticalLineTo(480.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(230.17f)
                horizontalLineTo(141.13f)
                verticalLineTo(355.09f)
                horizontalLineTo(306.87f)
                verticalLineTo(230.17f)
                close()
                moveTo(306.87f, 32.0f)
                horizontalLineTo(141.13f)
                verticalLineTo(156.91f)
                horizontalLineTo(306.87f)
                close()
            }
        }
        .build()
        return _unsplash!!
    }

private var _unsplash: ImageVector? = null
