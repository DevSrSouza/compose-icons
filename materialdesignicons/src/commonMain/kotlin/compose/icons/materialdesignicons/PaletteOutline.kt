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

public val MaterialDesignIcons.PaletteOutline: ImageVector
    get() {
        if (_paletteOutline != null) {
            return _paletteOutline!!
        }
        _paletteOutline = Builder(name = "PaletteOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.0f, 22.0f, 11.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 16.0f, 17.0f)
                horizontalLineTo(14.2f)
                curveTo(13.9f, 17.0f, 13.7f, 17.2f, 13.7f, 17.5f)
                curveTo(13.7f, 17.6f, 13.8f, 17.7f, 13.8f, 17.8f)
                curveTo(14.2f, 18.3f, 14.4f, 18.9f, 14.4f, 19.5f)
                curveTo(14.5f, 20.9f, 13.4f, 22.0f, 12.0f, 22.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                curveTo(12.3f, 20.0f, 12.5f, 19.8f, 12.5f, 19.5f)
                curveTo(12.5f, 19.3f, 12.4f, 19.2f, 12.4f, 19.1f)
                curveTo(12.0f, 18.6f, 11.8f, 18.1f, 11.8f, 17.5f)
                curveTo(11.8f, 16.1f, 12.9f, 15.0f, 14.3f, 15.0f)
                horizontalLineTo(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 11.0f)
                curveTo(20.0f, 7.1f, 16.4f, 4.0f, 12.0f, 4.0f)
                moveTo(6.5f, 10.0f)
                curveTo(7.3f, 10.0f, 8.0f, 10.7f, 8.0f, 11.5f)
                curveTo(8.0f, 12.3f, 7.3f, 13.0f, 6.5f, 13.0f)
                curveTo(5.7f, 13.0f, 5.0f, 12.3f, 5.0f, 11.5f)
                curveTo(5.0f, 10.7f, 5.7f, 10.0f, 6.5f, 10.0f)
                moveTo(9.5f, 6.0f)
                curveTo(10.3f, 6.0f, 11.0f, 6.7f, 11.0f, 7.5f)
                curveTo(11.0f, 8.3f, 10.3f, 9.0f, 9.5f, 9.0f)
                curveTo(8.7f, 9.0f, 8.0f, 8.3f, 8.0f, 7.5f)
                curveTo(8.0f, 6.7f, 8.7f, 6.0f, 9.5f, 6.0f)
                moveTo(14.5f, 6.0f)
                curveTo(15.3f, 6.0f, 16.0f, 6.7f, 16.0f, 7.5f)
                curveTo(16.0f, 8.3f, 15.3f, 9.0f, 14.5f, 9.0f)
                curveTo(13.7f, 9.0f, 13.0f, 8.3f, 13.0f, 7.5f)
                curveTo(13.0f, 6.7f, 13.7f, 6.0f, 14.5f, 6.0f)
                moveTo(17.5f, 10.0f)
                curveTo(18.3f, 10.0f, 19.0f, 10.7f, 19.0f, 11.5f)
                curveTo(19.0f, 12.3f, 18.3f, 13.0f, 17.5f, 13.0f)
                curveTo(16.7f, 13.0f, 16.0f, 12.3f, 16.0f, 11.5f)
                curveTo(16.0f, 10.7f, 16.7f, 10.0f, 17.5f, 10.0f)
                close()
            }
        }
        .build()
        return _paletteOutline!!
    }

private var _paletteOutline: ImageVector? = null
