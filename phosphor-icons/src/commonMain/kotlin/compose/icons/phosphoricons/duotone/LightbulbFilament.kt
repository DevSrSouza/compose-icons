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

public val DuotoneGroup.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) {
            return _lightbulbFilament!!
        }
        _lightbulbFilament = Builder(name = "LightbulbFilament", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 104.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, true, -30.6f, 62.9f)
                arcTo(24.2f, 24.2f, 0.0f, false, false, 168.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(24.4f, 24.4f, 0.0f, false, false, -9.3f, -19.0f)
                arcTo(79.5f, 79.5f, 0.0f, false, true, 48.0f, 104.5f)
                curveTo(47.8f, 61.1f, 82.7f, 25.0f, 126.1f, 24.0f)
                arcTo(80.1f, 80.1f, 0.0f, false, true, 208.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 232.0f)
                close()
                moveTo(216.0f, 104.0f)
                arcToRelative(87.7f, 87.7f, 0.0f, false, true, -33.6f, 69.2f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 176.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -6.2f, -12.7f)
                arcTo(87.8f, 87.8f, 0.0f, false, true, 40.0f, 104.5f)
                curveTo(39.7f, 56.8f, 78.3f, 17.1f, 125.9f, 16.0f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 216.0f, 104.0f)
                close()
                moveTo(200.0f, 104.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, -73.7f, -72.0f)
                curveToRelative(-39.0f, 0.9f, -70.5f, 33.4f, -70.3f, 72.4f)
                arcToRelative(71.7f, 71.7f, 0.0f, false, false, 27.6f, 56.3f)
                horizontalLineToRelative(0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 186.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 147.3f)
                lineTo(90.3f, 117.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(128.0f, 132.7f)
                lineToRelative(26.3f, -26.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(136.0f, 147.3f)
                lineTo(136.0f, 192.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 12.5f, -25.4f)
                arcTo(71.5f, 71.5f, 0.0f, false, false, 200.0f, 104.0f)
                close()
            }
        }
        .build()
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
