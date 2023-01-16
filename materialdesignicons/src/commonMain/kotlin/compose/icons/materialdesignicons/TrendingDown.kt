package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TrendingDown: ImageVector
    get() {
        if (_trendingDown != null) {
            return _trendingDown!!
        }
        _trendingDown = Builder(name = "TrendingDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                lineTo(18.29f, 15.71f)
                lineTo(13.41f, 10.83f)
                lineTo(9.41f, 14.83f)
                lineTo(2.0f, 7.41f)
                lineTo(3.41f, 6.0f)
                lineTo(9.41f, 12.0f)
                lineTo(13.41f, 8.0f)
                lineTo(19.71f, 14.29f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _trendingDown!!
    }

private var _trendingDown: ImageVector? = null
