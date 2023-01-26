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

public val SharpGroup.Kitchen: ImageVector
    get() {
        if (_kitchen != null) {
            return _kitchen!!
        }
        _kitchen = Builder(name = "Kitchen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.01f)
                lineTo(4.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 2.01f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-9.02f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 20.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _kitchen!!
    }

private var _kitchen: ImageVector? = null
