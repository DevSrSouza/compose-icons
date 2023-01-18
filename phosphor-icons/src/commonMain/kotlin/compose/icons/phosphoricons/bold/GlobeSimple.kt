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

public val BoldGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(211.1f, 116.0f)
                lineTo(179.5f, 116.0f)
                arcToRelative(138.3f, 138.3f, 0.0f, false, false, -22.9f, -67.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 211.1f, 116.0f)
                close()
                moveTo(100.6f, 140.0f)
                horizontalLineToRelative(54.8f)
                curveToRelative(-2.4f, 24.7f, -12.2f, 47.7f, -27.4f, 64.6f)
                curveTo(112.8f, 187.7f, 103.0f, 164.7f, 100.6f, 140.0f)
                close()
                moveTo(100.6f, 116.0f)
                curveTo(103.0f, 91.3f, 112.8f, 68.3f, 128.0f, 51.4f)
                curveToRelative(15.2f, 16.9f, 25.0f, 39.9f, 27.4f, 64.6f)
                close()
                moveTo(99.4f, 49.0f)
                arcToRelative(138.3f, 138.3f, 0.0f, false, false, -22.9f, 67.0f)
                lineTo(44.9f, 116.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 99.4f, 49.0f)
                close()
                moveTo(44.9f, 140.0f)
                lineTo(76.5f, 140.0f)
                arcToRelative(138.3f, 138.3f, 0.0f, false, false, 22.9f, 67.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 44.9f, 140.0f)
                close()
                moveTo(156.6f, 207.0f)
                arcToRelative(138.3f, 138.3f, 0.0f, false, false, 22.9f, -67.0f)
                horizontalLineToRelative(31.6f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 156.6f, 207.0f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
