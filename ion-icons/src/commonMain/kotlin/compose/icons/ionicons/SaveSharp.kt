package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SaveSharp: ImageVector
    get() {
        if (_saveSharp != null) {
            return _saveSharp!!
        }
        _saveSharp = Builder(name = "SaveSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.44f, 32.0f)
                horizontalLineTo(64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 32.0f, 64.0f)
                verticalLineTo(448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(448.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(131.56f)
                close()
                moveTo(112.0f, 176.0f)
                verticalLineTo(112.0f)
                horizontalLineTo(304.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(335.91f, 355.76f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -83.66f, -83.67f)
                arcTo(80.21f, 80.21f, 0.0f, false, true, 335.91f, 355.76f)
                close()
            }
        }
        .build()
        return _saveSharp!!
    }

private var _saveSharp: ImageVector? = null
