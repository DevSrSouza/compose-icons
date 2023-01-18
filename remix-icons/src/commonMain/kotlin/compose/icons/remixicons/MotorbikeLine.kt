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

public val RemixIcons.MotorbikeLine: ImageVector
    get() {
        if (_motorbikeLine != null) {
            return _motorbikeLine!!
        }
        _motorbikeLine = Builder(name = "MotorbikeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.256f)
                lineTo(4.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.365f)
                lineTo(11.2f, 8.0f)
                horizontalLineToRelative(3.491f)
                lineTo(13.6f, 5.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(1.092f, 3.0f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.816f)
                lineToRelative(1.456f, 4.002f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -1.985f, 0.392f)
                lineTo(15.419f, 10.0f)
                horizontalLineToRelative(-0.947f)
                lineToRelative(-1.582f, 5.87f)
                lineToRelative(-0.002f, -0.001f)
                lineToRelative(0.002f, 0.006f)
                lineToRelative(-2.925f, 1.064f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 4.0f, 13.256f)
                close()
                moveTo(6.0f, 13.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.281f, 2.033f)
                lineToRelative(1.957f, -0.713f)
                lineTo(12.403f, 10.0f)
                horizontalLineToRelative(-0.547f)
                lineTo(9.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(1.027f)
                close()
                moveTo(5.5f, 20.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(18.5f, 20.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _motorbikeLine!!
    }

private var _motorbikeLine: ImageVector? = null
