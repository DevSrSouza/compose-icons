package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.MarkEmailUnread: ImageVector
    get() {
        if (_markEmailUnread != null) {
            return _markEmailUnread!!
        }
        _markEmailUnread = Builder(name = "MarkEmailUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.98f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(12.1f)
                curveTo(14.04f, 4.32f, 14.0f, 4.66f, 14.0f, 5.0f)
                curveToRelative(0.0f, 1.48f, 0.65f, 2.79f, 1.67f, 3.71f)
                lineTo(12.0f, 11.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(8.0f, 5.0f)
                lineToRelative(5.3f, -3.32f)
                curveTo(17.84f, 9.88f, 18.4f, 10.0f, 19.0f, 10.0f)
                curveTo(20.13f, 10.0f, 21.16f, 9.61f, 22.0f, 8.98f)
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
