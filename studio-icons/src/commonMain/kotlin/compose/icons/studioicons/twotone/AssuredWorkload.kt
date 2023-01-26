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

public val TwotoneGroup.AssuredWorkload: ImageVector
    get() {
        if (_assuredWorkload != null) {
            return _assuredWorkload!!
        }
        _assuredWorkload = Builder(name = "AssuredWorkload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.47f, 6.0f)
                lineToRelative(11.06f, 0.0f)
                lineToRelative(-5.53f, -2.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                lineTo(12.0f, 1.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.47f, 6.0f)
                lineTo(12.0f, 3.24f)
                lineTo(17.53f, 6.0f)
                horizontalLineTo(6.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.4f)
                curveToRelative(-0.21f, -0.64f, -0.32f, -1.31f, -0.36f, -2.0f)
                horizontalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.26f)
                lineToRelative(0.0f, -2.26f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 3.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                lineToRelative(-4.0f, 2.0f)
                verticalLineToRelative(2.55f)
                curveToRelative(0.0f, 2.52f, 1.71f, 4.88f, 4.0f, 5.45f)
                curveToRelative(2.29f, -0.57f, 4.0f, -2.93f, 4.0f, -5.45f)
                verticalLineTo(16.0f)
                lineTo(20.0f, 14.0f)
                close()
                moveTo(19.28f, 21.0f)
                lineToRelative(-2.03f, -2.03f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(0.97f, 0.97f)
                lineToRelative(2.41f, -2.38f)
                lineToRelative(1.06f, 1.06f)
                lineTo(19.28f, 21.0f)
                close()
            }
        }
        .build()
        return _assuredWorkload!!
    }

private var _assuredWorkload: ImageVector? = null
