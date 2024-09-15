package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Registered: ImageVector
    get() {
        if (_registered != null) {
            return _registered!!
        }
        _registered = Builder(name = "Registered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.36f, 207.48f)
                curveToRelative(0.0f, 18.6f, -9.83f, 28.43f, -28.43f, 28.43f)
                horizontalLineToRelative(-29.88f)
                verticalLineToRelative(-56.14f)
                horizontalLineToRelative(23.38f)
                curveToRelative(28.67f, 0.0f, 34.93f, 8.77f, 34.93f, 27.71f)
                close()
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.97f, -111.03f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.97f, 8.0f, 256.0f)
                reflectiveCurveTo(119.03f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.03f, 248.0f, 248.0f)
                close()
                moveTo(363.41f, 360.41f)
                curveToRelative(-46.73f, -84.82f, -43.3f, -78.64f, -44.7f, -80.98f)
                curveToRelative(23.43f, -15.17f, 37.94f, -42.98f, 37.94f, -74.49f)
                curveToRelative(0.0f, -54.24f, -31.5f, -89.25f, -105.5f, -89.25f)
                horizontalLineToRelative(-70.67f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineTo(372.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(22.57f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineToRelative(-71.66f)
                horizontalLineToRelative(25.56f)
                lineToRelative(44.13f, 82.94f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 21.19f, 12.73f)
                horizontalLineToRelative(24.46f)
                curveToRelative(18.26f, -0.0f, 29.83f, -19.59f, 21.02f, -35.59f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
