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

public val DuotoneGroup.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) {
            return _bellSimple!!
        }
        _bellSimple = Builder(name = "BellSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 104.0f)
                arcToRelative(71.9f, 71.9f, 0.0f, false, true, 72.5f, -72.0f)
                curveToRelative(39.8f, 0.3f, 71.5f, 33.2f, 71.5f, 72.9f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, 35.8f, 7.5f, 56.6f, 14.1f, 67.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.9f, 12.1f)
                horizontalLineTo(48.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.9f, -12.1f)
                curveTo(48.5f, 168.6f, 56.0f, 147.8f, 56.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(220.9f, 192.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, 8.0f)
                lineTo(49.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.8f, -24.1f)
                curveToRelative(5.9f, -10.2f, 13.0f, -29.6f, 13.0f, -63.9f)
                verticalLineToRelative(-8.0f)
                arcTo(79.9f, 79.9f, 0.0f, false, true, 128.0f, 24.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(43.7f, 0.3f, 79.2f, 36.6f, 79.2f, 80.9f)
                lineTo(207.8f, 112.0f)
                curveToRelative(0.0f, 34.3f, 7.1f, 53.7f, 13.0f, 63.9f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 220.9f, 192.0f)
                close()
                moveTo(207.0f, 184.0f)
                curveToRelative(-6.9f, -12.0f, -15.2f, -34.1f, -15.2f, -72.0f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -35.5f, -28.4f, -64.7f, -63.3f, -64.9f)
                lineTo(128.0f, 40.0f)
                arcToRelative(63.8f, 63.8f, 0.0f, false, false, -63.8f, 64.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 37.9f, -8.3f, 60.0f, -15.2f, 72.0f)
                close()
            }
        }
        .build()
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
