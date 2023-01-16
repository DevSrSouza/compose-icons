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

public val MaterialDesignIcons.ClipboardAccountOutline: ImageVector
    get() {
        if (_clipboardAccountOutline != null) {
            return _clipboardAccountOutline!!
        }
        _clipboardAccountOutline = Builder(name = "ClipboardAccountOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 1.84f, 10.7f, 1.0f, 12.0f, 1.0f)
                curveTo(13.3f, 1.0f, 14.4f, 1.84f, 14.82f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(7.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                moveTo(12.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(8.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(8.0f, 14.9f, 9.79f, 14.0f, 12.0f, 14.0f)
                curveTo(14.21f, 14.0f, 16.0f, 14.9f, 16.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _clipboardAccountOutline!!
    }

private var _clipboardAccountOutline: ImageVector? = null
