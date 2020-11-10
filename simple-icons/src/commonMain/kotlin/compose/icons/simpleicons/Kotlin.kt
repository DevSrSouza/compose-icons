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

public val SimpleIcons.Kotlin: VectorAsset
    get() {
        if (_kotlin != null) {
            return _kotlin!!
        }
        _kotlin = VectorAssetBuilder(name = "Kotlin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3f, 24.0f)
                lineToRelative(11.3f, -11.5f)
                lineTo(24.0f, 24.0f)
                close()
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                lineTo(0.0f, 12.5f)
                close()
                moveTo(13.4f, 0.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(12.0f, -12.0f)
                lineTo(24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _kotlin!!
    }

private var _kotlin: VectorAsset? = null
