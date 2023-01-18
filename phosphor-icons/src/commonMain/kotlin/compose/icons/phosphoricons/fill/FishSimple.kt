package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.0f, 43.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 212.7f, 31.0f)
                curveTo(193.8f, 26.9f, 129.0f, 16.8f, 88.0f, 57.8f)
                curveTo(61.6f, 84.3f, 50.6f, 126.2f, 55.1f, 182.9f)
                curveToRelative(-11.8f, -1.6f, -24.3f, -3.9f, -37.4f, -6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.4f, 15.7f)
                curveToRelative(14.9f, 3.2f, 29.1f, 5.7f, 42.5f, 7.4f)
                curveToRelative(1.7f, 13.4f, 4.1f, 27.6f, 7.4f, 42.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 248.0f)
                lineToRelative(1.7f, -0.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.1f, -9.5f)
                curveToRelative(-2.9f, -13.1f, -5.1f, -25.6f, -6.7f, -37.4f)
                curveToRelative(56.7f, 4.5f, 98.6f, -6.5f, 125.1f, -32.9f)
                curveTo(239.2f, 127.0f, 229.1f, 62.2f, 225.0f, 43.3f)
                close()
                moveTo(197.2f, 143.9f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, -85.1f, -85.1f)
                curveToRelative(35.0f, -23.0f, 82.3f, -15.4f, 97.3f, -12.1f)
                curveTo(212.6f, 61.6f, 220.2f, 108.9f, 197.2f, 143.9f)
                close()
                moveTo(168.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
