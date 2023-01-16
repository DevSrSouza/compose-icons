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

public val MaterialDesignIcons.TrendingUp: ImageVector
    get() {
        if (_trendingUp != null) {
            return _trendingUp!!
        }
        _trendingUp = Builder(name = "TrendingUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                lineTo(18.29f, 8.29f)
                lineTo(13.41f, 13.17f)
                lineTo(9.41f, 9.17f)
                lineTo(2.0f, 16.59f)
                lineTo(3.41f, 18.0f)
                lineTo(9.41f, 12.0f)
                lineTo(13.41f, 16.0f)
                lineTo(19.71f, 9.71f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _trendingUp!!
    }

private var _trendingUp: ImageVector? = null
