package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.GridFour: ImageVector
    get() {
        if (_gridFour != null) {
            return _gridFour!!
        }
        _gridFour = Builder(name = "GridFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 40.0f)
                lineTo(52.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 52.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(204.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(216.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 40.0f)
                close()
                moveTo(208.0f, 52.0f)
                verticalLineToRelative(72.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 48.0f)
                horizontalLineToRelative(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 52.0f)
                close()
                moveTo(52.0f, 48.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(76.0f)
                lineTo(48.0f, 124.0f)
                lineTo(48.0f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 48.0f)
                close()
                moveTo(48.0f, 204.0f)
                lineTo(48.0f, 132.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(76.0f)
                lineTo(52.0f, 208.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 204.0f)
                close()
                moveTo(204.0f, 208.0f)
                lineTo(132.0f, 208.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 208.0f)
                close()
            }
        }
        .build()
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
