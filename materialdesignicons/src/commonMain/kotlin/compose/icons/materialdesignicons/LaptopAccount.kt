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

public val MaterialDesignIcons.LaptopAccount: ImageVector
    get() {
        if (_laptopAccount != null) {
            return _laptopAccount!!
        }
        _laptopAccount = Builder(name = "LaptopAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                curveTo(21.1f, 4.0f, 22.0f, 4.89f, 22.0f, 6.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.11f, 21.11f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 18.0f, 2.0f, 17.11f, 2.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(12.0f, 12.0f)
                curveTo(14.21f, 12.0f, 16.0f, 12.9f, 16.0f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                curveTo(8.0f, 12.9f, 9.79f, 12.0f, 12.0f, 12.0f)
                moveTo(12.0f, 7.0f)
                curveTo(13.11f, 7.0f, 14.0f, 7.9f, 14.0f, 9.0f)
                reflectiveCurveTo(13.11f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(10.0f, 10.11f, 10.0f, 9.0f)
                reflectiveCurveTo(10.9f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _laptopAccount!!
    }

private var _laptopAccount: ImageVector? = null