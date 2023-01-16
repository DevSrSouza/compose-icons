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

public val MaterialDesignIcons.EmailMarkAsUnread: ImageVector
    get() {
        if (_emailMarkAsUnread != null) {
            return _emailMarkAsUnread!!
        }
        _emailMarkAsUnread = Builder(name = "EmailMarkAsUnread", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.84f, 7.0f)
                horizontalLineTo(16.22f)
                lineTo(10.5f, 4.0f)
                lineTo(4.0f, 7.41f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 15.0f)
                verticalLineTo(7.17f)
                curveTo(2.0f, 6.5f, 2.28f, 6.06f, 2.81f, 5.81f)
                lineTo(10.5f, 2.0f)
                lineTo(18.05f, 5.81f)
                curveTo(18.5f, 6.09f, 18.78f, 6.5f, 18.84f, 7.0f)
                moveTo(7.0f, 8.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 10.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 19.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 8.0f)
                moveTo(20.0f, 11.67f)
                verticalLineTo(10.0f)
                lineTo(13.5f, 13.31f)
                lineTo(7.0f, 10.0f)
                verticalLineTo(11.67f)
                lineTo(13.5f, 15.0f)
                lineTo(20.0f, 11.67f)
                close()
            }
        }
        .build()
        return _emailMarkAsUnread!!
    }

private var _emailMarkAsUnread: ImageVector? = null
