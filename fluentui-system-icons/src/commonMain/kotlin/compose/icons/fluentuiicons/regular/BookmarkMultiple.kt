package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.BookmarkMultiple: ImageVector
    get() {
        if (_bookmarkMultiple != null) {
            return _bookmarkMultiple!!
        }
        _bookmarkMultiple = Builder(name = "BookmarkMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.7481f)
                curveTo(4.0f, 5.5054f, 5.0074f, 4.4979f, 6.2501f, 4.4979f)
                horizontalLineTo(15.2506f)
                curveTo(16.4933f, 4.4979f, 17.5008f, 5.5054f, 17.5008f, 6.7481f)
                verticalLineTo(21.2499f)
                curveTo(17.5008f, 21.5185f, 17.3572f, 21.7666f, 17.1243f, 21.9003f)
                curveTo(16.8914f, 22.0341f, 16.6048f, 22.0332f, 16.3728f, 21.8978f)
                lineTo(10.7504f, 18.6179f)
                lineTo(5.128f, 21.8978f)
                curveTo(4.896f, 22.0332f, 4.6094f, 22.0341f, 4.3765f, 21.9003f)
                curveTo(4.1436f, 21.7666f, 4.0f, 21.5185f, 4.0f, 21.2499f)
                verticalLineTo(6.7481f)
                close()
                moveTo(6.2501f, 5.9981f)
                curveTo(5.8359f, 5.9981f, 5.5001f, 6.3339f, 5.5001f, 6.7481f)
                verticalLineTo(19.944f)
                lineTo(10.3725f, 17.1016f)
                curveTo(10.606f, 16.9653f, 10.8948f, 16.9653f, 11.1283f, 17.1016f)
                lineTo(16.0007f, 19.944f)
                verticalLineTo(6.7481f)
                curveTo(16.0007f, 6.3339f, 15.6649f, 5.9981f, 15.2506f, 5.9981f)
                horizontalLineTo(6.2501f)
                close()
                moveTo(15.2497f, 2.0f)
                curveTo(17.8732f, 2.0f, 20.0f, 4.1269f, 20.0f, 6.7506f)
                verticalLineTo(18.6232f)
                curveTo(20.0f, 19.0374f, 19.6642f, 19.3733f, 19.25f, 19.3733f)
                curveTo(18.8357f, 19.3733f, 18.4999f, 19.0374f, 18.4999f, 18.6232f)
                verticalLineTo(6.7506f)
                curveTo(18.4999f, 4.9554f, 17.0448f, 3.5002f, 15.2497f, 3.5002f)
                horizontalLineTo(6.6369f)
                curveTo(6.6369f, 3.5002f, 6.7502f, 2.9434f, 7.4338f, 2.4195f)
                curveTo(8.0002f, 2.0f, 8.6018f, 2.0f, 8.6018f, 2.0f)
                horizontalLineTo(15.2497f)
                close()
            }
        }
        .build()
        return _bookmarkMultiple!!
    }

private var _bookmarkMultiple: ImageVector? = null
