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

public val RemixIcons.MoonClearLine: ImageVector
    get() {
        if (_moonClearLine != null) {
            return _moonClearLine!!
        }
        _moonClearLine = Builder(name = "MoonClearLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.955f, 6.956f)
                curveTo(21.474f, 18.03f, 17.2f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -5.2f, 3.97f, -9.474f, 9.044f, -9.955f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 10.0f, 6.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcToRelative(8.006f, 8.006f, 0.0f, false, false, 6.957f, -4.045f)
                curveToRelative(-0.316f, 0.03f, -0.636f, 0.045f, -0.957f, 0.045f)
                curveToRelative(-5.523f, 0.0f, -10.0f, -4.477f, -10.0f, -10.0f)
                curveToRelative(0.0f, -0.321f, 0.015f, -0.64f, 0.045f, -0.957f)
                arcTo(8.006f, 8.006f, 0.0f, false, false, 4.0f, 12.0f)
                close()
                moveTo(18.164f, 2.291f)
                lineTo(19.0f, 2.5f)
                verticalLineToRelative(1.0f)
                lineToRelative(-0.836f, 0.209f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, 1.455f)
                lineTo(16.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.209f, -0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, -1.455f)
                lineTo(13.0f, 3.5f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.836f, -0.209f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.29f, 0.836f)
                lineTo(15.5f, 0.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.209f, 0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.455f, 1.455f)
                close()
                moveTo(23.164f, 7.291f)
                lineTo(24.0f, 7.5f)
                verticalLineToRelative(1.0f)
                lineToRelative(-0.836f, 0.209f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, 1.455f)
                lineTo(21.5f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.209f, -0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, -1.455f)
                lineTo(18.0f, 8.5f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.836f, -0.209f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.455f, -1.455f)
                lineTo(20.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.209f, 0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.455f, 1.455f)
                close()
            }
        }
        .build()
        return _moonClearLine!!
    }

private var _moonClearLine: ImageVector? = null
