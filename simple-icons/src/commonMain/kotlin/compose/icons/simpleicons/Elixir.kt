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

public val SimpleIcons.Elixir: ImageVector
    get() {
        if (_elixir != null) {
            return _elixir!!
        }
        _elixir = Builder(name = "Elixir", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.793f, 16.575f)
                curveToRelative(0.0f, 3.752f, -2.927f, 7.426f, -7.743f, 7.426f)
                curveToRelative(-5.249f, 0.0f, -7.843f, -3.71f, -7.843f, -8.29f)
                curveToRelative(0.0f, -5.21f, 3.892f, -12.952f, 8.0f, -15.647f)
                arcToRelative(0.397f, 0.397f, 0.0f, false, true, 0.61f, 0.371f)
                arcToRelative(9.716f, 9.716f, 0.0f, false, false, 1.694f, 6.518f)
                curveToRelative(0.522f, 0.795f, 1.092f, 1.478f, 1.763f, 2.352f)
                curveToRelative(0.94f, 1.227f, 1.637f, 1.906f, 2.644f, 3.842f)
                lineToRelative(0.015f, 0.028f)
                arcToRelative(7.107f, 7.107f, 0.0f, false, true, 0.86f, 3.4f)
                close()
            }
        }
        .build()
        return _elixir!!
    }

private var _elixir: ImageVector? = null
