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

public val MaterialDesignIcons.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = Builder(name = "Attachment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 18.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 2.0f, 12.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 7.5f, 7.0f)
                horizontalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 15.0f)
                horizontalLineTo(9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.0f, 12.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.5f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.5f, 13.5f)
                horizontalLineTo(18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 8.5f)
                horizontalLineTo(7.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.5f, 12.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.5f, 16.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null
