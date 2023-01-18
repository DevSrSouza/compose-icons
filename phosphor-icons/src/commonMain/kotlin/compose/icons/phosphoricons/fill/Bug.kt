package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 120.0f)
                lineTo(216.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -3.2f, -23.7f)
                lineToRelative(23.1f, -13.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, -10.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.0f, -2.9f)
                lineTo(207.0f, 73.2f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -158.0f, 0.0f)
                lineTo(28.1f, 61.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.0f, 2.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 10.9f)
                lineTo(43.2f, 88.3f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 40.0f, 112.0f)
                verticalLineToRelative(8.0f)
                lineTo(12.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(40.0f, 136.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 3.2f, 23.7f)
                lineTo(20.1f, 181.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 14.9f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 4.0f, -1.1f)
                lineTo(49.0f, 182.8f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 158.0f, 0.0f)
                lineToRelative(20.9f, 12.1f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 4.0f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -14.9f)
                lineToRelative(-23.1f, -13.4f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 144.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(136.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(200.0f, 120.0f)
                lineTo(56.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                close()
                moveTo(111.9f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 111.9f, 92.0f)
                close()
                moveTo(167.9f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 167.9f, 92.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
