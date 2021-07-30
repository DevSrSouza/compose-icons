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

public val SimpleIcons.Roku: ImageVector
    get() {
        if (_roku != null) {
            return _roku!!
        }
        _roku = Builder(name = "Roku", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.34f, 9.853f)
                lineToRelative(-2.254f, 2.254f)
                verticalLineToRelative(-2.26f)
                lineTo(12.13f, 9.847f)
                verticalLineToRelative(5.744f)
                horizontalLineToRelative(1.957f)
                verticalLineToRelative(-2.33f)
                lineToRelative(2.353f, 2.33f)
                horizontalLineToRelative(2.46f)
                lineToRelative(-2.988f, -2.99f)
                lineToRelative(2.477f, -2.476f)
                verticalLineToRelative(3.411f)
                curveToRelative(0.0f, 1.133f, 0.679f, 2.177f, 2.393f, 2.177f)
                curveToRelative(0.815f, 0.0f, 1.56f, -0.462f, 1.922f, -0.88f)
                lineToRelative(0.88f, 0.759f)
                lineTo(24.0f, 15.592f)
                verticalLineToRelative(-5.74f)
                horizontalLineToRelative(-1.951f)
                verticalLineToRelative(3.718f)
                curveToRelative(-0.22f, 0.384f, -0.528f, 0.627f, -1.002f, 0.627f)
                curveToRelative(-0.482f, 0.0f, -0.703f, -0.286f, -0.703f, -1.198f)
                lineTo(20.344f, 9.853f)
                close()
                moveTo(11.749f, 12.722f)
                arcTo(3.004f, 3.004f, 0.0f, true, true, 8.738f, 9.73f)
                arcToRelative(2.997f, 2.997f, 0.0f, false, true, 3.011f, 2.99f)
                moveToRelative(-3.011f, -1.57f)
                curveToRelative(-0.518f, 0.0f, -0.956f, 0.704f, -0.956f, 1.572f)
                curveToRelative(0.0f, 0.867f, 0.438f, 1.57f, 0.956f, 1.57f)
                curveToRelative(0.528f, 0.0f, 0.968f, -0.702f, 0.968f, -1.57f)
                curveToRelative(0.0f, -0.869f, -0.438f, -1.572f, -0.968f, -1.572f)
                close()
                moveTo(6.532f, 15.597f)
                lineTo(4.313f, 15.597f)
                lineTo(2.55f, 13.153f)
                horizontalLineToRelative(-0.594f)
                verticalLineToRelative(2.44f)
                lineTo(0.0f, 15.593f)
                lineTo(0.0f, 8.26f)
                horizontalLineToRelative(2.8f)
                curveToRelative(1.616f, 0.0f, 2.935f, 1.1f, 2.935f, 2.45f)
                curveToRelative(0.0f, 0.826f, -0.505f, 1.562f, -1.273f, 2.013f)
                lineToRelative(2.07f, 2.875f)
                moveToRelative(-2.75f, -4.888f)
                arcTo(1.226f, 1.226f, 0.0f, false, false, 2.56f, 9.478f)
                horizontalLineToRelative(-0.604f)
                verticalLineToRelative(2.453f)
                horizontalLineToRelative(0.605f)
                arcToRelative(1.225f, 1.225f, 0.0f, false, false, 1.22f, -1.221f)
                close()
            }
        }
        .build()
        return _roku!!
    }

private var _roku: ImageVector? = null
