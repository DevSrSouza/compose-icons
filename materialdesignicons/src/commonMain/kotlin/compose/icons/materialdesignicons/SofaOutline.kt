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

public val MaterialDesignIcons.SofaOutline: ImageVector
    get() {
        if (_sofaOutline != null) {
            return _sofaOutline!!
        }
        _sofaOutline = Builder(name = "SofaOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.35f, 19.65f, 4.0f, 18.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(13.23f, 4.0f, 12.53f, 4.3f, 12.0f, 4.78f)
                curveTo(11.47f, 4.3f, 10.77f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(4.35f, 4.0f, 3.0f, 5.35f, 3.0f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(1.35f, 9.0f, 0.0f, 10.35f, 0.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(0.0f, 18.65f, 1.35f, 20.0f, 3.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                curveTo(22.65f, 20.0f, 24.0f, 18.65f, 24.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(24.0f, 10.35f, 22.65f, 9.0f, 21.0f, 9.0f)
                moveTo(14.0f, 6.0f)
                horizontalLineTo(18.0f)
                curveTo(18.55f, 6.0f, 19.0f, 6.45f, 19.0f, 7.0f)
                verticalLineTo(9.78f)
                curveTo(18.39f, 10.33f, 18.0f, 11.12f, 18.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.45f, 13.45f, 6.0f, 14.0f, 6.0f)
                moveTo(5.0f, 7.0f)
                curveTo(5.0f, 6.45f, 5.45f, 6.0f, 6.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(10.55f, 6.0f, 11.0f, 6.45f, 11.0f, 7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                curveTo(6.0f, 11.12f, 5.61f, 10.33f, 5.0f, 9.78f)
                verticalLineTo(7.0f)
                moveTo(22.0f, 17.0f)
                curveTo(22.0f, 17.55f, 21.55f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 18.0f, 2.0f, 17.55f, 2.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 11.45f, 2.45f, 11.0f, 3.0f, 11.0f)
                reflectiveCurveTo(4.0f, 11.45f, 4.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 11.45f, 20.45f, 11.0f, 21.0f, 11.0f)
                reflectiveCurveTo(22.0f, 11.45f, 22.0f, 12.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _sofaOutline!!
    }

private var _sofaOutline: ImageVector? = null
