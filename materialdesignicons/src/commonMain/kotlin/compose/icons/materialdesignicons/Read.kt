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

public val MaterialDesignIcons.Read: ImageVector
    get() {
        if (_read != null) {
            return _read!!
        }
        _read = Builder(name = "Read", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.59f, 11.59f)
                lineTo(23.0f, 13.0f)
                lineTo(13.5f, 22.5f)
                lineTo(8.42f, 17.41f)
                lineTo(9.83f, 16.0f)
                lineTo(13.5f, 19.68f)
                lineTo(21.59f, 11.59f)
                moveTo(4.0f, 16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                lineTo(9.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 7.0f)
                curveTo(13.0f, 8.54f, 12.13f, 9.88f, 10.85f, 10.55f)
                lineTo(14.0f, 16.0f)
                horizontalLineTo(12.0f)
                lineTo(9.11f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                moveTo(6.0f, 9.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _read!!
    }

private var _read: ImageVector? = null
