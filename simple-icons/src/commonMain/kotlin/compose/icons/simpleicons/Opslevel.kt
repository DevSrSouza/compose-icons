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

public val SimpleIcons.Opslevel: ImageVector
    get() {
        if (_opslevel != null) {
            return _opslevel!!
        }
        _opslevel = Builder(name = "Opslevel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.246f, 4.86f)
                lineTo(13.527f, 0.411f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, false, -3.071f, 0.0f)
                lineToRelative(-2.34f, 1.344f)
                verticalLineToRelative(6.209f)
                lineToRelative(3.104f, -1.793f)
                arcToRelative(1.515f, 1.515f, 0.0f, false, true, 1.544f, 0.0f)
                lineToRelative(3.884f, 2.241f)
                curveToRelative(0.482f, 0.282f, 0.764f, 0.78f, 0.764f, 1.328f)
                verticalLineToRelative(4.482f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, -0.764f, 1.328f)
                lineToRelative(-3.884f, 2.241f)
                verticalLineTo(24.0f)
                lineToRelative(8.482f, -4.897f)
                arcToRelative(3.082f, 3.082f, 0.0f, false, false, 1.544f, -2.656f)
                verticalLineTo(7.532f)
                arcToRelative(3.054f, 3.054f, 0.0f, false, false, -1.544f, -2.672f)
                close()
                moveTo(6.588f, 14.222f)
                verticalLineTo(2.652f)
                lineTo(2.754f, 4.876f)
                arcTo(3.082f, 3.082f, 0.0f, false, false, 1.21f, 7.532f)
                verticalLineToRelative(8.915f)
                curveToRelative(0.0f, 1.095f, 0.581f, 2.108f, 1.544f, 2.656f)
                lineTo(11.236f, 24.0f)
                verticalLineToRelative(-6.209f)
                lineTo(7.352f, 15.55f)
                arcToRelative(1.525f, 1.525f, 0.0f, false, true, -0.764f, -1.328f)
                close()
            }
        }
        .build()
        return _opslevel!!
    }

private var _opslevel: ImageVector? = null
