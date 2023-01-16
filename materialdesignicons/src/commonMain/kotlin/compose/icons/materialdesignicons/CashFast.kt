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

public val MaterialDesignIcons.CashFast: ImageVector
    get() {
        if (_cashFast != null) {
            return _cashFast!!
        }
        _cashFast = Builder(name = "CashFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.12f, 9.88f)
                curveTo(16.56f, 9.32f, 15.8f, 9.0f, 15.0f, 9.0f)
                reflectiveCurveTo(13.44f, 9.32f, 12.88f, 9.88f)
                curveTo(12.32f, 10.44f, 12.0f, 11.2f, 12.0f, 12.0f)
                reflectiveCurveTo(12.32f, 13.56f, 12.88f, 14.12f)
                reflectiveCurveTo(14.2f, 15.0f, 15.0f, 15.0f)
                reflectiveCurveTo(16.56f, 14.68f, 17.12f, 14.12f)
                reflectiveCurveTo(18.0f, 12.8f, 18.0f, 12.0f)
                reflectiveCurveTo(17.68f, 10.44f, 17.12f, 9.88f)
                moveTo(7.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                moveTo(21.0f, 14.0f)
                curveTo(20.47f, 14.0f, 19.96f, 14.21f, 19.59f, 14.59f)
                curveTo(19.21f, 14.96f, 19.0f, 15.47f, 19.0f, 16.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 15.47f, 10.79f, 14.96f, 10.41f, 14.59f)
                curveTo(10.04f, 14.21f, 9.53f, 14.0f, 9.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(9.53f, 10.0f, 10.04f, 9.79f, 10.41f, 9.41f)
                curveTo(10.79f, 9.04f, 11.0f, 8.53f, 11.0f, 8.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 8.53f, 19.21f, 9.04f, 19.59f, 9.41f)
                curveTo(19.96f, 9.79f, 20.47f, 10.0f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                moveTo(5.0f, 8.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 8.0f, 2.0f, 7.55f, 2.0f, 7.0f)
                curveTo(2.0f, 6.45f, 2.45f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                moveTo(5.0f, 13.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 13.0f, 1.0f, 12.55f, 1.0f, 12.0f)
                curveTo(1.0f, 11.45f, 1.45f, 11.0f, 2.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                moveTo(5.0f, 18.0f)
                horizontalLineTo(1.0f)
                curveTo(0.448f, 18.0f, 0.0f, 17.55f, 0.0f, 17.0f)
                curveTo(0.0f, 16.45f, 0.448f, 16.0f, 1.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _cashFast!!
    }

private var _cashFast: ImageVector? = null
