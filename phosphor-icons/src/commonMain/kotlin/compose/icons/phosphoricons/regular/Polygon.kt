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

public val RegularGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.6f, 49.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -45.2f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.2f, 30.2f, 0.0f, false, false, -5.2f, 6.7f)
                lineTo(152.0f, 48.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -54.6f, -23.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -5.8f, 37.4f)
                lineTo(57.7f, 93.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -40.3f, 4.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                arcTo(31.6f, 31.6f, 0.0f, false, false, 40.0f, 152.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 20.3f, -7.2f)
                lineToRelative(70.0f, 51.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 7.1f, 34.5f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 45.2f, 0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, -45.2f)
                arcToRelative(43.3f, 43.3f, 0.0f, false, false, -4.7f, -4.0f)
                lineToRelative(27.3f, -77.5f)
                lineTo(208.0f, 103.9f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 22.6f, -9.4f)
                arcTo(31.9f, 31.9f, 0.0f, false, false, 230.6f, 49.4f)
                close()
                moveTo(108.7f, 36.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.6f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 108.7f, 36.7f)
                close()
                moveTo(28.7f, 131.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.6f)
                close()
                moveTo(171.3f, 219.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.6f, 22.6f)
                close()
                moveTo(162.8f, 176.1f)
                arcToRelative(32.4f, 32.4f, 0.0f, false, false, -23.1f, 7.1f)
                lineToRelative(-70.0f, -51.3f)
                arcToRelative(32.4f, 32.4f, 0.0f, false, false, -1.3f, -26.7f)
                lineToRelative(33.9f, -30.5f)
                arcTo(32.4f, 32.4f, 0.0f, false, false, 120.0f, 80.0f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 22.6f, -9.4f)
                arcToRelative(30.2f, 30.2f, 0.0f, false, false, 5.2f, -6.7f)
                lineTo(176.0f, 71.6f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 9.4f, 23.0f)
                arcToRelative(43.3f, 43.3f, 0.0f, false, false, 4.7f, 4.0f)
                close()
                moveTo(219.3f, 83.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.6f, 22.6f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
