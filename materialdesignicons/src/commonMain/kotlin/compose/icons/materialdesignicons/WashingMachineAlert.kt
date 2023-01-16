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

public val MaterialDesignIcons.WashingMachineAlert: ImageVector
    get() {
        if (_washingMachineAlert != null) {
            return _washingMachineAlert!!
        }
        _washingMachineAlert = Builder(name = "WashingMachineAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.83f, 11.17f)
                curveTo(14.39f, 12.73f, 14.39f, 15.27f, 12.83f, 16.83f)
                reflectiveCurveTo(8.73f, 18.39f, 7.17f, 16.83f)
                lineTo(12.83f, 11.17f)
                moveTo(4.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 2.0f, 18.0f, 2.9f, 18.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.11f, 17.11f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                moveTo(5.0f, 4.0f)
                curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f)
                reflectiveCurveTo(4.45f, 6.0f, 5.0f, 6.0f)
                reflectiveCurveTo(6.0f, 5.55f, 6.0f, 5.0f)
                reflectiveCurveTo(5.55f, 4.0f, 5.0f, 4.0f)
                moveTo(8.0f, 4.0f)
                curveTo(7.45f, 4.0f, 7.0f, 4.45f, 7.0f, 5.0f)
                reflectiveCurveTo(7.45f, 6.0f, 8.0f, 6.0f)
                reflectiveCurveTo(9.0f, 5.55f, 9.0f, 5.0f)
                reflectiveCurveTo(8.55f, 4.0f, 8.0f, 4.0f)
                moveTo(10.0f, 8.0f)
                curveTo(6.69f, 8.0f, 4.0f, 10.69f, 4.0f, 14.0f)
                reflectiveCurveTo(6.69f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(16.0f, 17.31f, 16.0f, 14.0f)
                reflectiveCurveTo(13.31f, 8.0f, 10.0f, 8.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                moveTo(20.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _washingMachineAlert!!
    }

private var _washingMachineAlert: ImageVector? = null
