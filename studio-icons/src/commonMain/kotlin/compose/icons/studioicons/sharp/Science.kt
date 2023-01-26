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

public val SharpGroup.Science: ImageVector
    get() {
        if (_science != null) {
            return _science!!
        }
        _science = Builder(name = "Science", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8f, 18.4f)
                lineTo(14.0f, 10.67f)
                verticalLineTo(6.5f)
                lineToRelative(1.35f, -1.69f)
                curveTo(15.61f, 4.48f, 15.38f, 4.0f, 14.96f, 4.0f)
                horizontalLineTo(9.04f)
                curveTo(8.62f, 4.0f, 8.39f, 4.48f, 8.65f, 4.81f)
                lineTo(10.0f, 6.5f)
                verticalLineToRelative(4.17f)
                lineTo(4.2f, 18.4f)
                curveTo(3.71f, 19.06f, 4.18f, 20.0f, 5.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                curveTo(19.82f, 20.0f, 20.29f, 19.06f, 19.8f, 18.4f)
                close()
            }
        }
        .build()
        return _science!!
    }

private var _science: ImageVector? = null
