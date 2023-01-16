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

public val MaterialDesignIcons.BookCheckOutline: ImageVector
    get() {
        if (_bookCheckOutline != null) {
            return _bookCheckOutline!!
        }
        _bookCheckOutline = Builder(name = "BookCheckOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 22.16f)
                lineTo(14.0f, 19.16f)
                lineTo(15.16f, 18.0f)
                lineTo(16.75f, 19.59f)
                lineTo(20.34f, 16.0f)
                lineTo(21.5f, 17.41f)
                lineTo(16.75f, 22.16f)
                moveTo(18.0f, 2.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.9f, 20.0f, 4.0f)
                verticalLineTo(13.34f)
                curveTo(19.37f, 13.12f, 18.7f, 13.0f, 18.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                lineTo(10.5f, 9.75f)
                lineTo(8.0f, 12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 20.72f, 12.45f, 21.39f, 12.8f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _bookCheckOutline!!
    }

private var _bookCheckOutline: ImageVector? = null
