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

public val BoldGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.3f, 203.3f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 0.0f, -150.6f)
                lineToRelative(-0.8f, -1.0f)
                lineToRelative(-0.9f, -0.8f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, false, -151.2f, 0.0f)
                lineToRelative(-0.9f, 0.8f)
                lineToRelative(-0.8f, 1.0f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 0.0f, 150.6f)
                lineToRelative(0.8f, 1.0f)
                lineToRelative(0.9f, 0.8f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, false, 151.2f, 0.0f)
                lineToRelative(0.9f, -0.8f)
                close()
                moveTo(44.9f, 140.0f)
                lineTo(75.1f, 140.0f)
                arcTo(82.4f, 82.4f, 0.0f, false, true, 60.0f, 177.3f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 44.9f, 140.0f)
                close()
                moveTo(60.0f, 78.7f)
                arcTo(82.4f, 82.4f, 0.0f, false, true, 75.1f, 116.0f)
                lineTo(44.9f, 116.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 60.0f, 78.7f)
                close()
                moveTo(211.1f, 116.0f)
                lineTo(180.9f, 116.0f)
                arcTo(82.4f, 82.4f, 0.0f, false, true, 196.0f, 78.7f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 211.1f, 116.0f)
                close()
                moveTo(156.7f, 116.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 44.9f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 39.0f, 16.4f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 156.7f, 116.0f)
                close()
                moveTo(116.0f, 116.0f)
                lineTo(99.3f, 116.0f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 77.0f, 61.3f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 39.0f, -16.4f)
                close()
                moveTo(99.3f, 140.0f)
                lineTo(116.0f, 140.0f)
                verticalLineToRelative(71.1f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -39.0f, -16.4f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 99.3f, 140.0f)
                close()
                moveTo(140.0f, 140.0f)
                horizontalLineToRelative(16.7f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 179.0f, 194.7f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -39.0f, 16.4f)
                close()
                moveTo(180.9f, 140.0f)
                horizontalLineToRelative(30.2f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 196.0f, 177.3f)
                arcTo(82.4f, 82.4f, 0.0f, false, true, 180.9f, 140.0f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
