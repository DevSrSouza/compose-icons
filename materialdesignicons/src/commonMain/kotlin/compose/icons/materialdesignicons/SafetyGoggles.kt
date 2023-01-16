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

public val MaterialDesignIcons.SafetyGoggles: ImageVector
    get() {
        if (_safetyGoggles != null) {
            return _safetyGoggles!!
        }
        _safetyGoggles = Builder(name = "SafetyGoggles", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                curveTo(19.11f, 9.0f, 20.0f, 9.89f, 20.0f, 11.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 15.11f, 19.11f, 16.0f, 18.0f, 16.0f)
                horizontalLineTo(15.77f)
                lineTo(14.53f, 14.77f)
                curveTo(13.78f, 14.0f, 12.77f, 13.6f, 11.7f, 13.6f)
                curveTo(10.63f, 13.6f, 9.63f, 14.0f, 8.87f, 14.77f)
                lineTo(7.64f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 16.0f, 4.0f, 15.11f, 4.0f, 14.0f)
                verticalLineTo(11.0f)
                curveTo(4.0f, 9.89f, 4.89f, 9.0f, 6.0f, 9.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.0f, 11.0f)
                horizontalLineTo(2.0f)
                lineTo(1.0f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 18.0f)
                horizontalLineTo(8.5f)
                curveTo(8.54f, 17.94f, 8.59f, 17.88f, 10.29f, 16.18f)
                curveTo(10.68f, 15.79f, 11.19f, 15.6f, 11.7f, 15.6f)
                curveTo(12.22f, 15.6f, 12.73f, 15.79f, 13.12f, 16.18f)
                lineTo(14.91f, 18.0f)
                horizontalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 22.0f, 14.0f)
                horizontalLineTo(22.0f)
                lineTo(23.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _safetyGoggles!!
    }

private var _safetyGoggles: ImageVector? = null
