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

public val DuotoneGroup.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) {
            return _dropHalf!!
        }
        _dropHalf = Builder(name = "DropHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 224.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 80.0f, -80.0f)
                curveToRelative(0.0f, -72.0f, -80.0f, -128.0f, -80.0f, -128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.8f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 132.6f, 9.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.9f, -0.5f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.1f, -0.7f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.1f, 0.7f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.9f, 0.5f)
                horizontalLineToRelative(-0.1f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 82.0f, 47.8f)
                curveTo(54.5f, 79.3f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.5f, 79.3f, 174.0f, 47.8f)
                close()
                moveTo(56.0f, 144.0f)
                curveToRelative(0.0f, -50.0f, 42.3f, -92.7f, 64.0f, -111.4f)
                lineTo(120.0f, 215.5f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 56.0f, 144.0f)
                close()
                moveTo(136.0f, 215.5f)
                lineTo(136.0f, 32.6f)
                curveTo(157.7f, 51.3f, 200.0f, 94.0f, 200.0f, 144.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 136.0f, 215.5f)
                close()
            }
        }
        .build()
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
