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

public val BrandsGroup.RedditSquare: ImageVector
    get() {
        if (_redditSquare != null) {
            return _redditSquare!!
        }
        _redditSquare = Builder(name = "RedditSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(283.2f, 345.5f)
                curveToRelative(2.7f, 2.7f, 2.7f, 6.8f, 0.0f, 9.2f)
                curveToRelative(-24.5f, 24.5f, -93.8f, 24.6f, -118.4f, 0.0f)
                curveToRelative(-2.7f, -2.4f, -2.7f, -6.5f, 0.0f, -9.2f)
                curveToRelative(2.4f, -2.4f, 6.5f, -2.4f, 8.9f, 0.0f)
                curveToRelative(18.7f, 19.2f, 81.0f, 19.6f, 100.5f, 0.0f)
                curveToRelative(2.4f, -2.3f, 6.6f, -2.3f, 9.0f, 0.0f)
                close()
                moveTo(191.9f, 291.7f)
                curveToRelative(0.0f, -14.9f, -11.9f, -26.8f, -26.5f, -26.8f)
                curveToRelative(-14.9f, 0.0f, -26.8f, 11.9f, -26.8f, 26.8f)
                curveToRelative(0.0f, 14.6f, 11.9f, 26.5f, 26.8f, 26.5f)
                curveToRelative(14.6f, 0.0f, 26.5f, -11.9f, 26.5f, -26.5f)
                close()
                moveTo(282.6f, 264.9f)
                curveToRelative(-14.6f, 0.0f, -26.5f, 11.9f, -26.5f, 26.8f)
                curveToRelative(0.0f, 14.6f, 11.9f, 26.5f, 26.5f, 26.5f)
                curveToRelative(14.9f, 0.0f, 26.8f, -11.9f, 26.8f, -26.5f)
                curveToRelative(0.0f, -14.9f, -11.9f, -26.8f, -26.8f, -26.8f)
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
                moveTo(348.3f, 220.6f)
                curveToRelative(-10.1f, 0.0f, -19.0f, 4.2f, -25.6f, 10.7f)
                curveToRelative(-24.1f, -16.7f, -56.5f, -27.4f, -92.5f, -28.6f)
                lineToRelative(18.7f, -84.2f)
                lineToRelative(59.5f, 13.4f)
                curveToRelative(0.0f, 14.6f, 11.9f, 26.5f, 26.5f, 26.5f)
                curveToRelative(14.9f, 0.0f, 26.8f, -12.2f, 26.8f, -26.8f)
                curveToRelative(0.0f, -14.6f, -11.9f, -26.8f, -26.8f, -26.8f)
                curveToRelative(-10.4f, 0.0f, -19.3f, 6.2f, -23.8f, 14.9f)
                lineToRelative(-65.7f, -14.6f)
                curveToRelative(-3.3f, -0.9f, -6.5f, 1.5f, -7.4f, 4.8f)
                lineToRelative(-20.5f, 92.8f)
                curveToRelative(-35.7f, 1.5f, -67.8f, 12.2f, -91.9f, 28.9f)
                curveToRelative(-6.5f, -6.8f, -15.8f, -11.0f, -25.9f, -11.0f)
                curveToRelative(-37.5f, 0.0f, -49.8f, 50.4f, -15.5f, 67.5f)
                curveToRelative(-1.2f, 5.4f, -1.8f, 11.0f, -1.8f, 16.7f)
                curveToRelative(0.0f, 56.5f, 63.7f, 102.3f, 141.9f, 102.3f)
                curveToRelative(78.5f, 0.0f, 142.2f, -45.8f, 142.2f, -102.3f)
                curveToRelative(0.0f, -5.7f, -0.6f, -11.6f, -2.1f, -17.0f)
                curveToRelative(33.6f, -17.2f, 21.2f, -67.2f, -16.1f, -67.2f)
                close()
            }
        }
        .build()
        return _redditSquare!!
    }

private var _redditSquare: ImageVector? = null
