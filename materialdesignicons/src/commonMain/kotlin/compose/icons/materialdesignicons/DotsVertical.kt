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

public val MaterialDesignIcons.DotsVertical: ImageVector
    get() {
        if (_dotsVertical != null) {
            return _dotsVertical!!
        }
        _dotsVertical = Builder(name = "DotsVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 16.0f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                moveTo(12.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _dotsVertical!!
    }

private var _dotsVertical: ImageVector? = null
