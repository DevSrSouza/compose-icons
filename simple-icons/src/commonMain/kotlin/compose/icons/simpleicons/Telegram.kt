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

public val SimpleIcons.Telegram: VectorAsset
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = VectorAssetBuilder(name = "Telegram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.91f, 3.79f)
                lineTo(20.3f, 20.84f)
                curveToRelative(-0.25f, 1.21f, -0.98f, 1.5f, -2.0f, 0.94f)
                lineToRelative(-5.5f, -4.07f)
                lineToRelative(-2.66f, 2.57f)
                curveToRelative(-0.3f, 0.3f, -0.55f, 0.56f, -1.1f, 0.56f)
                curveToRelative(-0.72f, 0.0f, -0.6f, -0.27f, -0.84f, -0.95f)
                lineTo(6.3f, 13.7f)
                lineToRelative(-5.45f, -1.7f)
                curveToRelative(-1.18f, -0.35f, -1.19f, -1.16f, 0.26f, -1.75f)
                lineToRelative(21.26f, -8.2f)
                curveToRelative(0.97f, -0.43f, 1.9f, 0.24f, 1.53f, 1.73f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: VectorAsset? = null
