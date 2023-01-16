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

public val MaterialDesignIcons.RollerbladeOff: ImageVector
    get() {
        if (_rollerbladeOff != null) {
            return _rollerbladeOff!!
        }
        _rollerbladeOff = Builder(name = "RollerbladeOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(20.32f, 22.21f)
                curveTo(19.86f, 22.69f, 19.22f, 23.0f, 18.5f, 23.0f)
                curveTo(17.12f, 23.0f, 16.0f, 21.88f, 16.0f, 20.5f)
                curveTo(16.0f, 19.78f, 16.31f, 19.14f, 16.79f, 18.68f)
                lineTo(15.11f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19.5f, 12.95f)
                curveTo(18.55f, 10.9f, 15.82f, 10.56f, 13.91f, 10.05f)
                curveTo(13.45f, 10.03f, 13.0f, 9.77f, 12.6f, 9.4f)
                lineTo(20.0f, 16.79f)
                curveTo(20.0f, 15.45f, 20.06f, 13.76f, 19.5f, 12.95f)
                moveTo(9.2f, 6.0f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                moveTo(12.56f, 9.36f)
                curveTo(12.18f, 9.0f, 11.9f, 8.5f, 11.82f, 8.0f)
                horizontalLineTo(11.2f)
                lineTo(12.56f, 9.36f)
                moveTo(11.5f, 18.0f)
                curveTo(10.12f, 18.0f, 9.0f, 19.12f, 9.0f, 20.5f)
                curveTo(9.0f, 21.88f, 10.12f, 23.0f, 11.5f, 23.0f)
                reflectiveCurveTo(14.0f, 21.88f, 14.0f, 20.5f)
                curveTo(14.0f, 19.12f, 12.88f, 18.0f, 11.5f, 18.0f)
                moveTo(9.0f, 5.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.2f)
                lineTo(8.5f, 5.32f)
                curveTo(8.59f, 5.13f, 8.77f, 5.0f, 9.0f, 5.0f)
                moveTo(4.5f, 18.0f)
                curveTo(3.12f, 18.0f, 2.0f, 19.12f, 2.0f, 20.5f)
                curveTo(2.0f, 21.88f, 3.12f, 23.0f, 4.5f, 23.0f)
                reflectiveCurveTo(7.0f, 21.88f, 7.0f, 20.5f)
                curveTo(7.0f, 19.12f, 5.88f, 18.0f, 4.5f, 18.0f)
                close()
            }
        }
        .build()
        return _rollerbladeOff!!
    }

private var _rollerbladeOff: ImageVector? = null
