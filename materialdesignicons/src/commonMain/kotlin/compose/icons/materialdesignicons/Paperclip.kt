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

public val MaterialDesignIcons.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 6.0f)
                verticalLineTo(17.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.5f, 21.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.5f, 17.5f)
                verticalLineTo(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 5.0f)
                verticalLineTo(15.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.5f, 15.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 15.5f)
                verticalLineTo(5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 1.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 5.0f)
                verticalLineTo(17.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 12.5f, 23.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 18.0f, 17.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.5f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
