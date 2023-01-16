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

public val MaterialDesignIcons.SafeSquare: ImageVector
    get() {
        if (_safeSquare != null) {
            return _safeSquare!!
        }
        _safeSquare = Builder(name = "SafeSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(21.1f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.1f, 21.1f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 11.0f, 16.7f, 10.0f, 16.2f, 9.2f)
                lineTo(17.7f, 7.7f)
                lineTo(16.3f, 6.3f)
                lineTo(14.8f, 7.8f)
                curveTo(14.0f, 7.3f, 13.0f, 7.0f, 12.0f, 7.0f)
                curveTo(11.0f, 7.0f, 10.0f, 7.3f, 9.2f, 7.8f)
                lineTo(7.8f, 6.3f)
                lineTo(6.3f, 7.8f)
                lineTo(7.8f, 9.3f)
                curveTo(7.3f, 10.0f, 7.0f, 11.0f, 7.0f, 12.0f)
                curveTo(7.0f, 13.0f, 7.3f, 14.0f, 7.8f, 14.8f)
                lineTo(6.3f, 16.3f)
                lineTo(7.8f, 17.7f)
                lineTo(9.3f, 16.2f)
                curveTo(10.0f, 16.7f, 11.0f, 17.0f, 12.0f, 17.0f)
                curveTo(13.0f, 17.0f, 14.0f, 16.7f, 14.8f, 16.2f)
                lineTo(16.3f, 17.7f)
                lineTo(17.7f, 16.3f)
                lineTo(16.2f, 14.8f)
                curveTo(16.7f, 14.0f, 17.0f, 13.0f, 17.0f, 12.0f)
                moveTo(12.0f, 9.0f)
                curveTo(13.7f, 9.0f, 15.0f, 10.3f, 15.0f, 12.0f)
                curveTo(15.0f, 13.7f, 13.7f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3f, 15.0f, 9.0f, 13.7f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3f, 10.3f, 9.0f, 12.0f, 9.0f)
                moveTo(12.0f, 14.0f)
                curveTo(13.1f, 14.0f, 14.0f, 13.1f, 14.0f, 12.0f)
                curveTo(14.0f, 10.9f, 13.1f, 10.0f, 12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1f, 10.9f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _safeSquare!!
    }

private var _safeSquare: ImageVector? = null
