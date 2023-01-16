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

public val MaterialDesignIcons.BookClock: ImageVector
    get() {
        if (_bookClock != null) {
            return _bookClock!!
        }
        _bookClock = Builder(name = "BookClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 17.25f)
                lineTo(19.36f, 18.94f)
                lineTo(18.61f, 20.16f)
                lineTo(15.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(17.25f)
                moveTo(23.0f, 17.0f)
                curveTo(23.0f, 20.87f, 19.87f, 24.0f, 16.0f, 24.0f)
                curveTo(14.09f, 24.0f, 12.37f, 23.24f, 11.11f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.11f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.89f, 20.0f, 4.0f)
                verticalLineTo(11.26f)
                curveTo(21.81f, 12.53f, 23.0f, 14.62f, 23.0f, 17.0f)
                moveTo(21.0f, 17.0f)
                curveTo(21.0f, 14.24f, 18.76f, 12.0f, 16.0f, 12.0f)
                reflectiveCurveTo(11.0f, 14.24f, 11.0f, 17.0f)
                reflectiveCurveTo(13.24f, 22.0f, 16.0f, 22.0f)
                reflectiveCurveTo(21.0f, 19.76f, 21.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bookClock!!
    }

private var _bookClock: ImageVector? = null
