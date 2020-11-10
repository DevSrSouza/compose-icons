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

public val SimpleIcons.Trustpilot: VectorAsset
    get() {
        if (_trustpilot != null) {
            return _trustpilot!!
        }
        _trustpilot = VectorAssetBuilder(name = "Trustpilot", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.964f)
                lineToRelative(5.214f, -1.321f)
                lineToRelative(2.179f, 6.714f)
                lineTo(12.0f, 17.964f)
                close()
                moveTo(24.0f, 9.286f)
                horizontalLineToRelative(-9.179f)
                lineTo(12.0f, 0.643f)
                lineTo(9.179f, 9.286f)
                horizontalLineTo(0.0f)
                lineToRelative(7.429f, 5.357f)
                lineToRelative(-2.821f, 8.643f)
                lineToRelative(7.429f, -5.357f)
                lineToRelative(4.571f, -3.286f)
                lineTo(24.0f, 9.286f)
                lineTo(24.0f, 9.286f)
                lineTo(24.0f, 9.286f)
                lineTo(24.0f, 9.286f)
                close()
            }
        }
        .build()
        return _trustpilot!!
    }

private var _trustpilot: VectorAsset? = null
