package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 72.0f)
                lineTo(72.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(120.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(108.0f, 80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                lineTo(60.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(36.0f, 80.0f)
                arcToRelative(48.2f, 48.2f, 0.0f, false, false, 36.0f, 46.5f)
                lineTo(72.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(96.0f, 126.5f)
                arcTo(48.2f, 48.2f, 0.0f, false, false, 132.0f, 80.0f)
                lineTo(132.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 120.0f, 20.0f)
                close()
                moveTo(216.0f, 32.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(192.0f, 172.0f)
                lineTo(148.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.9f, -13.3f)
                arcToRelative(398.0f, 398.0f, 0.0f, false, true, 11.9f, -60.0f)
                curveToRelative(12.3f, -43.7f, 29.8f, -69.9f, 51.9f, -78.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 32.0f)
                close()
                moveTo(192.0f, 57.0f)
                curveToRelative(-7.8f, 10.8f, -15.0f, 27.2f, -21.0f, 48.3f)
                arcToRelative(385.0f, 385.0f, 0.0f, false, false, -9.2f, 42.7f)
                lineTo(192.0f, 148.0f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null