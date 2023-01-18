package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) {
            return _beerBottle!!
        }
        _beerBottle = Builder(name = "BeerBottle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.7f, 42.3f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineToRelative(1.5f, 1.4f)
                lineTo(148.7f, 64.5f)
                lineToRelative(-38.3f, 7.7f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -4.1f, 2.1f)
                lineTo(21.7f, 159.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 0.0f, 34.0f)
                lineTo(63.0f, 234.3f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 34.0f, 0.0f)
                lineToRelative(84.7f, -84.6f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 2.1f, -4.1f)
                lineToRelative(7.7f, -38.3f)
                lineToRelative(41.4f, -55.1f)
                lineToRelative(1.4f, 1.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 245.7f, 42.3f)
                close()
                moveTo(104.0f, 204.7f)
                lineTo(51.3f, 152.0f)
                lineTo(96.0f, 107.3f)
                lineTo(148.7f, 160.0f)
                close()
                moveTo(74.3f, 223.0f)
                lineTo(33.0f, 181.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(7.0f, -7.0f)
                lineTo(92.7f, 216.0f)
                lineToRelative(-7.0f, 7.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 74.3f, 223.0f)
                close()
                moveTo(177.6f, 99.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -1.4f, 3.2f)
                lineToRelative(-7.6f, 37.7f)
                lineToRelative(-8.6f, 8.6f)
                lineTo(107.3f, 96.0f)
                lineToRelative(8.6f, -8.6f)
                lineToRelative(37.7f, -7.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 3.2f, -1.4f)
                lineToRelative(58.4f, -43.8f)
                lineToRelative(6.2f, 6.2f)
                close()
            }
        }
        .build()
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
