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

public val MaterialDesignIcons.CarBrakeFluidLevel: ImageVector
    get() {
        if (_carBrakeFluidLevel != null) {
            return _carBrakeFluidLevel!!
        }
        _carBrakeFluidLevel = Builder(name = "CarBrakeFluidLevel", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 12.0f)
                curveTo(1.5f, 14.9f, 2.68f, 17.5f, 4.58f, 19.42f)
                lineTo(3.5f, 20.5f)
                curveTo(1.34f, 18.31f, 0.0f, 15.31f, 0.0f, 12.0f)
                reflectiveCurveTo(1.34f, 5.69f, 3.5f, 3.5f)
                lineTo(4.58f, 4.58f)
                curveTo(2.68f, 6.5f, 1.5f, 9.11f, 1.5f, 12.0f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.97f, 16.97f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveTo(3.0f, 16.97f, 3.0f, 12.0f)
                reflectiveCurveTo(7.03f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(21.0f, 7.03f, 21.0f, 12.0f)
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 12.44f, 5.05f, 12.86f, 5.12f, 13.28f)
                curveTo(5.3f, 13.09f, 5.46f, 13.0f, 5.78f, 13.0f)
                curveTo(6.3f, 13.0f, 6.39f, 13.21f, 6.78f, 13.71f)
                curveTo(7.17f, 14.21f, 7.85f, 15.0f, 8.89f, 15.0f)
                curveTo(9.92f, 15.0f, 10.61f, 14.21f, 11.0f, 13.71f)
                curveTo(11.26f, 13.37f, 11.39f, 13.18f, 11.61f, 13.08f)
                curveTo(11.71f, 13.03f, 11.83f, 13.0f, 12.0f, 13.0f)
                curveTo(12.5f, 13.0f, 12.61f, 13.21f, 13.0f, 13.71f)
                curveTo(13.39f, 14.21f, 14.08f, 15.0f, 15.11f, 15.0f)
                curveTo(16.15f, 15.0f, 16.83f, 14.21f, 17.22f, 13.71f)
                curveTo(17.61f, 13.21f, 17.7f, 13.0f, 18.22f, 13.0f)
                curveTo(18.54f, 13.0f, 18.7f, 13.09f, 18.88f, 13.28f)
                curveTo(18.95f, 12.86f, 19.0f, 12.44f, 19.0f, 12.0f)
                curveTo(19.0f, 8.14f, 15.86f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(5.0f, 8.14f, 5.0f, 12.0f)
                moveTo(20.5f, 3.5f)
                lineTo(19.42f, 4.58f)
                curveTo(21.32f, 6.5f, 22.5f, 9.11f, 22.5f, 12.0f)
                curveTo(22.5f, 14.9f, 21.32f, 17.5f, 19.42f, 19.42f)
                lineTo(20.5f, 20.5f)
                curveTo(22.66f, 18.31f, 24.0f, 15.31f, 24.0f, 12.0f)
                reflectiveCurveTo(22.66f, 5.69f, 20.5f, 3.5f)
                close()
            }
        }
        .build()
        return _carBrakeFluidLevel!!
    }

private var _carBrakeFluidLevel: ImageVector? = null
