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

public val MaterialDesignIcons.LockPercentOpenOutline: ImageVector
    get() {
        if (_lockPercentOpenOutline != null) {
            return _lockPercentOpenOutline!!
        }
        _lockPercentOpenOutline = Builder(name = "LockPercentOpenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 11.0f)
                curveTo(10.3f, 11.0f, 11.0f, 11.7f, 11.0f, 12.5f)
                reflectiveCurveTo(10.3f, 14.0f, 9.5f, 14.0f)
                reflectiveCurveTo(8.0f, 13.3f, 8.0f, 12.5f)
                reflectiveCurveTo(8.7f, 11.0f, 9.5f, 11.0f)
                moveTo(14.5f, 19.0f)
                curveTo(13.7f, 19.0f, 13.0f, 18.3f, 13.0f, 17.5f)
                reflectiveCurveTo(13.7f, 16.0f, 14.5f, 16.0f)
                reflectiveCurveTo(16.0f, 16.7f, 16.0f, 17.5f)
                reflectiveCurveTo(15.3f, 19.0f, 14.5f, 19.0f)
                moveTo(9.2f, 19.2f)
                lineTo(7.8f, 17.8f)
                lineTo(14.9f, 10.7f)
                lineTo(16.3f, 12.1f)
                lineTo(9.2f, 19.2f)
                moveTo(18.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 3.2f, 14.8f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(7.0f, 3.2f, 7.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 4.3f, 10.3f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(15.0f, 4.3f, 15.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 8.0f, 4.0f, 8.9f, 4.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 8.9f, 19.1f, 8.0f, 18.0f, 8.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _lockPercentOpenOutline!!
    }

private var _lockPercentOpenOutline: ImageVector? = null
