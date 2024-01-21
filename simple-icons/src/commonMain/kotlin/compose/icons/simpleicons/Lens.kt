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

public val SimpleIcons.Lens: ImageVector
    get() {
        if (_lens != null) {
            return _lens!!
        }
        _lens = Builder(name = "Lens", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.255f, 3.5f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.255f)
                lineToRelative(3.75f, 4.715f)
                close()
                moveTo(3.5f, 8.955f)
                verticalLineToRelative(7.125f)
                horizontalLineToRelative(5.665f)
                close()
                moveTo(19.545f, 3.5f)
                lineTo(10.02f, 3.5f)
                lineTo(8.87f, 8.635f)
                close()
                moveTo(18.645f, 20.5f)
                lineTo(20.5f, 20.5f)
                verticalLineToRelative(-8.4f)
                lineToRelative(-4.32f, -2.105f)
                close()
                moveTo(12.855f, 7.55f)
                lineTo(20.5f, 11.27f)
                verticalLineToRelative(-7.4f)
                close()
                moveTo(3.5f, 16.825f)
                lineTo(3.5f, 20.5f)
                horizontalLineToRelative(6.88f)
                lineToRelative(2.875f, -3.675f)
                close()
                moveTo(11.33f, 20.5f)
                horizontalLineToRelative(6.545f)
                lineToRelative(-1.51f, -6.435f)
                close()
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                close()
            }
        }
        .build()
        return _lens!!
    }

private var _lens: ImageVector? = null
