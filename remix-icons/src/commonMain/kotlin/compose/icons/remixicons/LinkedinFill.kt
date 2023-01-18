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

public val RemixIcons.LinkedinFill: ImageVector
    get() {
        if (_linkedinFill != null) {
            return _linkedinFill!!
        }
        _linkedinFill = Builder(name = "LinkedinFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.94f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, -0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.002f)
                close()
                moveTo(7.0f, 8.48f)
                lineTo(3.0f, 8.48f)
                lineTo(3.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                lineTo(7.0f, 8.48f)
                close()
                moveTo(13.32f, 8.48f)
                lineTo(9.34f, 8.48f)
                lineTo(9.34f, 21.0f)
                horizontalLineToRelative(3.94f)
                verticalLineToRelative(-6.57f)
                curveToRelative(0.0f, -3.66f, 4.77f, -4.0f, 4.77f, 0.0f)
                lineTo(18.05f, 21.0f)
                lineTo(22.0f, 21.0f)
                verticalLineToRelative(-7.93f)
                curveToRelative(0.0f, -6.17f, -7.06f, -5.94f, -8.72f, -2.91f)
                lineToRelative(0.04f, -1.68f)
                close()
            }
        }
        .build()
        return _linkedinFill!!
    }

private var _linkedinFill: ImageVector? = null
