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

public val MaterialDesignIcons.UnfoldLessHorizontal: ImageVector
    get() {
        if (_unfoldLessHorizontal != null) {
            return _unfoldLessHorizontal!!
        }
        _unfoldLessHorizontal = Builder(name = "UnfoldLessHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.59f, 5.41f)
                lineTo(15.17f, 4.0f)
                lineTo(12.0f, 7.17f)
                lineTo(8.83f, 4.0f)
                lineTo(7.41f, 5.41f)
                lineTo(12.0f, 10.0f)
                moveTo(7.41f, 18.59f)
                lineTo(8.83f, 20.0f)
                lineTo(12.0f, 16.83f)
                lineTo(15.17f, 20.0f)
                lineTo(16.58f, 18.59f)
                lineTo(12.0f, 14.0f)
                lineTo(7.41f, 18.59f)
                close()
            }
        }
        .build()
        return _unfoldLessHorizontal!!
    }

private var _unfoldLessHorizontal: ImageVector? = null
