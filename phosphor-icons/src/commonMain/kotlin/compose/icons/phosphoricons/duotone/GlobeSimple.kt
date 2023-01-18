package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                moveToRelative(-96.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -192.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 0.0f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 232.0f, 128.0f)
                close()
                moveTo(215.6f, 120.0f)
                lineTo(175.8f, 120.0f)
                curveToRelative(-1.6f, -29.6f, -12.0f, -57.0f, -29.5f, -78.1f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 215.6f, 120.0f)
                close()
                moveTo(96.3f, 136.0f)
                horizontalLineToRelative(63.4f)
                curveToRelative(-1.8f, 28.8f, -13.3f, 55.7f, -31.7f, 74.4f)
                curveTo(109.6f, 191.7f, 98.1f, 164.8f, 96.3f, 136.0f)
                close()
                moveTo(96.3f, 120.0f)
                curveToRelative(1.8f, -28.8f, 13.3f, -55.7f, 31.7f, -74.4f)
                curveToRelative(18.4f, 18.7f, 29.9f, 45.6f, 31.7f, 74.4f)
                close()
                moveTo(109.7f, 41.9f)
                curveTo(92.2f, 63.0f, 81.8f, 90.4f, 80.2f, 120.0f)
                lineTo(40.4f, 120.0f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 109.7f, 41.9f)
                close()
                moveTo(40.4f, 136.0f)
                lineTo(80.2f, 136.0f)
                curveToRelative(1.6f, 29.6f, 12.0f, 57.0f, 29.5f, 78.1f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 40.4f, 136.0f)
                close()
                moveTo(146.3f, 214.1f)
                curveToRelative(17.5f, -21.1f, 27.9f, -48.5f, 29.5f, -78.1f)
                horizontalLineToRelative(39.8f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 146.3f, 214.1f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
