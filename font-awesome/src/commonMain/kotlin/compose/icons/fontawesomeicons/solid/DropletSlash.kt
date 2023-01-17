package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.DropletSlash: ImageVector
    get() {
        if (_dropletSlash != null) {
            return _dropletSlash!!
        }
        _dropletSlash = Builder(name = "DropletSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 512.0f)
                curveToRelative(53.2f, 0.0f, 101.4f, -21.6f, 136.1f, -56.6f)
                lineToRelative(-298.3f, -235.0f)
                curveTo(140.0f, 257.1f, 128.0f, 292.3f, 128.0f, 320.0f)
                curveToRelative(0.0f, 106.0f, 86.0f, 192.0f, 192.0f, 192.0f)
                close()
                moveTo(505.2f, 370.7f)
                curveToRelative(4.4f, -16.1f, 6.8f, -33.1f, 6.8f, -50.7f)
                curveToRelative(0.0f, -91.2f, -130.2f, -262.3f, -166.6f, -308.3f)
                curveTo(339.4f, 4.2f, 330.5f, 0.0f, 320.9f, 0.0f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-9.6f, 0.0f, -18.5f, 4.2f, -24.5f, 11.7f)
                curveTo(277.8f, 33.0f, 240.7f, 81.3f, 205.8f, 136.0f)
                lineTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(505.2f, 370.7f)
                close()
                moveTo(224.0f, 336.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, -50.1f, -112.0f, -112.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _dropletSlash!!
    }

private var _dropletSlash: ImageVector? = null
