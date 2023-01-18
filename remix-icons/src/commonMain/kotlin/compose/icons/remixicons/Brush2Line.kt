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

public val RemixIcons.Brush2Line: ImageVector
    get() {
        if (_brush2Line != null) {
            return _brush2Line!!
        }
        _brush2Line = Builder(name = "Brush2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.536f, 15.95f)
                lineToRelative(2.12f, -2.122f)
                lineToRelative(-3.181f, -3.182f)
                lineToRelative(3.535f, -3.535f)
                lineToRelative(-2.12f, -2.121f)
                lineToRelative(-3.536f, 3.535f)
                lineToRelative(-3.182f, -3.182f)
                lineTo(8.05f, 7.464f)
                lineToRelative(8.486f, 8.486f)
                close()
                moveTo(15.121f, 17.364f)
                lineTo(6.636f, 8.879f)
                lineToRelative(-2.828f, 2.828f)
                lineToRelative(8.485f, 8.485f)
                lineToRelative(2.828f, -2.828f)
                close()
                moveTo(13.354f, 5.697f)
                lineToRelative(2.828f, -2.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(3.536f, 3.536f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-2.829f, 2.828f)
                lineToRelative(2.475f, 2.475f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.415f)
                lineTo(13.0f, 22.314f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-9.9f, -9.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(7.778f, -7.778f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 0.0f)
                lineToRelative(2.475f, 2.475f)
                close()
            }
        }
        .build()
        return _brush2Line!!
    }

private var _brush2Line: ImageVector? = null
