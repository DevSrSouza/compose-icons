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

public val FillGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(-0.4f, 14.3f, -5.7f, 30.5f, -28.0f, 30.5f)
                reflectiveCurveToRelative(-28.0f, -17.4f, -28.0f, -32.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.5f, -8.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.5f, 8.3f)
                verticalLineToRelative(4.0f)
                arcTo(47.4f, 47.4f, 0.0f, false, false, 128.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 38.7f, 76.3f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, 3.4f, 5.0f)
                curveTo(175.5f, 168.0f, 185.7f, 176.0f, 204.0f, 176.0f)
                arcToRelative(52.5f, 52.5f, 0.0f, false, false, 9.2f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.1f, 6.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 125.9f, 232.0f)
                curveToRelative(-54.8f, -1.1f, -99.7f, -45.2f, -101.8f, -99.9f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 96.0f, 128.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
