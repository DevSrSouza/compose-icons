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

public val LightGroup.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) {
            return _beerBottle!!
        }
        _beerBottle = Builder(name = "BeerBottle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.2f, 43.8f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineToRelative(3.1f, 3.2f)
                lineToRelative(-57.4f, 43.0f)
                lineToRelative(-38.7f, 7.7f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -3.0f, 1.7f)
                lineTo(23.1f, 160.4f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.2f)
                lineToRelative(41.3f, 41.3f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.2f, 0.0f)
                lineToRelative(84.6f, -84.7f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 1.7f, -3.0f)
                lineToRelative(7.7f, -38.7f)
                lineToRelative(43.0f, -57.4f)
                lineToRelative(3.2f, 3.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                close()
                moveTo(104.0f, 207.5f)
                lineTo(48.5f, 152.0f)
                lineTo(96.0f, 104.5f)
                lineTo(151.5f, 160.0f)
                close()
                moveTo(72.9f, 224.4f)
                lineTo(31.6f, 183.1f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, 0.0f, -14.2f)
                lineToRelative(8.4f, -8.4f)
                lineTo(95.5f, 216.0f)
                lineToRelative(-8.4f, 8.4f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 72.9f, 224.4f)
                close()
                moveTo(179.2f, 100.4f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, -1.1f, 2.4f)
                lineTo(170.5f, 141.0f)
                lineTo(160.0f, 151.5f)
                lineTo(104.5f, 96.0f)
                lineTo(115.0f, 85.5f)
                lineToRelative(38.2f, -7.6f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.4f, -1.1f)
                lineToRelative(59.8f, -44.9f)
                lineToRelative(8.7f, 8.7f)
                close()
            }
        }
        .build()
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
