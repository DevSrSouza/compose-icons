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

public val LightGroup.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) {
            return _bezierCurve!!
        }
        _bezierCurve = Builder(name = "BezierCurve", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.4f, 146.2f)
                arcTo(94.6f, 94.6f, 0.0f, false, false, 173.9f, 86.0f)
                lineTo(240.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(157.4f, 74.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(16.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(82.1f, 86.0f)
                arcToRelative(94.6f, 94.6f, 0.0f, false, false, -45.5f, 60.2f)
                arcToRelative(30.1f, 30.1f, 0.0f, true, false, 12.0f, 1.1f)
                arcToRelative(82.5f, 82.5f, 0.0f, false, true, 51.5f, -56.4f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 55.8f, 0.0f)
                arcToRelative(82.5f, 82.5f, 0.0f, false, true, 51.5f, 56.4f)
                arcToRelative(29.9f, 29.9f, 0.0f, true, false, 12.0f, -1.1f)
                close()
                moveTo(58.0f, 176.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 58.0f, 176.0f)
                close()
                moveTo(128.0f, 98.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 128.0f, 98.0f)
                close()
                moveTo(216.0f, 194.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 216.0f, 194.0f)
                close()
            }
        }
        .build()
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
