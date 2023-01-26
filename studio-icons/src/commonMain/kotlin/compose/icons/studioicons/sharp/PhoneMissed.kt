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

public val SharpGroup.PhoneMissed: ImageVector
    get() {
        if (_phoneMissed != null) {
            return _phoneMissed!!
        }
        _phoneMissed = Builder(name = "PhoneMissed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.32f, 16.67f)
                curveToRelative(-2.95f, -2.79f, -6.93f, -4.51f, -11.31f, -4.51f)
                curveToRelative(-4.39f, 0.0f, -8.37f, 1.72f, -11.31f, 4.51f)
                lineToRelative(-0.69f, 0.69f)
                lineTo(3.65f, 21.0f)
                lineToRelative(3.93f, -2.72f)
                lineToRelative(-0.01f, -3.49f)
                curveToRelative(1.4f, -0.45f, 2.9f, -0.7f, 4.44f, -0.7f)
                curveToRelative(1.55f, 0.0f, 3.04f, 0.24f, 4.44f, 0.7f)
                lineToRelative(-0.01f, 3.49f)
                lineTo(20.37f, 21.0f)
                lineToRelative(3.64f, -3.64f)
                curveToRelative(0.0f, -0.01f, -0.52f, -0.52f, -0.69f, -0.69f)
                close()
                moveTo(7.0f, 6.43f)
                lineToRelative(4.94f, 4.94f)
                lineToRelative(7.07f, -7.07f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(8.4f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _phoneMissed!!
    }

private var _phoneMissed: ImageVector? = null
