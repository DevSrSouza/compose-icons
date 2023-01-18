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

public val LightGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 140.0f)
                close()
                moveTo(172.0f, 130.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 172.0f, 130.0f)
                close()
                moveTo(230.0f, 51.3f)
                lineTo(230.0f, 136.0f)
                curveToRelative(0.0f, 51.8f, -45.8f, 94.0f, -102.0f, 94.0f)
                reflectiveCurveTo(26.0f, 187.8f, 26.0f, 136.0f)
                lineTo(26.0f, 51.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 23.9f, -9.9f)
                lineTo(68.3f, 59.8f)
                arcTo(99.6f, 99.6f, 0.0f, false, true, 93.5f, 47.6f)
                lineToRelative(1.4f, -0.5f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, 66.2f, 0.0f)
                lineToRelative(1.4f, 0.5f)
                arcToRelative(99.6f, 99.6f, 0.0f, false, true, 25.2f, 12.2f)
                lineToRelative(18.4f, -18.4f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 51.3f)
                close()
                moveTo(218.0f, 51.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.2f, -1.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -2.2f, 0.4f)
                lineToRelative(-22.0f, 21.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -7.8f, 0.6f)
                arcTo(89.5f, 89.5f, 0.0f, false, false, 166.0f, 61.7f)
                lineTo(166.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(154.0f, 57.5f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, -20.0f, -3.3f)
                lineTo(134.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 54.2f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, -20.0f, 3.3f)
                lineTo(102.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(90.0f, 61.7f)
                arcTo(89.5f, 89.5f, 0.0f, false, false, 71.2f, 72.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -7.8f, -0.6f)
                lineToRelative(-22.0f, -21.9f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.4f, -0.6f)
                lineToRelative(-0.8f, 0.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 38.0f, 51.3f)
                lineTo(38.0f, 136.0f)
                curveToRelative(0.0f, 43.4f, 37.2f, 79.0f, 84.0f, 81.8f)
                lineTo(122.0f, 194.5f)
                lineToRelative(-14.2f, -14.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(128.0f, 183.5f)
                lineToRelative(11.8f, -11.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(134.0f, 194.5f)
                verticalLineToRelative(23.3f)
                curveToRelative(46.8f, -2.8f, 84.0f, -38.4f, 84.0f, -81.8f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
