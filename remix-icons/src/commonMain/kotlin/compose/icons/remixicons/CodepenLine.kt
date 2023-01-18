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

public val RemixIcons.CodepenLine: ImageVector
    get() {
        if (_codepenLine != null) {
            return _codepenLine!!
        }
        _codepenLine = Builder(name = "CodepenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.202f)
                lineTo(13.0f, 15.535f)
                verticalLineToRelative(3.596f)
                lineTo(19.197f, 15.0f)
                lineTo(16.5f, 13.202f)
                close()
                moveTo(14.697f, 12.0f)
                lineTo(12.0f, 10.202f)
                lineTo(9.303f, 12.0f)
                lineTo(12.0f, 13.798f)
                lineTo(14.697f, 12.0f)
                close()
                moveTo(20.0f, 10.869f)
                lineTo(18.303f, 12.0f)
                lineTo(20.0f, 13.131f)
                verticalLineTo(10.87f)
                close()
                moveTo(19.197f, 9.0f)
                lineTo(13.0f, 4.869f)
                verticalLineToRelative(3.596f)
                lineToRelative(3.5f, 2.333f)
                lineTo(19.197f, 9.0f)
                close()
                moveTo(7.5f, 10.798f)
                lineTo(11.0f, 8.465f)
                verticalLineTo(4.869f)
                lineTo(4.803f, 9.0f)
                lineTo(7.5f, 10.798f)
                close()
                moveTo(4.803f, 15.0f)
                lineTo(11.0f, 19.131f)
                verticalLineToRelative(-3.596f)
                lineToRelative(-3.5f, -2.333f)
                lineTo(4.803f, 15.0f)
                close()
                moveTo(4.0f, 13.131f)
                lineTo(5.697f, 12.0f)
                lineTo(4.0f, 10.869f)
                verticalLineToRelative(2.262f)
                close()
                moveTo(2.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.445f, -0.832f)
                lineToRelative(9.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, 0.0f)
                lineToRelative(9.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.445f, 0.832f)
                lineToRelative(-9.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.11f, 0.0f)
                lineToRelative(-9.0f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _codepenLine!!
    }

private var _codepenLine: ImageVector? = null
