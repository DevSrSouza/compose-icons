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

public val MaterialDesignIcons.ClipboardTextMultipleOutline: ImageVector
    get() {
        if (_clipboardTextMultipleOutline != null) {
            return _clipboardTextMultipleOutline!!
        }
        _clipboardTextMultipleOutline = Builder(name = "ClipboardTextMultipleOutline", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 23.0f, 2.0f, 22.1f, 2.0f, 21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                moveTo(20.0f, 3.0f)
                curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.1f, 21.1f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 19.0f, 6.0f, 18.1f, 6.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 3.9f, 6.9f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(11.18f)
                curveTo(11.6f, 1.84f, 12.7f, 1.0f, 14.0f, 1.0f)
                curveTo(15.3f, 1.0f, 16.4f, 1.84f, 16.82f, 3.0f)
                horizontalLineTo(20.0f)
                moveTo(14.0f, 3.0f)
                curveTo(13.45f, 3.0f, 13.0f, 3.45f, 13.0f, 4.0f)
                curveTo(13.0f, 4.55f, 13.45f, 5.0f, 14.0f, 5.0f)
                curveTo(14.55f, 5.0f, 15.0f, 4.55f, 15.0f, 4.0f)
                curveTo(15.0f, 3.45f, 14.55f, 3.0f, 14.0f, 3.0f)
                moveTo(10.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                moveTo(15.0f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _clipboardTextMultipleOutline!!
    }

private var _clipboardTextMultipleOutline: ImageVector? = null
