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

public val SimpleIcons.YoutubeMusic: VectorAsset
    get() {
        if (_youtubeMusic != null) {
            return _youtubeMusic!!
        }
        _youtubeMusic = VectorAssetBuilder(name = "YoutubeMusic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8182f, 15.1364f)
                lineToRelative(5.3182f, -3.2727f)
                lineToRelative(-5.3182f, -3.0f)
                close()
                moveTo(12.0f, 6.2782f)
                curveToRelative(3.1555f, 0.0f, 5.7218f, 2.5664f, 5.7218f, 5.7218f)
                reflectiveCurveTo(15.1555f, 17.7218f, 12.0f, 17.7218f)
                reflectiveCurveTo(6.2782f, 15.1555f, 6.2782f, 12.0f)
                reflectiveCurveTo(8.8445f, 6.2782f, 12.0f, 6.2782f)
                moveToRelative(0.0f, -0.5509f)
                curveTo(8.535f, 5.7273f, 5.7273f, 8.535f, 5.7273f, 12.0f)
                reflectiveCurveTo(8.535f, 18.2727f, 12.0f, 18.2727f)
                reflectiveCurveTo(18.2727f, 15.465f, 18.2727f, 12.0f)
                reflectiveCurveTo(15.465f, 5.7273f, 12.0f, 5.7273f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
            }
        }
        .build()
        return _youtubeMusic!!
    }

private var _youtubeMusic: VectorAsset? = null
