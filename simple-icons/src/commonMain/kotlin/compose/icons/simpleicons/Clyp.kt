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

public val SimpleIcons.Clyp: ImageVector
    get() {
        if (_clyp != null) {
            return _clyp!!
        }
        _clyp = Builder(name = "Clyp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 17.9583f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.137f, -1.136f)
                verticalLineTo(7.2347f)
                arcToRelative(1.138f, 1.138f, 0.0f, false, true, 2.275f, 0.0f)
                verticalLineToRelative(9.5896f)
                curveToRelative(0.0f, 0.626f, -0.51f, 1.134f, -1.138f, 1.134f)
                moveToRelative(7.4397f, 2.4398f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.14f, -1.1379f)
                verticalLineTo(4.7958f)
                arcToRelative(1.138f, 1.138f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(14.4654f)
                curveToRelative(0.0f, 0.627f, -0.51f, 1.136f, -1.138f, 1.136f)
                moveTo(15.7193f, 24.0f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.138f, -1.136f)
                verticalLineTo(1.138f)
                arcToRelative(1.138f, 1.138f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(21.726f)
                curveToRelative(0.0f, 0.627f, -0.509f, 1.136f, -1.138f, 1.136f)
                moveToRelative(-7.4366f, -3.1599f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.138f, -1.136f)
                verticalLineTo(4.2979f)
                arcToRelative(1.138f, 1.138f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(15.4064f)
                curveToRelative(0.0f, 0.628f, -0.51f, 1.137f, -1.138f, 1.137f)
                moveToRelative(-3.7199f, -4.9889f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.138f, -1.135f)
                verticalLineTo(9.2857f)
                arcToRelative(1.138f, 1.138f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(5.4318f)
                curveToRelative(0.0f, 0.626f, -0.51f, 1.135f, -1.138f, 1.135f)
                close()
            }
        }
        .build()
        return _clyp!!
    }

private var _clyp: ImageVector? = null
