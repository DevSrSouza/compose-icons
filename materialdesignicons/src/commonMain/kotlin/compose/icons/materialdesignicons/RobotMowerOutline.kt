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

public val MaterialDesignIcons.RobotMowerOutline: ImageVector
    get() {
        if (_robotMowerOutline != null) {
            return _robotMowerOutline!!
        }
        _robotMowerOutline = Builder(name = "RobotMowerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 14.0f)
                curveTo(1.0f, 16.76f, 3.24f, 19.0f, 6.0f, 19.0f)
                curveTo(7.64f, 19.0f, 9.09f, 18.21f, 10.0f, 17.0f)
                horizontalLineTo(15.17f)
                curveTo(15.58f, 18.17f, 16.7f, 19.0f, 18.0f, 19.0f)
                curveTo(19.31f, 19.0f, 20.42f, 18.17f, 20.83f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 9.5f, 18.5f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(14.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(10.9f)
                curveTo(10.97f, 14.68f, 11.0f, 14.34f, 11.0f, 14.0f)
                curveTo(11.0f, 11.24f, 8.76f, 9.0f, 6.0f, 9.0f)
                curveTo(4.87f, 9.0f, 3.84f, 9.37f, 3.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                curveTo(15.1f, 7.0f, 17.42f, 8.16f, 19.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.25f)
                curveTo(20.67f, 12.92f, 20.92f, 13.94f, 21.0f, 15.0f)
                moveTo(6.0f, 11.0f)
                curveTo(7.66f, 11.0f, 9.0f, 12.34f, 9.0f, 14.0f)
                curveTo(9.0f, 15.66f, 7.66f, 17.0f, 6.0f, 17.0f)
                curveTo(4.34f, 17.0f, 3.0f, 15.66f, 3.0f, 14.0f)
                curveTo(3.0f, 12.34f, 4.34f, 11.0f, 6.0f, 11.0f)
                close()
            }
        }
        .build()
        return _robotMowerOutline!!
    }

private var _robotMowerOutline: ImageVector? = null
