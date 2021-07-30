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

public val SolidGroup.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 352.0f)
                lineTo(136.4f, 352.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                lineToRelative(-0.1f, 48.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                lineTo(504.0f, 416.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(504.0f, 448.0f)
                lineTo(136.1f, 448.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                lineToRelative(-0.1f, 48.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(368.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(504.0f, 256.0f)
                lineTo(136.6f, 256.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                lineToRelative(-0.1f, 48.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                lineTo(504.0f, 320.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(610.5f, 117.0f)
                lineTo(338.4f, 3.7f)
                arcToRelative(48.15f, 48.15f, 0.0f, false, false, -36.9f, 0.0f)
                lineTo(29.5f, 117.0f)
                curveTo(11.7f, 124.5f, 0.0f, 141.9f, 0.0f, 161.3f)
                lineTo(0.0f, 504.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(96.0f, 256.0f)
                curveToRelative(0.0f, -17.6f, 14.6f, -32.0f, 32.6f, -32.0f)
                horizontalLineToRelative(382.8f)
                curveToRelative(18.0f, 0.0f, 32.6f, 14.4f, 32.6f, 32.0f)
                verticalLineToRelative(248.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(640.0f, 161.3f)
                curveToRelative(0.0f, -19.4f, -11.7f, -36.8f, -29.5f, -44.3f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
