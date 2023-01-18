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

public val DuotoneGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 224.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, -80.0f)
                curveToRelative(0.0f, -72.0f, 80.0f, -128.0f, 80.0f, -128.0f)
                reflectiveCurveToRelative(80.0f, 56.0f, 80.0f, 128.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 128.0f, 224.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.8f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 132.6f, 9.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -9.2f, 0.0f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 82.0f, 47.8f)
                curveTo(54.5f, 79.3f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.5f, 79.3f, 174.0f, 47.8f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -57.2f, 55.5f, -105.0f, 72.0f, -118.0f)
                curveToRelative(16.5f, 13.0f, 72.0f, 60.8f, 72.0f, 118.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(183.2f, 153.4f)
                arcToRelative(55.8f, 55.8f, 0.0f, false, true, -45.8f, 45.7f)
                horizontalLineToRelative(-1.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.3f, -15.9f)
                arcToRelative(39.7f, 39.7f, 0.0f, false, false, 32.6f, -32.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.3f, -6.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 183.2f, 153.4f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
