package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Twilio: ImageVector
    get() {
        if (_twilio != null) {
            return _twilio!!
        }
        _twilio = Builder(name = "Twilio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                curveTo(11.0f, 10.105f, 10.105f, 11.0f, 9.0f, 11.0f)
                curveTo(7.895f, 11.0f, 7.0f, 10.105f, 7.0f, 9.0f)
                curveTo(7.0f, 7.895f, 7.895f, 7.0f, 9.0f, 7.0f)
                curveTo(10.105f, 7.0f, 11.0f, 7.895f, 11.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                curveTo(17.0f, 10.105f, 16.105f, 11.0f, 15.0f, 11.0f)
                curveTo(13.895f, 11.0f, 13.0f, 10.105f, 13.0f, 9.0f)
                curveTo(13.0f, 7.895f, 13.895f, 7.0f, 15.0f, 7.0f)
                curveTo(16.105f, 7.0f, 17.0f, 7.895f, 17.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                curveTo(16.105f, 17.0f, 17.0f, 16.105f, 17.0f, 15.0f)
                curveTo(17.0f, 13.895f, 16.105f, 13.0f, 15.0f, 13.0f)
                curveTo(13.895f, 13.0f, 13.0f, 13.895f, 13.0f, 15.0f)
                curveTo(13.0f, 16.105f, 13.895f, 17.0f, 15.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                curveTo(11.0f, 16.105f, 10.105f, 17.0f, 9.0f, 17.0f)
                curveTo(7.895f, 17.0f, 7.0f, 16.105f, 7.0f, 15.0f)
                curveTo(7.0f, 13.895f, 7.895f, 13.0f, 9.0f, 13.0f)
                curveTo(10.105f, 13.0f, 11.0f, 13.895f, 11.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 18.627f, 18.627f, 24.0f, 12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                curveTo(18.627f, 0.0f, 24.0f, 5.373f, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _twilio!!
    }

private var _twilio: ImageVector? = null
