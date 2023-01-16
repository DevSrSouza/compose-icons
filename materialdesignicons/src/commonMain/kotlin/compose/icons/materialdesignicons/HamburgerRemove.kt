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

public val MaterialDesignIcons.HamburgerRemove: ImageVector
    get() {
        if (_hamburgerRemove != null) {
            return _hamburgerRemove!!
        }
        _hamburgerRemove = Builder(name = "HamburgerRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 9.0f, 3.0f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(21.0f, 9.0f, 21.0f, 9.0f)
                moveTo(13.35f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.66f, 4.34f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13.0f, 19.7f, 13.0f, 19.0f)
                curveTo(13.0f, 18.3f, 13.13f, 17.63f, 13.35f, 17.0f)
                moveTo(21.86f, 13.73f)
                curveTo(21.95f, 13.5f, 22.0f, 13.26f, 22.0f, 13.0f)
                curveTo(22.0f, 11.9f, 21.11f, 11.0f, 20.0f, 11.0f)
                horizontalLineTo(11.0f)
                lineTo(8.5f, 13.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 11.0f, 2.0f, 11.9f, 2.0f, 13.0f)
                reflectiveCurveTo(2.9f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(14.54f)
                curveTo(15.64f, 13.78f, 17.23f, 13.0f, 19.0f, 13.0f)
                curveTo(20.04f, 13.0f, 21.0f, 13.26f, 21.86f, 13.73f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }
        .build()
        return _hamburgerRemove!!
    }

private var _hamburgerRemove: ImageVector? = null
