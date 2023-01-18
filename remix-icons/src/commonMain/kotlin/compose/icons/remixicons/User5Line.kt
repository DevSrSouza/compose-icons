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

public val RemixIcons.User5Line: ImageVector
    get() {
        if (_user5Line != null) {
            return _user5Line!!
        }
        _user5Line = Builder(name = "User5Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.39f, 16.539f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 9.221f, 0.0f)
                lineToRelative(2.083f, 4.76f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.459f, 0.701f)
                lineTo(5.765f, 22.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.459f, -0.7f)
                lineToRelative(2.083f, -4.761f)
                close()
                moveTo(14.125f, 15.846f)
                lineToRelative(1.332f, -0.941f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.913f, 0.0f)
                lineToRelative(1.331f, 0.941f)
                lineTo(8.058f, 20.0f)
                horizontalLineToRelative(7.884f)
                lineToRelative(-1.817f, -4.154f)
                close()
                moveTo(8.119f, 10.97f)
                lineToRelative(1.94f, -0.485f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.882f, 0.0f)
                lineToRelative(1.94f, 0.485f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, -7.762f, 0.0f)
                close()
            }
        }
        .build()
        return _user5Line!!
    }

private var _user5Line: ImageVector? = null
