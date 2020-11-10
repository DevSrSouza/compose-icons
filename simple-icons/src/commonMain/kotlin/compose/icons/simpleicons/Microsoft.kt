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

public val SimpleIcons.Microsoft: VectorAsset
    get() {
        if (_microsoft != null) {
            return _microsoft!!
        }
        _microsoft = VectorAssetBuilder(name = "Microsoft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 12.6f)
                horizontalLineToRelative(11.4f)
                lineTo(11.4f, 24.0f)
                close()
                moveTo(24.0f, 24.0f)
                lineTo(12.6f, 24.0f)
                lineTo(12.6f, 12.6f)
                lineTo(24.0f, 12.6f)
                lineTo(24.0f, 24.0f)
                close()
                moveTo(11.4f, 11.4f)
                lineTo(0.0f, 11.4f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(11.4f)
                verticalLineToRelative(11.4f)
                close()
                moveTo(24.0f, 11.4f)
                lineTo(12.6f, 11.4f)
                lineTo(12.6f, 0.0f)
                lineTo(24.0f, 0.0f)
                verticalLineToRelative(11.4f)
                close()
            }
        }
        .build()
        return _microsoft!!
    }

private var _microsoft: VectorAsset? = null
