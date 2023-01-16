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

public val MaterialDesignIcons.MessageDraw: ImageVector
    get() {
        if (_messageDraw != null) {
            return _messageDraw!!
        }
        _messageDraw = Builder(name = "MessageDraw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                horizontalLineTo(10.5f)
                lineTo(12.5f, 12.0f)
                horizontalLineTo(18.0f)
                moveTo(6.0f, 14.0f)
                verticalLineTo(11.5f)
                lineTo(12.88f, 4.64f)
                curveTo(13.07f, 4.45f, 13.39f, 4.45f, 13.59f, 4.64f)
                lineTo(15.35f, 6.41f)
                curveTo(15.55f, 6.61f, 15.55f, 6.92f, 15.35f, 7.12f)
                lineTo(8.47f, 14.0f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
            }
        }
        .build()
        return _messageDraw!!
    }

private var _messageDraw: ImageVector? = null
