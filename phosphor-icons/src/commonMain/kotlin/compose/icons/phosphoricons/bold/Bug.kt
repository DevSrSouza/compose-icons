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

public val BoldGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 140.0f, 88.0f)
                close()
                moveTo(100.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 100.0f, 72.0f)
                close()
                moveTo(256.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(220.0f, 140.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, -2.6f, 21.8f)
                lineToRelative(20.5f, 11.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 20.8f)
                lineToRelative(-17.3f, -10.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -161.2f, 0.0f)
                lineToRelative(-17.3f, 10.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -20.8f)
                lineToRelative(20.5f, -11.8f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 36.0f, 144.0f)
                verticalLineToRelative(-4.0f)
                lineTo(12.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(36.0f, 116.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, 2.6f, -21.8f)
                lineTo(18.1f, 78.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -20.8f)
                lineToRelative(17.3f, 10.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 161.2f, 0.0f)
                lineToRelative(17.3f, -10.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 20.8f)
                lineTo(217.4f, 90.2f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 220.0f, 112.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 128.0f)
                close()
                moveTo(60.0f, 116.0f)
                lineTo(196.0f, 116.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                close()
                moveTo(116.0f, 210.9f)
                lineTo(116.0f, 140.0f)
                lineTo(60.0f, 140.0f)
                verticalLineToRelative(4.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 116.0f, 210.9f)
                close()
                moveTo(196.0f, 140.0f)
                lineTo(140.0f, 140.0f)
                verticalLineToRelative(70.9f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 196.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
