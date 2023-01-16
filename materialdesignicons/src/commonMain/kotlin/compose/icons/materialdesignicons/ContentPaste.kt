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

public val MaterialDesignIcons.ContentPaste: ImageVector
    get() {
        if (_contentPaste != null) {
            return _contentPaste!!
        }
        _contentPaste = Builder(name = "ContentPaste", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(19.0f, 2.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 0.84f, 13.3f, 0.0f, 12.0f, 0.0f)
                curveTo(10.7f, 0.0f, 9.6f, 0.84f, 9.18f, 2.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 2.0f)
                close()
            }
        }
        .build()
        return _contentPaste!!
    }

private var _contentPaste: ImageVector? = null
