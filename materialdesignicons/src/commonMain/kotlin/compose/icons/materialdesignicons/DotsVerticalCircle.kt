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

public val MaterialDesignIcons.DotsVerticalCircle: ImageVector
    get() {
        if (_dotsVerticalCircle != null) {
            return _dotsVerticalCircle!!
        }
        _dotsVerticalCircle = Builder(name = "DotsVerticalCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                moveTo(10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.0f)
                moveTo(10.5f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 17.5f)
                moveTo(10.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 6.5f)
                close()
            }
        }
        .build()
        return _dotsVerticalCircle!!
    }

private var _dotsVerticalCircle: ImageVector? = null
