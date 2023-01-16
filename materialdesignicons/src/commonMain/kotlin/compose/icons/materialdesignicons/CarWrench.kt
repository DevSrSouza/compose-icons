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

public val MaterialDesignIcons.CarWrench: ImageVector
    get() {
        if (_carWrench != null) {
            return _carWrench!!
        }
        _carWrench = Builder(name = "CarWrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.96f, 16.45f)
                curveTo(20.97f, 16.3f, 21.0f, 16.15f, 21.0f, 16.0f)
                verticalLineTo(16.5f)
                lineTo(20.96f, 16.45f)
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 16.71f, 11.15f, 17.39f, 11.42f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                curveTo(6.0f, 19.55f, 5.55f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 20.0f, 3.0f, 19.55f, 3.0f, 19.0f)
                verticalLineTo(11.0f)
                lineTo(5.08f, 5.0f)
                curveTo(5.28f, 4.42f, 5.84f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(17.5f)
                curveTo(18.16f, 4.0f, 18.72f, 4.42f, 18.92f, 5.0f)
                lineTo(21.0f, 11.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(11.0f, 13.24f, 11.0f, 16.0f)
                moveTo(8.0f, 13.5f)
                curveTo(8.0f, 12.67f, 7.33f, 12.0f, 6.5f, 12.0f)
                reflectiveCurveTo(5.0f, 12.67f, 5.0f, 13.5f)
                reflectiveCurveTo(5.67f, 15.0f, 6.5f, 15.0f)
                reflectiveCurveTo(8.0f, 14.33f, 8.0f, 13.5f)
                moveTo(19.0f, 10.0f)
                lineTo(17.5f, 5.5f)
                horizontalLineTo(6.5f)
                lineTo(5.0f, 10.0f)
                horizontalLineTo(19.0f)
                moveTo(22.87f, 21.19f)
                lineTo(18.76f, 17.08f)
                curveTo(19.17f, 16.04f, 18.94f, 14.82f, 18.08f, 13.97f)
                curveTo(17.18f, 13.06f, 15.83f, 12.88f, 14.74f, 13.38f)
                lineTo(16.68f, 15.32f)
                lineTo(15.33f, 16.68f)
                lineTo(13.34f, 14.73f)
                curveTo(12.8f, 15.82f, 13.05f, 17.17f, 13.93f, 18.08f)
                curveTo(14.79f, 18.94f, 16.0f, 19.16f, 17.05f, 18.76f)
                lineTo(21.16f, 22.86f)
                curveTo(21.34f, 23.05f, 21.61f, 23.05f, 21.79f, 22.86f)
                lineTo(22.83f, 21.83f)
                curveTo(23.05f, 21.65f, 23.05f, 21.33f, 22.87f, 21.19f)
                close()
            }
        }
        .build()
        return _carWrench!!
    }

private var _carWrench: ImageVector? = null
