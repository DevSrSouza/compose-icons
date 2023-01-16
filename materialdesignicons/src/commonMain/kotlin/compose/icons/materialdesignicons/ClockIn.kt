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

public val MaterialDesignIcons.ClockIn: ImageVector
    get() {
        if (_clockIn != null) {
            return _clockIn!!
        }
        _clockIn = Builder(name = "ClockIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.21f, 0.79f)
                lineTo(0.79f, 2.21f)
                lineTo(4.8f, 6.21f)
                lineTo(3.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                lineTo(6.21f, 4.8f)
                moveTo(12.0f, 8.0f)
                curveTo(8.14f, 8.0f, 5.0f, 11.13f, 5.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(15.86f, 22.0f, 19.0f, 18.87f, 19.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(12.0f, 10.15f)
                curveTo(14.67f, 10.15f, 16.85f, 12.32f, 16.85f, 15.0f)
                arcTo(4.85f, 4.85f, 0.0f, false, true, 12.0f, 19.85f)
                curveTo(9.32f, 19.85f, 7.15f, 17.68f, 7.15f, 15.0f)
                arcTo(4.85f, 4.85f, 0.0f, false, true, 12.0f, 10.15f)
                moveTo(11.0f, 12.0f)
                verticalLineTo(15.69f)
                lineTo(14.19f, 17.53f)
                lineTo(14.94f, 16.23f)
                lineTo(12.5f, 14.82f)
                verticalLineTo(12.0f)
            }
        }
        .build()
        return _clockIn!!
    }

private var _clockIn: ImageVector? = null
