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

public val DuotoneGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(207.2f, 96.0f)
                horizontalLineTo(48.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 41.0f, 86.3f)
                curveTo(47.4f, 55.5f, 83.9f, 32.0f, 128.0f, 32.0f)
                reflectiveCurveToRelative(80.6f, 23.5f, 87.0f, 54.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 207.2f, 96.0f)
                close()
                moveTo(148.0f, 160.0f)
                lineToRelative(-40.0f, 16.0f)
                lineTo(68.0f, 160.0f)
                lineToRelative(-20.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(168.0f)
                lineToRelative(-20.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.8f, 104.0f)
                lineTo(207.2f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.6f, -19.4f)
                curveTo(215.5f, 49.5f, 175.6f, 24.0f, 128.0f, 24.0f)
                reflectiveCurveTo(40.5f, 49.5f, 33.2f, 84.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.8f, 104.0f)
                close()
                moveTo(128.0f, 40.0f)
                curveToRelative(39.4f, 0.0f, 73.4f, 20.6f, 79.2f, 47.9f)
                lineTo(48.8f, 87.9f)
                curveTo(54.6f, 60.6f, 88.6f, 40.0f, 128.0f, 40.0f)
                close()
                moveTo(225.0f, 152.6f)
                lineTo(188.0f, 167.4f)
                lineTo(151.0f, 152.6f)
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
                moveTo(200.0f, 184.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(80.0f, 208.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(56.0f, 173.4f)
                lineToRelative(12.0f, -4.8f)
                lineToRelative(37.0f, 14.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 6.0f, 0.0f)
                lineToRelative(37.0f, -14.8f)
                lineToRelative(37.0f, 14.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 6.0f, 0.0f)
                lineToRelative(9.0f, -3.6f)
                close()
                moveTo(240.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(24.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(232.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 128.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
