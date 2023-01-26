package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ScreenRotationAlt: ImageVector
    get() {
        if (_screenRotationAlt != null) {
            return _screenRotationAlt!!
        }
        _screenRotationAlt = Builder(name = "ScreenRotationAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.59f)
                lineToRelative(6.41f, -6.41f)
                lineTo(20.24f, 11.0f)
                horizontalLineToRelative(-2.83f)
                lineTo(10.4f, 4.0f)
                lineTo(5.41f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.59f)
                close()
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-4.99f, 5.0f)
                lineToRelative(-7.01f, -7.0f)
                horizontalLineTo(3.76f)
                lineToRelative(9.83f, 9.83f)
                lineTo(20.0f, 16.41f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _screenRotationAlt!!
    }

private var _screenRotationAlt: ImageVector? = null
