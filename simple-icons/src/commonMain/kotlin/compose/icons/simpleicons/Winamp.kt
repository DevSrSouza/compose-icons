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

public val SimpleIcons.Winamp: ImageVector
    get() {
        if (_winamp != null) {
            return _winamp!!
        }
        _winamp = Builder(name = "Winamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.902f, 0.0f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -0.91f, 0.604f)
                lineToRelative(-6.139f, 14.57f)
                curveToRelative(-0.176f, 0.42f, 0.131f, 0.883f, 0.586f, 0.883f)
                lineTo(8.66f, 16.057f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.91f, -0.604f)
                lineTo(15.707f, 0.883f)
                arcTo(0.636f, 0.636f, 0.0f, false, false, 15.12f, 0.0f)
                horizontalLineToRelative(-3.219f)
                close()
                moveTo(15.34f, 7.943f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -0.91f, 0.604f)
                lineToRelative(-6.137f, 14.57f)
                curveToRelative(-0.177f, 0.42f, 0.13f, 0.883f, 0.586f, 0.883f)
                horizontalLineToRelative(3.219f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.91f, -0.604f)
                lineToRelative(6.138f, -14.57f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, false, -0.586f, -0.883f)
                horizontalLineToRelative(-3.22f)
                close()
            }
        }
        .build()
        return _winamp!!
    }

private var _winamp: ImageVector? = null
