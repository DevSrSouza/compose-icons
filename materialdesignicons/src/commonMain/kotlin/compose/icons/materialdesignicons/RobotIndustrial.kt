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

public val MaterialDesignIcons.RobotIndustrial: ImageVector
    get() {
        if (_robotIndustrial != null) {
            return _robotIndustrial!!
        }
        _robotIndustrial = Builder(name = "RobotIndustrial", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.41f, 4.0f)
                lineTo(16.0f, 6.41f)
                verticalLineTo(6.59f)
                lineTo(18.41f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.59f)
                lineTo(16.0f, 9.41f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 10.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.86f)
                curveTo(9.77f, 7.87f, 9.62f, 8.22f, 9.42f, 8.55f)
                lineTo(15.18f, 19.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 19.0f)
                horizontalLineTo(10.61f)
                lineTo(5.92f, 10.5f)
                curveTo(4.12f, 10.47f, 2.56f, 9.24f, 2.11f, 7.5f)
                curveTo(1.56f, 5.36f, 2.85f, 3.18f, 5.0f, 2.63f)
                curveTo(7.13f, 2.08f, 9.31f, 3.36f, 9.86f, 5.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.59f)
                lineTo(17.59f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.41f)
                moveTo(6.0f, 4.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 6.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 8.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 6.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 4.5f)
                close()
            }
        }
        .build()
        return _robotIndustrial!!
    }

private var _robotIndustrial: ImageVector? = null
