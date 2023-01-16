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

public val MaterialDesignIcons.WrenchClock: ImageVector
    get() {
        if (_wrenchClock != null) {
            return _wrenchClock!!
        }
        _wrenchClock = Builder(name = "WrenchClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.2f)
                curveTo(10.0f, 4.3f, 8.8f, 2.6f, 7.0f, 2.0f)
                verticalLineTo(5.7f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                curveTo(2.2f, 2.6f, 1.0f, 4.3f, 1.0f, 6.2f)
                curveTo(1.0f, 8.1f, 2.2f, 9.8f, 4.0f, 10.4f)
                verticalLineTo(21.4f)
                curveTo(4.0f, 21.8f, 4.2f, 22.0f, 4.5f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(6.8f, 22.0f, 7.0f, 21.8f, 7.0f, 21.5f)
                verticalLineTo(10.5f)
                curveTo(8.8f, 9.9f, 10.0f, 8.2f, 10.0f, 6.2f)
                moveTo(16.0f, 8.0f)
                curveTo(16.0f, 8.0f, 15.9f, 8.0f, 16.0f, 8.0f)
                curveTo(12.1f, 8.1f, 9.0f, 11.2f, 9.0f, 15.0f)
                curveTo(9.0f, 18.9f, 12.1f, 22.0f, 16.0f, 22.0f)
                reflectiveCurveTo(23.0f, 18.9f, 23.0f, 15.0f)
                reflectiveCurveTo(19.9f, 8.0f, 16.0f, 8.0f)
                moveTo(16.0f, 20.0f)
                curveTo(13.2f, 20.0f, 11.0f, 17.8f, 11.0f, 15.0f)
                reflectiveCurveTo(13.2f, 10.0f, 16.0f, 10.0f)
                reflectiveCurveTo(21.0f, 12.2f, 21.0f, 15.0f)
                reflectiveCurveTo(18.8f, 20.0f, 16.0f, 20.0f)
                moveTo(15.0f, 11.0f)
                verticalLineTo(16.0f)
                lineTo(18.6f, 18.2f)
                lineTo(19.4f, 17.0f)
                lineTo(16.5f, 15.3f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _wrenchClock!!
    }

private var _wrenchClock: ImageVector? = null
