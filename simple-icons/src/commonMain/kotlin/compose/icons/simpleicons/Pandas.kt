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

public val SimpleIcons.Pandas: ImageVector
    get() {
        if (_pandas != null) {
            return _pandas!!
        }
        _pandas = Builder(name = "Pandas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.922f, 0.0f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(18.104f)
                horizontalLineToRelative(-2.623f)
                close()
                moveTo(12.796f, 12.94f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(2.57f)
                horizontalLineToRelative(-2.623f)
                close()
                moveTo(12.796f, 5.903f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(5.446f)
                horizontalLineToRelative(-2.623f)
                close()
                moveTo(12.796f, 17.1f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(5.446f)
                horizontalLineToRelative(-2.623f)
                close()
                moveTo(4.456f, 5.896f)
                horizontalLineToRelative(2.622f)
                lineTo(7.078f, 24.0f)
                lineTo(4.455f, 24.0f)
                close()
                moveTo(8.669f, 8.455f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(2.57f)
                lineTo(8.67f, 11.025f)
                close()
                moveTo(8.669f, 12.606f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(5.447f)
                lineTo(8.67f, 18.053f)
                close()
                moveTo(8.669f, 1.419f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(5.446f)
                lineTo(8.67f, 6.865f)
                close()
            }
        }
        .build()
        return _pandas!!
    }

private var _pandas: ImageVector? = null
