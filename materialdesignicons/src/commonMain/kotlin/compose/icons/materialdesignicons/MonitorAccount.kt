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

public val MaterialDesignIcons.MonitorAccount: ImageVector
    get() {
        if (_monitorAccount != null) {
            return _monitorAccount!!
        }
        _monitorAccount = Builder(name = "MonitorAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                curveTo(22.05f, 2.0f, 22.92f, 2.81f, 23.0f, 3.85f)
                lineTo(23.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 17.05f, 22.18f, 17.92f, 21.15f, 18.0f)
                lineTo(21.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(1.95f, 18.0f, 1.08f, 17.18f, 1.0f, 16.15f)
                lineTo(1.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 2.94f, 1.81f, 2.08f, 2.85f, 2.0f)
                lineTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                moveTo(12.0f, 11.0f)
                curveTo(14.21f, 11.0f, 16.0f, 11.9f, 16.0f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                curveTo(8.0f, 11.9f, 9.79f, 11.0f, 12.0f, 11.0f)
                moveTo(12.0f, 6.0f)
                curveTo(13.11f, 6.0f, 14.0f, 6.9f, 14.0f, 8.0f)
                reflectiveCurveTo(13.11f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(10.0f, 9.11f, 10.0f, 8.0f)
                reflectiveCurveTo(10.9f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _monitorAccount!!
    }

private var _monitorAccount: ImageVector? = null
