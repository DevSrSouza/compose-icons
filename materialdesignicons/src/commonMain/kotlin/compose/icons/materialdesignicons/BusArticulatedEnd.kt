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

public val MaterialDesignIcons.BusArticulatedEnd: ImageVector
    get() {
        if (_busArticulatedEnd != null) {
            return _busArticulatedEnd!!
        }
        _busArticulatedEnd = Builder(name = "BusArticulatedEnd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 6.0f)
                lineTo(20.0f, 7.5f)
                lineTo(21.5f, 9.0f)
                lineTo(20.0f, 10.5f)
                lineTo(21.5f, 12.0f)
                lineTo(20.0f, 13.5f)
                lineTo(21.5f, 15.0f)
                horizontalLineTo(12.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.5f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.5f, 15.0f)
                horizontalLineTo(2.5f)
                verticalLineTo(8.0f)
                curveTo(2.5f, 6.89f, 3.39f, 6.0f, 4.5f, 6.0f)
                horizontalLineTo(21.5f)
                moveTo(18.5f, 7.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(7.5f)
                moveTo(13.5f, 7.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.5f)
                moveTo(8.0f, 7.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5f)
                moveTo(9.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 13.5f)
                close()
            }
        }
        .build()
        return _busArticulatedEnd!!
    }

private var _busArticulatedEnd: ImageVector? = null
