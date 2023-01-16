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

public val MaterialDesignIcons.ClockCheck: ImageVector
    get() {
        if (_clockCheck != null) {
            return _clockCheck!!
        }
        _clockCheck = Builder(name = "ClockCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 17.5f, 13.5f, 16.2f, 14.4f, 15.1f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.2f)
                lineTo(15.6f, 14.1f)
                curveTo(16.6f, 13.4f, 17.7f, 13.0f, 19.0f, 13.0f)
                curveTo(20.0f, 13.0f, 21.0f, 13.3f, 21.8f, 13.7f)
                curveTo(21.9f, 13.1f, 22.0f, 12.6f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(12.6f, 22.0f, 13.2f, 21.9f, 13.7f, 21.8f)
                curveTo(13.3f, 21.0f, 13.0f, 20.0f, 13.0f, 19.0f)
                close()
            }
        }
        .build()
        return _clockCheck!!
    }

private var _clockCheck: ImageVector? = null
