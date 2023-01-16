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

public val MaterialDesignIcons.BagCarryOn: ImageVector
    get() {
        if (_bagCarryOn != null) {
            return _bagCarryOn!!
        }
        _bagCarryOn = Builder(name = "BagCarryOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6f, 21.4f)
                curveTo(15.0f, 21.8f, 15.4f, 22.0f, 16.0f, 22.0f)
                reflectiveCurveTo(17.0f, 21.8f, 17.4f, 21.4f)
                reflectiveCurveTo(18.0f, 20.6f, 18.0f, 20.0f)
                reflectiveCurveTo(17.8f, 19.0f, 17.4f, 18.6f)
                reflectiveCurveTo(16.5f, 18.0f, 16.0f, 18.0f)
                reflectiveCurveTo(15.0f, 18.2f, 14.6f, 18.6f)
                reflectiveCurveTo(14.0f, 19.4f, 14.0f, 20.0f)
                reflectiveCurveTo(14.2f, 21.0f, 14.6f, 21.4f)
                moveTo(6.0f, 19.0f)
                curveTo(6.0f, 19.5f, 6.2f, 20.0f, 6.6f, 20.4f)
                curveTo(7.0f, 20.8f, 7.5f, 21.0f, 8.0f, 21.0f)
                verticalLineTo(7.0f)
                curveTo(7.5f, 7.0f, 7.0f, 7.2f, 6.6f, 7.6f)
                curveTo(6.2f, 8.0f, 6.0f, 8.5f, 6.0f, 9.0f)
                verticalLineTo(19.0f)
                moveTo(16.0f, 2.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 2.5f, 12.2f, 3.0f, 12.6f, 3.4f)
                curveTo(13.0f, 3.8f, 13.5f, 4.0f, 14.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.2f)
                curveTo(13.0f, 20.5f, 13.0f, 20.2f, 13.0f, 20.0f)
                curveTo(13.0f, 19.2f, 13.3f, 18.5f, 13.9f, 17.9f)
                curveTo(14.5f, 17.3f, 15.2f, 17.0f, 16.0f, 17.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _bagCarryOn!!
    }

private var _bagCarryOn: ImageVector? = null
