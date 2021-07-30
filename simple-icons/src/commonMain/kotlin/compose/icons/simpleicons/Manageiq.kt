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

public val SimpleIcons.Manageiq: ImageVector
    get() {
        if (_manageiq != null) {
            return _manageiq!!
        }
        _manageiq = Builder(name = "Manageiq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.096f, 0.1f)
                lineToRelative(-0.001f, 0.001f)
                arcTo(11.547f, 11.547f, 0.0f, false, false, 0.538f, 11.658f)
                curveToRelative(0.0f, 2.069f, 0.548f, 4.005f, 1.496f, 5.683f)
                lineToRelative(2.869f, -2.867f)
                arcToRelative(7.676f, 7.676f, 0.0f, false, true, -0.54f, -2.816f)
                curveToRelative(0.0f, -4.261f, 3.47f, -7.73f, 7.732f, -7.73f)
                curveToRelative(4.261f, 0.0f, 7.732f, 3.469f, 7.732f, 7.73f)
                curveToRelative(0.0f, 4.262f, -3.47f, 7.732f, -7.732f, 7.732f)
                arcToRelative(7.67f, 7.67f, 0.0f, false, true, -2.6f, -0.459f)
                lineTo(6.597f, 21.83f)
                arcToRelative(11.514f, 11.514f, 0.0f, false, false, 5.499f, 1.388f)
                curveToRelative(2.316f, 0.0f, 4.468f, -0.686f, 6.275f, -1.856f)
                lineToRelative(2.393f, 2.392f)
                lineTo(24.0f, 20.512f)
                lineToRelative(-2.349f, -2.349f)
                arcToRelative(11.51f, 11.51f, 0.0f, false, false, 2.0f, -6.505f)
                curveTo(23.651f, 5.368f, 18.644f, 0.26f, 12.393f, 0.1f)
                curveToRelative(-0.08f, -0.003f, -0.18f, 0.0f, -0.297f, 0.0f)
                close()
                moveTo(12.095f, 9.44f)
                curveToRelative(-1.226f, 0.0f, -2.215f, 0.991f, -2.215f, 2.217f)
                curveToRelative(0.0f, 1.225f, 0.99f, 2.216f, 2.215f, 2.216f)
                arcToRelative(2.215f, 2.215f, 0.0f, true, false, 0.0f, -4.432f)
                close()
                moveTo(7.854f, 12.808f)
                lineToRelative(-0.214f, 0.214f)
                lineTo(0.0f, 20.662f)
                lineToRelative(3.239f, 3.24f)
                lineToRelative(7.855f, -7.856f)
                close()
            }
        }
        .build()
        return _manageiq!!
    }

private var _manageiq: ImageVector? = null
