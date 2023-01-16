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

public val MaterialDesignIcons.MushroomOffOutline: ImageVector
    get() {
        if (_mushroomOffOutline != null) {
            return _mushroomOffOutline!!
        }
        _mushroomOffOutline = Builder(name = "MushroomOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                lineTo(8.0f, 18.5f)
                lineTo(7.7f, 19.5f)
                curveTo(7.4f, 20.6f, 8.1f, 21.7f, 9.1f, 21.9f)
                lineTo(9.7f, 22.0f)
                horizontalLineTo(14.4f)
                curveTo(15.5f, 22.0f, 16.4f, 21.1f, 16.4f, 20.0f)
                lineTo(16.3f, 19.5f)
                lineTo(16.0f, 18.5f)
                lineTo(15.8f, 17.6f)
                lineTo(20.9f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 10.3f, 4.6f, 8.7f, 5.5f, 7.4f)
                lineTo(6.2f, 8.1f)
                curveTo(6.1f, 8.4f, 6.0f, 8.7f, 6.0f, 9.0f)
                curveTo(6.0f, 10.1f, 6.9f, 11.0f, 8.0f, 11.0f)
                curveTo(8.3f, 11.0f, 8.6f, 10.9f, 8.9f, 10.8f)
                lineTo(10.1f, 12.0f)
                horizontalLineTo(4.0f)
                moveTo(9.7f, 20.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.6f, 17.0f)
                horizontalLineTo(13.6f)
                lineTo(14.2f, 19.0f)
                lineTo(14.5f, 20.0f)
                horizontalLineTo(9.7f)
                moveTo(16.0f, 11.0f)
                curveTo(14.9f, 11.0f, 14.0f, 10.1f, 14.0f, 9.0f)
                reflectiveCurveTo(14.9f, 7.0f, 16.0f, 7.0f)
                reflectiveCurveTo(18.0f, 7.9f, 18.0f, 9.0f)
                reflectiveCurveTo(17.1f, 11.0f, 16.0f, 11.0f)
                moveTo(8.2f, 5.0f)
                lineTo(6.7f, 3.5f)
                curveTo(8.3f, 2.6f, 10.1f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 13.1f, 21.1f, 14.0f, 20.0f, 14.0f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 8.3f, 17.4f, 5.1f, 14.0f, 4.2f)
                curveTo(13.9f, 5.2f, 13.0f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(10.1f, 5.2f, 10.0f, 4.2f)
                curveTo(9.4f, 4.4f, 8.7f, 4.7f, 8.2f, 5.0f)
                close()
            }
        }
        .build()
        return _mushroomOffOutline!!
    }

private var _mushroomOffOutline: ImageVector? = null
