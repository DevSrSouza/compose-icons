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

public val MaterialDesignIcons.CloseOutline: ImageVector
    get() {
        if (_closeOutline != null) {
            return _closeOutline!!
        }
        _closeOutline = Builder(name = "CloseOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.74f)
                lineTo(7.76f, 12.0f)
                lineTo(3.0f, 7.26f)
                lineTo(7.26f, 3.0f)
                lineTo(12.0f, 7.76f)
                lineTo(16.74f, 3.0f)
                lineTo(21.0f, 7.26f)
                lineTo(16.24f, 12.0f)
                lineTo(21.0f, 16.74f)
                lineTo(16.74f, 21.0f)
                lineTo(12.0f, 16.24f)
                lineTo(7.26f, 21.0f)
                lineTo(3.0f, 16.74f)
                moveTo(12.0f, 13.41f)
                lineTo(16.74f, 18.16f)
                lineTo(18.16f, 16.74f)
                lineTo(13.41f, 12.0f)
                lineTo(18.16f, 7.26f)
                lineTo(16.74f, 5.84f)
                lineTo(12.0f, 10.59f)
                lineTo(7.26f, 5.84f)
                lineTo(5.84f, 7.26f)
                lineTo(10.59f, 12.0f)
                lineTo(5.84f, 16.74f)
                lineTo(7.26f, 18.16f)
                lineTo(12.0f, 13.41f)
                close()
            }
        }
        .build()
        return _closeOutline!!
    }

private var _closeOutline: ImageVector? = null
