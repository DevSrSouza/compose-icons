package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) {
            return _beerBottle!!
        }
        _beerBottle = Builder(name = "BeerBottle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.5f, 39.5f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.6f, 15.0f)
                lineTo(147.0f, 60.8f)
                lineToRelative(-37.4f, 7.4f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -6.1f, 3.3f)
                lineTo(18.8f, 156.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(41.4f, 41.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineToRelative(84.7f, -84.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.3f, -6.1f)
                lineToRelative(7.4f, -37.4f)
                lineToRelative(38.3f, -50.9f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 240.0f, 60.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, -3.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 248.5f, 39.5f)
                close()
                moveTo(108.0f, 195.0f)
                lineTo(61.0f, 148.0f)
                lineToRelative(35.0f, -35.0f)
                lineToRelative(47.0f, 47.0f)
                close()
                moveTo(77.2f, 220.2f)
                lineTo(35.8f, 178.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(44.0f, 165.0f)
                lineToRelative(47.0f, 47.0f)
                lineToRelative(-8.2f, 8.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 77.2f, 220.2f)
                close()
                moveTo(174.4f, 96.8f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -2.2f, 4.8f)
                lineToRelative(-7.3f, 36.5f)
                lineTo(160.0f, 143.0f)
                lineTo(113.0f, 96.0f)
                lineToRelative(4.9f, -4.9f)
                lineToRelative(36.5f, -7.3f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 4.8f, -2.2f)
                lineToRelative(55.7f, -41.8f)
                lineToRelative(1.3f, 1.3f)
                close()
            }
        }
        .build()
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
