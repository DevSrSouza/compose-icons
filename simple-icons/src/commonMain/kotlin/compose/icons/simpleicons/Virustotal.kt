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

public val SimpleIcons.Virustotal: VectorAsset
    get() {
        if (_virustotal != null) {
            return _virustotal!!
        }
        _virustotal = VectorAssetBuilder(name = "Virustotal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.87f, 12.0f)
                lineTo(0.0f, 22.68f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 1.32f)
                lineTo(0.0f, 1.32f)
                close()
                moveTo(21.6f, 20.52f)
                lineTo(5.28f, 20.52f)
                lineToRelative(8.637f, -8.448f)
                lineTo(5.28f, 3.48f)
                lineTo(21.6f, 3.48f)
                close()
            }
        }
        .build()
        return _virustotal!!
    }

private var _virustotal: VectorAsset? = null
