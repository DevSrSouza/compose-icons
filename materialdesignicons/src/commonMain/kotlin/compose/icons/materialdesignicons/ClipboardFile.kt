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

public val MaterialDesignIcons.ClipboardFile: ImageVector
    get() {
        if (_clipboardFile != null) {
            return _clipboardFile!!
        }
        _clipboardFile = Builder(name = "ClipboardFile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(9.17f)
                lineTo(19.83f, 8.0f)
                horizontalLineTo(15.0f)
                curveTo(12.79f, 8.0f, 11.0f, 9.79f, 11.0f, 12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 1.84f, 10.7f, 1.0f, 12.0f, 1.0f)
                curveTo(13.3f, 1.0f, 14.4f, 1.84f, 14.82f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 3.0f)
                curveTo(11.45f, 3.0f, 11.0f, 3.45f, 11.0f, 4.0f)
                curveTo(11.0f, 4.55f, 11.45f, 5.0f, 12.0f, 5.0f)
                curveTo(12.55f, 5.0f, 13.0f, 4.55f, 13.0f, 4.0f)
                curveTo(13.0f, 3.45f, 12.55f, 3.0f, 12.0f, 3.0f)
                moveTo(15.0f, 23.0f)
                curveTo(13.9f, 23.0f, 13.0f, 22.11f, 13.0f, 21.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 10.9f, 13.9f, 10.0f, 15.0f, 10.0f)
                horizontalLineTo(19.0f)
                lineTo(23.0f, 14.0f)
                verticalLineTo(21.0f)
                curveTo(23.0f, 22.11f, 22.11f, 23.0f, 21.0f, 23.0f)
                horizontalLineTo(15.0f)
                moveTo(21.0f, 14.83f)
                lineTo(18.17f, 12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.83f)
                close()
            }
        }
        .build()
        return _clipboardFile!!
    }

private var _clipboardFile: ImageVector? = null
