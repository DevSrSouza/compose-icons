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

public val MaterialDesignIcons.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) {
            return _pencilCircle!!
        }
        _pencilCircle = Builder(name = "PencilCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f)
                curveTo(2.0f, 17.53f, 6.47f, 22.0f, 12.0f, 22.0f)
                curveTo(17.53f, 22.0f, 22.0f, 17.53f, 22.0f, 12.0f)
                curveTo(22.0f, 6.47f, 17.53f, 2.0f, 12.0f, 2.0f)
                moveTo(15.1f, 7.07f)
                curveTo(15.24f, 7.07f, 15.38f, 7.12f, 15.5f, 7.23f)
                lineTo(16.77f, 8.5f)
                curveTo(17.0f, 8.72f, 17.0f, 9.07f, 16.77f, 9.28f)
                lineTo(15.77f, 10.28f)
                lineTo(13.72f, 8.23f)
                lineTo(14.72f, 7.23f)
                curveTo(14.82f, 7.12f, 14.96f, 7.07f, 15.1f, 7.07f)
                moveTo(13.13f, 8.81f)
                lineTo(15.19f, 10.87f)
                lineTo(9.13f, 16.93f)
                horizontalLineTo(7.07f)
                verticalLineTo(14.87f)
                lineTo(13.13f, 8.81f)
                close()
            }
        }
        .build()
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
