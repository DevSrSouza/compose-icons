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

public val MaterialDesignIcons.UnfoldMoreHorizontal: ImageVector
    get() {
        if (_unfoldMoreHorizontal != null) {
            return _unfoldMoreHorizontal!!
        }
        _unfoldMoreHorizontal = Builder(name = "UnfoldMoreHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.17f)
                lineTo(8.83f, 15.0f)
                lineTo(7.42f, 16.41f)
                lineTo(12.0f, 21.0f)
                lineTo(16.59f, 16.41f)
                lineTo(15.17f, 15.0f)
                moveTo(12.0f, 5.83f)
                lineTo(15.17f, 9.0f)
                lineTo(16.58f, 7.59f)
                lineTo(12.0f, 3.0f)
                lineTo(7.41f, 7.59f)
                lineTo(8.83f, 9.0f)
                lineTo(12.0f, 5.83f)
                close()
            }
        }
        .build()
        return _unfoldMoreHorizontal!!
    }

private var _unfoldMoreHorizontal: ImageVector? = null
