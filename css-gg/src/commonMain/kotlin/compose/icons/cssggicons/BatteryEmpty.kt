package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) {
            return _batteryEmpty!!
        }
        _batteryEmpty = Builder(name = "BatteryEmpty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 6.0f, 2.0f, 7.343f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.657f, 3.343f, 18.0f, 5.0f, 18.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 18.0f, 21.0f, 16.657f, 21.0f, 15.0f)
                curveTo(21.552f, 15.0f, 22.0f, 14.552f, 22.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 9.448f, 21.552f, 9.0f, 21.0f, 9.0f)
                curveTo(21.0f, 7.343f, 19.657f, 6.0f, 18.0f, 6.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 8.0f, 4.0f, 8.448f, 4.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 15.552f, 4.448f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 16.0f, 19.0f, 15.552f, 19.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 8.448f, 18.552f, 8.0f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _batteryEmpty!!
    }

private var _batteryEmpty: ImageVector? = null
