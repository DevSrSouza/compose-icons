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

public val SimpleIcons.Lmms: ImageVector
    get() {
        if (_lmms != null) {
            return _lmms!!
        }
        _lmms = Builder(name = "Lmms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.714f, 0.0f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 0.0f, 1.714f)
                verticalLineToRelative(20.572f)
                curveTo(0.0f, 23.236f, 0.765f, 24.0f, 1.714f, 24.0f)
                horizontalLineToRelative(20.572f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 24.0f, 22.286f)
                verticalLineTo(1.714f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 22.286f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                lineToRelative(9.0f, 5.143f)
                verticalLineToRelative(10.286f)
                lineToRelative(-3.0f, 1.714f)
                lineToRelative(-3.0f, -1.714f)
                verticalLineTo(15.0f)
                lineToRelative(3.0f, -1.714f)
                verticalLineTo(9.857f)
                lineTo(12.0f, 6.43f)
                lineTo(6.0f, 9.857f)
                verticalLineToRelative(3.429f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(3.429f)
                lineToRelative(-3.0f, 1.714f)
                lineToRelative(-3.0f, -1.714f)
                verticalLineTo(8.143f)
                close()
            }
        }
        .build()
        return _lmms!!
    }

private var _lmms: ImageVector? = null
