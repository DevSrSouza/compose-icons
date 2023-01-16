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

public val MaterialDesignIcons.TableClock: ImageVector
    get() {
        if (_tableClock != null) {
            return _tableClock!!
        }
        _tableClock = Builder(name = "TableClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15.0f, 16.69f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                moveTo(20.0f, 10.26f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 3.9f, 19.11f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.11f, 2.9f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(9.68f)
                curveTo(10.81f, 21.36f, 13.21f, 23.0f, 16.0f, 23.0f)
                curveTo(19.87f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 13.62f, 21.81f, 11.53f, 20.0f, 10.26f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(9.29f)
                curveTo(17.37f, 9.11f, 16.7f, 9.0f, 16.0f, 9.0f)
                curveTo(14.5f, 9.0f, 13.13f, 9.47f, 12.0f, 10.26f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                moveTo(4.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                moveTo(4.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.68f)
                curveTo(9.25f, 13.91f, 9.0f, 14.93f, 9.0f, 16.0f)
                curveTo(9.0f, 16.34f, 9.03f, 16.67f, 9.08f, 17.0f)
                horizontalLineTo(4.0f)
                moveTo(16.0f, 21.0f)
                curveTo(13.24f, 21.0f, 11.0f, 18.76f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.24f, 21.0f, 16.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _tableClock!!
    }

private var _tableClock: ImageVector? = null
