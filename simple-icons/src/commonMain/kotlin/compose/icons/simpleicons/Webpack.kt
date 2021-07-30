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

public val SimpleIcons.Webpack: ImageVector
    get() {
        if (_webpack != null) {
            return _webpack!!
        }
        _webpack = Builder(name = "Webpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1987f, 18.498f)
                lineToRelative(-9.7699f, 5.5022f)
                verticalLineToRelative(-4.2855f)
                lineToRelative(6.0872f, -3.3338f)
                lineToRelative(3.6826f, 2.117f)
                close()
                moveTo(22.867f, 17.8954f)
                lineTo(22.867f, 6.3884f)
                lineToRelative(-3.5752f, 2.0544f)
                verticalLineToRelative(7.396f)
                close()
                moveTo(1.8013f, 18.498f)
                lineToRelative(9.7699f, 5.5022f)
                verticalLineToRelative(-4.2855f)
                lineTo(5.484f, 16.3809f)
                lineToRelative(-3.6826f, 2.117f)
                close()
                moveTo(1.133f, 17.8954f)
                lineTo(1.133f, 6.3884f)
                lineToRelative(3.5751f, 2.0544f)
                verticalLineToRelative(7.396f)
                close()
                moveTo(1.5513f, 5.6439f)
                lineToRelative(10.0199f, -5.644f)
                verticalLineToRelative(4.1434f)
                lineTo(5.152f, 7.6586f)
                lineToRelative(-0.0489f, 0.028f)
                close()
                moveTo(22.4488f, 5.6439f)
                lineToRelative(-10.02f, -5.644f)
                verticalLineToRelative(4.1434f)
                lineToRelative(6.4192f, 3.5154f)
                lineToRelative(0.0489f, 0.028f)
                lineToRelative(3.5518f, -2.0427f)
                close()
                moveTo(11.5713f, 18.7399f)
                lineToRelative(-6.0056f, -3.2873f)
                lineTo(5.5657f, 8.9384f)
                lineToRelative(6.0054f, 3.4525f)
                verticalLineToRelative(6.349f)
                close()
                moveTo(12.4288f, 18.7399f)
                lineToRelative(6.0053f, -3.2873f)
                lineTo(18.4341f, 8.9384f)
                lineToRelative(-6.0053f, 3.4525f)
                close()
                moveTo(5.9724f, 8.1845f)
                lineToRelative(6.0287f, -3.3015f)
                lineTo(18.03f, 8.1845f)
                lineToRelative(-6.0288f, 3.4665f)
                close()
            }
        }
        .build()
        return _webpack!!
    }

private var _webpack: ImageVector? = null
