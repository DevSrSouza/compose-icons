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

public val BrandsGroup.LastfmSquare: ImageVector
    get() {
        if (_lastfmSquare != null) {
            return _lastfmSquare!!
        }
        _lastfmSquare = Builder(name = "LastfmSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(307.8f, 344.9f)
                curveToRelative(-63.4f, 0.0f, -85.4f, -28.6f, -97.1f, -64.1f)
                curveToRelative(-16.3f, -51.0f, -21.5f, -84.3f, -63.0f, -84.3f)
                curveToRelative(-22.4f, 0.0f, -45.1f, 16.1f, -45.1f, 61.2f)
                curveToRelative(0.0f, 35.2f, 18.0f, 57.2f, 43.3f, 57.2f)
                curveToRelative(28.6f, 0.0f, 47.6f, -21.3f, 47.6f, -21.3f)
                lineToRelative(11.7f, 31.9f)
                reflectiveCurveToRelative(-19.8f, 19.4f, -61.2f, 19.4f)
                curveToRelative(-51.3f, 0.0f, -79.9f, -30.1f, -79.9f, -85.8f)
                curveToRelative(0.0f, -57.9f, 28.6f, -92.0f, 82.5f, -92.0f)
                curveToRelative(73.5f, 0.0f, 80.8f, 41.4f, 100.8f, 101.9f)
                curveToRelative(8.8f, 26.8f, 24.2f, 46.2f, 61.2f, 46.2f)
                curveToRelative(24.9f, 0.0f, 38.1f, -5.5f, 38.1f, -19.1f)
                curveToRelative(0.0f, -19.9f, -21.8f, -22.0f, -49.9f, -28.6f)
                curveToRelative(-30.4f, -7.3f, -42.5f, -23.1f, -42.5f, -48.0f)
                curveToRelative(0.0f, -40.0f, 32.3f, -52.4f, 65.2f, -52.4f)
                curveToRelative(37.4f, 0.0f, 60.1f, 13.6f, 63.0f, 46.6f)
                lineToRelative(-36.7f, 4.4f)
                curveToRelative(-1.5f, -15.8f, -11.0f, -22.4f, -28.6f, -22.4f)
                curveToRelative(-16.1f, 0.0f, -26.0f, 7.3f, -26.0f, 19.8f)
                curveToRelative(0.0f, 11.0f, 4.8f, 17.6f, 20.9f, 21.3f)
                curveToRelative(32.7f, 7.1f, 71.8f, 12.0f, 71.8f, 57.5f)
                curveToRelative(0.1f, 36.7f, -30.7f, 50.6f, -76.1f, 50.6f)
                close()
            }
        }
        .build()
        return _lastfmSquare!!
    }

private var _lastfmSquare: ImageVector? = null
