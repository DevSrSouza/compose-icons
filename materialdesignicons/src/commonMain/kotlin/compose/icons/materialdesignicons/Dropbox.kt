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

public val MaterialDesignIcons.Dropbox: ImageVector
    get() {
        if (_dropbox != null) {
            return _dropbox!!
        }
        _dropbox = Builder(name = "Dropbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.2f)
                lineTo(8.0f, 9.39f)
                lineTo(13.0f, 6.2f)
                lineTo(8.0f, 3.0f)
                lineTo(3.0f, 6.2f)
                moveTo(13.0f, 6.2f)
                lineTo(18.0f, 9.39f)
                lineTo(23.0f, 6.2f)
                lineTo(18.0f, 3.0f)
                lineTo(13.0f, 6.2f)
                moveTo(3.0f, 12.55f)
                lineTo(8.0f, 15.74f)
                lineTo(13.0f, 12.55f)
                lineTo(8.0f, 9.35f)
                lineTo(3.0f, 12.55f)
                moveTo(18.0f, 9.35f)
                lineTo(13.0f, 12.55f)
                lineTo(18.0f, 15.74f)
                lineTo(23.0f, 12.55f)
                lineTo(18.0f, 9.35f)
                moveTo(8.03f, 16.8f)
                lineTo(13.04f, 20.0f)
                lineTo(18.04f, 16.8f)
                lineTo(13.04f, 13.61f)
                lineTo(8.03f, 16.8f)
                close()
            }
        }
        .build()
        return _dropbox!!
    }

private var _dropbox: ImageVector? = null
