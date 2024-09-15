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

public val CssGgIcons.SoftwareDownload: ImageVector
    get() {
        if (_softwareDownload != null) {
            return _softwareDownload!!
        }
        _softwareDownload = Builder(name = "SoftwareDownload", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                curveTo(11.0f, 4.448f, 11.448f, 4.0f, 12.0f, 4.0f)
                curveTo(12.552f, 4.0f, 13.0f, 4.448f, 13.0f, 5.0f)
                verticalLineTo(12.158f)
                lineTo(16.243f, 8.915f)
                lineTo(17.657f, 10.329f)
                lineTo(12.0f, 15.986f)
                lineTo(6.343f, 10.329f)
                lineTo(7.757f, 8.915f)
                lineTo(11.0f, 12.158f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 19.105f, 19.105f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 20.0f, 4.0f, 19.105f, 4.0f, 18.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _softwareDownload!!
    }

private var _softwareDownload: ImageVector? = null
