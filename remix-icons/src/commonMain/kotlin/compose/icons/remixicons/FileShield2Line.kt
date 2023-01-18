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

public val RemixIcons.FileShield2Line: ImageVector
    get() {
        if (_fileShield2Line != null) {
            return _fileShield2Line!!
        }
        _fileShield2Line = Builder(name = "FileShield2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                lineTo(14.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(6.056f)
                curveToRelative(0.328f, 0.417f, 0.724f, 0.785f, 1.18f, 1.085f)
                lineToRelative(1.39f, 0.915f)
                lineTo(3.993f, 22.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.455f, 3.449f, 2.0f, 4.002f, 2.0f)
                horizontalLineToRelative(10.995f)
                lineTo(21.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.949f)
                curveToRelative(0.0f, 0.99f, -0.501f, 1.916f, -1.336f, 2.465f)
                lineTo(16.5f, 21.498f)
                lineToRelative(-3.164f, -2.084f)
                arcTo(2.953f, 2.953f, 0.0f, false, true, 12.0f, 16.95f)
                lineTo(12.0f, 11.0f)
                close()
                moveTo(14.0f, 16.949f)
                curveToRelative(0.0f, 0.316f, 0.162f, 0.614f, 0.436f, 0.795f)
                lineToRelative(2.064f, 1.36f)
                lineToRelative(2.064f, -1.36f)
                arcToRelative(0.954f, 0.954f, 0.0f, false, false, 0.436f, -0.795f)
                lineTo(19.0f, 13.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.949f)
                close()
            }
        }
        .build()
        return _fileShield2Line!!
    }

private var _fileShield2Line: ImageVector? = null
