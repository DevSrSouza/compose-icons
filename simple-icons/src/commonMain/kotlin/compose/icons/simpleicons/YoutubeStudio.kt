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

public val SimpleIcons.YoutubeStudio: VectorAsset
    get() {
        if (_youtubeStudio != null) {
            return _youtubeStudio!!
        }
        _youtubeStudio = VectorAssetBuilder(name = "YoutubeStudio", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.577f, 15.606f)
                lineTo(15.606f, 12.0f)
                lineTo(9.577f, 8.394f)
                close()
                moveTo(20.957f, 13.183f)
                lineToRelative(2.536f, 1.972f)
                quadToRelative(0.394f, 0.282f, 0.113f, 0.789f)
                lineToRelative(-2.423f, 4.169f)
                quadToRelative(-0.225f, 0.394f, -0.732f, 0.225f)
                lineToRelative(-2.986f, -1.183f)
                quadToRelative(-1.183f, 0.845f, -2.028f, 1.183f)
                lineToRelative(-0.451f, 3.155f)
                quadToRelative(-0.113f, 0.507f, -0.563f, 0.507f)
                lineTo(9.577f, 24.0f)
                quadToRelative(-0.45f, 0.0f, -0.563f, -0.507f)
                lineToRelative(-0.45f, -3.155f)
                quadToRelative(-1.071f, -0.45f, -2.029f, -1.183f)
                lineTo(3.55f, 20.338f)
                quadToRelative(-0.507f, 0.169f, -0.732f, -0.225f)
                lineToRelative(-2.423f, -4.17f)
                quadToRelative(-0.281f, -0.506f, 0.113f, -0.788f)
                lineToRelative(2.535f, -1.972f)
                quadTo(2.986f, 12.79f, 2.986f, 12.0f)
                reflectiveQuadToRelative(0.056f, -1.183f)
                lineTo(0.507f, 8.845f)
                quadToRelative(-0.394f, -0.282f, -0.113f, -0.789f)
                lineToRelative(2.423f, -4.169f)
                quadToRelative(0.225f, -0.394f, 0.732f, -0.225f)
                lineToRelative(2.986f, 1.183f)
                quadTo(7.718f, 4.0f, 8.563f, 3.662f)
                lineTo(9.014f, 0.507f)
                quadTo(9.127f, 0.0f, 9.577f, 0.0f)
                horizontalLineToRelative(4.846f)
                quadToRelative(0.45f, 0.0f, 0.563f, 0.507f)
                lineToRelative(0.45f, 3.155f)
                quadToRelative(1.071f, 0.45f, 2.029f, 1.183f)
                lineToRelative(2.986f, -1.183f)
                quadToRelative(0.507f, -0.169f, 0.732f, 0.225f)
                lineToRelative(2.423f, 4.17f)
                quadToRelative(0.281f, 0.506f, -0.113f, 0.788f)
                lineToRelative(-2.535f, 1.972f)
                quadToRelative(0.056f, 0.394f, 0.056f, 1.183f)
                reflectiveQuadToRelative(-0.056f, 1.183f)
                close()
            }
        }
        .build()
        return _youtubeStudio!!
    }

private var _youtubeStudio: VectorAsset? = null
