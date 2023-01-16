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

public val MaterialDesignIcons.SkullScan: ImageVector
    get() {
        if (_skullScan != null) {
            return _skullScan!!
        }
        _skullScan = Builder(name = "SkullScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 3.0f)
                curveTo(7.6f, 3.0f, 4.0f, 6.6f, 4.0f, 11.0f)
                curveTo(4.0f, 13.5f, 5.2f, 15.8f, 7.0f, 17.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.2f)
                curveTo(18.8f, 15.7f, 20.0f, 13.5f, 20.0f, 11.0f)
                curveTo(20.0f, 6.6f, 16.4f, 3.0f, 12.0f, 3.0f)
                moveTo(8.0f, 14.0f)
                curveTo(6.9f, 14.0f, 6.0f, 13.1f, 6.0f, 12.0f)
                reflectiveCurveTo(6.9f, 10.0f, 8.0f, 10.0f)
                reflectiveCurveTo(10.0f, 10.9f, 10.0f, 12.0f)
                reflectiveCurveTo(9.1f, 14.0f, 8.0f, 14.0f)
                moveTo(10.5f, 16.0f)
                lineTo(12.0f, 13.0f)
                lineTo(13.5f, 16.0f)
                horizontalLineTo(10.5f)
                moveTo(16.0f, 14.0f)
                curveTo(14.9f, 14.0f, 14.0f, 13.1f, 14.0f, 12.0f)
                reflectiveCurveTo(14.9f, 10.0f, 16.0f, 10.0f)
                reflectiveCurveTo(18.0f, 10.9f, 18.0f, 12.0f)
                reflectiveCurveTo(17.1f, 14.0f, 16.0f, 14.0f)
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
                close()
            }
        }
        .build()
        return _skullScan!!
    }

private var _skullScan: ImageVector? = null