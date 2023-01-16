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

public val MaterialDesignIcons.Emby: ImageVector
    get() {
        if (_emby != null) {
            return _emby!!
        }
        _emby = Builder(name = "Emby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                lineTo(6.0f, 7.0f)
                lineTo(7.0f, 8.0f)
                lineTo(2.0f, 13.0f)
                lineTo(7.0f, 18.0f)
                lineTo(8.0f, 17.0f)
                lineTo(13.0f, 22.0f)
                lineTo(18.0f, 17.0f)
                lineTo(17.0f, 16.0f)
                lineTo(22.0f, 11.0f)
                lineTo(17.0f, 6.0f)
                lineTo(16.0f, 7.0f)
                lineTo(11.0f, 2.0f)
                moveTo(10.0f, 8.5f)
                lineTo(16.0f, 12.0f)
                lineTo(10.0f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _emby!!
    }

private var _emby: ImageVector? = null
