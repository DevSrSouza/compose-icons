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

public val ThinGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 72.0f)
                lineTo(80.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(88.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(115.9f, 31.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.8f, 1.4f)
                lineTo(116.0f, 80.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                lineToRelative(7.9f, -47.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.8f, -1.4f)
                lineToRelative(-8.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.1f, 0.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 36.0f, 39.8f)
                lineTo(80.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(88.0f, 119.8f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 124.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.1f, -0.7f)
                close()
                moveTo(208.0f, 32.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(200.0f, 164.0f)
                lineTo(148.0f, 164.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -3.0f, -1.3f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.0f, -3.1f)
                curveToRelative(0.5f, -4.7f, 12.8f, -114.7f, 58.6f, -131.4f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 3.7f, 0.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 32.0f)
                close()
                moveTo(200.0f, 38.3f)
                curveToRelative(-14.5f, 8.8f, -27.0f, 30.9f, -36.6f, 64.7f)
                arcToRelative(392.4f, 392.4f, 0.0f, false, false, -10.9f, 53.0f)
                lineTo(200.0f, 156.0f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
