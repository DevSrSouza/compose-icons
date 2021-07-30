package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Crutch: ImageVector
    get() {
        if (_crutch != null) {
            return _crutch!!
        }
        _crutch = Builder(name = "Crutch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(507.31f, 185.71f)
                lineToRelative(-181.0f, -181.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineTo(281.0f, 27.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(181.0f, 181.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(22.62f, -22.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.06f, -22.6f)
                close()
                moveTo(327.77f, 252.12f)
                lineToRelative(-67.89f, -67.89f)
                lineToRelative(55.1f, -55.1f)
                lineToRelative(-45.25f, -45.25f)
                lineToRelative(-109.67f, 109.67f)
                arcToRelative(96.08f, 96.08f, 0.0f, false, false, -25.67f, 46.29f)
                lineTo(106.65f, 360.1f)
                lineToRelative(-102.0f, 102.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(102.0f, -102.0f)
                lineToRelative(120.25f, -27.75f)
                arcToRelative(95.88f, 95.88f, 0.0f, false, false, 46.29f, -25.65f)
                lineToRelative(109.68f, -109.68f)
                lineTo(382.87f, 197.0f)
                close()
                moveTo(273.2f, 306.69f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -15.45f, 8.54f)
                lineToRelative(-79.3f, 18.32f)
                lineToRelative(18.3f, -79.3f)
                arcToRelative(32.22f, 32.22f, 0.0f, false, true, 8.56f, -15.45f)
                lineToRelative(9.31f, -9.31f)
                lineToRelative(67.89f, 67.89f)
                close()
            }
        }
        .build()
        return _crutch!!
    }

private var _crutch: ImageVector? = null
