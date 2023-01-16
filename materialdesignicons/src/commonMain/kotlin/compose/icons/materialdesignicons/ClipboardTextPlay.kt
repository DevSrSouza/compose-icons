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

public val MaterialDesignIcons.ClipboardTextPlay: ImageVector
    get() {
        if (_clipboardTextPlay != null) {
            return _clipboardTextPlay!!
        }
        _clipboardTextPlay = Builder(name = "ClipboardTextPlay", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(13.34f)
                curveTo(20.36f, 13.11f, 19.68f, 13.0f, 19.0f, 13.0f)
                curveTo(15.68f, 13.0f, 13.0f, 15.69f, 13.0f, 19.0f)
                curveTo(13.0f, 19.68f, 13.11f, 20.36f, 13.34f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(9.18f)
                curveTo(9.5f, 2.16f, 10.14f, 1.5f, 11.0f, 1.2f)
                curveTo(12.53f, 0.64f, 14.25f, 1.44f, 14.82f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(11.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                moveTo(17.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 16.0f)
                lineTo(22.0f, 19.0f)
                lineTo(17.0f, 22.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _clipboardTextPlay!!
    }

private var _clipboardTextPlay: ImageVector? = null
