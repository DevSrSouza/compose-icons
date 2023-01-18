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

public val FillGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.4f, 98.1f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, -3.2f, -13.5f)
                curveTo(40.5f, 49.5f, 80.4f, 24.0f, 128.0f, 24.0f)
                reflectiveCurveToRelative(87.5f, 25.5f, 94.8f, 60.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 207.2f, 104.0f)
                lineTo(48.8f, 104.0f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 36.4f, 98.1f)
                close()
                moveTo(225.0f, 152.6f)
                lineToRelative(-37.0f, 14.8f)
                lineToRelative(-37.0f, -14.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.0f, 0.0f)
                lineToRelative(-37.0f, 14.8f)
                lineTo(71.0f, 152.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.0f, 0.0f)
                lineToRelative(-40.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, -0.6f)
                lineToRelative(9.0f, -3.6f)
                lineTo(40.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(216.0f, 173.4f)
                lineToRelative(15.0f, -6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, -14.8f)
                close()
                moveTo(232.0f, 120.0f)
                lineTo(24.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(232.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
