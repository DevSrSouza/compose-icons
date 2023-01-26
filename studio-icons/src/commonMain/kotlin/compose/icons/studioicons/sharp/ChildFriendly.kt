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

public val SharpGroup.ChildFriendly: ImageVector
    get() {
        if (_childFriendly != null) {
            return _childFriendly!!
        }
        _childFriendly = Builder(name = "ChildFriendly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(19.32f, 15.89f)
                curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f)
                lineTo(6.44f, 11.0f)
                lineToRelative(-0.95f, -2.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.22f)
                reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f)
                curveToRelative(-1.1f, 0.59f, -1.84f, 1.75f, -1.84f, 3.08f)
                curveTo(4.5f, 20.43f, 6.07f, 22.0f, 8.0f, 22.0f)
                curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.24f, 1.7f, 1.7f, 3.0f, 3.46f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.04f, -0.46f, -1.97f, -1.18f, -2.61f)
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
