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

public val MaterialDesignIcons.Koala: ImageVector
    get() {
        if (_koala != null) {
            return _koala!!
        }
        _koala = Builder(name = "Koala", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(18.1f, 3.0f, 15.5f, 3.0f, 14.3f, 6.1f)
                curveTo(13.9f, 6.0f, 13.4f, 6.0f, 13.0f, 6.0f)
                horizontalLineTo(11.0f)
                curveTo(10.6f, 6.0f, 10.1f, 6.0f, 9.7f, 6.1f)
                curveTo(8.5f, 3.0f, 5.9f, 3.0f, 5.0f, 3.0f)
                curveTo(4.0f, 3.0f, 1.0f, 4.0f, 1.0f, 9.0f)
                curveTo(1.0f, 12.6f, 3.5f, 13.6f, 5.0f, 13.9f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 18.3f, 7.7f, 21.0f, 11.0f, 21.0f)
                horizontalLineTo(13.0f)
                curveTo(16.3f, 21.0f, 19.0f, 18.3f, 19.0f, 15.0f)
                verticalLineTo(13.9f)
                curveTo(20.5f, 13.6f, 23.0f, 12.6f, 23.0f, 9.0f)
                curveTo(23.0f, 4.0f, 20.0f, 3.0f, 19.0f, 3.0f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(12.4f)
                curveTo(2.9f, 11.8f, 3.3f, 9.5f, 4.3f, 8.7f)
                curveTo(4.0f, 8.3f, 3.0f, 9.0f, 3.0f, 8.6f)
                curveTo(3.0f, 8.1f, 4.8f, 7.4f, 5.1f, 7.3f)
                curveTo(4.8f, 6.8f, 3.6f, 7.0f, 3.6f, 6.6f)
                curveTo(3.6f, 6.3f, 4.8f, 5.8f, 5.8f, 6.0f)
                curveTo(6.3f, 6.1f, 6.9f, 6.3f, 7.4f, 6.7f)
                curveTo(6.0f, 8.0f, 5.0f, 9.8f, 5.0f, 12.0f)
                moveTo(8.5f, 15.0f)
                curveTo(6.5f, 15.0f, 6.5f, 12.0f, 8.5f, 12.0f)
                curveTo(10.5f, 12.0f, 10.5f, 15.0f, 8.5f, 15.0f)
                moveTo(12.5f, 18.0f)
                horizontalLineTo(11.5f)
                curveTo(10.8f, 18.0f, 10.3f, 17.3f, 10.6f, 16.7f)
                lineTo(11.3f, 13.7f)
                curveTo(11.4f, 13.3f, 11.8f, 13.1f, 12.1f, 13.0f)
                curveTo(12.4f, 13.0f, 12.7f, 13.2f, 12.9f, 13.7f)
                lineTo(13.6f, 16.7f)
                curveTo(13.7f, 17.3f, 13.2f, 18.0f, 12.5f, 18.0f)
                moveTo(15.5f, 15.0f)
                curveTo(13.5f, 15.0f, 13.5f, 12.0f, 15.5f, 12.0f)
                curveTo(17.5f, 12.0f, 17.5f, 15.0f, 15.5f, 15.0f)
                moveTo(19.7f, 8.6f)
                curveTo(20.7f, 9.4f, 21.1f, 11.7f, 19.0f, 12.3f)
                curveTo(19.1f, 10.1f, 18.1f, 8.0f, 16.6f, 6.7f)
                curveTo(17.1f, 6.3f, 17.7f, 6.1f, 18.2f, 6.0f)
                curveTo(19.2f, 5.8f, 20.4f, 6.2f, 20.4f, 6.6f)
                curveTo(20.4f, 7.0f, 19.2f, 6.8f, 18.9f, 7.2f)
                curveTo(19.2f, 7.4f, 21.0f, 8.1f, 21.0f, 8.6f)
                curveTo(21.0f, 9.0f, 20.1f, 8.3f, 19.7f, 8.6f)
                close()
            }
        }
        .build()
        return _koala!!
    }

private var _koala: ImageVector? = null
