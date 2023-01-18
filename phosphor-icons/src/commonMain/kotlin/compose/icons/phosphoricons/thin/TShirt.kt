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

public val ThinGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.4f, 64.8f)
                lineTo(194.0f, 36.5f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.4f, -0.2f)
                horizontalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(63.0f)
                lineToRelative(-0.4f, 0.2f)
                horizontalLineTo(62.0f)
                lineTo(12.6f, 64.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 7.8f, 80.6f)
                lineToRelative(18.4f, 36.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.9f, 124.0f)
                horizontalLineTo(60.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(124.0f)
                horizontalLineToRelative(23.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.7f, -6.6f)
                lineToRelative(18.4f, -36.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 243.4f, 64.8f)
                close()
                moveTo(36.9f, 116.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.5f, -2.2f)
                lineTo(15.0f, 77.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, -5.3f)
                lineTo(60.0f, 46.9f)
                verticalLineTo(116.0f)
                close()
                moveTo(188.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(92.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 71.6f, 0.0f)
                horizontalLineTo(188.0f)
                close()
                moveTo(241.0f, 77.0f)
                lineToRelative(-18.4f, 36.8f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.5f, 2.2f)
                horizontalLineTo(196.0f)
                verticalLineTo(46.9f)
                lineToRelative(43.4f, 24.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 241.0f, 77.0f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
