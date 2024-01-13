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

public val SimpleIcons.Deluge: ImageVector
    get() {
        if (_deluge != null) {
            return _deluge!!
        }
        _deluge = Builder(name = "Deluge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.766f, 10.341f)
                lineTo(12.006f, 0.0f)
                lineToRelative(-6.77f, 10.342f)
                curveToRelative(-1.945f, 2.97f, -2.191f, 6.432f, -0.66f, 9.264f)
                curveTo(6.04f, 22.316f, 8.885f, 24.0f, 12.001f, 24.0f)
                curveToRelative(3.113f, 0.0f, 5.957f, -1.681f, 7.421f, -4.388f)
                curveToRelative(1.532f, -2.832f, 1.287f, -6.297f, -0.657f, -9.27f)
                close()
                moveTo(8.684f, 17.241f)
                curveToRelative(1.433f, 2.554f, 3.608f, 3.045f, 6.585f, 2.102f)
                curveToRelative(-1.7f, 1.848f, -5.188f, 2.337f, -7.557f, -0.302f)
                curveToRelative(-1.63f, -1.817f, -1.773f, -4.351f, -0.642f, -6.468f)
                curveToRelative(1.132f, -2.117f, 3.388f, -2.706f, 5.012f, -1.551f)
                curveToRelative(-3.723f, 0.09f, -4.43f, 4.38f, -3.398f, 6.218f)
                close()
                moveTo(17.404f, 11.232f)
                curveToRelative(0.723f, 1.107f, 1.152f, 2.267f, 1.314f, 3.418f)
                curveToRelative(-3.354f, 5.763f, -7.862f, 4.879f, -9.062f, 1.377f)
                curveToRelative(-0.554f, -1.618f, 1.19f, -5.08f, 4.514f, -3.725f)
                curveToRelative(-1.296f, -2.838f, -4.238f, -4.017f, -6.911f, -1.809f)
                arcToRelative(5.099f, 5.099f, 0.0f, false, false, -0.609f, 0.66f)
                lineToRelative(5.355f, -8.179f)
                lineToRelative(5.398f, 8.258f)
                close()
            }
        }
        .build()
        return _deluge!!
    }

private var _deluge: ImageVector? = null
