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

public val MaterialDesignIcons.BookClockOutline: ImageVector
    get() {
        if (_bookClockOutline != null) {
            return _bookClockOutline!!
        }
        _bookClockOutline = Builder(name = "BookClockOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.26f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.11f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(11.11f)
                curveTo(12.37f, 23.24f, 14.09f, 24.0f, 16.0f, 24.0f)
                curveTo(19.87f, 24.0f, 23.0f, 20.87f, 23.0f, 17.0f)
                curveTo(23.0f, 14.62f, 21.81f, 12.53f, 20.0f, 11.26f)
                moveTo(18.0f, 4.0f)
                verticalLineTo(10.29f)
                curveTo(17.37f, 10.11f, 16.7f, 10.0f, 16.0f, 10.0f)
                curveTo(14.93f, 10.0f, 13.91f, 10.25f, 13.0f, 10.68f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                moveTo(6.0f, 4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                lineTo(10.5f, 9.75f)
                lineTo(12.1f, 11.19f)
                curveTo(10.23f, 12.45f, 9.0f, 14.58f, 9.0f, 17.0f)
                curveTo(9.0f, 18.08f, 9.25f, 19.09f, 9.68f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                moveTo(16.0f, 22.0f)
                curveTo(13.24f, 22.0f, 11.0f, 19.76f, 11.0f, 17.0f)
                reflectiveCurveTo(13.24f, 12.0f, 16.0f, 12.0f)
                reflectiveCurveTo(21.0f, 14.24f, 21.0f, 17.0f)
                reflectiveCurveTo(18.76f, 22.0f, 16.0f, 22.0f)
                moveTo(16.5f, 17.25f)
                lineTo(19.36f, 18.94f)
                lineTo(18.61f, 20.16f)
                lineTo(15.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _bookClockOutline!!
    }

private var _bookClockOutline: ImageVector? = null
