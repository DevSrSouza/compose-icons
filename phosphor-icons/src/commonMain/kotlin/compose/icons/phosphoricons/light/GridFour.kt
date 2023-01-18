package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GridFour: ImageVector
    get() {
        if (_gridFour != null) {
            return _gridFour!!
        }
        _gridFour = Builder(name = "GridFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 38.0f)
                lineTo(52.0f, 38.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 38.0f, 52.0f)
                lineTo(38.0f, 204.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(204.0f, 218.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(218.0f, 52.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 204.0f, 38.0f)
                close()
                moveTo(206.0f, 52.0f)
                verticalLineToRelative(70.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 50.0f)
                horizontalLineToRelative(70.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 206.0f, 52.0f)
                close()
                moveTo(52.0f, 50.0f)
                horizontalLineToRelative(70.0f)
                verticalLineToRelative(72.0f)
                lineTo(50.0f, 122.0f)
                lineTo(50.0f, 52.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 52.0f, 50.0f)
                close()
                moveTo(50.0f, 204.0f)
                lineTo(50.0f, 134.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                lineTo(52.0f, 206.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 50.0f, 204.0f)
                close()
                moveTo(204.0f, 206.0f)
                lineTo(134.0f, 206.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(70.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 204.0f, 206.0f)
                close()
            }
        }
        .build()
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
