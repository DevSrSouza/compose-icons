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

public val RegularGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 72.0f)
                lineTo(76.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(92.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(119.9f, 30.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.8f, 2.6f)
                lineTo(112.0f, 80.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                lineToRelative(7.9f, -47.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.8f, -2.6f)
                lineToRelative(-8.0f, 48.0f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 40.0f, 80.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 36.0f, 43.3f)
                lineTo(76.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(92.0f, 123.3f)
                arcTo(44.1f, 44.1f, 0.0f, false, false, 128.0f, 80.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -0.1f, -1.3f)
                close()
                moveTo(212.0f, 32.0f)
                lineTo(212.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(196.0f, 168.0f)
                lineTo(148.0f, 168.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.0f, -2.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.0f, -6.2f)
                arcToRelative(412.8f, 412.8f, 0.0f, false, true, 11.8f, -59.3f)
                curveToRelative(12.0f, -42.4f, 28.7f, -67.8f, 49.5f, -75.3f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 212.0f, 32.0f)
                close()
                moveTo(196.0f, 46.4f)
                curveToRelative(-11.1f, 10.2f, -20.9f, 29.8f, -28.8f, 57.8f)
                arcTo(402.3f, 402.3f, 0.0f, false, false, 157.1f, 152.0f)
                lineTo(196.0f, 152.0f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
