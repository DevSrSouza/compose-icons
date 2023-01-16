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

public val MaterialDesignIcons.ClipboardPlay: ImageVector
    get() {
        if (_clipboardPlay != null) {
            return _clipboardPlay!!
        }
        _clipboardPlay = Builder(name = "ClipboardPlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(14.82f)
                curveTo(14.25f, 1.44f, 12.53f, 0.64f, 11.0f, 1.2f)
                curveTo(10.14f, 1.5f, 9.5f, 2.16f, 9.18f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                moveTo(12.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(10.0f, 17.0f)
                verticalLineTo(9.0f)
                lineTo(15.0f, 13.0f)
                lineTo(10.0f, 17.0f)
                close()
            }
        }
        .build()
        return _clipboardPlay!!
    }

private var _clipboardPlay: ImageVector? = null
