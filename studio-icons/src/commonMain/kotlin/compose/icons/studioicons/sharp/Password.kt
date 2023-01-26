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

public val SharpGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(3.15f, 12.95f)
                lineTo(4.0f, 11.47f)
                lineToRelative(0.85f, 1.48f)
                lineToRelative(1.3f, -0.75f)
                lineTo(5.3f, 10.72f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(5.3f)
                lineToRelative(0.85f, -1.47f)
                lineTo(4.85f, 7.0f)
                lineTo(4.0f, 8.47f)
                lineTo(3.15f, 7.0f)
                lineToRelative(-1.3f, 0.75f)
                lineTo(2.7f, 9.22f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.7f)
                lineTo(1.85f, 12.2f)
                lineTo(3.15f, 12.95f)
                close()
                moveTo(9.85f, 12.2f)
                lineToRelative(1.3f, 0.75f)
                lineTo(12.0f, 11.47f)
                lineToRelative(0.85f, 1.48f)
                lineToRelative(1.3f, -0.75f)
                lineToRelative(-0.85f, -1.48f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(0.85f, -1.47f)
                lineTo(12.85f, 7.0f)
                lineTo(12.0f, 8.47f)
                lineTo(11.15f, 7.0f)
                lineToRelative(-1.3f, 0.75f)
                lineToRelative(0.85f, 1.47f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.7f)
                lineTo(9.85f, 12.2f)
                close()
                moveTo(23.0f, 9.22f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(0.85f, -1.47f)
                lineTo(20.85f, 7.0f)
                lineTo(20.0f, 8.47f)
                lineTo(19.15f, 7.0f)
                lineToRelative(-1.3f, 0.75f)
                lineToRelative(0.85f, 1.47f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-0.85f, 1.48f)
                lineToRelative(1.3f, 0.75f)
                lineTo(20.0f, 11.47f)
                lineToRelative(0.85f, 1.48f)
                lineToRelative(1.3f, -0.75f)
                lineToRelative(-0.85f, -1.48f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.22f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
