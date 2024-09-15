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

public val SimpleIcons.Tui: ImageVector
    get() {
        if (_tui != null) {
            return _tui!!
        }
        _tui = Builder(name = "Tui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.517f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, true, -2.117f, 2.117f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, true, -2.117f, -2.117f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, true, 2.117f, -2.117f)
                arcTo(2.117f, 2.117f, 0.0f, false, true, 24.0f, 4.517f)
                close()
                moveTo(1.14f, 7.747f)
                horizontalLineToRelative(5.706f)
                curveToRelative(0.564f, 0.0f, 0.981f, 0.177f, 1.146f, 0.972f)
                curveToRelative(0.185f, 0.884f, 0.113f, 1.499f, -0.886f, 1.569f)
                lineToRelative(-1.791f, 0.132f)
                curveToRelative(1.318f, 8.33f, 9.028f, 11.045f, 13.222f, 2.073f)
                curveToRelative(0.695f, -1.485f, 0.922f, -1.755f, 1.683f, -1.566f)
                curveToRelative(1.031f, 0.256f, 1.172f, 0.79f, 0.677f, 2.283f)
                curveToRelative(-3.623f, 11.057f, -15.819f, 12.166f, -18.211f, -2.604f)
                lineToRelative(-1.455f, 0.105f)
                curveTo(0.046f, 10.794f, 0.0f, 9.796f, 0.0f, 9.24f)
                curveToRelative(0.0f, -1.099f, 0.407f, -1.493f, 1.14f, -1.493f)
                close()
            }
        }
        .build()
        return _tui!!
    }

private var _tui: ImageVector? = null
