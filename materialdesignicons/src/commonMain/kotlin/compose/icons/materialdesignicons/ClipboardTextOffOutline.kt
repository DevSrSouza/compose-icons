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

public val MaterialDesignIcons.ClipboardTextOffOutline: ImageVector
    get() {
        if (_clipboardTextOffOutline != null) {
            return _clipboardTextOffOutline!!
        }
        _clipboardTextOffOutline = Builder(name = "ClipboardTextOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.8f)
                lineTo(21.0f, 17.8f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(14.82f)
                curveTo(14.25f, 1.44f, 12.53f, 0.64f, 11.0f, 1.2f)
                curveTo(10.14f, 1.5f, 9.5f, 2.16f, 9.18f, 3.0f)
                horizontalLineTo(6.2f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(17.0f)
                moveTo(12.0f, 3.0f)
                curveTo(12.55f, 3.0f, 13.0f, 3.45f, 13.0f, 4.0f)
                reflectiveCurveTo(12.55f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(11.0f, 4.55f, 11.0f, 4.0f)
                reflectiveCurveTo(11.45f, 3.0f, 12.0f, 3.0f)
                moveTo(14.2f, 11.0f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.2f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.9f)
                curveTo(3.0f, 4.93f, 3.0f, 4.97f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.03f, 21.0f, 19.07f, 21.0f, 19.1f, 21.0f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(6.89f)
                lineTo(7.11f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.11f)
                lineTo(11.11f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.11f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _clipboardTextOffOutline!!
    }

private var _clipboardTextOffOutline: ImageVector? = null
