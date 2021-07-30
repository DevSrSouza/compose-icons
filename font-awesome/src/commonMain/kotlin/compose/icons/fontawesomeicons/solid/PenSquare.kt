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

public val SolidGroup.PenSquare: ImageVector
    get() {
        if (_penSquare != null) {
            return _penSquare!!
        }
        _penSquare = Builder(name = "PenSquare", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 480.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(238.1f, 177.9f)
                lineTo(102.4f, 313.6f)
                lineToRelative(-6.3f, 57.1f)
                curveToRelative(-0.8f, 7.6f, 5.6f, 14.1f, 13.3f, 13.3f)
                lineToRelative(57.1f, -6.3f)
                lineTo(302.2f, 242.0f)
                curveToRelative(2.3f, -2.3f, 2.3f, -6.1f, 0.0f, -8.5f)
                lineTo(246.7f, 178.0f)
                curveToRelative(-2.5f, -2.4f, -6.3f, -2.4f, -8.6f, -0.1f)
                close()
                moveTo(345.0f, 165.1f)
                lineTo(314.9f, 135.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-23.1f, 23.1f)
                curveToRelative(-2.3f, 2.3f, -2.3f, 6.1f, 0.0f, 8.5f)
                lineToRelative(55.5f, 55.5f)
                curveToRelative(2.3f, 2.3f, 6.1f, 2.3f, 8.5f, 0.0f)
                lineTo(345.0f, 199.0f)
                curveToRelative(9.3f, -9.3f, 9.3f, -24.5f, 0.0f, -33.9f)
                close()
            }
        }
        .build()
        return _penSquare!!
    }

private var _penSquare: ImageVector? = null
