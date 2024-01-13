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

public val SolidGroup.BoxOpen: ImageVector
    get() {
        if (_boxOpen != null) {
            return _boxOpen!!
        }
        _boxOpen = Builder(name = "BoxOpen", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.9f, 42.1f)
                curveToRelative(3.0f, -6.1f, 9.6f, -9.6f, 16.3f, -8.7f)
                lineTo(320.0f, 64.0f)
                lineTo(564.8f, 33.4f)
                curveToRelative(6.7f, -0.8f, 13.3f, 2.7f, 16.3f, 8.7f)
                lineToRelative(41.7f, 83.4f)
                curveToRelative(9.0f, 17.9f, -0.6f, 39.6f, -19.8f, 45.1f)
                lineTo(439.6f, 217.3f)
                curveToRelative(-13.9f, 4.0f, -28.8f, -1.9f, -36.2f, -14.3f)
                lineTo(320.0f, 64.0f)
                lineTo(236.6f, 203.0f)
                curveToRelative(-7.4f, 12.4f, -22.3f, 18.3f, -36.2f, 14.3f)
                lineTo(37.1f, 170.6f)
                curveToRelative(-19.3f, -5.5f, -28.8f, -27.2f, -19.8f, -45.1f)
                lineTo(58.9f, 42.1f)
                close()
                moveTo(321.1f, 128.0f)
                lineToRelative(54.9f, 91.4f)
                curveToRelative(14.9f, 24.8f, 44.6f, 36.6f, 72.5f, 28.6f)
                lineTo(576.0f, 211.6f)
                verticalLineToRelative(167.0f)
                curveToRelative(0.0f, 22.0f, -15.0f, 41.2f, -36.4f, 46.6f)
                lineToRelative(-204.1f, 51.0f)
                curveToRelative(-10.2f, 2.6f, -20.9f, 2.6f, -31.0f, 0.0f)
                lineToRelative(-204.1f, -51.0f)
                curveTo(79.0f, 419.7f, 64.0f, 400.5f, 64.0f, 378.5f)
                verticalLineToRelative(-167.0f)
                lineTo(191.6f, 248.0f)
                curveToRelative(27.8f, 8.0f, 57.6f, -3.8f, 72.5f, -28.6f)
                lineTo(318.9f, 128.0f)
                horizontalLineToRelative(2.2f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
