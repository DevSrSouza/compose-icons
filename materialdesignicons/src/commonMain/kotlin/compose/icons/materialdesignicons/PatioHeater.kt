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

public val MaterialDesignIcons.PatioHeater: ImageVector
    get() {
        if (_patioHeater != null) {
            return _patioHeater!!
        }
        _patioHeater = Builder(name = "PatioHeater", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                moveTo(19.0f, 4.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineTo(19.0f)
                moveTo(8.0f, 5.0f)
                lineTo(8.4f, 6.0f)
                horizontalLineTo(15.6f)
                lineTo(16.0f, 5.0f)
                horizontalLineTo(8.0f)
                moveTo(10.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                curveTo(10.4f, 15.0f, 10.0f, 15.4f, 10.0f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                curveTo(14.0f, 15.4f, 13.6f, 15.0f, 13.0f, 15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                lineTo(14.4f, 9.0f)
                horizontalLineTo(9.6f)
                lineTo(10.0f, 10.0f)
                moveTo(9.2f, 8.0f)
                horizontalLineTo(14.8f)
                lineTo(15.2f, 7.0f)
                horizontalLineTo(8.8f)
                lineTo(9.2f, 8.0f)
                close()
            }
        }
        .build()
        return _patioHeater!!
    }

private var _patioHeater: ImageVector? = null
