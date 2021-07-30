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

public val SimpleIcons.Spdx: ImageVector
    get() {
        if (_spdx != null) {
            return _spdx!!
        }
        _spdx = Builder(name = "Spdx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(8.222f, 24.0f)
                lineToRelative(2.089f, -2.373f)
                lineToRelative(2.09f, -2.374f)
                lineTo(12.401f, 13.2f)
                lineTo(18.978f, 13.2f)
                lineToRelative(2.51f, -2.488f)
                lineTo(24.0f, 8.223f)
                lineTo(24.0f, 0.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(5.2f, 5.2f)
                horizontalLineToRelative(13.791f)
                lineTo(12.2f, 12.0f)
                curveToRelative(-3.735f, 3.74f, -6.838f, 6.8f, -6.896f, 6.8f)
                curveToRelative(-0.057f, 0.0f, -0.104f, -3.06f, -0.104f, -6.8f)
                close()
                moveTo(13.6f, 14.0f)
                verticalLineToRelative(10.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 14.0f)
                horizontalLineToRelative(-5.2f)
                close()
            }
        }
        .build()
        return _spdx!!
    }

private var _spdx: ImageVector? = null
