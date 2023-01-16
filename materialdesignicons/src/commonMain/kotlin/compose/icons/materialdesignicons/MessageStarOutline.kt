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

public val MaterialDesignIcons.MessageStarOutline: ImageVector
    get() {
        if (_messageStarOutline != null) {
            return _messageStarOutline!!
        }
        _messageStarOutline = Builder(name = "MessageStarOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 18.0f, 22.0f, 17.1f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(5.2f)
                lineTo(4.0f, 17.2f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                moveTo(12.0f, 12.4f)
                lineTo(14.6f, 14.0f)
                lineTo(13.9f, 11.0f)
                lineTo(16.2f, 9.0f)
                lineTo(13.2f, 8.7f)
                lineTo(12.0f, 6.0f)
                lineTo(10.8f, 8.8f)
                lineTo(7.8f, 9.0f)
                lineTo(10.1f, 11.0f)
                lineTo(9.4f, 14.0f)
                lineTo(12.0f, 12.4f)
                close()
            }
        }
        .build()
        return _messageStarOutline!!
    }

private var _messageStarOutline: ImageVector? = null
