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

public val FillGroup.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) {
            return _personSimple!!
        }
        _personSimple = Builder(name = "PersonSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.9f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 95.9f, 48.0f)
                close()
                moveTo(228.1f, 121.1f)
                curveTo(226.4f, 120.1f, 185.6f, 96.0f, 128.0f, 96.0f)
                reflectiveCurveTo(29.6f, 120.1f, 27.9f, 121.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.2f, 13.8f)
                curveToRelative(0.4f, -0.3f, 34.9f, -20.6f, 83.9f, -22.7f)
                lineTo(120.0f, 149.0f)
                lineTo(58.0f, 218.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.0f, 10.6f)
                lineTo(128.0f, 164.0f)
                lineToRelative(58.0f, 65.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 2.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.3f, -2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.7f, -11.3f)
                lineTo(136.0f, 149.0f)
                lineTo(136.0f, 112.2f)
                curveToRelative(48.8f, 2.1f, 83.5f, 22.4f, 83.9f, 22.7f)
                arcTo(8.7f, 8.7f, 0.0f, false, false, 224.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.1f, -14.9f)
                close()
            }
        }
        .build()
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
