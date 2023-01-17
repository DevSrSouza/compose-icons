package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Kdenlive: ImageVector
    get() {
        if (_kdenlive != null) {
            return _kdenlive!!
        }
        _kdenlive = Builder(name = "Kdenlive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.727f, 1.554f)
                lineToRelative(2.727f, 4.334f)
                verticalLineToRelative(16.558f)
                horizontalLineToRelative(1.091f)
                lineTo(12.545f, 5.889f)
                lineToRelative(2.728f, -4.335f)
                close()
                moveTo(2.727f, 6.502f)
                lineTo(2.727f, 9.8f)
                horizontalLineToRelative(7.091f)
                curveToRelative(0.003f, -0.83f, 0.0f, -1.672f, -0.006f, -2.498f)
                curveToRelative(0.0f, -0.383f, -0.356f, -0.732f, -0.718f, -0.8f)
                lineTo(2.727f, 6.502f)
                close()
                moveTo(15.03f, 6.503f)
                curveToRelative(-0.402f, 0.024f, -0.835f, 0.41f, -0.834f, 0.837f)
                lineToRelative(-0.014f, 12.619f)
                curveToRelative(0.0f, 0.57f, 0.767f, 1.065f, 1.207f, 0.727f)
                lineToRelative(8.28f, -6.331f)
                curveToRelative(0.441f, -0.335f, 0.44f, -1.12f, 0.0f, -1.455f)
                lineToRelative(-8.265f, -6.287f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, false, -0.374f, -0.11f)
                close()
                moveTo(-0.001f, 12.0f)
                verticalLineToRelative(3.299f)
                horizontalLineToRelative(9.818f)
                lineTo(9.817f, 12.0f)
                close()
                moveTo(4.362f, 17.497f)
                verticalLineToRelative(3.3f)
                horizontalLineToRelative(5.455f)
                verticalLineToRelative(-3.3f)
                close()
            }
        }
        .build()
        return _kdenlive!!
    }

private var _kdenlive: ImageVector? = null
