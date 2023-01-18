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

public val LightGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.0f, 72.0f)
                lineTo(78.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(90.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(117.9f, 31.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.8f, 2.0f)
                lineTo(114.0f, 80.5f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -60.0f, 0.0f)
                lineTo(61.9f, 33.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.8f, -2.0f)
                lineToRelative(-8.0f, 48.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.1f, 1.0f)
                arcToRelative(42.2f, 42.2f, 0.0f, false, false, 36.0f, 41.6f)
                lineTo(78.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(90.0f, 121.6f)
                arcTo(42.2f, 42.2f, 0.0f, false, false, 126.0f, 80.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.1f, -1.0f)
                close()
                moveTo(210.0f, 32.0f)
                lineTo(210.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(198.0f, 166.0f)
                lineTo(148.0f, 166.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.5f, -2.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -1.5f, -4.6f)
                arcToRelative(412.4f, 412.4f, 0.0f, false, true, 11.7f, -59.0f)
                curveToRelative(11.9f, -41.8f, 28.1f, -66.7f, 48.2f, -74.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 210.0f, 32.0f)
                close()
                moveTo(198.0f, 42.1f)
                curveToRelative(-25.7f, 19.4f, -39.1f, 81.1f, -43.2f, 111.9f)
                lineTo(198.0f, 154.0f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
