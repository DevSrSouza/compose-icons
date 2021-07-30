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

public val BrandsGroup.WikipediaW: ImageVector
    get() {
        if (_wikipediaW != null) {
            return _wikipediaW!!
        }
        _wikipediaW = Builder(name = "WikipediaW", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 51.2f)
                lineToRelative(-0.3f, 12.2f)
                curveToRelative(-28.1f, 0.8f, -45.0f, 15.8f, -55.8f, 40.3f)
                curveToRelative(-25.0f, 57.8f, -103.3f, 240.0f, -155.3f, 358.6f)
                horizontalLineTo(415.0f)
                lineToRelative(-81.9f, -193.1f)
                curveToRelative(-32.5f, 63.6f, -68.3f, 130.0f, -99.2f, 193.1f)
                curveToRelative(-0.3f, 0.3f, -15.0f, 0.0f, -15.0f, -0.3f)
                curveTo(172.0f, 352.3f, 122.8f, 243.4f, 75.8f, 133.4f)
                curveTo(64.4f, 106.7f, 26.4f, 63.4f, 0.2f, 63.7f)
                curveToRelative(0.0f, -3.1f, -0.3f, -10.0f, -0.3f, -14.2f)
                horizontalLineToRelative(161.9f)
                verticalLineToRelative(13.9f)
                curveToRelative(-19.2f, 1.1f, -52.8f, 13.3f, -43.3f, 34.2f)
                curveToRelative(21.9f, 49.7f, 103.6f, 240.3f, 125.6f, 288.6f)
                curveToRelative(15.0f, -29.7f, 57.8f, -109.2f, 75.3f, -142.8f)
                curveToRelative(-13.9f, -28.3f, -58.6f, -133.9f, -72.8f, -160.0f)
                curveToRelative(-9.7f, -17.8f, -36.1f, -19.4f, -55.8f, -19.7f)
                verticalLineTo(49.8f)
                lineToRelative(142.5f, 0.3f)
                verticalLineToRelative(13.1f)
                curveToRelative(-19.4f, 0.6f, -38.1f, 7.8f, -29.4f, 26.1f)
                curveToRelative(18.9f, 40.0f, 30.6f, 68.1f, 48.1f, 104.7f)
                curveToRelative(5.6f, -10.8f, 34.7f, -69.4f, 48.1f, -100.8f)
                curveToRelative(8.9f, -20.6f, -3.9f, -28.6f, -38.6f, -29.4f)
                curveToRelative(0.3f, -3.6f, 0.0f, -10.3f, 0.3f, -13.6f)
                curveToRelative(44.4f, -0.3f, 111.1f, -0.3f, 123.1f, -0.6f)
                verticalLineToRelative(13.6f)
                curveToRelative(-22.5f, 0.8f, -45.8f, 12.8f, -58.1f, 31.7f)
                lineToRelative(-59.2f, 122.8f)
                curveToRelative(6.4f, 16.1f, 63.3f, 142.8f, 69.2f, 156.7f)
                lineTo(559.2f, 91.8f)
                curveToRelative(-8.6f, -23.1f, -36.4f, -28.1f, -47.2f, -28.3f)
                verticalLineTo(49.6f)
                lineToRelative(127.8f, 1.1f)
                lineToRelative(0.2f, 0.5f)
                close()
            }
        }
        .build()
        return _wikipediaW!!
    }

private var _wikipediaW: ImageVector? = null
