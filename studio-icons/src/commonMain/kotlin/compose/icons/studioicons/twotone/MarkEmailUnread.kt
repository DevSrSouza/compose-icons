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

public val TwotoneGroup.MarkEmailUnread: ImageVector
    get() {
        if (_markEmailUnread != null) {
            return _markEmailUnread!!
        }
        _markEmailUnread = Builder(name = "MarkEmailUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(10.1f)
                curveToRelative(0.22f, 1.07f, 0.79f, 2.0f, 1.57f, 2.71f)
                lineTo(12.0f, 11.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(4.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(9.9f)
                curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f)
                curveToRelative(-0.6f, 0.0f, -1.16f, -0.12f, -1.7f, -0.32f)
                lineTo(12.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.9f)
                curveToRelative(0.74f, -0.15f, 1.42f, -0.48f, 2.0f, -0.92f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.1f)
                curveTo(14.04f, 4.32f, 14.0f, 4.66f, 14.0f, 5.0f)
                reflectiveCurveToRelative(0.04f, 0.68f, 0.1f, 1.0f)
                horizontalLineTo(4.0f)
                lineToRelative(8.0f, 5.0f)
                lineToRelative(3.67f, -2.29f)
                curveToRelative(0.47f, 0.43f, 1.02f, 0.76f, 1.63f, 0.98f)
                lineTo(12.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(9.9f)
                close()
                moveTo(16.0f, 5.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(16.0f, 3.34f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _markEmailUnread!!
    }

private var _markEmailUnread: ImageVector? = null
