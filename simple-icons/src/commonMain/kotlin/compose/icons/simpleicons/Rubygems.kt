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

public val SimpleIcons.Rubygems: ImageVector
    get() {
        if (_rubygems != null) {
            return _rubygems!!
        }
        _rubygems = Builder(name = "Rubygems", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.81f, 7.9f)
                lineToRelative(-2.97f, 2.95f)
                lineToRelative(7.19f, 7.18f)
                lineToRelative(2.96f, -2.95f)
                lineToRelative(4.22f, -4.23f)
                lineToRelative(-2.96f, -2.96f)
                verticalLineToRelative(-0.01f)
                lineTo(7.8f, 7.88f)
                close()
                moveTo(12.0f, 0.0f)
                lineTo(1.53f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.47f, -6.0f)
                lineTo(22.47f, 6.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(20.47f, 16.85f)
                lineTo(12.0f, 21.73f)
                lineToRelative(-8.47f, -4.88f)
                lineTo(3.53f, 7.12f)
                lineTo(12.0f, 2.24f)
                lineToRelative(8.47f, 4.88f)
                verticalLineToRelative(9.73f)
                close()
            }
        }
        .build()
        return _rubygems!!
    }

private var _rubygems: ImageVector? = null
