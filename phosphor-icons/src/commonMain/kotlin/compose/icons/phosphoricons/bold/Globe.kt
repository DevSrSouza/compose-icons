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

public val BoldGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 163.4f)
                arcToRelative(107.4f, 107.4f, 0.0f, false, false, 0.0f, -70.8f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.4f, -1.3f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, -203.2f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.4f, 1.3f)
                arcToRelative(107.4f, 107.4f, 0.0f, false, false, 0.0f, 70.8f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.4f, 1.3f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 203.2f, 0.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 230.0f, 163.4f)
                close()
                moveTo(108.2f, 172.0f)
                horizontalLineToRelative(39.6f)
                arcTo(104.8f, 104.8f, 0.0f, false, true, 128.0f, 204.6f)
                arcTo(104.8f, 104.8f, 0.0f, false, true, 108.2f, 172.0f)
                close()
                moveTo(101.6f, 148.0f)
                arcToRelative(125.8f, 125.8f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(52.8f)
                arcToRelative(125.8f, 125.8f, 0.0f, false, true, 0.0f, 40.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, 2.4f, -20.0f)
                lineTo(77.3f, 108.0f)
                arcTo(165.2f, 165.2f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(163.9f, 163.9f, 0.0f, false, false, 1.3f, 20.0f)
                lineTo(46.4f, 148.0f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(147.8f, 84.0f)
                lineTo(108.2f, 84.0f)
                arcTo(104.8f, 104.8f, 0.0f, false, true, 128.0f, 51.4f)
                arcTo(104.8f, 104.8f, 0.0f, false, true, 147.8f, 84.0f)
                close()
                moveTo(178.7f, 108.0f)
                horizontalLineToRelative(30.9f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, true, 0.0f, 40.0f)
                lineTo(178.7f, 148.0f)
                arcToRelative(163.9f, 163.9f, 0.0f, false, false, 1.3f, -20.0f)
                arcTo(165.2f, 165.2f, 0.0f, false, false, 178.7f, 108.0f)
                close()
                moveTo(199.5f, 84.0f)
                lineTo(173.4f, 84.0f)
                arcToRelative(134.7f, 134.7f, 0.0f, false, false, -16.8f, -35.0f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 199.5f, 84.0f)
                close()
                moveTo(99.4f, 49.0f)
                arcTo(134.7f, 134.7f, 0.0f, false, false, 82.6f, 84.0f)
                lineTo(56.5f, 84.0f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 99.4f, 49.0f)
                close()
                moveTo(56.5f, 172.0f)
                lineTo(82.6f, 172.0f)
                arcToRelative(134.7f, 134.7f, 0.0f, false, false, 16.8f, 35.0f)
                arcTo(84.6f, 84.6f, 0.0f, false, true, 56.5f, 172.0f)
                close()
                moveTo(156.6f, 207.0f)
                arcToRelative(134.7f, 134.7f, 0.0f, false, false, 16.8f, -35.0f)
                horizontalLineToRelative(26.1f)
                arcTo(84.6f, 84.6f, 0.0f, false, true, 156.6f, 207.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
