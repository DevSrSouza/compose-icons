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

public val RemixIcons.AngularjsLine: ImageVector
    get() {
        if (_angularjsLine != null) {
            return _angularjsLine!!
        }
        _angularjsLine = Builder(name = "AngularjsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.523f, 16.65f)
                lineToRelative(0.49f, -0.27f)
                lineToRelative(1.118f, -9.71f)
                lineTo(12.0f, 4.123f)
                lineTo(4.869f, 6.669f)
                lineToRelative(1.119f, 9.71f)
                lineToRelative(0.473f, 0.263f)
                lineTo(12.0f, 4.21f)
                lineToRelative(5.523f, 12.44f)
                close()
                moveTo(16.424f, 17.26f)
                horizontalLineToRelative(-0.798f)
                lineToRelative(-1.169f, -2.92f)
                lineTo(9.523f, 14.34f)
                lineToRelative(-1.17f, 2.92f)
                horizontalLineToRelative(-0.777f)
                lineTo(12.0f, 19.713f)
                lineToRelative(4.424f, -2.453f)
                close()
                moveTo(12.0f, 2.0f)
                lineToRelative(9.3f, 3.32f)
                lineToRelative(-1.418f, 12.31f)
                lineTo(12.0f, 22.0f)
                lineToRelative(-7.882f, -4.37f)
                lineTo(2.7f, 5.32f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(13.698f, 12.54f)
                lineTo(12.0f, 8.45f)
                lineToRelative(-1.698f, 4.09f)
                horizontalLineToRelative(3.396f)
                close()
            }
        }
        .build()
        return _angularjsLine!!
    }

private var _angularjsLine: ImageVector? = null
