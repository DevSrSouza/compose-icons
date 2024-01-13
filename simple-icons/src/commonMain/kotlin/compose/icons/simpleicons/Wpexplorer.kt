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

public val SimpleIcons.Wpexplorer: ImageVector
    get() {
        if (_wpexplorer != null) {
            return _wpexplorer!!
        }
        _wpexplorer = Builder(name = "Wpexplorer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcToRelative(12.008f, 12.008f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(22.5f, 12.0f)
                arcTo(10.5f, 10.5f, 0.0f, true, false, 12.0f, 22.5f)
                arcTo(10.516f, 10.516f, 0.0f, false, false, 22.5f, 12.0f)
                close()
                moveTo(7.542f, 5.841f)
                lineToRelative(4.074f, 1.739f)
                lineToRelative(-1.739f, 4.073f)
                lineTo(5.8f, 9.914f)
                lineToRelative(1.742f, -4.073f)
                close()
                moveTo(12.7f, 13.767f)
                lineTo(14.885f, 18.173f)
                lineTo(14.2f, 18.173f)
                lineToRelative(-2.343f, -4.687f)
                lineToRelative(-2.295f, 4.687f)
                horizontalLineToRelative(-0.656f)
                lineToRelative(2.4f, -5.01f)
                lineToRelative(-1.046f, -0.441f)
                lineToRelative(0.282f, -0.656f)
                lineToRelative(3.215f, 1.364f)
                lineToRelative(-0.281f, 0.67f)
                close()
                moveTo(12.147f, 8.316f)
                lineTo(15.363f, 9.694f)
                lineTo(13.985f, 12.894f)
                lineTo(10.785f, 11.53f)
                lineTo(12.149f, 8.315f)
                close()
                moveTo(15.911f, 10.327f)
                lineTo(18.471f, 11.409f)
                lineTo(17.371f, 13.955f)
                lineTo(14.826f, 12.872f)
                lineTo(15.908f, 10.327f)
                close()
            }
        }
        .build()
        return _wpexplorer!!
    }

private var _wpexplorer: ImageVector? = null
