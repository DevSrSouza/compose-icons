package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.OrderPlayFill: ImageVector
    get() {
        if (_orderPlayFill != null) {
            return _orderPlayFill!!
        }
        _orderPlayFill = Builder(name = "OrderPlayFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 2.068f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.82f, -0.385f)
                lineToRelative(4.12f, 3.433f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.321f, 0.884f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(2.0f, 18.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _orderPlayFill!!
    }

private var _orderPlayFill: ImageVector? = null
