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

public val MaterialDesignIcons.MonitorCellphoneStar: ImageVector
    get() {
        if (_monitorCellphoneStar != null) {
            return _monitorCellphoneStar!!
        }
        _monitorCellphoneStar = Builder(name = "MonitorCellphoneStar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 12.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 22.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 21.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 11.0f)
                moveTo(23.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(0.89f, 2.0f, 0.0f, 2.89f, 0.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(11.97f, 9.0f)
                lineTo(11.0f, 6.0f)
                lineTo(10.03f, 9.0f)
                horizontalLineTo(7.0f)
                lineTo(9.47f, 10.76f)
                lineTo(8.53f, 13.67f)
                lineTo(11.0f, 11.87f)
                lineTo(13.47f, 13.67f)
                lineTo(12.53f, 10.76f)
                lineTo(15.0f, 9.0f)
                horizontalLineTo(11.97f)
                close()
            }
        }
        .build()
        return _monitorCellphoneStar!!
    }

private var _monitorCellphoneStar: ImageVector? = null
