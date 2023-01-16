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

public val MaterialDesignIcons.RobotLove: ImageVector
    get() {
        if (_robotLove != null) {
            return _robotLove!!
        }
        _robotLove = Builder(name = "RobotLove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 10.13f, 17.87f, 7.0f, 14.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.73f)
                curveTo(13.6f, 5.39f, 14.0f, 4.74f, 14.0f, 4.0f)
                curveTo(14.0f, 2.9f, 13.11f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(10.0f, 2.9f, 10.0f, 4.0f)
                curveTo(10.0f, 4.74f, 10.4f, 5.39f, 11.0f, 5.73f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                curveTo(6.13f, 7.0f, 3.0f, 10.13f, 3.0f, 14.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 14.0f, 1.0f, 14.45f, 1.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 18.55f, 1.45f, 19.0f, 2.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.11f, 3.9f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 22.0f, 21.0f, 21.11f, 21.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                curveTo(22.55f, 19.0f, 23.0f, 18.55f, 23.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 14.45f, 22.55f, 14.0f, 22.0f, 14.0f)
                moveTo(9.7f, 15.45f)
                lineTo(8.97f, 16.18f)
                lineTo(7.5f, 17.65f)
                lineTo(5.3f, 15.45f)
                curveTo(4.9f, 15.05f, 4.9f, 14.39f, 5.3f, 14.0f)
                curveTo(5.71f, 13.58f, 6.36f, 13.58f, 6.77f, 14.0f)
                lineTo(7.5f, 14.72f)
                lineTo(8.23f, 14.0f)
                curveTo(8.64f, 13.58f, 9.29f, 13.58f, 9.7f, 14.0f)
                curveTo(10.1f, 14.39f, 10.1f, 15.05f, 9.7f, 15.45f)
                moveTo(18.7f, 15.45f)
                lineTo(17.97f, 16.18f)
                lineTo(16.5f, 17.65f)
                lineTo(14.3f, 15.45f)
                curveTo(13.9f, 15.05f, 13.9f, 14.39f, 14.3f, 14.0f)
                curveTo(14.71f, 13.58f, 15.36f, 13.58f, 15.77f, 14.0f)
                lineTo(16.5f, 14.72f)
                lineTo(17.23f, 14.0f)
                curveTo(17.64f, 13.58f, 18.29f, 13.58f, 18.7f, 14.0f)
                curveTo(19.1f, 14.39f, 19.1f, 15.05f, 18.7f, 15.45f)
                close()
            }
        }
        .build()
        return _robotLove!!
    }

private var _robotLove: ImageVector? = null
