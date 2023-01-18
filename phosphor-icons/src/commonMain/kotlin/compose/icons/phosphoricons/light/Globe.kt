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

public val LightGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, 161.6f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, -67.2f)
                lineToRelative(-0.3f, -0.8f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -192.0f, 0.0f)
                lineToRelative(-0.3f, 0.8f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, 67.2f)
                lineToRelative(0.3f, 0.8f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 192.0f, 0.1f)
                close()
                moveTo(99.7f, 166.0f)
                horizontalLineToRelative(56.6f)
                curveToRelative(-5.7f, 18.3f, -15.4f, 34.7f, -28.3f, 47.3f)
                curveTo(115.1f, 200.7f, 105.4f, 184.3f, 99.7f, 166.0f)
                close()
                moveTo(96.7f, 154.0f)
                arcToRelative(126.5f, 126.5f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(62.6f)
                arcToRelative(126.5f, 126.5f, 0.0f, false, true, 0.0f, 52.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(89.4f, 89.4f, 0.0f, false, true, 3.8f, -26.0f)
                lineTo(84.4f, 102.0f)
                arcToRelative(142.0f, 142.0f, 0.0f, false, false, 0.0f, 52.0f)
                lineTo(41.8f, 154.0f)
                arcTo(89.4f, 89.4f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(156.3f, 90.0f)
                lineTo(99.7f, 90.0f)
                curveToRelative(5.7f, -18.3f, 15.4f, -34.7f, 28.3f, -47.3f)
                curveTo(140.9f, 55.3f, 150.6f, 71.7f, 156.3f, 90.0f)
                close()
                moveTo(171.7f, 102.0f)
                horizontalLineToRelative(42.5f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, true, 0.0f, 52.0f)
                lineTo(171.7f, 154.0f)
                arcToRelative(148.1f, 148.1f, 0.0f, false, false, 0.0f, -52.0f)
                close()
                moveTo(209.6f, 90.0f)
                lineTo(168.9f, 90.0f)
                arcTo(124.0f, 124.0f, 0.0f, false, false, 141.0f, 39.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 209.6f, 90.0f)
                close()
                moveTo(115.0f, 39.0f)
                arcTo(124.0f, 124.0f, 0.0f, false, false, 87.1f, 90.0f)
                lineTo(46.4f, 90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 115.0f, 39.0f)
                close()
                moveTo(46.4f, 166.0f)
                lineTo(87.1f, 166.0f)
                arcTo(125.0f, 125.0f, 0.0f, false, false, 115.0f, 217.1f)
                arcTo(90.5f, 90.5f, 0.0f, false, true, 46.4f, 166.0f)
                close()
                moveTo(141.0f, 217.1f)
                arcTo(125.0f, 125.0f, 0.0f, false, false, 168.9f, 166.0f)
                horizontalLineToRelative(40.7f)
                arcTo(90.5f, 90.5f, 0.0f, false, true, 141.0f, 217.1f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
