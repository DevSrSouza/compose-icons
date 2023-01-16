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

public val MaterialDesignIcons.MushroomOff: ImageVector
    get() {
        if (_mushroomOff != null) {
            return _mushroomOff!!
        }
        _mushroomOff = Builder(name = "MushroomOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(4.1f, 6.0f)
                curveTo(2.8f, 7.6f, 2.0f, 9.7f, 2.0f, 12.0f)
                curveTo(2.0f, 13.1f, 2.9f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(12.1f)
                lineTo(13.1f, 15.0f)
                horizontalLineTo(9.0f)
                lineTo(7.7f, 19.5f)
                verticalLineTo(20.0f)
                curveTo(7.7f, 21.1f, 8.6f, 22.0f, 9.7f, 22.0f)
                horizontalLineTo(14.4f)
                curveTo(15.5f, 22.0f, 16.4f, 21.1f, 16.4f, 20.0f)
                lineTo(16.3f, 19.5f)
                lineTo(15.8f, 17.7f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(7.0f, 12.0f)
                curveTo(5.9f, 12.0f, 5.0f, 11.1f, 5.0f, 10.0f)
                curveTo(5.0f, 9.2f, 5.5f, 8.4f, 6.3f, 8.1f)
                lineTo(8.9f, 10.7f)
                curveTo(8.6f, 11.5f, 7.8f, 12.0f, 7.0f, 12.0f)
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(14.0f, 4.9f, 14.0f, 6.0f)
                reflectiveCurveTo(13.1f, 8.0f, 12.0f, 8.0f)
                curveTo(11.5f, 8.0f, 11.1f, 7.8f, 10.7f, 7.5f)
                lineTo(17.2f, 14.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 14.0f, 22.0f, 13.1f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1f, 2.0f, 8.3f, 2.6f, 6.7f, 3.5f)
                lineTo(10.4f, 7.2f)
                curveTo(10.2f, 6.9f, 10.0f, 6.5f, 10.0f, 6.0f)
                moveTo(17.0f, 8.0f)
                curveTo(18.1f, 8.0f, 19.0f, 8.9f, 19.0f, 10.0f)
                reflectiveCurveTo(18.1f, 12.0f, 17.0f, 12.0f)
                reflectiveCurveTo(15.0f, 11.1f, 15.0f, 10.0f)
                reflectiveCurveTo(15.9f, 8.0f, 17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mushroomOff!!
    }

private var _mushroomOff: ImageVector? = null
