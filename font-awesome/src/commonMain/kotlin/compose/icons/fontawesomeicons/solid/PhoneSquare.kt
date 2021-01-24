package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PhoneSquare: ImageVector
    get() {
        if (_phoneSquare != null) {
            return _phoneSquare!!
        }
        _phoneSquare = Builder(name = "PhoneSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                horizontalLineTo(48.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(94.0f, 416.0f)
                curveToRelative(-7.033f, 0.0f, -13.057f, -4.873f, -14.616f, -11.627f)
                lineToRelative(-14.998f, -65.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 8.707f, -17.16f)
                lineToRelative(69.998f, -29.999f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 17.518f, 4.289f)
                lineToRelative(30.997f, 37.885f)
                curveToRelative(48.944f, -22.963f, 88.297f, -62.858f, 110.781f, -110.78f)
                lineToRelative(-37.886f, -30.997f)
                arcToRelative(15.001f, 15.001f, 0.0f, false, true, -4.289f, -17.518f)
                lineToRelative(30.0f, -69.998f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 17.16f, -8.707f)
                lineToRelative(65.0f, 14.998f)
                arcTo(14.997f, 14.997f, 0.0f, false, true, 384.0f, 126.0f)
                curveToRelative(0.0f, 160.292f, -129.945f, 290.0f, -290.0f, 290.0f)
                close()
            }
        }
        .build()
        return _phoneSquare!!
    }

private var _phoneSquare: ImageVector? = null
