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

public val MaterialDesignIcons.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 12.0f)
                moveTo(14.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 8.0f)
                moveTo(9.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 8.0f)
                moveTo(6.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 12.0f)
                moveTo(12.0f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 19.5f)
                curveTo(13.5f, 19.11f, 13.35f, 18.76f, 13.11f, 18.5f)
                curveTo(12.88f, 18.23f, 12.73f, 17.88f, 12.73f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.23f, 16.0f)
                horizontalLineTo(16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.0f, 11.0f)
                curveTo(21.0f, 6.58f, 16.97f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
