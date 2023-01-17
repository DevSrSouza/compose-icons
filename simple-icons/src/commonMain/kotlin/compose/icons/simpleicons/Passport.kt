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

public val SimpleIcons.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.875f, 0.0f)
                arcTo(9.6f, 9.6f, 0.0f, false, false, 2.4f, 9.475f)
                horizontalLineToRelative(4.8f)
                arcTo(4.81f, 4.81f, 0.0f, false, true, 11.875f, 4.8f)
                close()
                moveTo(12.125f, 0.0f)
                verticalLineToRelative(4.8f)
                arcTo(4.81f, 4.81f, 0.0f, false, true, 16.8f, 9.475f)
                horizontalLineToRelative(4.8f)
                arcTo(9.6f, 9.6f, 0.0f, false, false, 12.125f, 0.0f)
                close()
                moveTo(2.4f, 9.725f)
                lineTo(2.4f, 24.0f)
                lineTo(12.0f, 24.0f)
                verticalLineToRelative(-4.8f)
                lineTo(7.2f, 19.2f)
                lineTo(7.2f, 9.724f)
                close()
                moveTo(12.0f, 19.199f)
                arcToRelative(9.599f, 9.599f, 0.0f, false, false, 9.6f, -9.474f)
                horizontalLineToRelative(-4.8f)
                arcTo(4.807f, 4.807f, 0.0f, false, true, 12.0f, 14.4f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
