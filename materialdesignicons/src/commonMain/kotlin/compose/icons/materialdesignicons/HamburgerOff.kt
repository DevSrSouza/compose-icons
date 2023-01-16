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

public val MaterialDesignIcons.HamburgerOff: ImageVector
    get() {
        if (_hamburgerOff != null) {
            return _hamburgerOff!!
        }
        _hamburgerOff = Builder(name = "HamburgerOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveTo(21.11f, 11.0f, 22.0f, 11.9f, 22.0f, 13.0f)
                reflectiveCurveTo(21.11f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(18.2f)
                lineTo(14.2f, 11.0f)
                horizontalLineTo(20.0f)
                moveTo(20.42f, 19.77f)
                lineTo(20.42f, 19.76f)
                lineTo(17.66f, 17.0f)
                horizontalLineTo(17.65f)
                lineTo(15.65f, 15.0f)
                horizontalLineTo(15.66f)
                lineTo(11.66f, 11.0f)
                horizontalLineTo(11.66f)
                lineTo(9.66f, 9.0f)
                horizontalLineTo(9.66f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.12f, 6.0f)
                curveTo(3.0f, 7.5f, 3.0f, 9.0f, 3.0f, 9.0f)
                horizontalLineTo(7.11f)
                lineTo(9.11f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 11.0f, 2.0f, 11.9f, 2.0f, 13.0f)
                reflectiveCurveTo(2.9f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(13.11f)
                lineTo(15.11f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.66f, 4.34f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.33f, 21.0f, 18.65f, 20.93f, 18.94f, 20.83f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.42f, 19.77f)
                moveTo(21.0f, 9.0f)
                curveTo(21.0f, 9.0f, 21.0f, 3.0f, 12.0f, 3.0f)
                curveTo(9.88f, 3.0f, 8.28f, 3.34f, 7.05f, 3.85f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _hamburgerOff!!
    }

private var _hamburgerOff: ImageVector? = null
