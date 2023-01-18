package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineTo(128.0f, 96.0f)
                lineTo(32.0f, 64.0f)
                lineToRelative(96.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.5f, 56.4f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -5.0f, 0.0f)
                lineToRelative(-95.9f, 32.0f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-1.0f, 0.5f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.0f, 0.6f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.2f, 0.2f)
                lineToRelative(-0.8f, 0.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.7f, 0.8f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.1f, 0.2f)
                lineToRelative(-0.6f, 0.9f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.1f, -0.1f, 0.2f)
                lineToRelative(-0.4f, 0.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.3f, 1.1f)
                verticalLineToRelative(0.3f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(40.0f, 75.1f)
                lineTo(73.6f, 86.3f)
                arcTo(63.2f, 63.2f, 0.0f, false, false, 64.0f, 120.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 30.0f, 54.2f)
                arcToRelative(96.1f, 96.1f, 0.0f, false, false, -46.5f, 37.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.4f, 11.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 11.0f, -2.3f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 134.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.7f, 3.6f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 4.3f, -1.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.4f, -11.1f)
                arcTo(96.1f, 96.1f, 0.0f, false, false, 162.0f, 174.2f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 192.0f, 120.0f)
                arcToRelative(63.2f, 63.2f, 0.0f, false, false, -9.6f, -33.7f)
                lineToRelative(44.1f, -14.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -15.2f)
                close()
                moveTo(176.0f, 120.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -96.0f, 0.0f)
                arcToRelative(48.6f, 48.6f, 0.0f, false, true, 9.3f, -28.5f)
                lineToRelative(36.2f, 12.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.0f, 0.0f)
                lineToRelative(36.2f, -12.1f)
                arcTo(48.6f, 48.6f, 0.0f, false, true, 176.0f, 120.0f)
                close()
                moveTo(166.7f, 74.7f)
                horizontalLineToRelative(-0.1f)
                lineTo(128.0f, 87.6f)
                lineTo(89.4f, 74.7f)
                horizontalLineToRelative(-0.1f)
                lineTo(57.3f, 64.0f)
                lineTo(128.0f, 40.4f)
                lineTo(198.7f, 64.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
