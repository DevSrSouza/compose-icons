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

public val BoldGroup.GridFour: ImageVector
    get() {
        if (_gridFour != null) {
            return _gridFour!!
        }
        _gridFour = Builder(name = "GridFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 32.0f)
                lineTo(52.0f, 32.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 32.0f, 52.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(204.0f, 224.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(224.0f, 52.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 204.0f, 32.0f)
                close()
                moveTo(200.0f, 116.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 56.0f)
                horizontalLineToRelative(60.0f)
                close()
                moveTo(116.0f, 56.0f)
                verticalLineToRelative(60.0f)
                lineTo(56.0f, 116.0f)
                lineTo(56.0f, 56.0f)
                close()
                moveTo(56.0f, 140.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(60.0f)
                lineTo(56.0f, 200.0f)
                close()
                moveTo(140.0f, 200.0f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(60.0f)
                close()
            }
        }
        .build()
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
