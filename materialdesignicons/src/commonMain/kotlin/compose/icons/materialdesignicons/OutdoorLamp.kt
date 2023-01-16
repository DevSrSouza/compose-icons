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

public val MaterialDesignIcons.OutdoorLamp: ImageVector
    get() {
        if (_outdoorLamp != null) {
            return _outdoorLamp!!
        }
        _outdoorLamp = Builder(name = "OutdoorLamp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(11.9f, 22.0f, 11.0f, 21.1f, 11.0f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                curveTo(17.0f, 21.1f, 16.1f, 22.0f, 15.0f, 22.0f)
                moveTo(7.0f, 14.0f)
                horizontalLineTo(21.0f)
                lineTo(15.0f, 9.71f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.39f, 13.94f, 2.0f, 11.0f, 2.0f)
                reflectiveCurveTo(7.0f, 4.39f, 7.0f, 6.0f)
                curveTo(7.0f, 6.45f, 6.81f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                curveTo(8.2f, 9.0f, 9.0f, 7.21f, 9.0f, 6.0f)
                curveTo(9.0f, 5.67f, 9.1f, 4.0f, 11.0f, 4.0f)
                curveTo(12.83f, 4.0f, 13.0f, 5.54f, 13.0f, 6.0f)
                verticalLineTo(9.71f)
                lineTo(7.0f, 14.0f)
                close()
            }
        }
        .build()
        return _outdoorLamp!!
    }

private var _outdoorLamp: ImageVector? = null
