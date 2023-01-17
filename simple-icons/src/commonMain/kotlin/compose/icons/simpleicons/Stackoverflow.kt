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

public val SimpleIcons.Stackoverflow: ImageVector
    get() {
        if (_stackoverflow != null) {
            return _stackoverflow!!
        }
        _stackoverflow = Builder(name = "Stackoverflow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.725f, 0.0f)
                lineToRelative(-1.72f, 1.277f)
                lineToRelative(6.39f, 8.588f)
                lineToRelative(1.716f, -1.277f)
                lineTo(15.725f, 0.0f)
                close()
                moveTo(11.785f, 3.418f)
                lineToRelative(-1.369f, 1.644f)
                lineToRelative(8.225f, 6.85f)
                lineToRelative(1.369f, -1.644f)
                lineToRelative(-8.225f, -6.85f)
                close()
                moveTo(8.635f, 7.883f)
                lineToRelative(-0.905f, 1.94f)
                lineToRelative(9.702f, 4.517f)
                lineToRelative(0.904f, -1.94f)
                lineToRelative(-9.701f, -4.517f)
                close()
                moveTo(6.785f, 12.743f)
                lineToRelative(-0.44f, 2.093f)
                lineToRelative(10.473f, 2.201f)
                lineToRelative(0.44f, -2.092f)
                lineToRelative(-10.473f, -2.203f)
                close()
                moveTo(1.89f, 15.47f)
                lineTo(1.89f, 24.0f)
                horizontalLineToRelative(19.19f)
                verticalLineToRelative(-8.53f)
                horizontalLineToRelative(-2.133f)
                verticalLineToRelative(6.397f)
                lineTo(4.021f, 21.867f)
                verticalLineToRelative(-6.396f)
                lineTo(1.89f, 15.471f)
                close()
                moveTo(6.155f, 17.603f)
                verticalLineToRelative(2.13f)
                horizontalLineToRelative(10.66f)
                verticalLineToRelative(-2.13f)
                lineTo(6.154f, 17.603f)
                close()
            }
        }
        .build()
        return _stackoverflow!!
    }

private var _stackoverflow: ImageVector? = null
