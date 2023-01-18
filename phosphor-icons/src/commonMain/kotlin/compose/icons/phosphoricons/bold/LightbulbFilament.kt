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

public val BoldGroup.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) {
            return _lightbulbFilament!!
        }
        _lightbulbFilament = Builder(name = "LightbulbFilament", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 232.0f)
                close()
                moveTo(220.0f, 104.0f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, -37.0f, 73.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.0f, 6.3f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-0.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -3.2f, -6.2f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 36.0f, 104.5f)
                curveTo(35.7f, 54.7f, 76.0f, 13.2f, 125.8f, 12.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 220.0f, 104.0f)
                close()
                moveTo(196.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -69.6f, -68.0f)
                curveToRelative(-36.8f, 0.9f, -66.6f, 31.6f, -66.4f, 68.4f)
                arcToRelative(67.4f, 67.4f, 0.0f, false, false, 27.2f, 54.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.3f, 32.3f, 0.0f, false, true, 99.8f, 180.0f)
                lineTo(116.0f, 180.0f)
                lineTo(116.0f, 149.0f)
                lineTo(87.5f, 120.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 127.0f)
                lineToRelative(23.5f, -23.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(140.0f, 149.0f)
                verticalLineToRelative(31.0f)
                horizontalLineToRelative(16.3f)
                arcToRelative(31.4f, 31.4f, 0.0f, false, true, 12.4f, -21.5f)
                arcTo(67.6f, 67.6f, 0.0f, false, false, 196.0f, 104.0f)
                close()
            }
        }
        .build()
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
