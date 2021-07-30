package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.PlusSquare: ImageVector
    get() {
        if (_plusSquare != null) {
            return _plusSquare!!
        }
        _plusSquare = Builder(name = "PlusSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 240.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-88.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-88.0f)
                horizontalLineToRelative(-88.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(-88.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(88.0f)
                horizontalLineToRelative(88.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                close()
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(400.0f, 426.0f)
                lineTo(400.0f, 86.0f)
                curveToRelative(0.0f, -3.3f, -2.7f, -6.0f, -6.0f, -6.0f)
                lineTo(54.0f, 80.0f)
                curveToRelative(-3.3f, 0.0f, -6.0f, 2.7f, -6.0f, 6.0f)
                verticalLineToRelative(340.0f)
                curveToRelative(0.0f, 3.3f, 2.7f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(340.0f)
                curveToRelative(3.3f, 0.0f, 6.0f, -2.7f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _plusSquare!!
    }

private var _plusSquare: ImageVector? = null
