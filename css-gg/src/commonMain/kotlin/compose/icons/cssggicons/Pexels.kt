package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Pexels: ImageVector
    get() {
        if (_pexels != null) {
            return _pexels!!
        }
        _pexels = Builder(name = "Pexels", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.0f)
                curveTo(12.7111f, 5.0f, 13.3875f, 5.1484f, 14.0f, 5.416f)
                curveTo(15.7659f, 6.1876f, 17.0f, 7.9497f, 17.0f, 10.0f)
                curveTo(17.0f, 12.0503f, 15.7659f, 13.8124f, 14.0f, 14.584f)
                curveTo(13.3875f, 14.8516f, 12.7111f, 15.0f, 12.0f, 15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                lineTo(12.0032f, 12.9988f)
                curveTo(13.6427f, 13.0303f, 15.0746f, 11.6934f, 15.0443f, 9.9547f)
                lineTo(15.0375f, 9.5653f)
                curveTo(15.0121f, 8.1018f, 13.7882f, 6.9455f, 12.3257f, 7.003f)
                lineTo(12.0203f, 7.0076f)
                lineTo(12.0f, 7.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _pexels!!
    }

private var _pexels: ImageVector? = null
