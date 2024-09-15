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

public val SimpleIcons.Wearos: ImageVector
    get() {
        if (_wearos != null) {
            return _wearos!!
        }
        _wearos = Builder(name = "Wearos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.416f, 21.135f)
                curveToRelative(-0.969f, 0.0f, -1.894f, -0.56f, -2.313f, -1.502f)
                lineTo(0.219f, 6.42f)
                curveTo(-0.349f, 5.143f, 0.225f, 3.647f, 1.501f, 3.079f)
                curveToRelative(1.277f, -0.568f, 2.773f, 0.005f, 3.341f, 1.282f)
                lineToRelative(5.883f, 13.213f)
                curveToRelative(0.568f, 1.277f, -0.005f, 2.773f, -1.282f, 3.341f)
                arcToRelative(2.525f, 2.525f, 0.0f, false, true, -1.027f, 0.219f)
                close()
                moveTo(15.611f, 21.171f)
                curveToRelative(-0.891f, 0.0f, -1.741f, -0.515f, -2.127f, -1.382f)
                lineTo(7.39f, 6.102f)
                curveTo(6.867f, 4.928f, 7.396f, 3.553f, 8.569f, 3.03f)
                curveToRelative(1.173f, -0.522f, 2.549f, 0.005f, 3.072f, 1.179f)
                lineToRelative(6.094f, 13.689f)
                curveToRelative(0.523f, 1.174f, -0.005f, 2.549f, -1.179f, 3.072f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, true, -0.946f, 0.202f)
                close()
                moveTo(24.0f, 5.195f)
                arcToRelative(2.327f, 2.327f, 0.0f, false, true, -2.327f, 2.327f)
                arcToRelative(2.327f, 2.327f, 0.0f, false, true, -2.327f, -2.327f)
                arcToRelative(2.327f, 2.327f, 0.0f, false, true, 2.327f, -2.327f)
                arcTo(2.327f, 2.327f, 0.0f, false, true, 24.0f, 5.195f)
                close()
                moveTo(21.388f, 10.311f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, -2.489f, 2.489f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, -2.489f, -2.489f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, 2.489f, -2.489f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, 2.489f, 2.489f)
                close()
            }
        }
        .build()
        return _wearos!!
    }

private var _wearos: ImageVector? = null
