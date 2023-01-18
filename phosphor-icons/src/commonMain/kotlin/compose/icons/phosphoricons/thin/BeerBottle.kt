package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) {
            return _beerBottle!!
        }
        _beerBottle = Builder(name = "BeerBottle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.8f, 45.2f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineToRelative(4.7f, 4.8f)
                lineTo(150.3f, 68.3f)
                lineToRelative(-39.1f, 7.8f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -2.0f, 1.1f)
                lineTo(24.5f, 161.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, 28.2f)
                lineToRelative(41.4f, 41.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 28.2f, 0.0f)
                lineToRelative(68.7f, -68.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 1.1f, -2.0f)
                lineToRelative(7.8f, -39.1f)
                lineToRelative(44.7f, -59.6f)
                lineToRelative(4.8f, 4.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 242.8f, 45.2f)
                close()
                moveTo(104.0f, 210.3f)
                lineTo(45.7f, 152.0f)
                lineTo(96.0f, 101.7f)
                lineTo(154.3f, 160.0f)
                close()
                moveTo(88.5f, 225.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(30.1f, 184.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(9.9f, -9.8f)
                lineTo(98.3f, 216.0f)
                close()
                moveTo(180.8f, 101.6f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -0.7f, 1.6f)
                lineTo(172.3f, 142.0f)
                lineTo(160.0f, 154.3f)
                lineTo(101.7f, 96.0f)
                lineTo(114.0f, 83.7f)
                lineToRelative(38.8f, -7.8f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.6f, -0.7f)
                lineToRelative(61.2f, -45.9f)
                lineToRelative(11.1f, 11.1f)
                close()
            }
        }
        .build()
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
