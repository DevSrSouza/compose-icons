package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoFood: ImageVector
    get() {
        if (_noFood != null) {
            return _noFood!!
        }
        _noFood = Builder(name = "NoFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.35f, 8.52f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-1.38f, 13.79f)
                lineTo(18.0f, 15.17f)
                lineTo(11.35f, 8.52f)
                close()
                moveTo(21.9f, 21.9f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(5.7f, 5.7f)
                curveTo(3.46f, 9.83f, 1.0f, 11.76f, 1.0f, 15.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-0.17f)
                lineToRelative(4.49f, 4.49f)
                lineTo(21.9f, 21.9f)
                close()
                moveTo(1.0f, 23.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _noFood!!
    }

private var _noFood: ImageVector? = null
