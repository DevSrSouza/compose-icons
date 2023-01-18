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

public val ThinGroup.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) {
            return _airplaneTilt!!
        }
        _airplaneTilt = Builder(name = "AirplaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.8f, 44.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.6f, 0.0f)
                curveToRelative(-0.2f, 0.3f, -0.5f, 0.5f, -0.6f, 0.8f)
                lineTo(142.9f, 75.3f)
                lineTo(57.4f, 44.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.2f, 1.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.6f, 6.1f)
                lineToRelative(67.9f, 45.3f)
                lineTo(78.3f, 140.0f)
                lineTo(56.0f, 140.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -2.8f, 1.2f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.1f, 3.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.6f, 2.9f)
                lineToRelative(40.0f, 13.5f)
                lineToRelative(13.5f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.9f, 2.6f)
                lineTo(88.0f, 227.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(24.0f, -24.0f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 116.0f, 200.0f)
                lineTo(116.0f, 177.8f)
                lineToRelative(19.5f, -17.7f)
                lineToRelative(45.2f, 66.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, 1.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.2f, -1.2f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.0f, -4.2f)
                lineToRelative(-31.1f, -85.5f)
                lineToRelative(31.7f, -29.8f)
                lineToRelative(0.7f, -0.9f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 211.8f, 44.2f)
                close()
                moveTo(206.1f, 78.1f)
                lineTo(205.8f, 78.5f)
                lineTo(173.3f, 109.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.1f, 4.3f)
                lineTo(203.4f, 199.0f)
                lineToRelative(-18.8f, 18.8f)
                lineToRelative(-45.1f, -66.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -2.8f, -1.8f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.7f, 1.1f)
                lineTo(109.3f, 173.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -1.3f, 3.0f)
                verticalLineToRelative(22.3f)
                lineTo(89.7f, 216.6f)
                lineTo(77.6f, 180.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.5f, -2.5f)
                lineTo(39.4f, 166.3f)
                lineTo(57.7f, 148.0f)
                lineTo(80.0f, 148.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.6f, -6.1f)
                lineTo(38.3f, 71.4f)
                lineTo(57.0f, 52.6f)
                lineToRelative(85.6f, 31.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.3f, -1.1f)
                lineToRelative(31.7f, -33.5f)
                lineToRelative(0.3f, -0.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 27.2f, 29.2f)
                close()
            }
        }
        .build()
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
