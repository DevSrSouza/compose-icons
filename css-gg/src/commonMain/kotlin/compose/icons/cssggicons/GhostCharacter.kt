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
                moveTo(10.976f, 9.0f)
                curveTo(10.976f, 9.552f, 10.528f, 10.0f, 9.976f, 10.0f)
                curveTo(9.424f, 10.0f, 8.976f, 9.552f, 8.976f, 9.0f)
                curveTo(8.976f, 8.448f, 9.424f, 8.0f, 9.976f, 8.0f)
                curveTo(10.528f, 8.0f, 10.976f, 8.448f, 10.976f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.971f, 10.0f)
                curveTo(14.524f, 10.0f, 14.971f, 9.552f, 14.971f, 9.0f)
                curveTo(14.971f, 8.448f, 14.524f, 8.0f, 13.971f, 8.0f)
                curveTo(13.419f, 8.0f, 12.971f, 8.448f, 12.971f, 9.0f)
                curveTo(12.971f, 9.552f, 13.419f, 10.0f, 13.971f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 21.0f)
                verticalLineTo(10.0f)
                curveTo(19.0f, 6.134f, 15.866f, 3.0f, 12.0f, 3.0f)
                curveTo(8.134f, 3.0f, 5.0f, 6.134f, 5.0f, 10.0f)
                verticalLineTo(21.0f)
                lineTo(7.828f, 21.0f)
                lineTo(9.243f, 19.586f)
                lineTo(10.657f, 21.0f)
                lineTo(13.343f, 21.0f)
                lineTo(14.757f, 19.586f)
                lineTo(16.172f, 21.0f)
                lineTo(19.0f, 21.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveTo(17.0f, 7.239f, 14.761f, 5.0f, 12.0f, 5.0f)
                curveTo(9.239f, 5.0f, 7.0f, 7.239f, 7.0f, 10.0f)
                verticalLineTo(19.0f)
                lineTo(9.243f, 16.757f)
                lineTo(12.0f, 19.515f)
                lineTo(14.757f, 16.757f)
                lineTo(17.0f, 19.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _ghostCharacter!!
    }

private var _ghostCharacter: ImageVector? = null
