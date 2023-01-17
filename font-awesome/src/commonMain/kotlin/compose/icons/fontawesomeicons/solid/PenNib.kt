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

public val SolidGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.4f, 18.3f)
                lineTo(312.7f, 74.1f)
                lineTo(437.9f, 199.3f)
                lineToRelative(55.7f, -55.7f)
                curveToRelative(21.9f, -21.9f, 21.9f, -57.3f, 0.0f, -79.2f)
                lineTo(447.6f, 18.3f)
                curveToRelative(-21.9f, -21.9f, -57.3f, -21.9f, -79.2f, 0.0f)
                close()
                moveTo(288.0f, 94.6f)
                lineToRelative(-9.2f, 2.8f)
                lineTo(134.7f, 140.6f)
                curveToRelative(-19.9f, 6.0f, -35.7f, 21.2f, -42.3f, 41.0f)
                lineTo(3.8f, 445.8f)
                curveToRelative(-3.8f, 11.3f, -1.0f, 23.9f, 7.3f, 32.4f)
                lineTo(164.7f, 324.7f)
                curveToRelative(-3.0f, -6.3f, -4.7f, -13.3f, -4.7f, -20.7f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                curveToRelative(-7.4f, 0.0f, -14.4f, -1.7f, -20.7f, -4.7f)
                lineTo(33.7f, 500.9f)
                curveToRelative(8.6f, 8.3f, 21.1f, 11.2f, 32.4f, 7.3f)
                lineToRelative(264.3f, -88.6f)
                curveToRelative(19.7f, -6.6f, 35.0f, -22.4f, 41.0f, -42.3f)
                lineToRelative(43.2f, -144.1f)
                lineToRelative(2.8f, -9.2f)
                lineTo(288.0f, 94.6f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
