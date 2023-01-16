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

public val MaterialDesignIcons.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = Builder(name = "Mushroom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 14.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(17.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 12.0f)
                moveTo(7.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 12.0f)
                moveTo(15.0f, 15.0f)
                lineTo(16.27f, 19.45f)
                lineTo(16.35f, 20.0f)
                curveTo(16.35f, 21.1f, 15.45f, 22.0f, 14.35f, 22.0f)
                horizontalLineTo(9.65f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.65f, 20.0f)
                lineTo(7.73f, 19.45f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
