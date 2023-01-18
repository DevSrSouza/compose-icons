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

public val RemixIcons.CreativeCommonsNcLine: ImageVector
    get() {
        if (_creativeCommonsNcLine != null) {
            return _creativeCommonsNcLine!!
        }
        _creativeCommonsNcLine = Builder(name = "CreativeCommonsNcLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.4f, -0.846f, 4.604f, -2.256f, 6.328f)
                lineToRelative(0.034f, 0.036f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.036f, -0.034f)
                arcTo(9.959f, 9.959f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.905f, 6.32f)
                lineToRelative(-2.375f, -2.376f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 14.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.5f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(14.0f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.09f, -0.992f)
                lineTo(14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.165f, -3.75f)
                lineTo(5.679f, 7.094f)
                arcTo(7.965f, 7.965f, 0.0f, false, false, 4.0f, 12.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-1.848f, 0.0f, -3.55f, 0.627f, -4.905f, 1.68f)
                lineTo(9.47f, 8.055f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 10.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.09f, 0.992f)
                lineTo(10.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.165f, 3.75f)
                lineToRelative(2.156f, 2.155f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsNcLine!!
    }

private var _creativeCommonsNcLine: ImageVector? = null
