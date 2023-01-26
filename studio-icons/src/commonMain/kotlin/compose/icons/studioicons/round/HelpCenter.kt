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

public val RoundGroup.HelpCenter: ImageVector
    get() {
        if (_helpCenter != null) {
            return _helpCenter!!
        }
        _helpCenter = Builder(name = "HelpCenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(12.01f, 18.0f)
                curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f)
                curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f)
                curveToRelative(0.71f, 0.0f, 1.25f, 0.54f, 1.25f, 1.25f)
                curveTo(13.25f, 17.43f, 12.72f, 18.0f, 12.01f, 18.0f)
                close()
                moveTo(15.02f, 10.6f)
                curveToRelative(-0.76f, 1.11f, -1.48f, 1.46f, -1.87f, 2.17f)
                curveToRelative(-0.1f, 0.18f, -0.16f, 0.32f, -0.19f, 0.63f)
                curveToRelative(-0.05f, 0.45f, -0.45f, 0.78f, -0.9f, 0.78f)
                horizontalLineTo(12.0f)
                curveToRelative(-0.52f, 0.0f, -0.93f, -0.44f, -0.88f, -0.96f)
                curveToRelative(0.03f, -0.34f, 0.11f, -0.69f, 0.3f, -1.03f)
                curveToRelative(0.49f, -0.87f, 1.42f, -1.39f, 1.96f, -2.16f)
                curveToRelative(0.57f, -0.81f, 0.25f, -2.33f, -1.37f, -2.33f)
                curveToRelative(-0.71f, 0.0f, -1.18f, 0.36f, -1.47f, 0.79f)
                curveToRelative(-0.25f, 0.36f, -0.69f, 0.53f, -1.1f, 0.36f)
                lineToRelative(0.0f, 0.0f)
                curveTo(8.91f, 8.64f, 8.72f, 8.0f, 9.04f, 7.54f)
                curveTo(9.65f, 6.65f, 10.67f, 6.0f, 11.99f, 6.0f)
                curveToRelative(1.48f, 0.0f, 2.49f, 0.67f, 3.01f, 1.52f)
                curveTo(15.44f, 8.24f, 15.7f, 9.59f, 15.02f, 10.6f)
                close()
            }
        }
        .build()
        return _helpCenter!!
    }

private var _helpCenter: ImageVector? = null
