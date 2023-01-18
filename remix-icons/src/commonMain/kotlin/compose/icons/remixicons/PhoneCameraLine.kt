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

public val RemixIcons.PhoneCameraLine: ImageVector
    get() {
        if (_phoneCameraLine != null) {
            return _phoneCameraLine!!
        }
        _phoneCameraLine = Builder(name = "PhoneCameraLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.803f, 4.0f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, -0.72f, 2.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-5.083f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, 2.0f, -0.72f)
                lineTo(23.0f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.44f, 1.001f, -1.002f, 1.001f)
                lineTo(2.002f, 20.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 19.0f)
                lineTo(1.0f, 5.0f)
                curveToRelative(0.0f, -0.552f, 0.44f, -1.0f, 1.002f, -1.0f)
                horizontalLineToRelative(12.8f)
                close()
                moveTo(20.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(20.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _phoneCameraLine!!
    }

private var _phoneCameraLine: ImageVector? = null
