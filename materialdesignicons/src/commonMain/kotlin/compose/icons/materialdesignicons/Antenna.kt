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

public val MaterialDesignIcons.Antenna: ImageVector
    get() {
        if (_antenna != null) {
            return _antenna!!
        }
        _antenna = Builder(name = "Antenna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                curveTo(12.69f, 7.5f, 13.27f, 7.73f, 13.76f, 8.2f)
                reflectiveCurveTo(14.5f, 9.27f, 14.5f, 10.0f)
                curveTo(14.5f, 11.05f, 14.0f, 11.81f, 13.0f, 12.28f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.28f)
                curveTo(10.0f, 11.81f, 9.5f, 11.05f, 9.5f, 10.0f)
                curveTo(9.5f, 9.27f, 9.76f, 8.67f, 10.24f, 8.2f)
                reflectiveCurveTo(11.31f, 7.5f, 12.0f, 7.5f)
                moveTo(16.69f, 5.3f)
                curveTo(17.94f, 6.55f, 18.61f, 8.11f, 18.7f, 10.0f)
                curveTo(18.7f, 11.8f, 18.03f, 13.38f, 16.69f, 14.72f)
                lineTo(15.5f, 13.5f)
                curveTo(16.5f, 12.59f, 17.0f, 11.42f, 17.0f, 10.0f)
                curveTo(17.0f, 8.67f, 16.5f, 7.5f, 15.5f, 6.5f)
                lineTo(16.69f, 5.3f)
                moveTo(6.09f, 4.08f)
                curveTo(4.5f, 5.67f, 3.7f, 7.64f, 3.7f, 10.0f)
                reflectiveCurveTo(4.5f, 14.3f, 6.09f, 15.89f)
                lineTo(4.92f, 17.11f)
                curveTo(3.0f, 15.08f, 2.0f, 12.7f, 2.0f, 10.0f)
                curveTo(2.0f, 7.3f, 3.0f, 4.94f, 4.92f, 2.91f)
                lineTo(6.09f, 4.08f)
                moveTo(19.08f, 2.91f)
                curveTo(21.0f, 4.94f, 22.0f, 7.3f, 22.0f, 10.0f)
                curveTo(22.0f, 12.8f, 21.0f, 15.17f, 19.08f, 17.11f)
                lineTo(17.91f, 15.89f)
                curveTo(19.5f, 14.3f, 20.3f, 12.33f, 20.3f, 10.0f)
                reflectiveCurveTo(19.5f, 5.67f, 17.91f, 4.08f)
                lineTo(19.08f, 2.91f)
                moveTo(7.31f, 5.3f)
                lineTo(8.5f, 6.5f)
                curveTo(7.5f, 7.42f, 7.0f, 8.58f, 7.0f, 10.0f)
                curveTo(7.0f, 11.33f, 7.5f, 12.5f, 8.5f, 13.5f)
                lineTo(7.31f, 14.72f)
                curveTo(5.97f, 13.38f, 5.3f, 11.8f, 5.3f, 10.0f)
                curveTo(5.3f, 8.2f, 5.97f, 6.64f, 7.31f, 5.3f)
                close()
            }
        }
        .build()
        return _antenna!!
    }

private var _antenna: ImageVector? = null
