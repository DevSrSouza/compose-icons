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

public val MaterialDesignIcons.ChartBellCurve: ImageVector
    get() {
        if (_chartBellCurve != null) {
            return _chartBellCurve!!
        }
        _chartBellCurve = Builder(name = "ChartBellCurve", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.96f, 11.31f)
                curveTo(10.82f, 8.1f, 11.5f, 6.0f, 13.0f, 6.0f)
                curveTo(14.5f, 6.0f, 15.18f, 8.1f, 16.04f, 11.31f)
                curveTo(17.0f, 14.92f, 18.1f, 19.0f, 22.0f, 19.0f)
                verticalLineTo(17.0f)
                curveTo(19.8f, 17.0f, 19.0f, 14.54f, 17.97f, 10.8f)
                curveTo(17.08f, 7.46f, 16.15f, 4.0f, 13.0f, 4.0f)
                curveTo(9.85f, 4.0f, 8.92f, 7.46f, 8.03f, 10.8f)
                curveTo(7.03f, 14.54f, 6.2f, 17.0f, 4.0f, 17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                curveTo(7.9f, 19.0f, 9.0f, 14.92f, 9.96f, 11.31f)
                close()
            }
        }
        .build()
        return _chartBellCurve!!
    }

private var _chartBellCurve: ImageVector? = null
