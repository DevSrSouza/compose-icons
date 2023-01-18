package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.0f, 92.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 146.0f, 92.0f)
                close()
                moveTo(100.0f, 82.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 100.0f, 82.0f)
                close()
                moveTo(250.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(214.0f, 134.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(86.6f, 86.6f, 0.0f, false, true, -3.6f, 24.6f)
                lineToRelative(24.5f, 14.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, 11.2f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -3.0f, -0.8f)
                lineTo(206.1f, 180.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, -156.2f, 0.0f)
                lineTo(27.1f, 193.2f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -3.0f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, -11.2f)
                lineToRelative(24.5f, -14.2f)
                arcTo(86.6f, 86.6f, 0.0f, false, true, 42.0f, 144.0f)
                lineTo(42.0f, 134.0f)
                lineTo(12.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(42.0f, 122.0f)
                lineTo(42.0f, 112.0f)
                arcToRelative(86.6f, 86.6f, 0.0f, false, true, 3.6f, -24.6f)
                lineTo(21.1f, 73.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -10.4f)
                lineTo(49.9f, 76.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 156.2f, 0.0f)
                lineToRelative(22.8f, -13.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 10.4f)
                lineTo(210.4f, 87.4f)
                arcTo(86.6f, 86.6f, 0.0f, false, true, 214.0f, 112.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 250.0f, 128.0f)
                close()
                moveTo(54.0f, 122.0f)
                lineTo(202.0f, 122.0f)
                lineTo(202.0f, 112.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -148.0f, 0.0f)
                close()
                moveTo(122.0f, 217.7f)
                lineTo(122.0f, 134.0f)
                lineTo(54.0f, 134.0f)
                verticalLineToRelative(10.0f)
                arcTo(74.0f, 74.0f, 0.0f, false, false, 122.0f, 217.7f)
                close()
                moveTo(202.0f, 134.0f)
                lineTo(134.0f, 134.0f)
                verticalLineToRelative(83.7f)
                arcTo(74.0f, 74.0f, 0.0f, false, false, 202.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
