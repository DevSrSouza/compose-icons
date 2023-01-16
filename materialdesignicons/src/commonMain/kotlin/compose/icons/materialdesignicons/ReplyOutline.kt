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

public val MaterialDesignIcons.ReplyOutline: ImageVector
    get() {
        if (_replyOutline != null) {
            return _replyOutline!!
        }
        _replyOutline = Builder(name = "ReplyOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.8f)
                verticalLineTo(10.7f)
                lineTo(9.7f, 11.0f)
                curveTo(12.3f, 11.4f, 14.2f, 12.4f, 15.6f, 13.7f)
                curveTo(13.9f, 13.2f, 12.1f, 12.9f, 10.0f, 12.9f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.2f)
                lineTo(5.8f, 12.0f)
                lineTo(8.0f, 9.8f)
                moveTo(10.0f, 5.0f)
                lineTo(3.0f, 12.0f)
                lineTo(10.0f, 19.0f)
                verticalLineTo(14.9f)
                curveTo(15.0f, 14.9f, 18.5f, 16.5f, 21.0f, 20.0f)
                curveTo(20.0f, 15.0f, 17.0f, 10.0f, 10.0f, 9.0f)
            }
        }
        .build()
        return _replyOutline!!
    }

private var _replyOutline: ImageVector? = null
