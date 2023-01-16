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

public val MaterialDesignIcons.HandBackRightOff: ImageVector
    get() {
        if (_handBackRightOff != null) {
            return _handBackRightOff!!
        }
        _handBackRightOff = Builder(name = "HandBackRightOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(19.17f, 21.06f)
                curveTo(17.7f, 22.85f, 15.5f, 24.0f, 13.0f, 24.0f)
                curveTo(9.74f, 24.0f, 6.81f, 22.0f, 5.6f, 19.0f)
                lineTo(2.57f, 11.37f)
                curveTo(2.26f, 10.58f, 3.0f, 9.79f, 3.81f, 10.05f)
                lineTo(4.6f, 10.31f)
                curveTo(5.16f, 10.5f, 5.62f, 10.92f, 5.84f, 11.47f)
                lineTo(7.25f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(14.0f, 1.25f)
                curveTo(14.0f, 0.56f, 13.44f, 0.0f, 12.75f, 0.0f)
                reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f)
                verticalLineTo(8.3f)
                lineTo(14.0f, 10.8f)
                verticalLineTo(1.25f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 5.06f, 20.44f, 4.5f, 19.75f, 4.5f)
                reflectiveCurveTo(18.5f, 5.06f, 18.5f, 5.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(2.75f)
                curveTo(17.5f, 2.06f, 16.94f, 1.5f, 16.25f, 1.5f)
                reflectiveCurveTo(15.0f, 2.06f, 15.0f, 2.75f)
                verticalLineTo(11.8f)
                lineTo(20.83f, 17.63f)
                curveTo(20.94f, 17.11f, 21.0f, 16.56f, 21.0f, 16.0f)
                moveTo(10.5f, 3.25f)
                curveTo(10.5f, 2.56f, 9.94f, 2.0f, 9.25f, 2.0f)
                reflectiveCurveTo(8.0f, 2.56f, 8.0f, 3.25f)
                verticalLineTo(4.8f)
                lineTo(10.5f, 7.3f)
                verticalLineTo(3.25f)
                close()
            }
        }
        .build()
        return _handBackRightOff!!
    }

private var _handBackRightOff: ImageVector? = null
