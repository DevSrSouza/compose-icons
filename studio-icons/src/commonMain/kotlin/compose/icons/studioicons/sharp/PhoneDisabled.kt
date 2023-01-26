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

public val SharpGroup.PhoneDisabled: ImageVector
    get() {
        if (_phoneDisabled != null) {
            return _phoneDisabled!!
        }
        _phoneDisabled = Builder(name = "PhoneDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.52f, 17.35f)
                curveTo(11.39f, 19.83f, 7.36f, 21.22f, 3.0f, 20.97f)
                verticalLineToRelative(-5.51f)
                lineToRelative(5.27f, -0.61f)
                lineToRelative(2.52f, 2.52f)
                curveToRelative(0.81f, -0.41f, 1.58f, -0.9f, 2.3f, -1.45f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.42f, -1.41f)
                lineTo(21.19f, 21.2f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(14.52f, 17.35f)
                close()
                moveTo(15.91f, 13.11f)
                curveToRelative(0.56f, -0.73f, 1.05f, -1.51f, 1.47f, -2.33f)
                lineToRelative(-2.53f, -2.53f)
                lineTo(15.46f, 3.0f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.25f, 4.37f, -1.15f, 8.4f, -3.63f, 11.54f)
                lineTo(15.91f, 13.11f)
                close()
            }
        }
        .build()
        return _phoneDisabled!!
    }

private var _phoneDisabled: ImageVector? = null
