package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) {
            return _googlePhotosLogo!!
        }
        _googlePhotosLogo = Builder(name = "GooglePhotosLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 126.0f)
                lineTo(182.9f, 126.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 132.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(126.0f, 73.1f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 18.0f, 124.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(73.1f, 130.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 124.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(130.0f, 182.9f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 238.0f, 132.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 126.0f)
                close()
                moveTo(138.0f, 30.3f)
                arcTo(54.1f, 54.1f, 0.0f, false, true, 186.0f, 84.0f)
                arcToRelative(53.5f, 53.5f, 0.0f, false, true, -20.1f, 42.0f)
                lineTo(138.0f, 126.0f)
                close()
                moveTo(84.0f, 70.0f)
                arcToRelative(53.5f, 53.5f, 0.0f, false, true, 42.0f, 20.1f)
                lineTo(126.0f, 118.0f)
                lineTo(30.3f, 118.0f)
                arcTo(54.1f, 54.1f, 0.0f, false, true, 84.0f, 70.0f)
                close()
                moveTo(118.0f, 225.7f)
                arcTo(54.1f, 54.1f, 0.0f, false, true, 70.0f, 172.0f)
                arcToRelative(53.5f, 53.5f, 0.0f, false, true, 20.1f, -42.0f)
                lineTo(118.0f, 130.0f)
                close()
                moveTo(172.0f, 186.0f)
                arcToRelative(53.5f, 53.5f, 0.0f, false, true, -42.0f, -20.1f)
                lineTo(130.0f, 138.0f)
                horizontalLineToRelative(95.7f)
                arcTo(54.1f, 54.1f, 0.0f, false, true, 172.0f, 186.0f)
                close()
            }
        }
        .build()
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
