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

public val RemixIcons.ThunderstormsLine: ImageVector
    get() {
        if (_thunderstormsLine != null) {
            return _thunderstormsLine!!
        }
        _thunderstormsLine = Builder(name = "ThunderstormsLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -2.5f, -5.95f)
                lineTo(15.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.0f, 5.659f)
                verticalLineToRelative(2.089f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 9.458f, -10.65f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 17.5f, 18.0f)
                lineToRelative(-0.5f, 0.001f)
                close()
                moveTo(13.0f, 16.005f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-5.0f, 6.5f)
                verticalLineToRelative(-4.5f)
                lineTo(8.0f, 18.005f)
                lineToRelative(5.0f, -6.505f)
                verticalLineToRelative(4.505f)
                close()
            }
        }
        .build()
        return _thunderstormsLine!!
    }

private var _thunderstormsLine: ImageVector? = null
