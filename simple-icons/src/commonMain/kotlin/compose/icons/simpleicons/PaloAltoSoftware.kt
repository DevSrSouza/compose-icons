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

public val SimpleIcons.PaloAltoSoftware: VectorAsset
    get() {
        if (_paloAltoSoftware != null) {
            return _paloAltoSoftware!!
        }
        _paloAltoSoftware = VectorAssetBuilder(name = "PaloAltoSoftware", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.576f, 14.448f)
                lineToRelative(6.323f, -6.434f)
                lineToRelative(1.649f, -1.678f)
                arcToRelative(3.419f, 3.419f, 0.0f, false, true, 4.825f, 0.0f)
                lineToRelative(1.609f, 1.608f)
                lineToRelative(6.433f, 6.434f)
                lineToRelative(0.84f, -0.84f)
                curveToRelative(0.909f, -0.839f, 0.909f, -2.237f, 0.07f, -3.146f)
                lineTo(13.603f, 0.742f)
                curveToRelative(-0.91f, -0.91f, -2.308f, -0.91f, -3.217f, 0.0f)
                lineToRelative(-9.65f, 9.65f)
                curveToRelative(-0.91f, 0.909f, -0.91f, 2.307f, 0.0f, 3.216f)
                close()
                moveTo(13.604f, 7.175f)
                curveToRelative(-0.91f, -0.91f, -2.308f, -0.91f, -3.217f, 0.0f)
                lineToRelative(-8.042f, 8.042f)
                lineToRelative(-1.608f, 1.608f)
                curveToRelative(-0.91f, 0.91f, -0.91f, 2.308f, 0.0f, 3.217f)
                lineToRelative(3.216f, 3.217f)
                curveToRelative(0.91f, 0.909f, 2.308f, 0.909f, 3.217f, 0.0f)
                lineToRelative(4.825f, -4.826f)
                lineToRelative(4.826f, 4.826f)
                curveToRelative(0.909f, 0.909f, 2.307f, 0.909f, 3.216f, 0.0f)
                lineToRelative(3.217f, -3.217f)
                curveToRelative(0.91f, -0.839f, 0.91f, -2.308f, 0.07f, -3.217f)
                close()
            }
        }
        .build()
        return _paloAltoSoftware!!
    }

private var _paloAltoSoftware: VectorAsset? = null
