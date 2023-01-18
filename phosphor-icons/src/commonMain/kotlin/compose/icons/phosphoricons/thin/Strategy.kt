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

public val ThinGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 156.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 68.0f, 156.0f)
                close()
                moveTo(68.0f, 212.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 68.0f, 212.0f)
                close()
                moveTo(37.2f, 109.2f)
                lineTo(54.3f, 92.0f)
                lineTo(37.2f, 74.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(60.0f, 86.3f)
                lineTo(77.2f, 69.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                lineTo(65.7f, 92.0f)
                lineToRelative(17.1f, 17.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(60.0f, 97.7f)
                lineTo(42.8f, 114.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 37.2f, 109.2f)
                close()
                moveTo(218.8f, 205.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(196.0f, 193.7f)
                lineToRelative(-17.2f, 17.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(190.3f, 188.0f)
                lineToRelative(-17.1f, -17.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(196.0f, 182.3f)
                lineToRelative(17.2f, -17.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                lineTo(201.7f, 188.0f)
                close()
                moveTo(172.6f, 111.8f)
                curveToRelative(-5.8f, 21.0f, -23.7f, 39.1f, -43.6f, 44.1f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, -3.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.9f, -4.9f)
                curveToRelative(17.0f, -4.2f, 32.9f, -20.4f, 37.9f, -38.5f)
                curveToRelative(3.5f, -12.5f, 3.6f, -31.5f, -15.7f, -50.8f)
                lineTo(140.0f, 49.7f)
                lineTo(140.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(132.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(145.7f, 44.0f)
                lineToRelative(9.1f, 9.2f)
                curveTo(172.0f, 70.4f, 178.3f, 91.2f, 172.6f, 111.8f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
