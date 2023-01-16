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

public val MaterialDesignIcons.ChartMultiple: ImageVector
    get() {
        if (_chartMultiple != null) {
            return _chartMultiple!!
        }
        _chartMultiple = Builder(name = "ChartMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.57f)
                lineTo(13.71f, 4.57f)
                lineTo(16.87f, 6.68f)
                lineTo(19.29f, 4.26f)
                lineTo(20.71f, 5.68f)
                lineTo(17.13f, 9.29f)
                lineTo(14.29f, 7.4f)
                lineTo(8.82f, 16.0f)
                moveTo(4.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _chartMultiple!!
    }

private var _chartMultiple: ImageVector? = null
