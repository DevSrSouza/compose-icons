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

public val SimpleIcons.Pytorch: VectorAsset
    get() {
        if (_pytorch != null) {
            return _pytorch!!
        }
        _pytorch = VectorAssetBuilder(name = "Pytorch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 0.04f)
                lineToRelative(-7.03f, 7.03f)
                arcToRelative(9.832f, 9.832f, 0.0f, false, false, 0.0f, 13.975f)
                arcToRelative(9.833f, 9.833f, 0.0f, false, false, 13.976f, 0.0f)
                curveToRelative(3.97f, -3.887f, 3.972f, -10.171f, 0.084f, -13.976f)
                lineToRelative(-1.738f, 1.737f)
                curveToRelative(2.895f, 2.895f, 2.895f, 7.608f, 0.0f, 10.503f)
                curveToRelative(-2.894f, 2.894f, -7.608f, 2.894f, -10.503f, 0.0f)
                curveTo(3.9f, 16.414f, 3.9f, 11.7f, 6.794f, 8.806f)
                lineToRelative(4.632f, -4.631f)
                lineToRelative(0.58f, -0.663f)
                close()
                moveTo(15.561f, 3.926f)
                arcToRelative(1.323f, 1.323f, 0.0f, false, false, -1.323f, 1.323f)
                arcToRelative(1.323f, 1.323f, 0.0f, false, false, 1.323f, 1.323f)
                arcToRelative(1.323f, 1.323f, 0.0f, false, false, 1.323f, -1.323f)
                arcToRelative(1.323f, 1.323f, 0.0f, false, false, -1.323f, -1.323f)
                close()
            }
        }
        .build()
        return _pytorch!!
    }

private var _pytorch: VectorAsset? = null
