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

public val MaterialDesignIcons.ClockAlert: ImageVector
    get() {
        if (_clockAlert != null) {
            return _clockAlert!!
        }
        _clockAlert = Builder(name = "ClockAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(14.3f, 22.0f, 16.3f, 21.2f, 18.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.8f)
                curveTo(20.9f, 5.4f, 16.8f, 2.0f, 12.0f, 2.0f)
                moveTo(16.2f, 16.2f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.2f)
                lineTo(17.0f, 14.9f)
                lineTo(16.2f, 16.2f)
                close()
            }
        }
        .build()
        return _clockAlert!!
    }

private var _clockAlert: ImageVector? = null
