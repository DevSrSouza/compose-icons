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

public val BoldGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                lineTo(212.0f, 56.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(64.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 44.0f, 56.0f)
                verticalLineToRelative(4.0f)
                lineTo(23.9f, 60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(3.9f, 96.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, 44.0f)
                lineTo(49.0f, 140.0f)
                curveToRelative(10.5f, 28.9f, 36.1f, 50.6f, 67.0f, 55.1f)
                lineTo(116.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 212.0f)
                lineTo(140.0f, 195.1f)
                arcTo(83.9f, 83.9f, 0.0f, false, false, 207.2f, 140.0f)
                horizontalLineToRelative(0.8f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(252.0f, 80.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 232.0f, 60.0f)
                close()
                moveTo(27.9f, 96.0f)
                lineTo(27.9f, 84.0f)
                lineTo(44.0f, 84.0f)
                verticalLineToRelative(27.1f)
                curveToRelative(0.0f, 1.5f, 0.0f, 3.0f, 0.1f, 4.5f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 27.9f, 96.0f)
                close()
                moveTo(127.5f, 172.0f)
                curveTo(94.7f, 171.8f, 68.0f, 144.4f, 68.0f, 111.1f)
                lineTo(68.0f, 60.0f)
                lineTo(188.0f, 60.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, -60.5f, 60.0f)
                close()
                moveTo(228.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -16.1f, 19.6f)
                curveToRelative(0.1f, -1.2f, 0.1f, -2.4f, 0.1f, -3.6f)
                lineTo(212.0f, 84.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
