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

public val MaterialDesignIcons.Multimedia: ImageVector
    get() {
        if (_multimedia != null) {
            return _multimedia!!
        }
        _multimedia = Builder(name = "Multimedia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 3.9f, 9.9f, 3.0f, 11.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.57f)
                lineTo(17.29f, 9.26f)
                curveTo(17.23f, 9.17f, 17.11f, 9.17f, 17.05f, 9.26f)
                lineTo(15.06f, 12.0f)
                curveTo(15.0f, 12.06f, 14.88f, 12.07f, 14.82f, 12.0f)
                lineTo(13.39f, 10.25f)
                curveTo(13.33f, 10.18f, 13.22f, 10.18f, 13.16f, 10.25f)
                lineTo(11.05f, 12.91f)
                curveTo(10.97f, 13.0f, 11.04f, 13.15f, 11.16f, 13.15f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                curveTo(9.89f, 15.0f, 9.0f, 14.11f, 9.0f, 13.0f)
                moveTo(6.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.39f)
                curveTo(7.54f, 2.74f, 7.0f, 3.8f, 7.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.21f, 8.79f, 17.0f, 11.0f, 17.0f)
                horizontalLineTo(15.7f)
                curveTo(14.67f, 17.83f, 14.0f, 19.08f, 14.0f, 20.5f)
                curveTo(14.0f, 21.03f, 14.11f, 21.53f, 14.28f, 22.0f)
                horizontalLineTo(6.0f)
                moveTo(4.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                moveTo(4.0f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                moveTo(4.0f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                moveTo(6.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                moveTo(23.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.5f)
                curveTo(21.0f, 21.88f, 19.88f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(16.0f, 21.88f, 16.0f, 20.5f)
                reflectiveCurveTo(17.12f, 18.0f, 18.5f, 18.0f)
                curveTo(18.86f, 18.0f, 19.19f, 18.07f, 19.5f, 18.21f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _multimedia!!
    }

private var _multimedia: ImageVector? = null
