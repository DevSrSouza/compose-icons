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

public val DuotoneGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 127.8f)
                arcToRelative(63.9f, 63.9f, 0.0f, false, true, -99.5f, 53.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -9.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 61.3f, 69.9f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 4.0f, -4.2f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 125.4f, 0.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 4.0f, 4.2f)
                arcTo(63.9f, 63.9f, 0.0f, false, true, 232.0f, 127.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.1f, 62.6f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -140.2f, 0.0f)
                arcTo(72.3f, 72.3f, 0.0f, false, false, 16.0f, 127.8f)
                curveTo(15.9f, 166.6f, 47.4f, 199.0f, 86.1f, 200.0f)
                arcToRelative(71.6f, 71.6f, 0.0f, false, false, 33.9f, -7.5f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(192.5f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 32.0f, 7.5f)
                horizontalLineToRelative(1.9f)
                curveToRelative(38.7f, -1.0f, 70.2f, -33.4f, 70.1f, -72.2f)
                arcTo(72.3f, 72.3f, 0.0f, false, false, 198.1f, 62.6f)
                close()
                moveTo(169.5f, 184.0f)
                arcToRelative(56.2f, 56.2f, 0.0f, false, true, -32.6f, -9.4f)
                lineToRelative(-0.9f, -0.6f)
                verticalLineTo(132.9f)
                lineToRelative(43.6f, -21.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.2f, -14.4f)
                lineTo(136.0f, 115.1f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(51.1f)
                lineTo(83.6f, 120.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.2f, 14.4f)
                lineTo(120.0f, 156.9f)
                verticalLineTo(174.0f)
                lineToRelative(-0.9f, 0.6f)
                arcTo(56.2f, 56.2f, 0.0f, false, true, 86.5f, 184.0f)
                curveToRelative(-30.1f, -0.8f, -54.6f, -26.0f, -54.5f, -56.2f)
                arcTo(56.3f, 56.3f, 0.0f, false, true, 64.6f, 77.1f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 8.1f, -8.3f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 110.6f, 0.0f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 8.1f, 8.3f)
                arcTo(56.3f, 56.3f, 0.0f, false, true, 224.0f, 127.8f)
                curveTo(224.1f, 158.0f, 199.6f, 183.2f, 169.5f, 184.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
