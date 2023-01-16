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

public val MaterialDesignIcons.BeehiveOutline: ImageVector
    get() {
        if (_beehiveOutline != null) {
            return _beehiveOutline!!
        }
        _beehiveOutline = Builder(name = "BeehiveOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 14.5f)
                curveTo(23.0f, 12.94f, 21.97f, 11.63f, 20.55f, 11.18f)
                curveTo(20.83f, 10.68f, 21.0f, 10.11f, 21.0f, 9.5f)
                curveTo(21.0f, 7.94f, 19.97f, 6.63f, 18.55f, 6.18f)
                curveTo(18.83f, 5.68f, 19.0f, 5.11f, 19.0f, 4.5f)
                curveTo(19.0f, 2.57f, 17.43f, 1.0f, 15.5f, 1.0f)
                horizontalLineTo(8.5f)
                curveTo(6.57f, 1.0f, 5.0f, 2.57f, 5.0f, 4.5f)
                curveTo(5.0f, 5.11f, 5.17f, 5.68f, 5.45f, 6.18f)
                curveTo(4.04f, 6.63f, 3.0f, 7.94f, 3.0f, 9.5f)
                curveTo(3.0f, 10.11f, 3.17f, 10.68f, 3.45f, 11.18f)
                curveTo(2.04f, 11.63f, 1.0f, 12.94f, 1.0f, 14.5f)
                curveTo(1.0f, 15.76f, 1.67f, 16.84f, 2.67f, 17.46f)
                curveTo(2.25f, 18.03f, 2.0f, 18.74f, 2.0f, 19.5f)
                curveTo(2.0f, 21.43f, 3.57f, 23.0f, 5.5f, 23.0f)
                horizontalLineTo(18.5f)
                curveTo(20.43f, 23.0f, 22.0f, 21.43f, 22.0f, 19.5f)
                curveTo(22.0f, 18.74f, 21.75f, 18.03f, 21.33f, 17.46f)
                curveTo(22.33f, 16.84f, 23.0f, 15.76f, 23.0f, 14.5f)
                moveTo(8.5f, 3.0f)
                horizontalLineTo(15.5f)
                curveTo(16.33f, 3.0f, 17.0f, 3.67f, 17.0f, 4.5f)
                reflectiveCurveTo(16.33f, 6.0f, 15.5f, 6.0f)
                horizontalLineTo(8.5f)
                curveTo(7.67f, 6.0f, 7.0f, 5.33f, 7.0f, 4.5f)
                reflectiveCurveTo(7.67f, 3.0f, 8.5f, 3.0f)
                moveTo(6.5f, 8.0f)
                horizontalLineTo(17.5f)
                curveTo(18.33f, 8.0f, 19.0f, 8.67f, 19.0f, 9.5f)
                reflectiveCurveTo(18.33f, 11.0f, 17.5f, 11.0f)
                horizontalLineTo(6.5f)
                curveTo(5.67f, 11.0f, 5.0f, 10.33f, 5.0f, 9.5f)
                reflectiveCurveTo(5.67f, 8.0f, 6.5f, 8.0f)
                moveTo(4.0f, 19.5f)
                curveTo(4.0f, 18.67f, 4.67f, 18.0f, 5.5f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 21.0f, 4.0f, 20.33f, 4.0f, 19.5f)
                moveTo(18.5f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.5f)
                curveTo(19.33f, 18.0f, 20.0f, 18.67f, 20.0f, 19.5f)
                reflectiveCurveTo(19.33f, 21.0f, 18.5f, 21.0f)
                moveTo(19.5f, 16.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 14.84f, 13.3f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(9.6f, 14.84f, 9.18f, 16.0f)
                horizontalLineTo(4.5f)
                curveTo(3.67f, 16.0f, 3.0f, 15.33f, 3.0f, 14.5f)
                reflectiveCurveTo(3.67f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(19.5f)
                curveTo(20.33f, 13.0f, 21.0f, 13.67f, 21.0f, 14.5f)
                reflectiveCurveTo(20.33f, 16.0f, 19.5f, 16.0f)
                close()
            }
        }
        .build()
        return _beehiveOutline!!
    }

private var _beehiveOutline: ImageVector? = null
