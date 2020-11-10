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

public val SimpleIcons.Esea: VectorAsset
    get() {
        if (_esea != null) {
            return _esea!!
        }
        _esea = VectorAssetBuilder(name = "Esea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.054f, 3.0f)
                lineTo(8.95f, 9.746f)
                lineTo(0.0f, 9.883f)
                lineToRelative(5.832f, 4.47f)
                lineToRelative(-4.79f, 6.879f)
                lineToRelative(8.491f, -4.088f)
                lineToRelative(5.711f, 4.323f)
                verticalLineToRelative(-7.114f)
                lineTo(24.0f, 10.029f)
                lineTo(6.745f, 14.05f)
                arcToRelative(12.575f, 12.575f, 0.0f, false, false, 1.589f, -1.955f)
                arcToRelative(5.475f, 5.475f, 0.0f, false, false, 0.617f, -1.786f)
                lineToRelative(5.593f, -0.151f)
                close()
            }
        }
        .build()
        return _esea!!
    }

private var _esea: VectorAsset? = null
