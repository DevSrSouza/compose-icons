package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pivotaltracker: ImageVector
    get() {
        if (_pivotaltracker != null) {
            return _pivotaltracker!!
        }
        _pivotaltracker = Builder(name = "Pivotaltracker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 0.0f)
                curveToRelative(-6.617f, 0.0f, -12.0f, 5.382f, -12.0f, 11.998f)
                curveToRelative(0.0f, 6.618f, 5.384f, 12.002f, 12.0f, 12.002f)
                reflectiveCurveTo(24.0f, 18.616f, 24.0f, 11.998f)
                curveTo(24.0f, 5.382f, 18.619f, 0.0f, 12.002f, 0.0f)
                close()
                moveTo(12.002f, 2.43f)
                arcToRelative(9.568f, 9.568f, 0.0f, false, true, 9.568f, 9.568f)
                curveToRelative(0.0f, 5.286f, -4.283f, 9.572f, -9.568f, 9.572f)
                curveToRelative(-5.285f, 0.0f, -9.57f, -4.286f, -9.57f, -9.572f)
                curveToRelative(0.0f, -5.285f, 4.285f, -9.568f, 9.57f, -9.568f)
                close()
                moveTo(11.867f, 3.74f)
                lineTo(8.822f, 5.498f)
                lineTo(8.822f, 5.5f)
                lineToRelative(2.68f, 4.64f)
                curveToRelative(0.425f, -0.113f, 0.888f, -0.08f, 1.31f, 0.118f)
                lineToRelative(1.41f, -2.442f)
                lineToRelative(-2.355f, -4.076f)
                close()
                moveTo(16.037f, 5.996f)
                lineToRelative(-2.68f, 4.643f)
                curveToRelative(0.325f, 0.324f, 0.52f, 0.749f, 0.557f, 1.195f)
                horizontalLineToRelative(2.816f)
                lineToRelative(2.356f, -4.076f)
                lineToRelative(-3.049f, -1.762f)
                close()
                moveTo(4.781f, 7.984f)
                verticalLineToRelative(3.55f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(-0.03f)
                horizontalLineToRelative(5.36f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, true, 0.756f, -1.08f)
                lineTo(9.49f, 7.984f)
                lineTo(4.781f, 7.984f)
                close()
                moveTo(7.268f, 12.166f)
                lineTo(4.912f, 16.24f)
                lineToRelative(3.049f, 1.762f)
                lineToRelative(2.682f, -4.645f)
                arcToRelative(1.929f, 1.929f, 0.0f, false, true, -0.557f, -1.191f)
                lineTo(7.268f, 12.166f)
                close()
                moveTo(13.858f, 12.496f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, true, -0.756f, 1.078f)
                lineToRelative(1.41f, 2.442f)
                horizontalLineToRelative(4.707f)
                verticalLineToRelative(-3.52f)
                horizontalLineToRelative(-5.362f)
                close()
                moveTo(11.188f, 13.74f)
                lineToRelative(-1.41f, 2.442f)
                lineToRelative(2.353f, 4.076f)
                lineToRelative(3.049f, -1.76f)
                lineToRelative(-2.68f, -4.64f)
                curveToRelative(-0.425f, 0.114f, -0.89f, 0.08f, -1.313f, -0.118f)
                close()
            }
        }
        .build()
        return _pivotaltracker!!
    }

private var _pivotaltracker: ImageVector? = null
