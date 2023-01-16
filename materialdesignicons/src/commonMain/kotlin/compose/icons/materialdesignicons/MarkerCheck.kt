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

public val MaterialDesignIcons.MarkerCheck: ImageVector
    get() {
        if (_markerCheck != null) {
            return _markerCheck!!
        }
        _markerCheck = Builder(name = "MarkerCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                lineTo(5.0f, 11.0f)
                lineTo(6.41f, 9.58f)
                lineTo(10.0f, 13.17f)
                lineTo(17.59f, 5.58f)
                lineTo(19.0f, 7.0f)
                moveTo(19.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 1.0f, 3.0f, 1.89f, 3.0f, 3.0f)
                verticalLineTo(15.93f)
                curveTo(3.0f, 16.62f, 3.35f, 17.23f, 3.88f, 17.59f)
                lineTo(12.0f, 23.0f)
                lineTo(20.11f, 17.59f)
                curveTo(20.64f, 17.23f, 21.0f, 16.62f, 21.0f, 15.93f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 1.89f, 20.1f, 1.0f, 19.0f, 1.0f)
                close()
            }
        }
        .build()
        return _markerCheck!!
    }

private var _markerCheck: ImageVector? = null
