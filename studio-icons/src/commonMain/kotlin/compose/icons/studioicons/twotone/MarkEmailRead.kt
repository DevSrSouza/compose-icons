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

public val TwotoneGroup.MarkEmailRead: ImageVector
    get() {
        if (_markEmailRead != null) {
            return _markEmailRead!!
        }
        _markEmailRead = Builder(name = "MarkEmailRead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                verticalLineToRelative(4.08f)
                curveTo(19.67f, 12.03f, 19.34f, 12.0f, 19.0f, 12.0f)
                curveToRelative(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                lineToRelative(8.0f, 5.0f)
                lineTo(20.0f, 8.0f)
                close()
                moveTo(20.0f, 6.0f)
                horizontalLineTo(4.0f)
                lineToRelative(8.0f, 5.0f)
                lineTo(20.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.08f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                lineToRelative(8.0f, 5.0f)
                lineToRelative(8.0f, -5.0f)
                verticalLineToRelative(4.08f)
                curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.08f)
                curveTo(12.03f, 19.67f, 12.0f, 19.34f, 12.0f, 19.0f)
                reflectiveCurveTo(12.03f, 18.33f, 12.08f, 18.0f)
                close()
                moveTo(20.0f, 6.0f)
                lineToRelative(-8.0f, 5.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(17.34f, 22.0f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineTo(23.0f, 16.34f)
                lineTo(17.34f, 22.0f)
                close()
            }
        }
        .build()
        return _markEmailRead!!
    }

private var _markEmailRead: ImageVector? = null
