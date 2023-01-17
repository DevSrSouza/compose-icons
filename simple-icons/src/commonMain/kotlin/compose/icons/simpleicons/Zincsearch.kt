package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zincsearch: ImageVector
    get() {
        if (_zincsearch != null) {
            return _zincsearch!!
        }
        _zincsearch = Builder(name = "Zincsearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.723f, 19.748f)
                lineToRelative(-1.73f, 1.493f)
                horizontalLineTo(0.678f)
                lineTo(0.0f, 18.77f)
                lineToRelative(10.63f, -9.343f)
                lineToRelative(0.542f, 6.635f)
                horizontalLineToRelative(8.701f)
                arcToRelative(3.649f, 3.649f, 0.0f, false, true, -1.15f, 3.686f)
                close()
                moveTo(5.277f, 4.252f)
                lineToRelative(1.73f, -1.493f)
                horizontalLineToRelative(16.316f)
                lineTo(24.0f, 5.23f)
                lineToRelative(-10.63f, 9.343f)
                lineToRelative(-0.542f, -6.635f)
                horizontalLineTo(4.129f)
                arcToRelative(3.648f, 3.648f, 0.0f, false, true, 1.148f, -3.686f)
                close()
            }
        }
        .build()
        return _zincsearch!!
    }

private var _zincsearch: ImageVector? = null
