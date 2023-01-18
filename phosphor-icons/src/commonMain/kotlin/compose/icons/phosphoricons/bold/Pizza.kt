package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.7f, 82.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -5.3f, -27.0f)
                arcToRelative(188.0f, 188.0f, 0.0f, false, false, -218.8f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -5.3f, 27.0f)
                horizontalLineToRelative(0.0f)
                lineTo(78.7f, 184.9f)
                verticalLineToRelative(0.2f)
                lineToRelative(32.3f, 50.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 33.8f, 0.0f)
                lineToRelative(24.6f, -38.7f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(152.0f, 164.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, true, 4.0f, 0.5f)
                lineToRelative(-16.3f, 25.7f)
                arcTo(15.6f, 15.6f, 0.0f, false, true, 152.0f, 164.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(162.6f, 162.6f, 0.0f, false, true, 92.4f, 28.5f)
                lineTo(211.8f, 86.0f)
                arcTo(148.0f, 148.0f, 0.0f, false, false, 44.2f, 86.0f)
                lineTo(35.6f, 72.5f)
                arcTo(162.6f, 162.6f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(92.5f, 161.9f)
                lineTo(76.3f, 136.4f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 80.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                arcTo(15.7f, 15.7f, 0.0f, false, true, 92.5f, 161.9f)
                close()
                moveTo(105.7f, 182.6f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 112.0f)
                arcToRelative(38.6f, 38.6f, 0.0f, false, false, -16.8f, 3.8f)
                lineToRelative(-6.1f, -9.5f)
                arcToRelative(123.9f, 123.9f, 0.0f, false, true, 141.8f, 0.0f)
                lineToRelative(-13.8f, 21.6f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -42.6f, 67.0f)
                lineTo(128.0f, 217.6f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
