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

public val RemixIcons.FlaskFill: ImageVector
    get() {
        if (_flaskFill != null) {
            return _flaskFill!!
        }
        _flaskFill = Builder(name = "FlaskFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.243f)
                curveToRelative(0.0f, 1.158f, 0.251f, 2.301f, 0.736f, 3.352f)
                lineToRelative(4.282f, 9.276f)
                curveToRelative(0.347f, 0.753f, 0.018f, 1.644f, -0.734f, 1.99f)
                curveToRelative(-0.197f, 0.092f, -0.411f, 0.139f, -0.628f, 0.139f)
                lineTo(5.344f, 22.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.217f, 0.047f, -0.432f, 0.138f, -0.629f)
                lineToRelative(4.282f, -9.276f)
                curveTo(8.749f, 9.545f, 9.0f, 8.401f, 9.0f, 7.243f)
                lineTo(9.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _flaskFill!!
    }

private var _flaskFill: ImageVector? = null
