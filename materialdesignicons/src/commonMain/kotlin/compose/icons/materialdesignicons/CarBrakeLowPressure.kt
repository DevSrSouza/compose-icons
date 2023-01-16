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

public val MaterialDesignIcons.CarBrakeLowPressure: ImageVector
    get() {
        if (_carBrakeLowPressure != null) {
            return _carBrakeLowPressure!!
        }
        _carBrakeLowPressure = Builder(name = "CarBrakeLowPressure", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(11.0f, 12.55f, 11.0f, 12.0f)
                reflectiveCurveTo(11.45f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(13.0f, 11.45f, 13.0f, 12.0f)
                moveTo(10.0f, 12.0f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                lineTo(10.0f, 12.0f)
                moveTo(14.0f, 12.0f)
                lineTo(17.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                lineTo(14.0f, 12.0f)
                moveTo(20.5f, 3.5f)
                lineTo(19.42f, 4.58f)
                curveTo(21.32f, 6.5f, 22.5f, 9.11f, 22.5f, 12.0f)
                curveTo(22.5f, 14.9f, 21.32f, 17.5f, 19.42f, 19.42f)
                lineTo(20.5f, 20.5f)
                curveTo(22.66f, 18.31f, 24.0f, 15.31f, 24.0f, 12.0f)
                reflectiveCurveTo(22.66f, 5.69f, 20.5f, 3.5f)
                moveTo(5.69f, 9.0f)
                curveTo(6.81f, 6.64f, 9.22f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(17.19f, 6.64f, 18.32f, 9.0f)
                horizontalLineTo(20.5f)
                curveTo(19.24f, 5.5f, 15.92f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.76f, 5.5f, 3.5f, 9.0f)
                horizontalLineTo(5.69f)
                moveTo(4.58f, 4.58f)
                lineTo(3.5f, 3.5f)
                curveTo(1.34f, 5.69f, 0.0f, 8.69f, 0.0f, 12.0f)
                reflectiveCurveTo(1.34f, 18.31f, 3.5f, 20.5f)
                lineTo(4.58f, 19.42f)
                curveTo(2.68f, 17.5f, 1.5f, 14.9f, 1.5f, 12.0f)
                curveTo(1.5f, 9.11f, 2.68f, 6.5f, 4.58f, 4.58f)
                moveTo(18.32f, 15.0f)
                curveTo(17.19f, 17.36f, 14.79f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(6.81f, 17.36f, 5.69f, 15.0f)
                horizontalLineTo(3.5f)
                curveTo(4.76f, 18.5f, 8.08f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveTo(19.24f, 18.5f, 20.5f, 15.0f)
                horizontalLineTo(18.32f)
                close()
            }
        }
        .build()
        return _carBrakeLowPressure!!
    }

private var _carBrakeLowPressure: ImageVector? = null
