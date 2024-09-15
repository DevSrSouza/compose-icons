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

public val CssGgIcons.Calibrate: ImageVector
    get() {
        if (_calibrate != null) {
            return _calibrate!!
        }
        _calibrate = Builder(name = "Calibrate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.05f, 5.0f)
                curveTo(14.51f, 5.0f, 16.739f, 5.987f, 18.364f, 7.586f)
                lineTo(14.121f, 11.829f)
                curveTo(13.582f, 11.315f, 12.853f, 11.0f, 12.05f, 11.0f)
                curveTo(11.196f, 11.0f, 10.426f, 11.357f, 9.879f, 11.929f)
                lineTo(5.636f, 7.687f)
                curveTo(7.269f, 6.028f, 9.539f, 5.0f, 12.05f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.05f, 19.0f)
                curveTo(13.707f, 19.0f, 15.05f, 17.657f, 15.05f, 16.0f)
                curveTo(15.05f, 14.343f, 13.707f, 13.0f, 12.05f, 13.0f)
                curveTo(10.393f, 13.0f, 9.05f, 14.343f, 9.05f, 16.0f)
                curveTo(9.05f, 17.657f, 10.393f, 19.0f, 12.05f, 19.0f)
                close()
            }
        }
        .build()
        return _calibrate!!
    }

private var _calibrate: ImageVector? = null
