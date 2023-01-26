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

public val RoundGroup.BeachAccess: ImageVector
    get() {
        if (_beachAccess != null) {
            return _beachAccess!!
        }
        _beachAccess = Builder(name = "BeachAccess", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.13f, 14.56f)
                lineToRelative(1.43f, -1.43f)
                lineToRelative(5.73f, 5.73f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0.0f, 1.43f)
                curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.43f, 0.0f)
                lineToRelative(-5.73f, -5.73f)
                close()
                moveTo(17.42f, 8.83f)
                lineToRelative(1.27f, -1.27f)
                curveToRelative(0.89f, -0.89f, 0.77f, -2.43f, -0.31f, -3.08f)
                curveToRelative(-3.89f, -2.38f, -9.03f, -1.89f, -12.4f, 1.47f)
                curveToRelative(3.93f, -1.3f, 8.31f, -0.25f, 11.44f, 2.88f)
                close()
                moveTo(5.95f, 5.98f)
                curveToRelative(-3.36f, 3.37f, -3.85f, 8.51f, -1.48f, 12.4f)
                curveToRelative(0.66f, 1.08f, 2.19f, 1.21f, 3.08f, 0.31f)
                lineToRelative(1.27f, -1.27f)
                curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 5.98f)
                close()
                moveTo(5.97f, 5.96f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.38f, 3.01f, 1.17f, 6.88f, 4.3f, 10.02f)
                lineToRelative(5.73f, -5.73f)
                curveToRelative(-3.13f, -3.13f, -7.01f, -4.68f, -10.02f, -4.3f)
                close()
            }
        }
        .build()
        return _beachAccess!!
    }

private var _beachAccess: ImageVector? = null
