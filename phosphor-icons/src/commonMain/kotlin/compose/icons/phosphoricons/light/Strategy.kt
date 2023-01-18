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

public val LightGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 154.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 34.0f, 34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 68.0f, 154.0f)
                close()
                moveTo(68.0f, 210.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 68.0f, 210.0f)
                close()
                moveTo(35.8f, 107.8f)
                lineTo(51.5f, 92.0f)
                lineTo(35.8f, 76.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(60.0f, 83.5f)
                lineTo(75.8f, 67.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(68.5f, 92.0f)
                lineToRelative(15.7f, 15.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(60.0f, 100.5f)
                lineTo(44.2f, 116.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                close()
                moveTo(220.2f, 203.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(196.0f, 196.5f)
                lineToRelative(-15.8f, 15.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(187.5f, 188.0f)
                lineToRelative(-15.7f, -15.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(196.0f, 179.5f)
                lineToRelative(15.8f, -15.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(204.5f, 188.0f)
                close()
                moveTo(174.5f, 112.3f)
                curveToRelative(-6.0f, 21.7f, -24.5f, 40.4f, -45.0f, 45.5f)
                lineToRelative(-1.5f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.5f, -11.8f)
                curveToRelative(16.3f, -4.1f, 31.7f, -19.7f, 36.5f, -37.1f)
                curveToRelative(3.3f, -12.0f, 3.4f, -30.2f, -15.2f, -48.9f)
                lineTo(142.0f, 54.5f)
                lineTo(142.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(130.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(150.5f, 46.0f)
                lineToRelative(5.7f, 5.8f)
                curveTo(174.0f, 69.5f, 180.5f, 91.0f, 174.5f, 112.3f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
