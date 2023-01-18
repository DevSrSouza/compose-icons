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

public val LightGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.4f, 63.0f)
                lineTo(195.0f, 34.8f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.3f, -0.2f)
                horizontalLineTo(194.0f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.2f, -0.1f)
                horizontalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(62.2f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.0f, -0.2f, 0.1f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.3f, 0.2f)
                horizontalLineTo(61.0f)
                lineTo(11.6f, 63.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 6.0f, 81.5f)
                lineToRelative(18.4f, 36.8f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 36.9f, 126.0f)
                horizontalLineTo(58.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(126.0f)
                horizontalLineToRelative(21.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.5f, -7.7f)
                lineTo(250.0f, 81.5f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 244.4f, 63.0f)
                close()
                moveTo(36.9f, 114.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.7f, -1.1f)
                lineTo(16.8f, 76.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.7f, -2.6f)
                lineTo(58.0f, 50.3f)
                verticalLineTo(114.0f)
                close()
                moveTo(186.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(46.0f)
                horizontalLineTo(90.5f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.0f, 0.0f)
                horizontalLineTo(186.0f)
                close()
                moveTo(239.2f, 76.1f)
                lineToRelative(-18.4f, 36.8f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.7f, 1.1f)
                horizontalLineTo(198.0f)
                verticalLineTo(50.3f)
                lineToRelative(40.5f, 23.2f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 239.2f, 76.1f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
