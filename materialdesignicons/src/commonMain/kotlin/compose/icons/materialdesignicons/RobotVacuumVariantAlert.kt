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

public val MaterialDesignIcons.RobotVacuumVariantAlert: ImageVector
    get() {
        if (_robotVacuumVariantAlert != null) {
            return _robotVacuumVariantAlert!!
        }
        _robotVacuumVariantAlert = Builder(name = "RobotVacuumVariantAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.9f, 18.1f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(3.0f)
                moveTo(6.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                moveTo(1.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 17.0f, 5.0f, 21.0f, 10.0f, 21.0f)
                reflectiveCurveTo(19.0f, 17.0f, 19.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 15.9f, 13.9f, 19.0f, 10.0f, 19.0f)
                reflectiveCurveTo(3.0f, 15.9f, 3.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(1.0f)
                moveTo(10.0f, 12.0f)
                curveTo(8.6f, 12.0f, 7.5f, 13.1f, 7.5f, 14.5f)
                reflectiveCurveTo(8.6f, 17.0f, 10.0f, 17.0f)
                reflectiveCurveTo(12.5f, 15.9f, 12.5f, 14.5f)
                reflectiveCurveTo(11.4f, 12.0f, 10.0f, 12.0f)
                moveTo(21.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _robotVacuumVariantAlert!!
    }

private var _robotVacuumVariantAlert: ImageVector? = null
