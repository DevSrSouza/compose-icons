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

public val TwotoneGroup.FollowTheSigns: ImageVector
    get() {
        if (_followTheSigns != null) {
            return _followTheSigns!!
        }
        _followTheSigns = Builder(name = "FollowTheSigns", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.64f, 7.75f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-3.51f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(3.51f)
                verticalLineTo(2.75f)
                lineToRelative(2.49f, 2.5f)
                lineTo(17.64f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.12f, 5.25f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(8.02f, 5.25f, 9.12f, 5.25f)
                close()
                moveTo(5.38f, 8.65f)
                lineToRelative(-2.75f, 14.1f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.75f, -8.0f)
                lineToRelative(2.15f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.2f)
                lineToRelative(-2.05f, -2.05f)
                lineToRelative(0.6f, -3.0f)
                curveToRelative(1.3f, 1.6f, 3.25f, 2.6f, 5.45f, 2.6f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f)
                lineTo(9.32f, 6.7f)
                curveToRelative(-0.35f, -0.6f, -1.0f, -0.95f, -1.7f, -0.95f)
                curveToRelative(-0.25f, 0.0f, -0.5f, 0.05f, -0.75f, 0.15f)
                lineTo(1.62f, 8.05f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.4f)
                lineTo(5.38f, 8.65f)
                moveTo(12.62f, 1.75f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(12.62f)
                close()
                moveTo(17.64f, 7.75f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-3.51f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(3.51f)
                verticalLineTo(2.75f)
                lineToRelative(2.49f, 2.5f)
                lineTo(17.64f, 7.75f)
                close()
            }
        }
        .build()
        return _followTheSigns!!
    }

private var _followTheSigns: ImageVector? = null
