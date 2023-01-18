package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) {
            return _googlePhotosLogo!!
        }
        _googlePhotosLogo = Builder(name = "GooglePhotosLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 124.0f)
                lineTo(187.0f, 124.0f)
                arcToRelative(67.4f, 67.4f, 0.0f, false, false, 13.0f, -40.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -68.0f, -68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(124.0f, 69.0f)
                arcTo(67.4f, 67.4f, 0.0f, false, false, 84.0f, 56.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -68.0f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(69.0f, 132.0f)
                arcToRelative(67.4f, 67.4f, 0.0f, false, false, -13.0f, 40.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(132.0f, 187.0f)
                arcToRelative(67.4f, 67.4f, 0.0f, false, false, 40.0f, 13.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, -68.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 124.0f)
                close()
                moveTo(84.0f, 72.0f)
                arcToRelative(51.5f, 51.5f, 0.0f, false, true, 40.0f, 18.8f)
                lineTo(124.0f, 116.0f)
                lineTo(32.6f, 116.0f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 84.0f, 72.0f)
                close()
                moveTo(172.0f, 184.0f)
                arcToRelative(51.5f, 51.5f, 0.0f, false, true, -40.0f, -18.8f)
                lineTo(132.0f, 140.0f)
                horizontalLineToRelative(91.4f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 172.0f, 184.0f)
                close()
            }
        }
        .build()
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
