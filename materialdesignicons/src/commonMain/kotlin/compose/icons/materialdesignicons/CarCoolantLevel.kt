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

public val MaterialDesignIcons.CarCoolantLevel: ImageVector
    get() {
        if (_carCoolantLevel != null) {
            return _carCoolantLevel!!
        }
        _carCoolantLevel = Builder(name = "CarCoolantLevel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                moveTo(21.0f, 14.42f)
                curveTo(20.71f, 14.13f, 20.5f, 14.0f, 20.0f, 14.0f)
                curveTo(19.33f, 14.0f, 19.21f, 14.21f, 18.71f, 14.71f)
                reflectiveCurveTo(17.33f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveTo(13.79f, 15.21f, 13.29f, 14.71f)
                reflectiveCurveTo(12.67f, 14.0f, 12.0f, 14.0f)
                curveTo(11.78f, 14.0f, 11.63f, 14.03f, 11.5f, 14.08f)
                curveTo(11.22f, 14.18f, 11.05f, 14.37f, 10.71f, 14.71f)
                curveTo(10.21f, 15.21f, 9.33f, 16.0f, 8.0f, 16.0f)
                reflectiveCurveTo(5.79f, 15.21f, 5.29f, 14.71f)
                reflectiveCurveTo(4.67f, 14.0f, 4.0f, 14.0f)
                curveTo(3.5f, 14.0f, 3.29f, 14.13f, 3.0f, 14.42f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.42f)
                close()
            }
        }
        .build()
        return _carCoolantLevel!!
    }

private var _carCoolantLevel: ImageVector? = null
