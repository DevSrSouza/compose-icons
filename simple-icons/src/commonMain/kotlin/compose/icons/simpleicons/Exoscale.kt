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

public val SimpleIcons.Exoscale: ImageVector
    get() {
        if (_exoscale != null) {
            return _exoscale!!
        }
        _exoscale = Builder(name = "Exoscale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.608f)
                lineTo(0.0f, 22.392f)
                horizontalLineToRelative(1.665f)
                lineTo(12.0f, 4.593f)
                verticalLineToRelative(2.929f)
                lineToRelative(-8.612f, 14.87f)
                horizontalLineTo(5.11f)
                lineTo(12.0f, 10.507f)
                verticalLineToRelative(2.986f)
                lineToRelative(-5.167f, 8.9f)
                horizontalLineToRelative(1.722f)
                lineTo(12.0f, 16.477f)
                verticalLineToRelative(2.929f)
                lineToRelative(-1.722f, 2.985f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _exoscale!!
    }

private var _exoscale: ImageVector? = null
