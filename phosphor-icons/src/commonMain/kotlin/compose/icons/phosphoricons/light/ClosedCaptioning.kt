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

public val LightGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(74.0f, 128.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, false, 15.7f, -6.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.6f, 8.4f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 0.0f, -47.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.6f, 8.4f)
                arcTo(21.6f, 21.6f, 0.0f, false, false, 96.0f, 106.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 74.0f, 128.0f)
                close()
                moveTo(146.0f, 128.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, false, 15.7f, -6.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.6f, 8.4f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 0.0f, -47.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.6f, 8.4f)
                arcTo(21.6f, 21.6f, 0.0f, false, false, 168.0f, 106.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 146.0f, 128.0f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
