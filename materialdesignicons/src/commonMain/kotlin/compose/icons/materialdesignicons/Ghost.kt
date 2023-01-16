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

public val MaterialDesignIcons.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 11.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 19.0f)
                lineTo(9.0f, 22.0f)
                lineTo(12.0f, 19.0f)
                lineTo(15.0f, 22.0f)
                lineTo(18.0f, 19.0f)
                lineTo(21.0f, 22.0f)
                verticalLineTo(11.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(9.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 8.0f)
                moveTo(15.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
