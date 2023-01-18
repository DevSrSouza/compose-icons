package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ThunderstormsFill: ImageVector
    get() {
        if (_thunderstormsFill != null) {
            return _thunderstormsFill!!
        }
        _thunderstormsFill = Builder(name = "ThunderstormsFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.988f, 18.0f)
                lineToRelative(1.216f, -1.58f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.189f, -2.415f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-3.976f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.69f, -0.914f)
                lineToRelative(-6.365f, 8.281f)
                arcTo(8.002f, 8.002f, 0.0f, false, true, 9.0f, 2.0f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, true, 7.458f, 5.099f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 17.5f, 18.0f)
                horizontalLineToRelative(-0.512f)
                close()
                moveTo(13.0f, 16.005f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-5.0f, 6.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(8.0f)
                lineToRelative(5.0f, -6.505f)
                verticalLineToRelative(4.505f)
                close()
            }
        }
        .build()
        return _thunderstormsFill!!
    }

private var _thunderstormsFill: ImageVector? = null
