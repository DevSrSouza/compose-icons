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

public val MaterialDesignIcons.AirplaneSearch: ImageVector
    get() {
        if (_airplaneSearch != null) {
            return _airplaneSearch!!
        }
        _airplaneSearch = Builder(name = "AirplaneSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.55f, 9.63f)
                lineTo(10.9f, 12.22f)
                curveTo(11.5f, 11.17f, 12.41f, 10.31f, 13.5f, 9.74f)
                lineTo(12.73f, 6.45f)
                lineTo(16.62f, 2.56f)
                curveTo(17.2f, 1.97f, 17.2f, 1.0f, 16.62f, 0.438f)
                reflectiveCurveTo(15.08f, -0.148f, 14.5f, 0.438f)
                lineTo(10.61f, 4.33f)
                lineTo(1.41f, 2.21f)
                lineTo(0.0f, 3.62f)
                lineTo(7.43f, 7.5f)
                lineTo(3.54f, 11.4f)
                lineTo(1.06f, 11.05f)
                lineTo(0.0f, 12.11f)
                lineTo(3.18f, 13.87f)
                lineTo(4.95f, 17.06f)
                lineTo(6.0f, 16.0f)
                lineTo(5.66f, 13.5f)
                lineTo(9.55f, 9.63f)
                moveTo(16.5f, 11.0f)
                curveTo(19.0f, 11.0f, 21.0f, 13.0f, 21.0f, 15.5f)
                curveTo(21.0f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21.0f)
                lineTo(22.0f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20.0f, 16.5f, 20.0f)
                curveTo(14.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 11.0f, 16.5f, 11.0f)
                moveTo(16.5f, 13.0f)
                curveTo(15.12f, 13.0f, 14.0f, 14.12f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 18.0f, 16.5f, 18.0f)
                reflectiveCurveTo(19.0f, 16.88f, 19.0f, 15.5f)
                reflectiveCurveTo(17.88f, 13.0f, 16.5f, 13.0f)
            }
        }
        .build()
        return _airplaneSearch!!
    }

private var _airplaneSearch: ImageVector? = null
