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

public val MaterialDesignIcons.ClockStart: ImageVector
    get() {
        if (_clockStart != null) {
            return _clockStart!!
        }
        _clockStart = Builder(name = "ClockStart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(8.14f, 1.0f, 5.0f, 4.14f, 5.0f, 8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 15.0f)
                curveTo(15.86f, 15.0f, 19.0f, 11.87f, 19.0f, 8.0f)
                curveTo(19.0f, 4.14f, 15.86f, 1.0f, 12.0f, 1.0f)
                moveTo(12.0f, 3.15f)
                curveTo(14.67f, 3.15f, 16.85f, 5.32f, 16.85f, 8.0f)
                curveTo(16.85f, 10.68f, 14.67f, 12.85f, 12.0f, 12.85f)
                arcTo(4.85f, 4.85f, 0.0f, false, true, 7.15f, 8.0f)
                arcTo(4.85f, 4.85f, 0.0f, false, true, 12.0f, 3.15f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(8.69f)
                lineTo(14.19f, 10.53f)
                lineTo(14.94f, 9.23f)
                lineTo(12.5f, 7.82f)
                verticalLineTo(5.0f)
                moveTo(4.0f, 16.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(24.0f)
                lineTo(22.0f, 20.0f)
                lineTo(18.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
            }
        }
        .build()
        return _clockStart!!
    }

private var _clockStart: ImageVector? = null
