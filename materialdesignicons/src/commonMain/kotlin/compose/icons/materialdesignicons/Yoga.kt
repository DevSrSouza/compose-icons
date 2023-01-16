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

public val MaterialDesignIcons.Yoga: ImageVector
    get() {
        if (_yoga != null) {
            return _yoga!!
        }
        _yoga = Builder(name = "Yoga", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                curveTo(11.9f, 2.0f, 11.0f, 2.9f, 11.0f, 4.0f)
                curveTo(11.0f, 5.11f, 11.9f, 6.0f, 13.0f, 6.0f)
                curveTo(14.11f, 6.0f, 15.0f, 5.11f, 15.0f, 4.0f)
                curveTo(15.0f, 2.9f, 14.11f, 2.0f, 13.0f, 2.0f)
                moveTo(4.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                lineTo(4.93f, 20.07f)
                lineTo(6.34f, 21.5f)
                lineTo(13.06f, 14.77f)
                lineTo(17.0f, 17.13f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.57f)
                curveTo(19.0f, 16.21f, 18.82f, 15.89f, 18.5f, 15.71f)
                lineTo(15.0f, 13.6f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _yoga!!
    }

private var _yoga: ImageVector? = null
