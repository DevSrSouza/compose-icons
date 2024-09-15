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

public val CssGgIcons.SoftwareUpload: ImageVector
    get() {
        if (_softwareUpload != null) {
            return _softwareUpload!!
        }
        _softwareUpload = Builder(name = "SoftwareUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.986f)
                curveTo(11.0f, 15.538f, 11.448f, 15.986f, 12.0f, 15.986f)
                curveTo(12.552f, 15.986f, 13.0f, 15.538f, 13.0f, 14.986f)
                verticalLineTo(7.828f)
                lineTo(16.243f, 11.071f)
                lineTo(17.657f, 9.657f)
                lineTo(12.0f, 4.0f)
                lineTo(6.343f, 9.657f)
                lineTo(7.757f, 11.071f)
                lineTo(11.0f, 7.829f)
                verticalLineTo(14.986f)
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
        return _softwareUpload!!
    }

private var _softwareUpload: ImageVector? = null
