package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }
        _sync = Builder(name = "Sync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.561f, 10.642f)
                lineTo(6.354f, 3.95f)
                lineTo(8.254f, 5.85f)
                curveTo(11.731f, 3.659f, 16.381f, 4.078f, 19.41f, 7.106f)
                lineTo(17.996f, 8.521f)
                curveTo(15.754f, 6.278f, 12.369f, 5.875f, 9.716f, 7.311f)
                lineTo(11.253f, 8.849f)
                lineTo(4.561f, 10.642f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.439f, 13.358f)
                lineTo(17.646f, 20.05f)
                lineTo(15.746f, 18.15f)
                curveTo(12.269f, 20.341f, 7.619f, 19.922f, 4.59f, 16.894f)
                lineTo(6.004f, 15.479f)
                curveTo(8.246f, 17.722f, 11.631f, 18.125f, 14.284f, 16.689f)
                lineTo(12.747f, 15.151f)
                lineTo(19.439f, 13.358f)
                close()
            }
        }
        .build()
        return _sync!!
    }

private var _sync: ImageVector? = null
