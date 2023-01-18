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

public val BoldGroup.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 112.0f)
                horizontalLineToRelative(-9.4f)
                lineTo(204.5f, 65.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 187.6f, 56.0f)
                lineTo(168.1f, 56.0f)
                lineTo(157.2f, 28.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 138.6f, 16.0f)
                lineTo(117.4f, 16.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 98.8f, 28.6f)
                lineTo(87.9f, 56.0f)
                lineTo(68.4f, 56.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -16.9f, 9.2f)
                lineTo(21.4f, 112.0f)
                lineTo(12.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(60.0f, 224.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(80.0f, 184.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(240.0f, 136.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(120.1f, 40.0f)
                horizontalLineToRelative(15.8f)
                lineToRelative(6.4f, 16.0f)
                lineTo(113.7f, 56.0f)
                close()
                moveTo(70.6f, 80.0f)
                lineTo(185.4f, 80.0f)
                lineTo(206.0f, 112.0f)
                lineTo(50.0f, 112.0f)
                close()
                moveTo(56.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 184.0f)
                lineTo(56.0f, 184.0f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(200.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(216.0f, 160.0f)
                lineTo(40.0f, 160.0f)
                lineTo(40.0f, 136.0f)
                lineTo(216.0f, 136.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
