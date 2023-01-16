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

public val MaterialDesignIcons.HomeBatteryOutline: ImageVector
    get() {
        if (_homeBatteryOutline != null) {
            return _homeBatteryOutline!!
        }
        _homeBatteryOutline = Builder(name = "HomeBatteryOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 9.0f, 22.0f, 9.45f, 22.0f, 10.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.55f, 21.55f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(14.45f, 22.0f, 14.0f, 21.55f, 14.0f, 21.0f)
                verticalLineTo(10.0f)
                curveTo(14.0f, 9.45f, 14.45f, 9.0f, 15.0f, 9.0f)
                moveTo(16.0f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                moveTo(12.0f, 5.69f)
                lineTo(7.0f, 10.19f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 3.0f)
                lineTo(14.78f, 5.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.17f)
                lineTo(13.76f, 7.27f)
                lineTo(12.0f, 5.69f)
                close()
            }
        }
        .build()
        return _homeBatteryOutline!!
    }

private var _homeBatteryOutline: ImageVector? = null
