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

public val MaterialDesignIcons.UnfoldLessVertical: ImageVector
    get() {
        if (_unfoldLessVertical != null) {
            return _unfoldLessVertical!!
        }
        _unfoldLessVertical = Builder(name = "UnfoldLessVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.41f, 7.41f)
                lineTo(10.0f, 12.0f)
                lineTo(5.41f, 16.59f)
                lineTo(4.0f, 15.17f)
                lineTo(7.17f, 12.0f)
                lineTo(4.0f, 8.83f)
                lineTo(5.41f, 7.41f)
                moveTo(18.59f, 16.59f)
                lineTo(14.0f, 12.0f)
                lineTo(18.59f, 7.42f)
                lineTo(20.0f, 8.83f)
                lineTo(16.83f, 12.0f)
                lineTo(20.0f, 15.17f)
                lineTo(18.59f, 16.59f)
                close()
            }
        }
        .build()
        return _unfoldLessVertical!!
    }

private var _unfoldLessVertical: ImageVector? = null
