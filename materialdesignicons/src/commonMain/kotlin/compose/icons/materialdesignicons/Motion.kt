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

public val MaterialDesignIcons.Motion: ImageVector
    get() {
        if (_motion != null) {
            return _motion!!
        }
        _motion = Builder(name = "Motion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 13.0f, 2.0f, 12.55f, 2.0f, 12.0f)
                reflectiveCurveTo(2.45f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(7.55f, 11.0f, 8.0f, 11.45f, 8.0f, 12.0f)
                reflectiveCurveTo(7.55f, 13.0f, 7.0f, 13.0f)
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 7.45f, 5.55f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 7.0f, 3.0f, 7.45f, 3.0f, 8.0f)
                reflectiveCurveTo(3.45f, 9.0f, 4.0f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(5.55f, 9.0f, 6.0f, 8.55f, 6.0f, 8.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 14.76f, 19.76f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 17.0f, 3.0f, 16.55f, 3.0f, 16.0f)
                reflectiveCurveTo(3.45f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(12.58f, 14.42f, 12.25f, 13.74f, 12.1f, 13.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 13.0f, 9.0f, 12.55f, 9.0f, 12.0f)
                reflectiveCurveTo(9.45f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(12.1f)
                curveTo(12.25f, 10.26f, 12.58f, 9.58f, 13.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 9.0f, 7.0f, 8.55f, 7.0f, 8.0f)
                reflectiveCurveTo(7.45f, 7.0f, 8.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(19.76f, 7.0f, 22.0f, 9.24f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _motion!!
    }

private var _motion: ImageVector? = null
