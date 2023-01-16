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

public val MaterialDesignIcons.RobotAngry: ImageVector
    get() {
        if (_robotAngry != null) {
            return _robotAngry!!
        }
        _robotAngry = Builder(name = "RobotAngry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(7.5f, 18.0f)
                curveTo(6.12f, 18.0f, 5.0f, 16.88f, 5.0f, 15.5f)
                curveTo(5.0f, 14.68f, 5.4f, 13.96f, 6.0f, 13.5f)
                lineTo(9.83f, 16.38f)
                curveTo(9.5f, 17.32f, 8.57f, 18.0f, 7.5f, 18.0f)
                moveTo(16.5f, 18.0f)
                curveTo(15.43f, 18.0f, 14.5f, 17.32f, 14.17f, 16.38f)
                lineTo(18.0f, 13.5f)
                curveTo(18.6f, 13.96f, 19.0f, 14.68f, 19.0f, 15.5f)
                curveTo(19.0f, 16.88f, 17.88f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return _robotAngry!!
    }

private var _robotAngry: ImageVector? = null
