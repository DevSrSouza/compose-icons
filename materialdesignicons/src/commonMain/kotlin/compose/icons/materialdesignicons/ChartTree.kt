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

public val MaterialDesignIcons.ChartTree: ImageVector
    get() {
        if (_chartTree != null) {
            return _chartTree!!
        }
        _chartTree = Builder(name = "ChartTree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                moveTo(2.0f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                moveTo(2.0f, 8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                moveTo(9.0f, 22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                moveTo(2.0f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _chartTree!!
    }

private var _chartTree: ImageVector? = null
