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

public val DuotoneGroup.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) {
            return _bugBeetle!!
        }
        _bugBeetle = Builder(name = "BugBeetle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, 72.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, -72.0f)
                verticalLineTo(104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 144.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(208.0f, 128.0f)
                lineTo(208.0f, 112.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(207.6f, 96.0f)
                arcToRelative(79.6f, 79.6f, 0.0f, false, false, -20.0f, -45.3f)
                lineToRelative(17.8f, -16.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.3f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.3f)
                lineTo(175.8f, 39.9f)
                arcToRelative(79.8f, 79.8f, 0.0f, false, false, -95.7f, 0.1f)
                lineTo(61.4f, 22.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, 11.6f)
                lineToRelative(17.9f, 17.0f)
                arcTo(79.9f, 79.9f, 0.0f, false, false, 48.4f, 96.0f)
                lineTo(32.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(48.0f, 112.0f)
                verticalLineToRelative(16.0f)
                lineTo(32.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(48.0f, 144.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, 0.4f, 8.0f)
                lineTo(32.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(51.7f, 176.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 152.6f, 0.0f)
                lineTo(224.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(207.6f, 160.0f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, 0.4f, -8.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, true, 63.5f, 56.0f)
                lineTo(64.5f, 96.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(136.0f, 215.5f)
                lineTo(136.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(79.5f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 64.0f, 152.0f)
                lineTo(64.0f, 112.0f)
                lineTo(192.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 136.0f, 215.5f)
                close()
            }
        }
        .build()
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
