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

public val SimpleIcons.ApacheSolr: VectorAsset
    get() {
        if (_apacheSolr != null) {
            return _apacheSolr!!
        }
        _apacheSolr = VectorAssetBuilder(name = "ApacheSolr", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.74f, 3.797f)
                lineTo(8.919f, 16.585f)
                lineToRelative(14.866f, -6.842f)
                arcToRelative(11.695f, 11.695f, 0.0f, false, false, -3.045f, -5.946f)
                close()
                moveTo(11.964f, 0.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -4.621f, 0.931f)
                lineTo(5.767f, 14.293f)
                lineTo(13.683f, 0.144f)
                curveTo(13.146f, 0.036f, 12.573f, 0.0f, 11.964f, 0.0f)
                close()
                moveTo(23.893f, 10.46f)
                lineTo(9.815f, 18.34f)
                lineToRelative(13.218f, -1.576f)
                curveToRelative(0.609f, -1.468f, 0.967f, -3.045f, 0.967f, -4.728f)
                curveToRelative(0.0f, -0.537f, -0.036f, -1.075f, -0.107f, -1.576f)
                close()
                moveTo(18.699f, 21.994f)
                arcToRelative(12.403f, 12.403f, 0.0f, false, false, 3.797f, -4.155f)
                lineToRelative(-12.358f, 2.436f)
                lineToRelative(8.561f, 1.719f)
                close()
                moveTo(14.436f, 0.251f)
                lineTo(7.558f, 15.188f)
                lineTo(20.346f, 3.367f)
                curveToRelative(-1.647f, -1.54f, -3.653f, -2.651f, -5.91f, -3.116f)
                close()
                moveTo(13.003f, 24.0f)
                arcToRelative(11.838f, 11.838f, 0.0f, false, false, 3.761f, -0.931f)
                lineToRelative(-6.949f, -0.824f)
                lineTo(13.003f, 24.0f)
                close()
                moveTo(1.003f, 7.093f)
                arcTo(11.626f, 11.626f, 0.0f, false, false, 0.0f, 10.961f)
                lineToRelative(1.863f, 3.331f)
                lineToRelative(-0.86f, -7.199f)
                close()
                moveTo(6.304f, 1.397f)
                arcToRelative(11.957f, 11.957f, 0.0f, false, false, -4.226f, 3.797f)
                lineToRelative(1.755f, 8.776f)
                lineTo(6.304f, 1.397f)
                close()
            }
        }
        .build()
        return _apacheSolr!!
    }

private var _apacheSolr: VectorAsset? = null
