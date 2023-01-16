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

public val MaterialDesignIcons.ClipboardOff: ImageVector
    get() {
        if (_clipboardOff != null) {
            return _clipboardOff!!
        }
        _clipboardOff = Builder(name = "ClipboardOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f)
                horizontalLineTo(6.2f)
                lineTo(21.0f, 17.8f)
                verticalLineTo(5.0f)
                moveTo(12.0f, 5.0f)
                curveTo(11.45f, 5.0f, 11.0f, 4.55f, 11.0f, 4.0f)
                reflectiveCurveTo(11.45f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(13.0f, 3.45f, 13.0f, 4.0f)
                reflectiveCurveTo(12.55f, 5.0f, 12.0f, 5.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21.0f)
                curveTo(19.07f, 21.0f, 19.03f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.97f, 3.0f, 4.93f, 3.0f, 4.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                close()
            }
        }
        .build()
        return _clipboardOff!!
    }

private var _clipboardOff: ImageVector? = null
