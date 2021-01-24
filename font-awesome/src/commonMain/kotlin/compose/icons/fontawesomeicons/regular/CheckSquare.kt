package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(364.136f, 190.276f)
                lineTo(191.547f, 361.48f)
                curveToRelative(-4.705f, 4.667f, -12.303f, 4.637f, -16.97f, -0.068f)
                lineToRelative(-90.781f, -91.516f)
                curveToRelative(-4.667f, -4.705f, -4.637f, -12.303f, 0.069f, -16.971f)
                lineToRelative(22.719f, -22.536f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.97f, 0.069f)
                lineToRelative(59.792f, 60.277f)
                lineToRelative(141.352f, -140.216f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.97f, 0.068f)
                lineToRelative(22.536f, 22.718f)
                curveToRelative(4.667f, 4.706f, 4.637f, 12.304f, -0.068f, 16.971f)
                close()
            }
        }
        .build()
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
