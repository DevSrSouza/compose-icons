package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Tshirt: ImageVector
    get() {
        if (_tshirt != null) {
            return _tshirt!!
        }
        _tshirt = Builder(name = "Tshirt", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(631.2f, 96.5f)
                lineTo(436.5f, 0.0f)
                curveTo(416.4f, 27.8f, 371.9f, 47.2f, 320.0f, 47.2f)
                reflectiveCurveTo(223.6f, 27.8f, 203.5f, 0.0f)
                lineTo(8.8f, 96.5f)
                curveToRelative(-7.9f, 4.0f, -11.1f, 13.6f, -7.2f, 21.5f)
                lineToRelative(57.2f, 114.5f)
                curveToRelative(4.0f, 7.9f, 13.6f, 11.1f, 21.5f, 7.2f)
                lineToRelative(56.6f, -27.7f)
                curveToRelative(10.6f, -5.2f, 23.0f, 2.5f, 23.0f, 14.4f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(226.3f)
                curveToRelative(0.0f, -11.8f, 12.4f, -19.6f, 23.0f, -14.4f)
                lineToRelative(56.6f, 27.7f)
                curveToRelative(7.9f, 4.0f, 17.5f, 0.8f, 21.5f, -7.2f)
                lineTo(638.3f, 118.0f)
                curveToRelative(4.0f, -7.9f, 0.8f, -17.6f, -7.1f, -21.5f)
                close()
            }
        }
        .build()
        return _tshirt!!
    }

private var _tshirt: ImageVector? = null
