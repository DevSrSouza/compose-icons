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

public val MaterialDesignIcons.InboxMultipleOutline: ImageVector
    get() {
        if (_inboxMultipleOutline != null) {
            return _inboxMultipleOutline!!
        }
        _inboxMultipleOutline = Builder(name = "InboxMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 14.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 12.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(5.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.4f)
                curveTo(8.8f, 11.47f, 8.34f, 10.78f, 8.13f, 10.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.87f)
                curveTo(15.66f, 10.78f, 15.2f, 11.47f, 14.6f, 12.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                curveTo(10.0f, 10.07f, 10.93f, 11.0f, 12.0f, 11.0f)
                curveTo(13.07f, 11.0f, 14.0f, 10.07f, 14.0f, 9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                moveTo(21.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                curveTo(10.0f, 17.07f, 10.93f, 18.0f, 12.0f, 18.0f)
                curveTo(13.07f, 18.0f, 14.0f, 17.07f, 14.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                moveTo(5.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.4f)
                curveTo(8.8f, 18.47f, 8.34f, 17.78f, 8.13f, 17.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.87f)
                curveTo(15.66f, 17.78f, 15.2f, 18.47f, 14.6f, 19.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _inboxMultipleOutline!!
    }

private var _inboxMultipleOutline: ImageVector? = null
