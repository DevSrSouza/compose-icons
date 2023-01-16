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

public val MaterialDesignIcons.SofaSingleOutline: ImageVector
    get() {
        if (_sofaSingleOutline != null) {
            return _sofaSingleOutline!!
        }
        _sofaSingleOutline = Builder(name = "SofaSingleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.35f, 17.65f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(6.35f, 4.0f, 5.0f, 5.35f, 5.0f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(3.35f, 9.0f, 2.0f, 10.35f, 2.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.65f, 3.35f, 20.0f, 5.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                curveTo(20.65f, 20.0f, 22.0f, 18.65f, 22.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 10.35f, 20.65f, 9.0f, 19.0f, 9.0f)
                moveTo(7.0f, 7.0f)
                curveTo(7.0f, 6.45f, 7.45f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(16.55f, 6.0f, 17.0f, 6.45f, 17.0f, 7.0f)
                verticalLineTo(9.78f)
                curveTo(16.39f, 10.33f, 16.0f, 11.12f, 16.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                curveTo(8.0f, 11.12f, 7.61f, 10.33f, 7.0f, 9.78f)
                verticalLineTo(7.0f)
                moveTo(20.0f, 17.0f)
                curveTo(20.0f, 17.55f, 19.55f, 18.0f, 19.0f, 18.0f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 18.0f, 4.0f, 17.55f, 4.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 11.45f, 4.45f, 11.0f, 5.0f, 11.0f)
                reflectiveCurveTo(6.0f, 11.45f, 6.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                curveTo(18.0f, 11.45f, 18.45f, 11.0f, 19.0f, 11.0f)
                reflectiveCurveTo(20.0f, 11.45f, 20.0f, 12.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _sofaSingleOutline!!
    }

private var _sofaSingleOutline: ImageVector? = null
