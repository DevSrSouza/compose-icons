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

public val MaterialDesignIcons.ClockTimeEightOutline: ImageVector
    get() {
        if (_clockTimeEightOutline != null) {
            return _clockTimeEightOutline!!
        }
        _clockTimeEightOutline = Builder(name = "ClockTimeEightOutline", defaultWidth = 24.0.dp,
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
                moveTo(12.5f, 12.8f)
                lineTo(7.7f, 15.6f)
                lineTo(7.0f, 14.2f)
                lineTo(11.0f, 11.9f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.8f)
                close()
            }
        }
        .build()
        return _clockTimeEightOutline!!
    }

private var _clockTimeEightOutline: ImageVector? = null
