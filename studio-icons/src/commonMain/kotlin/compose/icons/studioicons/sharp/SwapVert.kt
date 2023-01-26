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

public val SharpGroup.SwapVert: ImageVector
    get() {
        if (_swapVert != null) {
            return _swapVert!!
        }
        _swapVert = Builder(name = "SwapVert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 17.01f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.01f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 21.0f)
                lineToRelative(4.0f, -3.99f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 3.0f)
                lineTo(5.0f, 6.99f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.99f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 3.0f)
                close()
            }
        }
        .build()
        return _swapVert!!
    }

private var _swapVert: ImageVector? = null
