package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SubtitlesOff: ImageVector
    get() {
        if (_subtitlesOff != null) {
            return _subtitlesOff!!
        }
        _subtitlesOff = Builder(name = "SubtitlesOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.83f, 6.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(5.17f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-3.17f, 0.0f)
                lineToRelative(5.17f, 5.17f)
                lineToRelative(0.0f, -11.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.17f, 18.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-7.17f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(5.17f, 0.0f)
                lineToRelative(-3.17f, -3.17f)
                lineToRelative(0.0f, 1.17f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(1.17f, 0.0f)
                lineToRelative(-3.17f, -3.17f)
                lineToRelative(0.0f, 11.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                lineToRelative(-5.17f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(3.17f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(6.83f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(11.17f)
                lineToRelative(1.76f, 1.76f)
                curveTo(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.04f, 3.87f)
                lineToRelative(1.2f, 1.2f)
                curveTo(2.09f, 5.35f, 2.0f, 5.66f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(2.96f, 2.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.45f, 2.45f)
                lineTo(1.04f, 3.87f)
                close()
                moveTo(4.0f, 6.83f)
                lineTo(7.17f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.17f)
                lineTo(11.17f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.83f)
                close()
            }
        }
        .build()
        return _subtitlesOff!!
    }

private var _subtitlesOff: ImageVector? = null
