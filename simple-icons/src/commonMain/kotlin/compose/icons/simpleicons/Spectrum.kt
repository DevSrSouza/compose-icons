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

public val SimpleIcons.Spectrum: VectorAsset
    get() {
        if (_spectrum != null) {
            return _spectrum!!
        }
        _spectrum = VectorAssetBuilder(name = "Spectrum", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.2f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 1.8f, 12.0f)
                horizontalLineToRelative(1.8f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.4f, 8.4f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.8f, 1.8f)
                horizontalLineToRelative(8.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.8f, -1.8f)
                verticalLineToRelative(-1.8f)
                curveTo(24.0f, 9.133f, 14.867f, 0.0f, 3.6f, 0.0f)
                horizontalLineTo(1.8f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 0.0f, 1.8f)
                verticalLineToRelative(8.4f)
                close()
            }
        }
        .build()
        return _spectrum!!
    }

private var _spectrum: VectorAsset? = null
