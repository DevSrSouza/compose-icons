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

public val MaterialDesignIcons.Yahoo: ImageVector
    get() {
        if (_yahoo != null) {
            return _yahoo!!
        }
        _yahoo = Builder(name = "Yahoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.59f)
                lineTo(8.16f, 13.2f)
                lineTo(5.85f, 7.59f)
                horizontalLineTo(2.0f)
                lineTo(6.29f, 17.23f)
                lineTo(4.75f, 20.7f)
                horizontalLineTo(8.5f)
                lineTo(14.24f, 7.59f)
                horizontalLineTo(10.5f)
                moveTo(15.0f, 12.73f)
                curveTo(13.63f, 12.73f, 12.59f, 13.77f, 12.59f, 15.0f)
                curveTo(12.59f, 16.17f, 13.59f, 17.16f, 14.93f, 17.16f)
                curveTo(16.32f, 17.16f, 17.36f, 16.13f, 17.36f, 14.9f)
                curveTo(17.36f, 13.69f, 16.36f, 12.73f, 15.0f, 12.73f)
                moveTo(17.72f, 3.3f)
                lineTo(13.89f, 11.89f)
                horizontalLineTo(18.17f)
                lineTo(22.0f, 3.3f)
                horizontalLineTo(17.72f)
                close()
            }
        }
        .build()
        return _yahoo!!
    }

private var _yahoo: ImageVector? = null
