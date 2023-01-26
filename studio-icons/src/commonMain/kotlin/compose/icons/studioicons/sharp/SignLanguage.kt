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

public val SharpGroup.SignLanguage: ImageVector
    get() {
        if (_signLanguage != null) {
            return _signLanguage!!
        }
        _signLanguage = Builder(name = "SignLanguage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.49f, 13.0f)
                lineToRelative(-1.39f, -2.7f)
                lineTo(12.49f, 9.0f)
                lineTo(19.0f, 15.2f)
                verticalLineTo(24.0f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(12.49f)
                close()
                moveTo(11.78f, 7.12f)
                curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f)
                lineTo(6.76f, 4.74f)
                lineToRelative(1.45f, -1.38f)
                lineTo(11.78f, 7.12f)
                close()
                moveTo(9.64f, 9.21f)
                curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11.0f)
                horizontalLineTo(8.58f)
                lineTo(5.62f, 7.89f)
                lineToRelative(1.45f, -1.38f)
                lineTo(9.64f, 9.21f)
                close()
                moveTo(21.98f, 12.34f)
                lineTo(22.0f, 3.35f)
                lineToRelative(-1.9f, -0.1f)
                lineToRelative(-1.0f, 2.86f)
                lineTo(13.3f, 0.0f)
                lineToRelative(-1.45f, 1.38f)
                lineToRelative(4.09f, 4.3f)
                lineToRelative(-0.73f, 0.69f)
                lineTo(9.74f, 0.64f)
                lineTo(8.3f, 2.0f)
                lineToRelative(3.36f, 3.53f)
                lineToRelative(1.06f, 1.11f)
                lineToRelative(2.65f, 2.33f)
                lineToRelative(5.08f, 4.83f)
                lineTo(21.98f, 12.34f)
                close()
            }
        }
        .build()
        return _signLanguage!!
    }

private var _signLanguage: ImageVector? = null
