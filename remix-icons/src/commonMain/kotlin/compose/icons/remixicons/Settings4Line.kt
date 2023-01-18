package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Settings4Line: ImageVector
    get() {
        if (_settings4Line != null) {
            return _settings4Line!!
        }
        _settings4Line = Builder(name = "Settings4Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, -0.865f, 0.11f, -1.703f, 0.316f, -2.504f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.99f, 4.867f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 4.335f, -2.505f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 5.348f, 0.0f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 4.335f, 2.505f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.675f, 4.63f)
                curveToRelative(0.206f, 0.8f, 0.316f, 1.638f, 0.316f, 2.503f)
                curveToRelative(0.0f, 0.865f, -0.11f, 1.703f, -0.316f, 2.504f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.675f, 4.629f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, -4.335f, 2.505f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.348f, 0.0f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, -4.335f, -2.505f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.675f, -4.63f)
                curveTo(2.11f, 13.704f, 2.0f, 12.866f, 2.0f, 12.0f)
                close()
                moveTo(6.804f, 15.0f)
                curveToRelative(0.63f, 1.091f, 0.81f, 2.346f, 0.564f, 3.524f)
                curveToRelative(0.408f, 0.29f, 0.842f, 0.541f, 1.297f, 0.75f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 12.0f, 18.0f)
                curveToRelative(1.26f, 0.0f, 2.438f, 0.471f, 3.335f, 1.274f)
                curveToRelative(0.455f, -0.209f, 0.889f, -0.46f, 1.297f, -0.75f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 17.196f, 15.0f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, 2.77f, -2.25f)
                arcToRelative(8.126f, 8.126f, 0.0f, false, false, 0.0f, -1.5f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 17.195f, 9.0f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, -0.564f, -3.524f)
                arcToRelative(7.989f, 7.989f, 0.0f, false, false, -1.297f, -0.75f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 12.0f, 6.0f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, -3.335f, -1.274f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, -1.297f, 0.75f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 6.804f, 9.0f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, -2.77f, 2.25f)
                arcToRelative(8.126f, 8.126f, 0.0f, false, false, 0.0f, 1.5f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 6.805f, 15.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _settings4Line!!
    }

private var _settings4Line: ImageVector? = null
