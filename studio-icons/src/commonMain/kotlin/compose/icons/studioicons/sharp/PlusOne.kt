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

public val SharpGroup.PlusOne: ImageVector
    get() {
        if (_plusOne != null) {
            return _plusOne!!
        }
        _plusOne = Builder(name = "PlusOne", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(14.5f, 6.08f)
                lineTo(14.5f, 7.9f)
                lineToRelative(2.5f, -0.5f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 5.0f)
                lineToRelative(-4.5f, 1.08f)
                close()
            }
        }
        .build()
        return _plusOne!!
    }

private var _plusOne: ImageVector? = null
