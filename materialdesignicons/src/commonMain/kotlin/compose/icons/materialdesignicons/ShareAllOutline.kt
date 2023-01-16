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

public val MaterialDesignIcons.ShareAllOutline: ImageVector
    get() {
        if (_shareAllOutline != null) {
            return _shareAllOutline!!
        }
        _shareAllOutline = Builder(name = "ShareAllOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.8f)
                verticalLineTo(10.7f)
                lineTo(11.3f, 10.9f)
                curveTo(8.7f, 11.3f, 6.8f, 12.3f, 5.4f, 13.6f)
                curveTo(7.1f, 13.1f, 8.9f, 12.8f, 11.0f, 12.8f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.1f)
                lineTo(15.2f, 12.0f)
                lineTo(13.0f, 9.8f)
                moveTo(11.0f, 5.0f)
                lineTo(18.0f, 12.0f)
                lineTo(11.0f, 19.0f)
                verticalLineTo(14.9f)
                curveTo(6.0f, 14.9f, 2.5f, 16.5f, 0.0f, 20.0f)
                curveTo(1.0f, 15.0f, 4.0f, 10.0f, 11.0f, 9.0f)
                moveTo(17.0f, 8.0f)
                verticalLineTo(5.0f)
                lineTo(24.0f, 12.0f)
                lineTo(17.0f, 19.0f)
                verticalLineTo(16.0f)
                lineTo(21.0f, 12.0f)
            }
        }
        .build()
        return _shareAllOutline!!
    }

private var _shareAllOutline: ImageVector? = null
