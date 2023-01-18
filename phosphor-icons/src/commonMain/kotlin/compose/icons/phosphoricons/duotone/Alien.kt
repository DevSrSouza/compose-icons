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

public val DuotoneGroup.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -88.0f, 88.0f)
                curveToRelative(0.0f, 48.6f, 56.0f, 120.0f, 88.0f, 120.0f)
                reflectiveCurveToRelative(88.0f, -71.4f, 88.0f, -120.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(112.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
                moveTo(184.0f, 116.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(96.2f, 96.2f, 0.0f, false, false, -96.0f, 96.0f)
                curveToRelative(0.0f, 24.0f, 12.6f, 55.1f, 33.6f, 83.0f)
                reflectiveCurveToRelative(44.5f, 45.0f, 62.4f, 45.0f)
                reflectiveCurveToRelative(41.2f, -16.8f, 62.4f, -45.0f)
                reflectiveCurveTo(224.0f, 136.0f, 224.0f, 112.0f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(177.6f, 185.4f)
                curveTo(160.2f, 208.5f, 140.3f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(-32.2f, -15.5f, -49.6f, -38.6f)
                curveTo(59.6f, 160.5f, 48.0f, 132.4f, 48.0f, 112.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                curveTo(208.0f, 132.4f, 196.4f, 160.5f, 177.6f, 185.4f)
                close()
                moveTo(120.0f, 140.0f)
                verticalLineToRelative(-4.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 120.0f, 140.0f)
                close()
                moveTo(80.0f, 116.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 80.0f, 116.0f)
                close()
                moveTo(176.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineToRelative(-4.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 96.0f)
                close()
                moveTo(176.0f, 116.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, -24.0f)
                close()
                moveTo(152.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 184.0f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
