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

public val SimpleIcons.Peloton: ImageVector
    get() {
        if (_peloton != null) {
            return _peloton!!
        }
        _peloton = Builder(name = "Peloton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.728f, 5.764f)
                lineToRelative(1.731f, -3.007f)
                curveToRelative(0.504f, -0.88f, 0.208f, -2.008f, -0.673f, -2.512f)
                curveToRelative(-0.88f, -0.504f, -2.008f, -0.208f, -2.512f, 0.673f)
                lineToRelative(-1.741f, 3.007f)
                curveToRelative(-3.699f, -1.167f, -7.843f, 0.346f, -9.861f, 3.847f)
                curveToRelative(-1.286f, 2.225f, -1.444f, 4.787f, -0.663f, 7.032f)
                lineToRelative(3.204f, -5.558f)
                curveToRelative(0.732f, -1.276f, 1.929f, -2.186f, 3.353f, -2.572f)
                curveToRelative(1.424f, -0.386f, 2.908f, -0.188f, 4.184f, 0.554f)
                curveToRelative(2.631f, 1.523f, 3.541f, 4.905f, 2.018f, 7.536f)
                curveToRelative(-1.523f, 2.631f, -4.896f, 3.541f, -7.536f, 2.018f)
                lineToRelative(1.84f, -3.185f)
                curveToRelative(0.88f, 0.504f, 2.008f, 0.208f, 2.512f, -0.673f)
                curveToRelative(0.504f, -0.88f, 0.208f, -2.008f, -0.673f, -2.512f)
                curveToRelative(-0.88f, -0.504f, -2.008f, -0.208f, -2.512f, 0.673f)
                lineToRelative(-5.855f, 10.157f)
                curveToRelative(-0.504f, 0.88f, -0.208f, 2.008f, 0.673f, 2.512f)
                curveToRelative(0.88f, 0.504f, 2.008f, 0.208f, 2.512f, -0.673f)
                lineTo(9.47f, 20.075f)
                curveToRelative(3.699f, 1.167f, 7.843f, -0.346f, 9.861f, -3.847f)
                curveToRelative(2.018f, -3.491f, 1.256f, -7.833f, -1.602f, -10.464f)
                close()
            }
        }
        .build()
        return _peloton!!
    }

private var _peloton: ImageVector? = null
