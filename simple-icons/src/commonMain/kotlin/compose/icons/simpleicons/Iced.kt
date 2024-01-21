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

public val SimpleIcons.Iced: ImageVector
    get() {
        if (_iced != null) {
            return _iced!!
        }
        _iced = Builder(name = "Iced", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.605f, 0.0f)
                lineToRelative(-6.023f, 6.123f)
                lineToRelative(1.313f, 1.291f)
                lineToRelative(6.023f, -6.123f)
                lineTo(22.605f, 0.0f)
                close()
                moveTo(16.967f, 0.047f)
                lineTo(7.932f, 9.232f)
                lineToRelative(1.312f, 1.29f)
                lineToRelative(9.035f, -9.184f)
                lineTo(16.967f, 0.047f)
                close()
                moveTo(9.699f, 1.775f)
                curveToRelative(-2.337f, 2.377f, -3.477f, 3.528f, -4.617f, 4.68f)
                arcToRelative(1972.17f, 1972.17f, 0.0f, false, false, -4.621f, 4.686f)
                lineToRelative(-0.379f, 0.384f)
                lineToRelative(2.867f, 9.772f)
                lineTo(12.762f, 24.0f)
                lineToRelative(10.511f, -10.5f)
                lineToRelative(-1.3f, -1.3f)
                lineToRelative(-9.02f, 9.007f)
                lineToRelative(-1.908f, -6.83f)
                lineToRelative(5.559f, -5.65f)
                lineToRelative(-1.311f, -1.291f)
                lineToRelative(-5.559f, 5.65f)
                lineToRelative(-6.845f, -1.79f)
                curveTo(4.506f, 9.655f, 5.449f, 8.703f, 6.39f, 7.75f)
                curveToRelative(1.14f, -1.153f, 2.282f, -2.305f, 4.62f, -4.684f)
                lineTo(9.7f, 1.776f)
                close()
                moveTo(21.605f, 6.73f)
                lineToRelative(-1.53f, 1.53f)
                lineToRelative(-6.458f, 6.565f)
                lineToRelative(1.313f, 1.291f)
                lineToRelative(6.45f, -6.558f)
                lineToRelative(1.528f, -1.528f)
                lineToRelative(-1.303f, -1.3f)
                close()
                moveTo(2.46f, 13.088f)
                lineToRelative(6.812f, 1.781f)
                lineToRelative(1.895f, 6.783f)
                lineToRelative(-6.738f, -1.857f)
                lineToRelative(-1.969f, -6.707f)
                close()
            }
        }
        .build()
        return _iced!!
    }

private var _iced: ImageVector? = null
