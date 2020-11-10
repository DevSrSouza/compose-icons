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

public val SimpleIcons.YoutubeTv: VectorAsset
    get() {
        if (_youtubeTv != null) {
            return _youtubeTv!!
        }
        _youtubeTv = VectorAssetBuilder(name = "YoutubeTv", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.36f, 20.988f)
                lineTo(6.536f, 20.988f)
                curveToRelative(-0.306f, 0.0f, -0.51f, -0.205f, -0.51f, -0.511f)
                curveToRelative(0.0f, -0.306f, 0.204f, -0.51f, 0.51f, -0.51f)
                horizontalLineToRelative(10.928f)
                curveToRelative(0.306f, 0.0f, 0.51f, 0.204f, 0.51f, 0.51f)
                curveToRelative(0.0f, 0.306f, -0.306f, 0.51f, -0.612f, 0.51f)
                close()
                moveTo(1.635f, 3.012f)
                curveTo(0.714f, 3.012f, 0.0f, 3.73f, 0.0f, 4.648f)
                verticalLineToRelative(12.56f)
                curveToRelative(0.0f, 0.92f, 0.714f, 1.634f, 1.634f, 1.634f)
                horizontalLineToRelative(20.73f)
                curveToRelative(0.92f, 0.0f, 1.636f, -0.714f, 1.636f, -1.633f)
                lineTo(24.0f, 4.648f)
                curveToRelative(0.0f, -0.92f, -0.716f, -1.636f, -1.636f, -1.636f)
                close()
                moveTo(9.498f, 7.405f)
                lineToRelative(6.23f, 3.472f)
                lineToRelative(-6.23f, 3.575f)
                close()
            }
        }
        .build()
        return _youtubeTv!!
    }

private var _youtubeTv: VectorAsset? = null
