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

public val RegularGroup.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) {
            return _checkSquare!!
        }
        _checkSquare = Builder(name = "CheckSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(400.0f, 432.0f)
                lineTo(48.0f, 432.0f)
                lineTo(48.0f, 80.0f)
                horizontalLineToRelative(352.0f)
                verticalLineToRelative(352.0f)
                close()
                moveTo(364.14f, 190.28f)
                lineTo(191.55f, 361.48f)
                curveToRelative(-4.7f, 4.67f, -12.3f, 4.64f, -16.97f, -0.07f)
                lineToRelative(-90.78f, -91.52f)
                curveToRelative(-4.67f, -4.7f, -4.64f, -12.3f, 0.07f, -16.97f)
                lineToRelative(22.72f, -22.54f)
                curveToRelative(4.7f, -4.67f, 12.3f, -4.64f, 16.97f, 0.07f)
                lineToRelative(59.79f, 60.28f)
                lineToRelative(141.35f, -140.22f)
                curveToRelative(4.7f, -4.67f, 12.3f, -4.64f, 16.97f, 0.07f)
                lineToRelative(22.54f, 22.72f)
                curveToRelative(4.67f, 4.71f, 4.64f, 12.3f, -0.07f, 16.97f)
                close()
            }
        }
        .build()
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
