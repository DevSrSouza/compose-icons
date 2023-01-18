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

public val RemixIcons.CloudWindyLine: ImageVector
    get() {
        if (_cloudWindyLine != null) {
            return _cloudWindyLine!!
        }
        _cloudWindyLine = Builder(name = "CloudWindyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -2.5f, -5.95f)
                lineTo(15.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(0.007f)
                lineTo(1.0f, 10.007f)
                lineTo(1.0f, 10.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.458f, -2.901f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 17.5f, 18.0f)
                lineTo(14.0f, 18.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _cloudWindyLine!!
    }

private var _cloudWindyLine: ImageVector? = null
