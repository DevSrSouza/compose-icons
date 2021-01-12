package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Sprint: VectorAsset
    get() {
        if (_sprint != null) {
            return _sprint!!
        }
        _sprint = VectorAssetBuilder(name = "Sprint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.201f, 0.0f)
                curveToRelative(2.416f, 2.642f, 5.96f, 7.925f, 7.203f, 9.821f)
                curveTo(8.41f, 7.09f, 5.904f, 1.4f, 2.2f, 0.0f)
                close()
                moveTo(7.665f, 2.461f)
                curveToRelative(1.264f, 3.635f, 2.37f, 8.828f, 2.687f, 11.356f)
                curveToRelative(0.429f, -2.845f, 0.203f, -6.276f, -0.361f, -8.443f)
                curveTo(9.697f, 4.2f, 8.636f, 2.867f, 7.665f, 2.46f)
                close()
                moveTo(11.842f, 4.809f)
                curveToRelative(0.022f, 2.732f, -0.948f, 9.099f, -1.987f, 11.876f)
                curveToRelative(2.303f, -2.98f, 4.132f, -6.458f, 4.132f, -8.964f)
                curveToRelative(0.0f, -1.31f, -0.926f, -2.212f, -2.145f, -2.912f)
                close()
                moveTo(15.906f, 7.609f)
                curveToRelative(-1.92f, 4.492f, -6.232f, 10.114f, -8.602f, 12.575f)
                curveToRelative(3.341f, -2.28f, 8.173f, -6.638f, 9.82f, -8.986f)
                curveToRelative(0.385f, -0.542f, 0.678f, -0.88f, 0.678f, -1.467f)
                curveToRelative(0.0f, -0.948f, -1.106f, -1.648f, -1.896f, -2.123f)
                close()
                moveTo(19.383f, 10.521f)
                curveTo(15.093f, 14.991f, 6.559f, 21.675f, 2.292f, 24.0f)
                curveToRelative(5.396f, -1.806f, 13.23f, -6.028f, 18.694f, -9.799f)
                curveToRelative(0.451f, -0.316f, 0.813f, -0.61f, 0.813f, -1.129f)
                curveToRelative(0.0f, -0.88f, -1.626f, -2.077f, -2.416f, -2.551f)
                close()
            }
        }
        .build()
        return _sprint!!
    }

private var _sprint: VectorAsset? = null
