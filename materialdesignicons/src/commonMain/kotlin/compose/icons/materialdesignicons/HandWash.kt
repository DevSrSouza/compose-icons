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

public val MaterialDesignIcons.HandWash: ImageVector
    get() {
        if (_handWash != null) {
            return _handWash!!
        }
        _handWash = Builder(name = "HandWash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineTo(17.62f, 6.37f)
                lineTo(19.0f, 7.0f)
                lineTo(17.62f, 7.63f)
                lineTo(17.0f, 9.0f)
                lineTo(16.36f, 7.63f)
                lineTo(15.0f, 7.0f)
                lineTo(16.36f, 6.37f)
                lineTo(17.0f, 5.0f)
                moveTo(11.0f, 6.13f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                curveTo(13.57f, 4.0f, 14.1f, 4.17f, 14.55f, 4.45f)
                lineTo(16.0f, 3.0f)
                curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.14f)
                curveTo(7.23f, 6.5f, 5.81f, 7.8f, 5.26f, 9.5f)
                horizontalLineTo(9.24f)
                lineTo(15.0f, 11.65f)
                verticalLineTo(11.03f)
                curveTo(15.0f, 8.61f, 13.28f, 6.59f, 11.0f, 6.13f)
                moveTo(1.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(22.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(10.91f, 16.27f)
                lineTo(11.24f, 15.33f)
                lineTo(13.0f, 16.0f)
                horizontalLineTo(15.82f)
                curveTo(16.47f, 16.0f, 17.0f, 15.47f, 17.0f, 14.82f)
                curveTo(17.0f, 14.33f, 16.69f, 13.89f, 16.23f, 13.71f)
                lineTo(8.97f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                lineTo(14.0f, 22.0f)
                lineTo(22.0f, 19.0f)
                curveTo(22.0f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f)
                moveTo(20.0f, 14.0f)
                curveTo(21.1f, 14.0f, 22.0f, 13.1f, 22.0f, 12.0f)
                reflectiveCurveTo(20.0f, 8.0f, 20.0f, 8.0f)
                reflectiveCurveTo(18.0f, 10.9f, 18.0f, 12.0f)
                reflectiveCurveTo(18.9f, 14.0f, 20.0f, 14.0f)
                close()
            }
        }
        .build()
        return _handWash!!
    }

private var _handWash: ImageVector? = null
