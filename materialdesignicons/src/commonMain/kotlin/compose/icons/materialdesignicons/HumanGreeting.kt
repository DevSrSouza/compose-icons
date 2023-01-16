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

public val MaterialDesignIcons.HumanGreeting: ImageVector
    get() {
        if (_humanGreeting != null) {
            return _humanGreeting!!
        }
        _humanGreeting = Builder(name = "HumanGreeting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.1f, 2.0f, 14.0f, 2.9f, 14.0f, 4.0f)
                reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(10.0f, 5.1f, 10.0f, 4.0f)
                reflectiveCurveTo(10.9f, 2.0f, 12.0f, 2.0f)
                moveTo(15.9f, 8.1f)
                curveTo(15.5f, 7.7f, 14.8f, 7.0f, 13.5f, 7.0f)
                horizontalLineTo(11.0f)
                curveTo(8.2f, 7.0f, 6.0f, 4.8f, 6.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 5.2f, 6.1f, 7.8f, 9.0f, 8.7f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.1f)
                lineTo(19.0f, 14.0f)
                lineTo(20.4f, 12.6f)
                lineTo(15.9f, 8.1f)
                close()
            }
        }
        .build()
        return _humanGreeting!!
    }

private var _humanGreeting: ImageVector? = null
