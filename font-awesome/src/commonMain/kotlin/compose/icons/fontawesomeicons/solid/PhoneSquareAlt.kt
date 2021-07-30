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

public val SolidGroup.PhoneSquareAlt: ImageVector
    get() {
        if (_phoneSquareAlt != null) {
            return _phoneSquareAlt!!
        }
        _phoneSquareAlt = Builder(name = "PhoneSquareAlt", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                close()
                moveTo(383.61f, 339.37f)
                lineToRelative(-15.0f, 65.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 354.0f, 416.0f)
                curveTo(194.0f, 416.0f, 64.0f, 286.29f, 64.0f, 126.0f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, 11.63f, -14.61f)
                lineToRelative(65.0f, -15.0f)
                arcTo(18.23f, 18.23f, 0.0f, false, true, 144.0f, 96.0f)
                arcToRelative(16.27f, 16.27f, 0.0f, false, true, 13.79f, 9.09f)
                lineToRelative(30.0f, 70.0f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 189.0f, 181.0f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -5.5f, 11.61f)
                lineToRelative(-37.89f, 31.0f)
                arcToRelative(231.91f, 231.91f, 0.0f, false, false, 110.78f, 110.78f)
                lineToRelative(31.0f, -37.89f)
                arcTo(17.0f, 17.0f, 0.0f, false, true, 299.0f, 291.0f)
                arcToRelative(17.85f, 17.85f, 0.0f, false, true, 5.91f, 1.21f)
                lineToRelative(70.0f, 30.0f)
                arcTo(16.25f, 16.25f, 0.0f, false, true, 384.0f, 336.0f)
                arcToRelative(17.41f, 17.41f, 0.0f, false, true, -0.39f, 3.37f)
                close()
            }
        }
        .build()
        return _phoneSquareAlt!!
    }

private var _phoneSquareAlt: ImageVector? = null
