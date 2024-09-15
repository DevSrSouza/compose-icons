package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.146f, 11.05f)
                lineTo(12.972f, 9.058f)
                lineTo(15.346f, 8.85f)
                curveTo(14.447f, 7.983f, 13.224f, 7.45f, 11.877f, 7.45f)
                curveTo(9.115f, 7.45f, 6.877f, 9.689f, 6.877f, 12.45f)
                curveTo(6.877f, 15.212f, 9.115f, 17.45f, 11.877f, 17.45f)
                curveTo(13.698f, 17.45f, 15.291f, 16.477f, 16.165f, 15.022f)
                lineTo(18.168f, 15.523f)
                curveTo(17.03f, 17.849f, 14.641f, 19.45f, 11.877f, 19.45f)
                curveTo(8.011f, 19.45f, 4.877f, 16.316f, 4.877f, 12.45f)
                curveTo(4.877f, 8.584f, 8.011f, 5.45f, 11.877f, 5.45f)
                curveTo(13.823f, 5.45f, 15.584f, 6.245f, 16.853f, 7.527f)
                lineTo(16.608f, 4.724f)
                lineTo(18.6f, 4.55f)
                lineTo(19.123f, 10.527f)
                lineTo(13.146f, 11.05f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
