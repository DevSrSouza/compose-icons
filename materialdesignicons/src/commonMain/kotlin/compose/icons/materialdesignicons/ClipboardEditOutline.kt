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

public val MaterialDesignIcons.ClipboardEditOutline: ImageVector
    get() {
        if (_clipboardEditOutline != null) {
            return _clipboardEditOutline!!
        }
        _clipboardEditOutline = Builder(name = "ClipboardEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.04f, 12.13f)
                curveTo(21.18f, 12.13f, 21.31f, 12.19f, 21.42f, 12.3f)
                lineTo(22.7f, 13.58f)
                curveTo(22.92f, 13.79f, 22.92f, 14.14f, 22.7f, 14.35f)
                lineTo(21.7f, 15.35f)
                lineTo(19.65f, 13.3f)
                lineTo(20.65f, 12.3f)
                curveTo(20.76f, 12.19f, 20.9f, 12.13f, 21.04f, 12.13f)
                moveTo(19.07f, 13.88f)
                lineTo(21.12f, 15.93f)
                lineTo(15.06f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.94f)
                lineTo(19.07f, 13.88f)
                moveTo(11.0f, 19.0f)
                lineTo(9.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 1.84f, 10.7f, 1.0f, 12.0f, 1.0f)
                curveTo(13.3f, 1.0f, 14.4f, 1.84f, 14.82f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(9.0f)
                lineTo(19.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 3.0f)
                curveTo(11.45f, 3.0f, 11.0f, 3.45f, 11.0f, 4.0f)
                curveTo(11.0f, 4.55f, 11.45f, 5.0f, 12.0f, 5.0f)
                curveTo(12.55f, 5.0f, 13.0f, 4.55f, 13.0f, 4.0f)
                curveTo(13.0f, 3.45f, 12.55f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _clipboardEditOutline!!
    }

private var _clipboardEditOutline: ImageVector? = null
