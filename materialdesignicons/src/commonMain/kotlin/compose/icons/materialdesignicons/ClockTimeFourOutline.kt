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

public val MaterialDesignIcons.ClockTimeFourOutline: ImageVector
    get() {
        if (_clockTimeFourOutline != null) {
            return _clockTimeFourOutline!!
        }
        _clockTimeFourOutline = Builder(name = "ClockTimeFourOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(16.4f, 20.0f, 20.0f, 16.4f, 20.0f, 12.0f)
                reflectiveCurveTo(16.4f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(4.0f, 7.6f, 4.0f, 12.0f)
                reflectiveCurveTo(7.6f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(17.0f, 13.9f)
                lineTo(16.3f, 15.2f)
                lineTo(11.0f, 12.3f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(11.4f)
                lineTo(17.0f, 13.9f)
                close()
            }
        }
        .build()
        return _clockTimeFourOutline!!
    }

private var _clockTimeFourOutline: ImageVector? = null
