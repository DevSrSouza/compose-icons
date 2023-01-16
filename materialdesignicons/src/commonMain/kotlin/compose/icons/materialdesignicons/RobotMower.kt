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

public val MaterialDesignIcons.RobotMower: ImageVector
    get() {
        if (_robotMower != null) {
            return _robotMower!!
        }
        _robotMower = Builder(name = "RobotMower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                curveTo(18.5f, 5.0f, 23.0f, 9.5f, 23.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.83f)
                curveTo(20.42f, 18.17f, 19.31f, 19.0f, 18.0f, 19.0f)
                curveTo(16.69f, 19.0f, 15.58f, 18.17f, 15.17f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(9.09f, 18.21f, 7.64f, 19.0f, 6.0f, 19.0f)
                curveTo(3.24f, 19.0f, 1.0f, 16.76f, 1.0f, 14.0f)
                moveTo(6.0f, 11.0f)
                curveTo(4.34f, 11.0f, 3.0f, 12.34f, 3.0f, 14.0f)
                curveTo(3.0f, 15.66f, 4.34f, 17.0f, 6.0f, 17.0f)
                curveTo(7.66f, 17.0f, 9.0f, 15.66f, 9.0f, 14.0f)
                curveTo(9.0f, 12.34f, 7.66f, 11.0f, 6.0f, 11.0f)
                moveTo(15.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.25f)
                curveTo(19.92f, 11.27f, 19.5f, 10.6f, 19.0f, 10.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _robotMower!!
    }

private var _robotMower: ImageVector? = null
