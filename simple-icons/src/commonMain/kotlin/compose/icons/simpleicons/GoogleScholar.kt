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

public val SimpleIcons.GoogleScholar: VectorAsset
    get() {
        if (_googleScholar != null) {
            return _googleScholar!!
        }
        _googleScholar = VectorAssetBuilder(name = "GoogleScholar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, -14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                close()
                moveTo(12.0f, 0.0f)
                lineTo(0.0f, 9.5f)
                lineToRelative(4.838f, 3.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.162f, 4.44f)
                lineTo(24.0f, 9.5f)
                close()
            }
        }
        .build()
        return _googleScholar!!
    }

private var _googleScholar: VectorAsset? = null
