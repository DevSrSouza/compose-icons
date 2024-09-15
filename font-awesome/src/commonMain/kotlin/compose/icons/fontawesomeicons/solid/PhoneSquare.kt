package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                curveToRelative(-7.03f, 0.0f, -13.06f, -4.87f, -14.62f, -11.63f)
                lineToRelative(-15.0f, -65.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 8.71f, -17.16f)
                lineToRelative(70.0f, -30.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 17.52f, 4.29f)
                lineToRelative(31.0f, 37.88f)
                curveToRelative(48.94f, -22.96f, 88.3f, -62.86f, 110.78f, -110.78f)
                lineToRelative(-37.89f, -31.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -4.29f, -17.52f)
                lineToRelative(30.0f, -70.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 17.16f, -8.71f)
                lineToRelative(65.0f, 15.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 384.0f, 126.0f)
                curveToRelative(0.0f, 160.29f, -129.95f, 290.0f, -290.0f, 290.0f)
                close()
            }
        }
        .build()
        return _phoneSquare!!
    }

private var _phoneSquare: ImageVector? = null
