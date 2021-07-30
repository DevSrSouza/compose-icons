package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.YoutubeSquare: ImageVector
    get() {
        if (_youtubeSquare != null) {
            return _youtubeSquare!!
        }
        _youtubeSquare = Builder(name = "YoutubeSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.8f, 202.1f)
                lineToRelative(95.2f, 54.1f)
                lineToRelative(-95.2f, 54.1f)
                lineTo(186.8f, 202.1f)
                close()
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(406.0f, 256.3f)
                reflectiveCurveToRelative(0.0f, -59.6f, -7.6f, -88.2f)
                curveToRelative(-4.2f, -15.8f, -16.5f, -28.2f, -32.2f, -32.4f)
                curveTo(337.9f, 128.0f, 224.0f, 128.0f, 224.0f, 128.0f)
                reflectiveCurveToRelative(-113.9f, 0.0f, -142.2f, 7.7f)
                curveToRelative(-15.7f, 4.2f, -28.0f, 16.6f, -32.2f, 32.4f)
                curveToRelative(-7.6f, 28.5f, -7.6f, 88.2f, -7.6f, 88.2f)
                reflectiveCurveToRelative(0.0f, 59.6f, 7.6f, 88.2f)
                curveToRelative(4.2f, 15.8f, 16.5f, 27.7f, 32.2f, 31.9f)
                curveTo(110.1f, 384.0f, 224.0f, 384.0f, 224.0f, 384.0f)
                reflectiveCurveToRelative(113.9f, 0.0f, 142.2f, -7.7f)
                curveToRelative(15.7f, -4.2f, 28.0f, -16.1f, 32.2f, -31.9f)
                curveToRelative(7.6f, -28.5f, 7.6f, -88.1f, 7.6f, -88.1f)
                close()
            }
        }
        .build()
        return _youtubeSquare!!
    }

private var _youtubeSquare: ImageVector? = null
