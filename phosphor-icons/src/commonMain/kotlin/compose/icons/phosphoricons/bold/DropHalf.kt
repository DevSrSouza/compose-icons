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

public val BoldGroup.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) {
            return _dropHalf!!
        }
        _dropHalf = Builder(name = "DropHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.9f, 6.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.8f, 0.0f)
                arcTo(264.8f, 264.8f, 0.0f, false, false, 78.9f, 45.1f)
                curveTo(50.9f, 77.4f, 36.0f, 111.6f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 66.6f, 138.4f, 8.6f, 134.9f, 6.2f)
                close()
                moveTo(196.0f, 144.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, true, -1.9f, 16.0f)
                lineTo(140.0f, 160.0f)
                lineTo(140.0f, 144.0f)
                close()
                moveTo(140.0f, 120.0f)
                lineTo(140.0f, 104.0f)
                horizontalLineToRelative(47.0f)
                arcToRelative(108.5f, 108.5f, 0.0f, false, true, 5.7f, 16.0f)
                close()
                moveTo(159.3f, 61.3f)
                arcTo(190.1f, 190.1f, 0.0f, false, true, 173.7f, 80.0f)
                lineTo(140.0f, 80.0f)
                lineTo(140.0f, 41.5f)
                arcTo(246.1f, 246.1f, 0.0f, false, true, 159.3f, 61.3f)
                close()
                moveTo(60.0f, 144.0f)
                curveToRelative(0.0f, -33.3f, 20.0f, -63.4f, 36.7f, -82.7f)
                arcTo(246.1f, 246.1f, 0.0f, false, true, 116.0f, 41.5f)
                lineTo(116.0f, 210.9f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 60.0f, 144.0f)
                close()
                moveTo(140.0f, 210.9f)
                lineTo(140.0f, 184.0f)
                horizontalLineToRelative(42.9f)
                arcTo(67.5f, 67.5f, 0.0f, false, true, 140.0f, 210.9f)
                close()
            }
        }
        .build()
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
