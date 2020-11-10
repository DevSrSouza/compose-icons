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

public val SimpleIcons.Hurriyetemlak: VectorAsset
    get() {
        if (_hurriyetemlak != null) {
            return _hurriyetemlak!!
        }
        _hurriyetemlak = VectorAssetBuilder(name = "Hurriyetemlak", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.085f)
                lineTo(11.994f, 4.091f)
                lineTo(0.0f, 16.097f)
                lineToRelative(3.817f, 3.812f)
                lineToRelative(8.182f, -8.189f)
                lineToRelative(8.189f, 8.182f)
                close()
            }
        }
        .build()
        return _hurriyetemlak!!
    }

private var _hurriyetemlak: VectorAsset? = null
