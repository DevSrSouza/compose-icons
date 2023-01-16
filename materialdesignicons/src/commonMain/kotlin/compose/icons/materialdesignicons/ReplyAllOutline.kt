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

public val MaterialDesignIcons.ReplyAllOutline: ImageVector
    get() {
        if (_replyAllOutline != null) {
            return _replyAllOutline!!
        }
        _replyAllOutline = Builder(name = "ReplyAllOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.8f)
                verticalLineTo(10.7f)
                lineTo(12.7f, 10.9f)
                curveTo(15.3f, 11.3f, 17.2f, 12.3f, 18.6f, 13.6f)
                curveTo(16.9f, 13.1f, 15.1f, 12.8f, 13.0f, 12.8f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.1f)
                lineTo(8.8f, 12.0f)
                lineTo(11.0f, 9.8f)
                moveTo(13.0f, 5.0f)
                lineTo(6.0f, 12.0f)
                lineTo(13.0f, 19.0f)
                verticalLineTo(14.9f)
                curveTo(18.0f, 14.9f, 21.5f, 16.5f, 24.0f, 20.0f)
                curveTo(23.0f, 15.0f, 20.0f, 10.0f, 13.0f, 9.0f)
                moveTo(7.0f, 8.0f)
                verticalLineTo(5.0f)
                lineTo(0.0f, 12.0f)
                lineTo(7.0f, 19.0f)
                verticalLineTo(16.0f)
                lineTo(3.0f, 12.0f)
            }
        }
        .build()
        return _replyAllOutline!!
    }

private var _replyAllOutline: ImageVector? = null
