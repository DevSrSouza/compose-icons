package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(40.0f, 208.0f)
                lineTo(192.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 216.0f)
                close()
                moveTo(230.2f, 109.1f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.2f, -0.4f)
                lineToRelative(0.2f, -0.3f)
                lineToRelative(0.3f, -0.3f)
                lineToRelative(0.2f, -0.3f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.3f, 0.1f, -0.4f)
                lineToRelative(0.2f, -0.3f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.3f, 0.1f, -0.4f)
                lineToRelative(0.2f, -0.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.1f, -0.4f)
                verticalLineToRelative(-0.3f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.1f, -0.5f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.1f, -0.3f)
                verticalLineToRelative(-1.6f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, -0.3f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, -0.1f, -0.5f)
                verticalLineToRelative(-0.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.1f, -0.4f)
                lineToRelative(-0.2f, -0.4f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.4f)
                lineToRelative(-0.2f, -0.3f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.4f)
                lineToRelative(-0.2f, -0.3f)
                lineToRelative(-0.3f, -0.3f)
                lineToRelative(-0.2f, -0.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, -0.4f)
                curveToRelative(-0.1f, -0.1f, -0.3f, -0.2f, -0.4f, -0.4f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.1f, -0.2f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineTo(204.7f, 96.0f)
                lineTo(168.0f, 96.0f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 67.3f, 174.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, 9.7f)
                lineToRelative(2.0f, 0.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.8f, -6.0f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 168.0f, 112.0f)
                horizontalLineToRelative(36.7f)
                lineToRelative(-34.4f, 34.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.1f, -0.2f)
                curveTo(229.9f, 109.3f, 230.1f, 109.2f, 230.2f, 109.1f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
