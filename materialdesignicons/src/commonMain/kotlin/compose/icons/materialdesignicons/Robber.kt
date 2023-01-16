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

public val MaterialDesignIcons.Robber: ImageVector
    get() {
        if (_robber != null) {
            return _robber!!
        }
        _robber = Builder(name = "Robber", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7f, 12.5f)
                curveTo(10.7f, 12.8f, 9.4f, 13.2f, 8.4f, 13.2f)
                reflectiveCurveTo(6.3f, 12.5f, 6.3f, 12.3f)
                curveTo(6.3f, 12.0f, 7.0f, 11.1f, 8.6f, 11.0f)
                curveTo(9.5f, 10.9f, 10.5f, 11.5f, 10.7f, 12.5f)
                moveTo(15.4f, 11.0f)
                curveTo(14.4f, 10.9f, 13.5f, 11.5f, 13.3f, 12.5f)
                curveTo(13.3f, 12.8f, 14.5f, 13.2f, 15.6f, 13.2f)
                curveTo(16.7f, 13.2f, 17.7f, 12.5f, 17.7f, 12.3f)
                reflectiveCurveTo(17.0f, 11.1f, 15.4f, 11.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(22.0f, 6.5f, 22.0f, 12.0f)
                moveTo(20.0f, 11.2f)
                curveTo(20.0f, 9.2f, 19.3f, 8.5f, 16.7f, 8.5f)
                curveTo(14.1f, 8.5f, 13.3f, 9.6f, 12.0f, 9.6f)
                reflectiveCurveTo(10.0f, 8.5f, 7.3f, 8.5f)
                reflectiveCurveTo(4.0f, 9.1f, 4.0f, 11.2f)
                curveTo(4.0f, 14.6f, 5.5f, 16.5f, 7.6f, 16.5f)
                curveTo(9.2f, 16.5f, 10.4f, 14.5f, 12.0f, 14.5f)
                reflectiveCurveTo(14.7f, 16.5f, 16.4f, 16.5f)
                curveTo(18.5f, 16.5f, 20.0f, 14.6f, 20.0f, 11.2f)
                close()
            }
        }
        .build()
        return _robber!!
    }

private var _robber: ImageVector? = null
