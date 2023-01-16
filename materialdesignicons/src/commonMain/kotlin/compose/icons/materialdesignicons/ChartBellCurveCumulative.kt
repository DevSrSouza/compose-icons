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

public val MaterialDesignIcons.ChartBellCurveCumulative: ImageVector
    get() {
        if (_chartBellCurveCumulative != null) {
            return _chartBellCurveCumulative!!
        }
        _chartBellCurveCumulative = Builder(name = "ChartBellCurveCumulative", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 17.0f, 10.0f, 15.0f, 12.1f, 11.4f)
                curveTo(15.1f, 6.4f, 18.4f, 4.0f, 22.0f, 4.0f)
                verticalLineTo(6.0f)
                curveTo(19.2f, 6.0f, 16.5f, 8.1f, 13.9f, 12.5f)
                curveTo(11.3f, 16.6f, 7.7f, 19.0f, 4.0f, 19.0f)
                close()
            }
        }
        .build()
        return _chartBellCurveCumulative!!
    }

private var _chartBellCurveCumulative: ImageVector? = null
