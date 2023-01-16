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

public val MaterialDesignIcons.InboxArrowDownOutline: ImageVector
    get() {
        if (_inboxArrowDownOutline != null) {
            return _inboxArrowDownOutline!!
        }
        _inboxArrowDownOutline = Builder(name = "InboxArrowDownOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.13f)
                arcTo(4.13f, 4.13f, 0.0f, false, false, 9.4f, 19.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(14.6f)
                arcTo(4.13f, 4.13f, 0.0f, false, false, 15.87f, 17.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 14.0f)
            }
        }
        .build()
        return _inboxArrowDownOutline!!
    }

private var _inboxArrowDownOutline: ImageVector? = null
