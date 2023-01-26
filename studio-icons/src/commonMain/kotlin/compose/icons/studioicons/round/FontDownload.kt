package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FontDownload: ImageVector
    get() {
        if (_fontDownload != null) {
            return _fontDownload!!
        }
        _fontDownload = Builder(name = "FontDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.93f, 13.5f)
                horizontalLineToRelative(4.14f)
                lineTo(12.0f, 7.98f)
                lineTo(9.93f, 13.5f)
                close()
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.71f, 17.88f)
                lineToRelative(-0.9f, -2.38f)
                lineTo(9.17f, 15.5f)
                lineToRelative(-0.89f, 2.37f)
                curveToRelative(-0.14f, 0.38f, -0.5f, 0.63f, -0.91f, 0.63f)
                curveToRelative(-0.68f, 0.0f, -1.15f, -0.69f, -0.9f, -1.32f)
                lineToRelative(4.25f, -10.81f)
                curveToRelative(0.22f, -0.53f, 0.72f, -0.87f, 1.28f, -0.87f)
                reflectiveCurveToRelative(1.06f, 0.34f, 1.27f, 0.87f)
                lineToRelative(4.25f, 10.81f)
                curveToRelative(0.25f, 0.63f, -0.22f, 1.32f, -0.9f, 1.32f)
                curveToRelative(-0.4f, 0.0f, -0.76f, -0.25f, -0.91f, -0.62f)
                close()
            }
        }
        .build()
        return _fontDownload!!
    }

private var _fontDownload: ImageVector? = null
