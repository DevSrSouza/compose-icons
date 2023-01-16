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

public val MaterialDesignIcons.FlashTriangleOutline: ImageVector
    get() {
        if (_flashTriangleOutline != null) {
            return _flashTriangleOutline!!
        }
        _flashTriangleOutline = Builder(name = "FlashTriangleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(1.0f, 21.0f)
                horizontalLineTo(23.0f)
                moveTo(12.0f, 6.0f)
                lineTo(19.5f, 19.0f)
                horizontalLineTo(4.5f)
                moveTo(14.0f, 14.0f)
                horizontalLineTo(12.5f)
                lineTo(14.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                lineTo(14.0f, 14.0f)
                close()
            }
        }
        .build()
        return _flashTriangleOutline!!
    }

private var _flashTriangleOutline: ImageVector? = null
