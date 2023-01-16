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

public val MaterialDesignIcons.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 13.5f)
                moveTo(14.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 13.5f)
                moveTo(9.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 13.5f)
                moveTo(22.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(6.31f, 3.0f, 5.77f, 3.35f, 5.41f, 3.88f)
                lineTo(0.0f, 12.0f)
                lineTo(5.41f, 20.11f)
                curveTo(5.77f, 20.64f, 6.37f, 21.0f, 7.06f, 21.0f)
                horizontalLineTo(22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(24.0f, 3.89f, 23.1f, 3.0f, 22.0f, 3.0f)
                close()
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null
