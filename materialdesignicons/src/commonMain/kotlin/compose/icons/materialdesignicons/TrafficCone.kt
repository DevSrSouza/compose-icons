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

public val MaterialDesignIcons.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                lineTo(18.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                lineTo(7.0f, 15.0f)
                horizontalLineTo(17.0f)
                moveTo(15.0f, 8.0f)
                lineTo(16.0f, 12.0f)
                horizontalLineTo(8.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineTo(15.0f)
                moveTo(13.0f, 1.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineTo(10.0f)
                lineTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
