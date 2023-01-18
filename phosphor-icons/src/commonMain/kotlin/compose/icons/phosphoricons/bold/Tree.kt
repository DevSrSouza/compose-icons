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

public val BoldGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.2f, 59.6f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, false, -146.4f, 0.0f)
                arcTo(76.4f, 76.4f, 0.0f, false, false, 12.0f, 127.8f)
                curveToRelative(-0.1f, 41.0f, 33.1f, 75.1f, 74.0f, 76.2f)
                arcToRelative(77.8f, 77.8f, 0.0f, false, false, 30.0f, -5.3f)
                verticalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(198.7f)
                arcToRelative(75.7f, 75.7f, 0.0f, false, false, 28.0f, 5.3f)
                horizontalLineToRelative(2.0f)
                curveToRelative(40.9f, -1.1f, 74.1f, -35.2f, 74.0f, -76.2f)
                arcTo(76.4f, 76.4f, 0.0f, false, false, 201.2f, 59.6f)
                close()
                moveTo(169.4f, 180.0f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, true, -29.4f, -8.2f)
                verticalLineTo(135.4f)
                lineToRelative(41.4f, -20.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.8f, -21.4f)
                lineTo(140.0f, 108.6f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(44.6f)
                lineTo(85.4f, 117.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.8f, 21.4f)
                lineTo(116.0f, 159.4f)
                verticalLineToRelative(12.4f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, -49.7f, -91.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 10.0f, -10.5f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, 103.4f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 10.0f, 10.5f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 169.4f, 180.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
