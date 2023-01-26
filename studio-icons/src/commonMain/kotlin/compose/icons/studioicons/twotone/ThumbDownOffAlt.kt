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

public val TwotoneGroup.ThumbDownOffAlt: ImageVector
    get() {
        if (_thumbDownOffAlt != null) {
            return _thumbDownOffAlt!!
        }
        _thumbDownOffAlt = Builder(name = "ThumbDownOffAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(9.0f, 0.0f)
                lineToRelative(-1.34f, 5.34f)
                lineToRelative(4.34f, -4.34f)
                lineToRelative(0.0f, -10.0f)
                lineToRelative(-9.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.17f, 3.0f, 4.46f, 3.5f, 4.16f, 4.22f)
                lineToRelative(-3.02f, 7.05f)
                curveTo(1.05f, 11.5f, 1.0f, 11.74f, 1.0f, 12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.31f)
                lineToRelative(-0.95f, 4.57f)
                lineToRelative(-0.03f, 0.32f)
                curveToRelative(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f)
                lineTo(9.83f, 23.0f)
                lineToRelative(6.59f, -6.59f)
                curveTo(16.78f, 16.05f, 17.0f, 15.55f, 17.0f, 15.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.9f, 16.1f, 3.0f, 15.0f, 3.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineToRelative(-4.34f, 4.34f)
                lineTo(12.0f, 14.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, -7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _thumbDownOffAlt!!
    }

private var _thumbDownOffAlt: ImageVector? = null
