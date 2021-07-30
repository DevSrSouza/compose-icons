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

public val SimpleIcons.Blackberry: ImageVector
    get() {
        if (_blackberry != null) {
            return _blackberry!!
        }
        _blackberry = Builder(name = "Blackberry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.05f, 3.54f)
                lineTo(1.17f, 7.7f)
                horizontalLineTo(4.45f)
                curveTo(6.97f, 7.7f, 7.73f, 6.47f, 7.73f, 5.36f)
                curveTo(7.73f, 4.54f, 7.26f, 3.54f, 5.21f, 3.54f)
                horizontalLineTo(2.05f)
                moveTo(10.54f, 3.54f)
                lineTo(9.66f, 7.7f)
                horizontalLineTo(12.94f)
                curveTo(15.5f, 7.7f, 16.22f, 6.47f, 16.22f, 5.36f)
                curveTo(16.22f, 4.54f, 15.75f, 3.54f, 13.7f, 3.54f)
                horizontalLineTo(10.54f)
                moveTo(18.32f, 7.23f)
                lineTo(17.39f, 11.39f)
                horizontalLineTo(20.67f)
                curveTo(23.24f, 11.39f, 24.0f, 10.22f, 24.0f, 9.05f)
                curveTo(24.0f, 8.23f, 23.53f, 7.23f, 21.5f, 7.23f)
                horizontalLineTo(18.32f)
                moveTo(0.88f, 9.8f)
                lineTo(0.0f, 13.96f)
                horizontalLineTo(3.28f)
                curveTo(5.85f, 13.96f, 6.56f, 12.73f, 6.56f, 11.62f)
                curveTo(6.56f, 10.8f, 6.09f, 9.8f, 4.04f, 9.8f)
                horizontalLineTo(0.88f)
                moveTo(9.43f, 9.8f)
                lineTo(8.5f, 13.96f)
                horizontalLineTo(11.77f)
                curveTo(14.34f, 13.96f, 15.11f, 12.73f, 15.11f, 11.62f)
                curveTo(15.11f, 10.8f, 14.64f, 9.8f, 12.59f, 9.8f)
                horizontalLineTo(9.42f)
                moveTo(17.09f, 13.73f)
                lineTo(16.22f, 17.88f)
                horizontalLineTo(19.5f)
                curveTo(22.0f, 17.88f, 22.77f, 16.71f, 22.77f, 15.54f)
                curveTo(22.77f, 14.72f, 22.3f, 13.73f, 20.26f, 13.73f)
                horizontalLineTo(17.09f)
                moveTo(8.2f, 16.3f)
                lineTo(7.32f, 20.46f)
                horizontalLineTo(10.6f)
                curveTo(13.11f, 20.46f, 13.87f, 19.23f, 13.87f, 18.12f)
                curveTo(13.87f, 17.3f, 13.41f, 16.3f, 11.36f, 16.3f)
                horizontalLineTo(8.2f)
                close()
            }
        }
        .build()
        return _blackberry!!
    }

private var _blackberry: ImageVector? = null
