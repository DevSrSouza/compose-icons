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

public val MaterialDesignIcons.RadiologyBoxOutline: ImageVector
    get() {
        if (_radiologyBoxOutline != null) {
            return _radiologyBoxOutline!!
        }
        _radiologyBoxOutline = Builder(name = "RadiologyBoxOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(12.0f, 6.0f)
                curveTo(12.55f, 6.0f, 13.0f, 6.45f, 13.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.17f)
                curveTo(16.35f, 8.31f, 16.5f, 8.65f, 16.66f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.1f, 10.33f, 17.17f, 10.67f, 17.19f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.2f)
                curveTo(17.16f, 12.35f, 17.15f, 12.69f, 17.1f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 14.0f, 16.94f, 17.0f, 15.5f, 17.0f)
                curveTo(14.15f, 17.0f, 14.5f, 15.47f, 13.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 17.55f, 12.55f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(11.0f, 17.55f, 11.0f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(9.5f, 15.47f, 9.85f, 17.0f, 8.5f, 17.0f)
                curveTo(7.06f, 17.0f, 7.0f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.9f)
                curveTo(6.85f, 12.69f, 6.84f, 12.35f, 6.8f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.81f)
                curveTo(6.83f, 10.67f, 6.91f, 10.33f, 7.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.34f)
                curveTo(7.5f, 8.65f, 7.65f, 8.31f, 7.83f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 6.45f, 11.45f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _radiologyBoxOutline!!
    }

private var _radiologyBoxOutline: ImageVector? = null
