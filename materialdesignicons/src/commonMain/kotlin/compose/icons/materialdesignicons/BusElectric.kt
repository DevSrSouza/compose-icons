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

public val MaterialDesignIcons.BusElectric: ImageVector
    get() {
        if (_busElectric != null) {
            return _busElectric!!
        }
        _busElectric = Builder(name = "BusElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                moveTo(16.5f, 14.0f)
                curveTo(15.7f, 14.0f, 15.0f, 13.3f, 15.0f, 12.5f)
                curveTo(15.0f, 11.7f, 15.7f, 11.0f, 16.5f, 11.0f)
                curveTo(17.3f, 11.0f, 18.0f, 11.7f, 18.0f, 12.5f)
                curveTo(18.0f, 13.3f, 17.3f, 14.0f, 16.5f, 14.0f)
                moveTo(7.5f, 14.0f)
                curveTo(6.7f, 14.0f, 6.0f, 13.3f, 6.0f, 12.5f)
                curveTo(6.0f, 11.7f, 6.7f, 11.0f, 7.5f, 11.0f)
                reflectiveCurveTo(9.0f, 11.7f, 9.0f, 12.5f)
                curveTo(9.0f, 13.3f, 8.3f, 14.0f, 7.5f, 14.0f)
                moveTo(4.0f, 13.0f)
                curveTo(4.0f, 13.9f, 4.4f, 14.7f, 5.0f, 15.2f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 17.6f, 5.4f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(7.6f, 18.0f, 8.0f, 17.6f, 8.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                curveTo(16.0f, 17.6f, 16.4f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(18.0f)
                curveTo(18.6f, 18.0f, 19.0f, 17.6f, 19.0f, 17.0f)
                verticalLineTo(15.2f)
                curveTo(19.6f, 14.7f, 20.0f, 13.9f, 20.0f, 13.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 0.5f, 16.4f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 0.5f, 4.0f, 4.0f)
                verticalLineTo(13.0f)
                moveTo(7.0f, 21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                lineTo(17.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                lineTo(7.0f, 21.0f)
                close()
            }
        }
        .build()
        return _busElectric!!
    }

private var _busElectric: ImageVector? = null
