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

public val MaterialDesignIcons.ClipboardPulseOutline: ImageVector
    get() {
        if (_clipboardPulseOutline != null) {
            return _clipboardPulseOutline!!
        }
        _clipboardPulseOutline = Builder(name = "ClipboardPulseOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f)
                curveTo(10.7f, 1.0f, 9.6f, 1.84f, 9.18f, 3.0f)
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
                moveTo(5.0f, 15.0f)
                horizontalLineTo(8.11f)
                lineTo(9.62f, 12.15f)
                lineTo(10.38f, 17.92f)
                lineTo(14.07f, 13.21f)
                lineTo(15.89f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                moveTo(19.0f, 13.46f)
                horizontalLineTo(16.53f)
                lineTo(13.93f, 10.86f)
                lineTo(11.44f, 14.05f)
                lineTo(10.5f, 7.08f)
                lineTo(7.17f, 13.46f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                lineTo(19.0f, 13.46f)
                close()
            }
        }
        .build()
        return _clipboardPulseOutline!!
    }

private var _clipboardPulseOutline: ImageVector? = null
