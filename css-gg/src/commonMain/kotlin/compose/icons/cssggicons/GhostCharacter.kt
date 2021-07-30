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

public val CssGgIcons.GhostCharacter: ImageVector
    get() {
        if (_ghostCharacter != null) {
            return _ghostCharacter!!
        }
        _ghostCharacter = Builder(name = "GhostCharacter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9759f, 9.0f)
                curveTo(10.9759f, 9.5523f, 10.5282f, 10.0f, 9.9759f, 10.0f)
                curveTo(9.4236f, 10.0f, 8.9759f, 9.5523f, 8.9759f, 9.0f)
                curveTo(8.9759f, 8.4477f, 9.4236f, 8.0f, 9.9759f, 8.0f)
                curveTo(10.5282f, 8.0f, 10.9759f, 8.4477f, 10.9759f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9712f, 10.0f)
                curveTo(14.5235f, 10.0f, 14.9712f, 9.5523f, 14.9712f, 9.0f)
                curveTo(14.9712f, 8.4477f, 14.5235f, 8.0f, 13.9712f, 8.0f)
                curveTo(13.4189f, 8.0f, 12.9712f, 8.4477f, 12.9712f, 9.0f)
                curveTo(12.9712f, 9.5523f, 13.4189f, 10.0f, 13.9712f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 20.9999f)
                verticalLineTo(10.0f)
                curveTo(19.0f, 6.134f, 15.866f, 3.0f, 12.0f, 3.0f)
                curveTo(8.134f, 3.0f, 5.0f, 6.134f, 5.0f, 10.0f)
                verticalLineTo(21.0f)
                lineTo(7.8285f, 21.0f)
                lineTo(9.2426f, 19.5858f)
                lineTo(10.6569f, 21.0f)
                lineTo(13.3433f, 21.0f)
                lineTo(14.7574f, 19.5858f)
                lineTo(16.1717f, 21.0f)
                lineTo(19.0f, 20.9999f)
                close()
                moveTo(17.0f, 10.0f)
                curveTo(17.0f, 7.2386f, 14.7614f, 5.0f, 12.0f, 5.0f)
                curveTo(9.2386f, 5.0f, 7.0f, 7.2386f, 7.0f, 10.0f)
                verticalLineTo(19.0f)
                lineTo(9.2426f, 16.7573f)
                lineTo(12.0f, 19.5147f)
                lineTo(14.7574f, 16.7573f)
                lineTo(17.0f, 18.9999f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _ghostCharacter!!
    }

private var _ghostCharacter: ImageVector? = null
