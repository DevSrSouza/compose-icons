package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FollowTheSigns: ImageVector
    get() {
        if (_followTheSigns != null) {
            return _followTheSigns!!
        }
        _followTheSigns = Builder(name = "FollowTheSigns", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(8.4f, 5.5f, 9.5f, 5.5f)
                close()
                moveTo(5.75f, 8.9f)
                lineTo(3.0f, 23.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.75f, -8.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.55f)
                lineTo(8.95f, 13.4f)
                lineToRelative(0.6f, -3.0f)
                curveTo(10.85f, 12.0f, 12.8f, 13.0f, 15.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f)
                lineTo(9.7f, 6.95f)
                curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f)
                curveTo(7.75f, 6.0f, 7.5f, 6.05f, 7.25f, 6.15f)
                lineTo(2.0f, 8.3f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.65f)
                lineTo(5.75f, 8.9f)
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(18.01f, 8.0f)
                verticalLineTo(6.25f)
                horizontalLineTo(14.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.51f)
                verticalLineTo(3.0f)
                lineToRelative(2.49f, 2.5f)
                lineTo(18.01f, 8.0f)
                close()
            }
        }
        .build()
        return _followTheSigns!!
    }

private var _followTheSigns: ImageVector? = null
