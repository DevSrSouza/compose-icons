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

public val MaterialDesignIcons.CodeTags: ImageVector
    get() {
        if (_codeTags != null) {
            return _codeTags!!
        }
        _codeTags = Builder(name = "CodeTags", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6f, 16.6f)
                lineTo(19.2f, 12.0f)
                lineTo(14.6f, 7.4f)
                lineTo(16.0f, 6.0f)
                lineTo(22.0f, 12.0f)
                lineTo(16.0f, 18.0f)
                lineTo(14.6f, 16.6f)
                moveTo(9.4f, 16.6f)
                lineTo(4.8f, 12.0f)
                lineTo(9.4f, 7.4f)
                lineTo(8.0f, 6.0f)
                lineTo(2.0f, 12.0f)
                lineTo(8.0f, 18.0f)
                lineTo(9.4f, 16.6f)
                close()
            }
        }
        .build()
        return _codeTags!!
    }

private var _codeTags: ImageVector? = null
