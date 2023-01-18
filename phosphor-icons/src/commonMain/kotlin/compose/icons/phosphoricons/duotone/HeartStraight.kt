package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(133.6f, 211.9f)
                lineToRelative(81.1f, -81.0f)
                curveToRelative(19.9f, -20.0f, 22.8f, -52.7f, 4.0f, -73.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -75.5f, -2.1f)
                lineTo(128.0f, 70.5f)
                lineTo(114.8f, 57.3f)
                curveToRelative(-19.9f, -19.9f, -52.6f, -22.8f, -73.6f, -4.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -2.0f, 75.5f)
                lineToRelative(83.1f, 83.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 133.6f, 211.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 222.2f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -11.3f, -4.7f)
                lineTo(33.5f, 134.4f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 2.4f, -87.0f)
                arcToRelative(57.6f, 57.6f, 0.0f, false, true, 43.0f, -14.6f)
                arcToRelative(64.5f, 64.5f, 0.0f, false, true, 41.6f, 18.9f)
                lineToRelative(7.5f, 7.4f)
                lineToRelative(9.5f, -9.5f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 87.1f, 2.3f)
                curveToRelative(10.5f, 11.6f, 15.6f, 26.9f, 14.6f, 43.1f)
                arcToRelative(64.3f, 64.3f, 0.0f, false, true, -18.9f, 41.5f)
                lineToRelative(-81.0f, 81.0f)
                horizontalLineToRelative(0.0f)
                arcTo(15.6f, 15.6f, 0.0f, false, true, 128.0f, 222.2f)
                close()
                moveTo(75.0f, 48.7f)
                arcTo(42.3f, 42.3f, 0.0f, false, false, 46.6f, 59.2f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -1.7f, 63.9f)
                lineToRelative(88.7f, 88.8f)
                lineToRelative(-5.6f, -5.7f)
                lineToRelative(81.0f, -81.0f)
                curveToRelative(17.4f, -17.4f, 19.1f, -45.5f, 3.7f, -62.6f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, -63.8f, -1.7f)
                lineTo(133.6f, 76.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, 0.0f)
                lineTo(109.2f, 63.0f)
                arcTo(48.5f, 48.5f, 0.0f, false, false, 75.0f, 48.7f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
