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

public val MaterialDesignIcons.Candelabra: ImageVector
    get() {
        if (_candelabra != null) {
            return _candelabra!!
        }
        _candelabra = Builder(name = "Candelabra", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 11.0f)
                curveTo(20.5f, 11.55f, 20.05f, 12.0f, 19.5f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 15.11f, 18.11f, 16.0f, 17.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 20.0f, 16.0f, 20.9f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 20.9f, 8.9f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 16.0f, 5.0f, 15.11f, 5.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.5f)
                curveTo(3.95f, 12.0f, 3.5f, 11.55f, 3.5f, 11.0f)
                reflectiveCurveTo(3.95f, 10.0f, 4.5f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                lineTo(7.0f, 5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.5f)
                curveTo(8.05f, 10.0f, 8.5f, 10.45f, 8.5f, 11.0f)
                reflectiveCurveTo(8.05f, 12.0f, 7.5f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.5f)
                curveTo(9.95f, 12.0f, 9.5f, 11.55f, 9.5f, 11.0f)
                reflectiveCurveTo(9.95f, 10.0f, 10.5f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                lineTo(13.0f, 3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.5f)
                curveTo(14.05f, 10.0f, 14.5f, 10.45f, 14.5f, 11.0f)
                reflectiveCurveTo(14.05f, 12.0f, 13.5f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                curveTo(15.95f, 12.0f, 15.5f, 11.55f, 15.5f, 11.0f)
                reflectiveCurveTo(15.95f, 10.0f, 16.5f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                lineTo(19.0f, 5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.5f)
                curveTo(20.05f, 10.0f, 20.5f, 10.45f, 20.5f, 11.0f)
                close()
            }
        }
        .build()
        return _candelabra!!
    }

private var _candelabra: ImageVector? = null
