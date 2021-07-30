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

public val SimpleIcons.Giphy: ImageVector
    get() {
        if (_giphy != null) {
            return _giphy!!
        }
        _giphy = Builder(name = "Giphy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.666f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(18.668f)
                lineTo(21.334f, 8.666f)
                lineToRelative(-2.668f, 2.668f)
                verticalLineToRelative(10.0f)
                lineTo(5.334f, 21.334f)
                lineTo(5.334f, 2.668f)
                lineTo(10.0f, 2.668f)
                lineTo(12.666f, 0.0f)
                close()
                moveTo(13.334f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(21.334f, 5.334f)
                horizontalLineToRelative(-2.668f)
                lineTo(18.666f, 2.668f)
                lineTo(16.0f, 2.668f)
                lineTo(16.0f, 0.0f)
            }
        }
        .build()
        return _giphy!!
    }

private var _giphy: ImageVector? = null
