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

public val MaterialDesignIcons.ClockCheckOutline: ImageVector
    get() {
        if (_clockCheckOutline != null) {
            return _clockCheckOutline!!
        }
        _clockCheckOutline = Builder(name = "ClockCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 17.0f)
                lineTo(18.5f, 22.0f)
                lineTo(15.0f, 18.5f)
                lineTo(16.5f, 17.0f)
                lineTo(18.5f, 19.0f)
                lineTo(22.0f, 15.5f)
                lineTo(23.5f, 17.0f)
                moveTo(13.1f, 19.9f)
                curveTo(12.7f, 20.0f, 12.4f, 20.0f, 12.0f, 20.0f)
                curveTo(7.6f, 20.0f, 4.0f, 16.4f, 4.0f, 12.0f)
                reflectiveCurveTo(7.6f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.0f, 7.6f, 20.0f, 12.0f)
                curveTo(20.0f, 12.4f, 20.0f, 12.7f, 19.9f, 13.1f)
                curveTo(20.6f, 13.2f, 21.2f, 13.4f, 21.8f, 13.7f)
                curveTo(21.9f, 13.1f, 22.0f, 12.6f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(12.6f, 22.0f, 13.2f, 21.9f, 13.7f, 21.8f)
                curveTo(13.4f, 21.3f, 13.2f, 20.6f, 13.1f, 19.9f)
                moveTo(15.6f, 14.1f)
                lineTo(12.5f, 12.3f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                lineTo(14.5f, 15.1f)
                curveTo(14.8f, 14.7f, 15.2f, 14.4f, 15.6f, 14.1f)
                close()
            }
        }
        .build()
        return _clockCheckOutline!!
    }

private var _clockCheckOutline: ImageVector? = null
