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

public val MaterialDesignIcons.ImageFilterHdr: ImageVector
    get() {
        if (_imageFilterHdr != null) {
            return _imageFilterHdr!!
        }
        _imageFilterHdr = Builder(name = "ImageFilterHdr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                lineTo(10.25f, 11.0f)
                lineTo(13.1f, 14.8f)
                lineTo(11.5f, 16.0f)
                curveTo(9.81f, 13.75f, 7.0f, 10.0f, 7.0f, 10.0f)
                lineTo(1.0f, 18.0f)
                horizontalLineTo(23.0f)
                lineTo(14.0f, 6.0f)
                close()
            }
        }
        .build()
        return _imageFilterHdr!!
    }

private var _imageFilterHdr: ImageVector? = null
