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

public val SimpleIcons.Testrail: ImageVector
    get() {
        if (_testrail != null) {
            return _testrail!!
        }
        _testrail = Builder(name = "Testrail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.27f, 23.896f)
                lineTo(4.5f, 21.124f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, -0.5f)
                lineToRelative(2.772f, -2.77f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(2.772f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, 0.5f)
                lineToRelative(-2.772f, 2.77f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.5f, 0.0f)
                lineTo(7.27f, 23.896f)
                close()
                moveTo(11.75f, 19.416f)
                lineTo(8.978f, 16.644f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, -0.498f)
                lineToRelative(2.772f, -2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(2.77f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, 0.5f)
                lineToRelative(-2.77f, 2.77f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.499f, 0.0f)
                close()
                moveTo(16.23f, 14.936f)
                lineTo(13.46f, 12.164f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, -0.498f)
                lineToRelative(2.771f, -2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(2.77f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, 0.498f)
                lineToRelative(-2.772f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.5f, 0.0f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(7.354f, 15.02f)
                lineTo(4.582f, 12.25f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, -0.499f)
                lineToRelative(2.772f, -2.773f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(2.772f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, 0.498f)
                lineToRelative(-2.772f, 2.774f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.5f, 0.0f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(11.834f, 10.54f)
                lineTo(9.062f, 7.77f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, -0.5f)
                lineToRelative(2.772f, -2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(2.77f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, 0.498f)
                lineToRelative(-2.77f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.499f, 0.0f)
                verticalLineToRelative(-0.002f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(7.44f, 6.15f)
                lineTo(4.666f, 3.37f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, -0.5f)
                lineTo(7.44f, 0.104f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(2.772f, 2.772f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, 0.5f)
                lineTo(7.938f, 6.142f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.5f, 0.0f)
                lineToRelative(0.002f, 0.006f)
                verticalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _testrail!!
    }

private var _testrail: ImageVector? = null
