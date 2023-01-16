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

public val MaterialDesignIcons.TrainCarAutorack: ImageVector
    get() {
        if (_trainCarAutorack != null) {
            return _trainCarAutorack!!
        }
        _trainCarAutorack = Builder(name = "TrainCarAutorack", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 6.0f, 1.0f, 6.9f, 1.0f, 8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 18.11f, 2.9f, 19.0f, 4.0f, 19.0f)
                reflectiveCurveTo(6.0f, 18.11f, 6.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 18.11f, 18.9f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(22.0f, 18.11f, 22.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(8.0f)
                curveTo(23.0f, 6.9f, 22.11f, 6.0f, 21.0f, 6.0f)
                moveTo(7.58f, 12.18f)
                curveTo(8.19f, 12.18f, 8.68f, 12.68f, 8.68f, 13.29f)
                reflectiveCurveTo(8.19f, 14.39f, 7.58f, 14.39f)
                curveTo(6.97f, 14.39f, 6.47f, 13.9f, 6.47f, 13.29f)
                reflectiveCurveTo(6.97f, 12.18f, 7.58f, 12.18f)
                moveTo(7.03f, 11.08f)
                lineTo(8.68f, 9.61f)
                horizontalLineTo(11.63f)
                lineTo(14.58f, 11.08f)
                horizontalLineTo(7.03f)
                moveTo(9.66f, 14.03f)
                horizontalLineTo(14.34f)
                curveTo(14.5f, 14.42f, 14.74f, 14.75f, 15.05f, 15.0f)
                horizontalLineTo(8.95f)
                curveTo(9.26f, 14.75f, 9.5f, 14.42f, 9.66f, 14.03f)
                moveTo(15.32f, 13.29f)
                curveTo(15.32f, 12.68f, 15.81f, 12.18f, 16.42f, 12.18f)
                curveTo(17.03f, 12.18f, 17.53f, 12.68f, 17.53f, 13.29f)
                reflectiveCurveTo(17.03f, 14.39f, 16.42f, 14.39f)
                curveTo(15.81f, 14.4f, 15.32f, 13.9f, 15.32f, 13.29f)
                moveTo(17.79f, 15.0f)
                curveTo(18.11f, 14.75f, 18.36f, 14.42f, 18.5f, 14.03f)
                horizontalLineTo(20.11f)
                verticalLineTo(13.29f)
                curveTo(20.11f, 12.47f, 19.35f, 12.21f, 18.63f, 11.82f)
                lineTo(12.0f, 8.5f)
                horizontalLineTo(8.32f)
                lineTo(6.11f, 10.34f)
                horizontalLineTo(5.37f)
                curveTo(4.55f, 10.34f, 3.89f, 11.0f, 3.89f, 11.82f)
                verticalLineTo(14.03f)
                horizontalLineTo(5.5f)
                curveTo(5.64f, 14.42f, 5.89f, 14.75f, 6.21f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.79f)
                close()
            }
        }
        .build()
        return _trainCarAutorack!!
    }

private var _trainCarAutorack: ImageVector? = null
