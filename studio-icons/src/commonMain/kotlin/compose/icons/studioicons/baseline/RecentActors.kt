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

public val BaselineGroup.RecentActors: ImageVector
    get() {
        if (_recentActors != null) {
            return _recentActors!!
        }
        _recentActors = Builder(name = "RecentActors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(15.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(8.0f, 7.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f)
                reflectiveCurveTo(9.24f, 12.25f, 8.0f, 12.25f)
                reflectiveCurveTo(5.75f, 11.24f, 5.75f, 10.0f)
                reflectiveCurveTo(6.76f, 7.75f, 8.0f, 7.75f)
                close()
                moveTo(12.5f, 17.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -1.5f, 3.0f, -2.25f, 4.5f, -2.25f)
                reflectiveCurveToRelative(4.5f, 0.75f, 4.5f, 2.25f)
                lineTo(12.5f, 17.0f)
                close()
            }
        }
        .build()
        return _recentActors!!
    }

private var _recentActors: ImageVector? = null
