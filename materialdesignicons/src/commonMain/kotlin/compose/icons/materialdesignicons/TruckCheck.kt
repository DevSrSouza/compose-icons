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

public val MaterialDesignIcons.TruckCheck: ImageVector
    get() {
        if (_truckCheck != null) {
            return _truckCheck!!
        }
        _truckCheck = Builder(name = "TruckCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                lineTo(23.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 17.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.89f, 1.9f, 4.0f, 3.0f, 4.0f)
                moveTo(17.0f, 9.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.47f)
                lineTo(19.5f, 9.5f)
                horizontalLineTo(17.0f)
                moveTo(6.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 15.5f)
                moveTo(18.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 15.5f)
                moveTo(8.0f, 14.0f)
                lineTo(14.0f, 8.0f)
                lineTo(12.59f, 6.58f)
                lineTo(8.0f, 11.17f)
                lineTo(5.91f, 9.08f)
                lineTo(4.5f, 10.5f)
                lineTo(8.0f, 14.0f)
                close()
            }
        }
        .build()
        return _truckCheck!!
    }

private var _truckCheck: ImageVector? = null
