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

public val MaterialDesignIcons.Shimmer: ImageVector
    get() {
        if (_shimmer != null) {
            return _shimmer!!
        }
        _shimmer = Builder(name = "Shimmer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6f, 9.6f)
                lineTo(9.0f, 15.0f)
                lineTo(7.4f, 9.6f)
                lineTo(2.0f, 8.0f)
                lineTo(7.4f, 6.4f)
                lineTo(9.0f, 1.0f)
                lineTo(10.6f, 6.4f)
                lineTo(16.0f, 8.0f)
                lineTo(10.6f, 9.6f)
                moveTo(17.0f, 14.2f)
                lineTo(21.0f, 12.0f)
                lineTo(18.8f, 16.0f)
                lineTo(21.0f, 20.0f)
                lineTo(17.0f, 17.8f)
                lineTo(13.0f, 20.0f)
                lineTo(15.2f, 16.0f)
                lineTo(13.0f, 12.0f)
                lineTo(17.0f, 14.2f)
                moveTo(10.0f, 16.0f)
                lineTo(8.3f, 19.0f)
                lineTo(10.0f, 22.0f)
                lineTo(7.0f, 20.3f)
                lineTo(4.0f, 22.0f)
                lineTo(5.7f, 19.0f)
                lineTo(4.0f, 16.0f)
                lineTo(7.0f, 17.7f)
                lineTo(10.0f, 16.0f)
            }
        }
        .build()
        return _shimmer!!
    }

private var _shimmer: ImageVector? = null
