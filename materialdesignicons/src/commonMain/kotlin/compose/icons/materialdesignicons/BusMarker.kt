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

public val MaterialDesignIcons.BusMarker: ImageVector
    get() {
        if (_busMarker != null) {
            return _busMarker!!
        }
        _busMarker = Builder(name = "BusMarker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(7.58f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f)
                verticalLineTo(16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 18.22f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 21.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 13.0f, 15.5f)
                arcTo(5.55f, 5.55f, 0.0f, false, true, 15.38f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 18.5f, 10.0f)
                arcTo(5.34f, 5.34f, 0.0f, false, true, 20.0f, 10.22f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f)
                moveTo(7.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 14.0f)
                moveTo(18.5f, 12.0f)
                arcTo(3.54f, 3.54f, 0.0f, false, false, 15.0f, 15.5f)
                curveTo(15.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(22.0f, 18.1f, 22.0f, 15.5f)
                arcTo(3.54f, 3.54f, 0.0f, false, false, 18.5f, 12.0f)
                moveTo(18.5f, 16.8f)
                arcTo(1.2f, 1.2f, 0.0f, true, true, 18.5f, 14.4f)
                arcTo(1.29f, 1.29f, 0.0f, false, true, 19.7f, 15.6f)
                arcTo(1.15f, 1.15f, 0.0f, false, true, 18.5f, 16.8f)
                close()
            }
        }
        .build()
        return _busMarker!!
    }

private var _busMarker: ImageVector? = null
