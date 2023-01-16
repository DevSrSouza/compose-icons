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

public val MaterialDesignIcons.Latitude: ImageVector
    get() {
        if (_latitude != null) {
            return _latitude!!
        }
        _latitude = Builder(name = "Latitude", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(15.0f, 4.0f, 17.5f, 5.6f, 18.9f, 8.0f)
                horizontalLineTo(5.1f)
                curveTo(6.5f, 5.6f, 9.0f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                curveTo(9.0f, 20.0f, 6.5f, 18.4f, 5.1f, 16.0f)
                horizontalLineTo(18.9f)
                curveTo(17.5f, 18.4f, 15.0f, 20.0f, 12.0f, 20.0f)
                moveTo(4.3f, 14.0f)
                curveTo(4.1f, 13.4f, 4.0f, 12.7f, 4.0f, 12.0f)
                reflectiveCurveTo(4.1f, 10.6f, 4.3f, 10.0f)
                horizontalLineTo(19.8f)
                curveTo(20.0f, 10.6f, 20.1f, 11.3f, 20.1f, 12.0f)
                reflectiveCurveTo(20.0f, 13.4f, 19.8f, 14.0f)
                horizontalLineTo(4.3f)
                close()
            }
        }
        .build()
        return _latitude!!
    }

private var _latitude: ImageVector? = null
