package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.MarkEmailUnread: ImageVector
    get() {
        if (_markEmailUnread != null) {
            return _markEmailUnread!!
        }
        _markEmailUnread = Builder(name = "MarkEmailUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveToRelative(1.13f, 0.0f, 2.16f, -0.39f, 3.0f, -1.02f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.1f)
                curveTo(14.04f, 4.32f, 14.0f, 4.66f, 14.0f, 5.0f)
                curveToRelative(0.0f, 1.48f, 0.65f, 2.79f, 1.67f, 3.71f)
                lineTo(12.0f, 11.0f)
                lineTo(5.3f, 6.81f)
                curveTo(4.73f, 6.46f, 4.0f, 6.86f, 4.0f, 7.53f)
                curveToRelative(0.0f, 0.29f, 0.15f, 0.56f, 0.4f, 0.72f)
                lineToRelative(7.07f, 4.42f)
                curveToRelative(0.32f, 0.2f, 0.74f, 0.2f, 1.06f, 0.0f)
                lineToRelative(4.77f, -2.98f)
                curveTo(17.84f, 9.88f, 18.4f, 10.0f, 19.0f, 10.0f)
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
