package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.449f)
                lineTo(9.75f, 2.1f)
                verticalLineToRelative(9.451f)
                horizontalLineTo(0.0f)
                moveToRelative(10.949f, -9.602f)
                lineTo(24.0f, 0.0f)
                verticalLineToRelative(11.4f)
                horizontalLineTo(10.949f)
                moveTo(0.0f, 12.6f)
                horizontalLineToRelative(9.75f)
                verticalLineToRelative(9.451f)
                lineTo(0.0f, 20.699f)
                moveTo(10.949f, 12.6f)
                horizontalLineTo(24.0f)
                verticalLineTo(24.0f)
                lineToRelative(-12.9f, -1.801f)
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
