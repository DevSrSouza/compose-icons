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

public val MaterialDesignIcons.Saxophone: ImageVector
    get() {
        if (_saxophone != null) {
            return _saxophone!!
        }
        _saxophone = Builder(name = "Saxophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 7.0f)
                verticalLineTo(8.66f)
                lineTo(7.0f, 15.5f)
                curveTo(7.0f, 19.1f, 9.9f, 22.0f, 13.5f, 22.0f)
                curveTo(17.1f, 22.0f, 20.0f, 19.1f, 20.0f, 15.5f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 11.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 13.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 15.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 9.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 6.0f)
                verticalLineTo(5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 2.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _saxophone!!
    }

private var _saxophone: ImageVector? = null
