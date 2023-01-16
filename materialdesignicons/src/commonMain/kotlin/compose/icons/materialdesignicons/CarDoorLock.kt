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

public val MaterialDesignIcons.CarDoorLock: ImageVector
    get() {
        if (_carDoorLock != null) {
            return _carDoorLock!!
        }
        _carDoorLock = Builder(name = "CarDoorLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(7.8f, 14.1f, 6.4f, 13.0f, 5.0f, 13.0f)
                reflectiveCurveTo(2.2f, 14.1f, 2.2f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(1.6f, 17.0f, 1.0f, 17.6f, 1.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(1.0f, 22.4f, 1.6f, 23.0f, 2.2f, 23.0f)
                horizontalLineTo(7.7f)
                curveTo(8.4f, 23.0f, 9.0f, 22.4f, 9.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(9.0f, 17.6f, 8.4f, 17.0f, 7.8f, 17.0f)
                moveTo(6.5f, 17.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.5f)
                curveTo(3.5f, 14.7f, 4.2f, 14.2f, 5.0f, 14.2f)
                reflectiveCurveTo(6.5f, 14.7f, 6.5f, 15.5f)
                verticalLineTo(17.0f)
                moveTo(21.0f, 3.0f)
                horizontalLineTo(11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineTo(11.44f)
                curveTo(3.61f, 11.17f, 4.29f, 11.0f, 5.0f, 11.0f)
                curveTo(7.6f, 11.0f, 9.8f, 13.06f, 9.8f, 15.5f)
                verticalLineTo(15.75f)
                curveTo(10.53f, 16.36f, 11.0f, 17.28f, 11.0f, 18.3f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.45f, 21.55f, 3.0f, 21.0f, 3.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(5.83f)
                lineTo(11.83f, 5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _carDoorLock!!
    }

private var _carDoorLock: ImageVector? = null
