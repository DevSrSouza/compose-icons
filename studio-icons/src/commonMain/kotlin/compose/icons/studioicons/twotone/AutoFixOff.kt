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

public val TwotoneGroup.AutoFixOff: ImageVector
    get() {
        if (_autoFixOff != null) {
            return _autoFixOff!!
        }
        _autoFixOff = Builder(name = "AutoFixOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.4169f, 18.1737f)
                lineToRelative(5.4659f, -5.4659f)
                lineToRelative(1.4142f, 1.4142f)
                lineToRelative(-5.4659f, 5.4659f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineToRelative(0.94f, -2.06f)
                lineToRelative(2.06f, -0.94f)
                lineToRelative(-2.06f, -0.94f)
                lineToRelative(-0.94f, -2.06f)
                lineToRelative(-0.94f, 2.06f)
                lineToRelative(-2.06f, 0.94f)
                lineToRelative(2.06f, 0.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.17f, 8.42f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.46f, 1.46f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.17f, -2.17f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.83f, -2.83f)
                curveTo(14.68f, 6.1f, 14.43f, 6.0f, 14.17f, 6.0f)
                curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f)
                lineToRelative(-2.17f, 2.17f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.17f, 8.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(-6.17f, 6.17f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.83f, 2.83f)
                curveTo(5.32f, 21.9f, 5.57f, 22.0f, 5.83f, 22.0f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(6.17f, -6.17f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(5.83f, 19.59f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.46f, -5.46f)
                lineToRelative(1.41f, 1.41f)
                lineTo(5.83f, 19.59f)
                close()
            }
        }
        .build()
        return _autoFixOff!!
    }

private var _autoFixOff: ImageVector? = null
