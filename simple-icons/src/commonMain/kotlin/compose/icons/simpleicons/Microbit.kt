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

public val SimpleIcons.Microbit: ImageVector
    get() {
        if (_microbit != null) {
            return _microbit!!
        }
        _microbit = Builder(name = "Microbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.857f, 5.143f)
                arcTo(6.865f, 6.865f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(6.864f, 6.864f, 0.0f, false, false, 6.857f, 6.857f)
                horizontalLineToRelative(10.287f)
                arcTo(6.863f, 6.863f, 0.0f, false, false, 24.0f, 12.0f)
                curveToRelative(0.0f, -3.781f, -3.075f, -6.857f, -6.856f, -6.857f)
                close()
                moveTo(6.857f, 7.887f)
                horizontalLineToRelative(10.287f)
                arcTo(4.117f, 4.117f, 0.0f, false, true, 21.257f, 12.0f)
                arcToRelative(4.119f, 4.119f, 0.0f, false, true, -4.113f, 4.116f)
                lineTo(6.857f, 16.116f)
                arcTo(4.12f, 4.12f, 0.0f, false, true, 2.743f, 12.0f)
                arcToRelative(4.118f, 4.118f, 0.0f, false, true, 4.114f, -4.113f)
                close()
                moveTo(17.025f, 10.616f)
                arcToRelative(1.385f, 1.385f, 0.0f, true, false, 0.003f, 2.77f)
                arcToRelative(1.385f, 1.385f, 0.0f, false, false, -0.003f, -2.77f)
                close()
                moveTo(6.859f, 10.616f)
                arcToRelative(1.385f, 1.385f, 0.0f, true, false, -0.003f, 2.771f)
                arcToRelative(1.385f, 1.385f, 0.0f, false, false, 0.003f, -2.77f)
                close()
            }
        }
        .build()
        return _microbit!!
    }

private var _microbit: ImageVector? = null
