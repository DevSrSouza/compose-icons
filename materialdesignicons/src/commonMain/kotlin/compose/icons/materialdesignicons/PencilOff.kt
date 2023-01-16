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

public val MaterialDesignIcons.PencilOff: ImageVector
    get() {
        if (_pencilOff != null) {
            return _pencilOff!!
        }
        _pencilOff = Builder(name = "PencilOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.66f, 2.0f)
                curveTo(18.4f, 2.0f, 18.16f, 2.09f, 17.97f, 2.28f)
                lineTo(16.13f, 4.13f)
                lineTo(19.88f, 7.88f)
                lineTo(21.72f, 6.03f)
                curveTo(22.11f, 5.64f, 22.11f, 5.0f, 21.72f, 4.63f)
                lineTo(19.38f, 2.28f)
                curveTo(19.18f, 2.09f, 18.91f, 2.0f, 18.66f, 2.0f)
                moveTo(3.28f, 4.0f)
                lineTo(2.0f, 5.28f)
                lineTo(8.5f, 11.75f)
                lineTo(4.0f, 16.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.75f)
                lineTo(12.25f, 15.5f)
                lineTo(18.72f, 22.0f)
                lineTo(20.0f, 20.72f)
                lineTo(13.5f, 14.25f)
                lineTo(9.75f, 10.5f)
                lineTo(3.28f, 4.0f)
                moveTo(15.06f, 5.19f)
                lineTo(11.03f, 9.22f)
                lineTo(14.78f, 12.97f)
                lineTo(18.81f, 8.94f)
                lineTo(15.06f, 5.19f)
                close()
            }
        }
        .build()
        return _pencilOff!!
    }

private var _pencilOff: ImageVector? = null
