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

public val RemixIcons.FileEditLine: ImageVector
    get() {
        if (_fileEditLine != null) {
            return _fileEditLine!!
        }
        _fileEditLine = Builder(name = "FileEditLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.757f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.757f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(5.765f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.993f)
                lineTo(3.0f, 8.0f)
                lineToRelative(6.003f, -6.0f)
                horizontalLineToRelative(10.995f)
                curveTo(20.55f, 2.0f, 21.0f, 2.455f, 21.0f, 2.992f)
                verticalLineToRelative(3.765f)
                close()
                moveTo(21.778f, 8.807f)
                lineToRelative(1.414f, 1.415f)
                lineTo(15.414f, 18.0f)
                lineToRelative(-1.416f, -0.002f)
                lineToRelative(0.002f, -1.412f)
                lineToRelative(7.778f, -7.778f)
                close()
            }
        }
        .build()
        return _fileEditLine!!
    }

private var _fileEditLine: ImageVector? = null
