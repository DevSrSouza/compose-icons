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

public val SimpleIcons.DWavesystems: ImageVector
    get() {
        if (_dWavesystems != null) {
            return _dWavesystems!!
        }
        _dWavesystems = Builder(name = "DWavesystems", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.106f, 12.005f)
                curveToRelative(0.0f, 1.582f, -1.284f, 2.864f, -2.868f, 2.864f)
                curveToRelative(-1.584f, 0.0f, -2.868f, -1.282f, -2.868f, -2.864f)
                curveToRelative(0.0f, -1.582f, 1.284f, -2.864f, 2.868f, -2.864f)
                curveToRelative(1.584f, 0.0f, 2.868f, 1.282f, 2.868f, 2.864f)
                close()
                moveTo(7.238f, 0.0f)
                curveTo(5.654f, 0.0f, 4.369f, 1.282f, 4.369f, 2.863f)
                reflectiveCurveToRelative(1.284f, 2.863f, 2.868f, 2.863f)
                curveToRelative(1.584f, 0.0f, 2.868f, -1.282f, 2.868f, -2.863f)
                curveTo(10.106f, 1.282f, 8.822f, 0.0f, 7.238f, 0.0f)
                close()
                moveTo(16.762f, 18.278f)
                curveToRelative(-1.584f, 0.0f, -2.868f, 1.276f, -2.868f, 2.864f)
                curveToRelative(0.0f, 1.576f, 1.283f, 2.858f, 2.868f, 2.858f)
                curveToRelative(1.584f, 0.0f, 2.868f, -1.282f, 2.868f, -2.858f)
                curveToRelative(0.0f, -1.587f, -1.284f, -2.864f, -2.868f, -2.864f)
                close()
                moveTo(13.894f, 12.005f)
                curveToRelative(0.0f, -1.582f, 1.284f, -2.864f, 2.868f, -2.864f)
                curveToRelative(1.584f, 0.0f, 2.868f, 1.282f, 2.868f, 2.864f)
                curveToRelative(0.0f, 1.582f, -1.284f, 2.864f, -2.868f, 2.864f)
                curveToRelative(-1.584f, 0.0f, -2.868f, -1.282f, -2.868f, -2.864f)
                close()
                moveTo(14.394f, 12.005f)
                curveToRelative(0.0f, 1.303f, 1.063f, 2.364f, 2.368f, 2.364f)
                reflectiveCurveToRelative(2.368f, -1.06f, 2.368f, -2.364f)
                curveToRelative(0.0f, -1.303f, -1.062f, -2.364f, -2.368f, -2.364f)
                reflectiveCurveToRelative(-2.368f, 1.06f, -2.368f, 2.364f)
                close()
            }
        }
        .build()
        return _dWavesystems!!
    }

private var _dWavesystems: ImageVector? = null
