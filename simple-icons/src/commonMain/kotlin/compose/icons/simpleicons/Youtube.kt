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

public val SimpleIcons.Youtube: VectorAsset
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = VectorAssetBuilder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.499f, 6.203f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, -2.089f, -2.089f)
                curveToRelative(-1.87f, -0.501f, -9.4f, -0.501f, -9.4f, -0.501f)
                reflectiveCurveToRelative(-7.509f, -0.01f, -9.399f, 0.501f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, -2.088f, 2.09f)
                arcTo(31.258f, 31.26f, 0.0f, false, false, 0.0f, 12.01f)
                arcToRelative(31.258f, 31.26f, 0.0f, false, false, 0.523f, 5.785f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 2.088f, 2.089f)
                curveToRelative(1.869f, 0.502f, 9.4f, 0.502f, 9.4f, 0.502f)
                reflectiveCurveToRelative(7.508f, 0.0f, 9.399f, -0.502f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 2.089f, -2.09f)
                arcToRelative(31.258f, 31.26f, 0.0f, false, false, 0.5f, -5.784f)
                arcToRelative(31.258f, 31.26f, 0.0f, false, false, -0.5f, -5.808f)
                close()
                moveTo(9.608f, 15.603f)
                lineTo(9.608f, 8.407f)
                lineToRelative(6.266f, 3.604f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: VectorAsset? = null
