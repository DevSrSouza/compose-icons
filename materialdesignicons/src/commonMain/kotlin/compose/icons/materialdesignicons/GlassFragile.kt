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

public val MaterialDesignIcons.GlassFragile: ImageVector
    get() {
        if (_glassFragile != null) {
            return _glassFragile!!
        }
        _glassFragile = Builder(name = "GlassFragile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.97f)
                curveTo(8.19f, 13.7f, 6.0f, 11.34f, 6.0f, 8.46f)
                curveTo(6.0f, 8.15f, 6.03f, 7.85f, 6.08f, 7.55f)
                lineTo(7.0f, 2.0f)
                horizontalLineTo(13.54f)
                lineTo(12.33f, 4.41f)
                lineTo(11.79f, 5.5f)
                horizontalLineTo(13.79f)
                lineTo(12.33f, 8.41f)
                lineTo(11.79f, 9.5f)
                horizontalLineTo(14.0f)
                lineTo(13.0f, 12.75f)
                lineTo(15.67f, 9.09f)
                lineTo(16.46f, 8.0f)
                horizontalLineTo(14.21f)
                lineTo(15.67f, 5.09f)
                lineTo(16.21f, 4.0f)
                horizontalLineTo(14.21f)
                lineTo(15.21f, 2.0f)
                horizontalLineTo(17.0f)
                lineTo(17.93f, 7.55f)
                curveTo(18.0f, 7.85f, 18.0f, 8.15f, 18.0f, 8.46f)
                curveTo(18.0f, 11.34f, 15.81f, 13.7f, 13.0f, 13.97f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _glassFragile!!
    }

private var _glassFragile: ImageVector? = null
