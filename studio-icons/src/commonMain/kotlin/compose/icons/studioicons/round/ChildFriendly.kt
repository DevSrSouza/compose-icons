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

public val RoundGroup.ChildFriendly: ImageVector
    get() {
        if (_childFriendly != null) {
            return _childFriendly!!
        }
        _childFriendly = Builder(name = "ChildFriendly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.08f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, -4.03f, -2.98f, -7.37f, -6.86f, -7.92f)
                curveToRelative(-0.6f, -0.09f, -1.14f, 0.39f, -1.14f, 1.0f)
                close()
                moveTo(19.32f, 15.89f)
                curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f)
                lineTo(6.44f, 11.0f)
                lineToRelative(-0.68f, -1.43f)
                curveTo(5.6f, 9.22f, 5.24f, 9.0f, 4.86f, 9.0f)
                lineTo(3.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.22f)
                reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f)
                curveToRelative(-1.33f, 0.71f, -2.14f, 2.27f, -1.74f, 3.94f)
                curveToRelative(0.3f, 1.26f, 1.34f, 2.27f, 2.6f, 2.55f)
                curveToRelative(2.1f, 0.46f, 3.98f, -0.96f, 4.25f, -2.91f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.27f, 1.94f, 2.14f, 3.36f, 4.22f, 2.92f)
                curveToRelative(1.27f, -0.27f, 2.31f, -1.27f, 2.63f, -2.53f)
                curveToRelative(0.35f, -1.39f, -0.14f, -2.68f, -1.06f, -3.5f)
                close()
                moveTo(8.0f, 20.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(7.17f, 17.0f, 8.0f, 17.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(8.83f, 20.0f, 8.0f, 20.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(16.17f, 17.0f, 17.0f, 17.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.83f, 20.0f, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _childFriendly!!
    }

private var _childFriendly: ImageVector? = null
