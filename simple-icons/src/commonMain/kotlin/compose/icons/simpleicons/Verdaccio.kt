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

public val SimpleIcons.Verdaccio: ImageVector
    get() {
        if (_verdaccio != null) {
            return _verdaccio!!
        }
        _verdaccio = Builder(name = "Verdaccio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.376f, 9.84f)
                lineTo(18.72f, 7.2f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(0.566f)
                horizontalLineToRelative(0.864f)
                lineToRelative(-0.192f, 0.377f)
                lineTo(12.96f, 8.143f)
                verticalLineToRelative(0.566f)
                horizontalLineToRelative(1.344f)
                lineToRelative(-0.288f, 0.565f)
                lineTo(12.0f, 9.274f)
                verticalLineToRelative(0.566f)
                horizontalLineToRelative(1.728f)
                close()
                moveTo(13.121f, 18.48f)
                lineToRelative(3.68f, -7.265f)
                horizontalLineToRelative(-3.68f)
                lineToRelative(-1.064f, 2.103f)
                lineTo(8.959f, 7.2f)
                lineTo(5.28f, 7.2f)
                lineToRelative(5.712f, 11.28f)
                close()
                moveTo(8.88f, 0.0f)
                horizontalLineToRelative(6.24f)
                arcTo(8.86f, 8.86f, 0.0f, false, true, 24.0f, 8.88f)
                verticalLineToRelative(6.24f)
                arcTo(8.86f, 8.86f, 0.0f, false, true, 15.12f, 24.0f)
                lineTo(8.88f, 24.0f)
                arcTo(8.86f, 8.86f, 0.0f, false, true, 0.0f, 15.12f)
                lineTo(0.0f, 8.88f)
                arcTo(8.86f, 8.86f, 0.0f, false, true, 8.88f, 0.0f)
                close()
            }
        }
        .build()
        return _verdaccio!!
    }

private var _verdaccio: ImageVector? = null
