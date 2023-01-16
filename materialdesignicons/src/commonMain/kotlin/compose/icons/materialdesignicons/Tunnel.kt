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

public val MaterialDesignIcons.Tunnel: ImageVector
    get() {
        if (_tunnel != null) {
            return _tunnel!!
        }
        _tunnel = Builder(name = "Tunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(7.1f, 5.69f)
                curveTo(8.21f, 4.83f, 9.54f, 4.25f, 11.0f, 4.07f)
                verticalLineTo(6.09f)
                curveTo(10.09f, 6.24f, 9.25f, 6.6f, 8.53f, 7.11f)
                lineTo(7.1f, 5.69f)
                moveTo(15.47f, 7.11f)
                curveTo(14.75f, 6.6f, 13.91f, 6.24f, 13.0f, 6.09f)
                verticalLineTo(4.07f)
                curveTo(14.46f, 4.25f, 15.79f, 4.83f, 16.9f, 5.69f)
                lineTo(15.47f, 7.11f)
                moveTo(5.69f, 7.1f)
                lineTo(7.11f, 8.53f)
                curveTo(6.6f, 9.25f, 6.24f, 10.09f, 6.09f, 11.0f)
                horizontalLineTo(4.07f)
                curveTo(4.25f, 9.54f, 4.83f, 8.21f, 5.69f, 7.1f)
                moveTo(6.0f, 13.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                moveTo(4.0f, 20.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                moveTo(16.89f, 8.53f)
                lineTo(18.31f, 7.1f)
                curveTo(19.17f, 8.21f, 19.75f, 9.54f, 19.93f, 11.0f)
                horizontalLineTo(17.91f)
                curveTo(17.76f, 10.09f, 17.4f, 9.25f, 16.89f, 8.53f)
                moveTo(18.0f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                moveTo(18.0f, 20.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _tunnel!!
    }

private var _tunnel: ImageVector? = null
