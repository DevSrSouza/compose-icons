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

public val SimpleIcons.Teradata: ImageVector
    get() {
        if (_teradata != null) {
            return _teradata!!
        }
        _teradata = Builder(name = "Teradata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.0f, 0.0f, 0.0f, 5.65f, 0.0f, 12.08f)
                curveTo(0.0f, 18.83f, 5.0f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveTo(24.0f, 18.83f, 24.0f, 12.08f)
                curveTo(24.0f, 5.65f, 19.0f, 0.0f, 12.0f, 0.0f)
                moveTo(8.47f, 3.44f)
                horizontalLineTo(11.97f)
                verticalLineTo(6.7f)
                horizontalLineTo(15.55f)
                verticalLineTo(9.56f)
                horizontalLineTo(11.97f)
                verticalLineTo(14.78f)
                curveTo(11.97f, 16.36f, 12.74f, 17.05f, 13.9f, 17.05f)
                curveTo(14.32f, 17.05f, 14.88f, 16.93f, 15.41f, 16.73f)
                curveTo(15.79f, 17.73f, 16.46f, 18.63f, 17.18f, 19.35f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 13.66f, 20.32f)
                curveTo(10.54f, 20.32f, 8.47f, 18.67f, 8.47f, 15.04f)
                verticalLineTo(3.45f)
                close()
            }
        }
        .build()
        return _teradata!!
    }

private var _teradata: ImageVector? = null
