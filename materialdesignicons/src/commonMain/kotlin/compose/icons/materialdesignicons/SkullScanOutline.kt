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

public val MaterialDesignIcons.SkullScanOutline: ImageVector
    get() {
        if (_skullScanOutline != null) {
            return _skullScanOutline!!
        }
        _skullScanOutline = Builder(name = "SkullScanOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                curveTo(0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.0f)
                moveTo(18.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(2.0f)
                curveTo(24.0f, 0.9f, 23.1f, 0.0f, 22.0f, 0.0f)
                horizontalLineTo(18.0f)
                moveTo(9.5f, 13.0f)
                curveTo(8.7f, 13.0f, 8.0f, 12.3f, 8.0f, 11.5f)
                reflectiveCurveTo(8.7f, 10.0f, 9.5f, 10.0f)
                reflectiveCurveTo(11.0f, 10.7f, 11.0f, 11.5f)
                reflectiveCurveTo(10.3f, 13.0f, 9.5f, 13.0f)
                moveTo(11.0f, 15.0f)
                lineTo(12.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                moveTo(14.5f, 13.0f)
                curveTo(13.7f, 13.0f, 13.0f, 12.3f, 13.0f, 11.5f)
                reflectiveCurveTo(13.7f, 10.0f, 14.5f, 10.0f)
                reflectiveCurveTo(16.0f, 10.7f, 16.0f, 11.5f)
                reflectiveCurveTo(15.3f, 13.0f, 14.5f, 13.0f)
                moveTo(0.0f, 18.0f)
                verticalLineTo(22.0f)
                curveTo(0.0f, 23.1f, 0.9f, 24.0f, 2.0f, 24.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(0.0f)
                moveTo(22.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1f, 24.0f, 24.0f, 23.1f, 24.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                moveTo(12.0f, 3.0f)
                curveTo(7.6f, 3.0f, 4.0f, 6.6f, 4.0f, 11.0f)
                curveTo(4.0f, 13.0f, 4.8f, 14.9f, 6.0f, 16.3f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.3f)
                curveTo(19.2f, 14.9f, 20.0f, 13.1f, 20.0f, 11.0f)
                curveTo(20.0f, 6.6f, 16.4f, 3.0f, 12.0f, 3.0f)
                moveTo(16.0f, 15.4f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.4f)
                curveTo(6.8f, 14.3f, 6.0f, 12.7f, 6.0f, 11.0f)
                curveTo(6.0f, 7.7f, 8.7f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(18.0f, 7.7f, 18.0f, 11.0f)
                curveTo(18.0f, 12.8f, 17.2f, 14.3f, 16.0f, 15.4f)
                close()
            }
        }
        .build()
        return _skullScanOutline!!
    }

private var _skullScanOutline: ImageVector? = null
