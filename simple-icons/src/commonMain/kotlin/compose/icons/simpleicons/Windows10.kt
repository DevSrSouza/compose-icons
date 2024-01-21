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

public val SimpleIcons.Windows10: ImageVector
    get() {
        if (_windows10 != null) {
            return _windows10!!
        }
        _windows10 = Builder(name = "Windows10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
        return _windows10!!
    }

private var _windows10: ImageVector? = null
