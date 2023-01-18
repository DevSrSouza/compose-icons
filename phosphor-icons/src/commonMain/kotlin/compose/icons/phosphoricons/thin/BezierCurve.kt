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

public val ThinGroup.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) {
            return _bezierCurve!!
        }
        _bezierCurve = Builder(name = "BezierCurve", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.8f, 148.1f)
                arcTo(92.6f, 92.6f, 0.0f, false, false, 165.5f, 84.0f)
                lineTo(240.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(155.7f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.4f, 0.0f)
                lineTo(16.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(90.5f, 84.0f)
                arcToRelative(92.6f, 92.6f, 0.0f, false, false, -52.3f, 64.1f)
                arcToRelative(27.9f, 27.9f, 0.0f, true, false, 8.0f, 0.6f)
                arcToRelative(84.6f, 84.6f, 0.0f, false, true, 55.1f, -60.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 53.4f, 0.0f)
                arcToRelative(84.6f, 84.6f, 0.0f, false, true, 55.1f, 60.3f)
                arcToRelative(28.1f, 28.1f, 0.0f, true, false, 8.0f, -0.6f)
                close()
                moveTo(60.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 60.0f, 176.0f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 100.0f)
                close()
                moveTo(216.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 216.0f, 196.0f)
                close()
            }
        }
        .build()
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
