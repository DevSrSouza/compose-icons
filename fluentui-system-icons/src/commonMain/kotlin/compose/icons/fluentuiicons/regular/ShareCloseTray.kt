package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ShareCloseTray: ImageVector
    get() {
        if (_shareCloseTray != null) {
            return _shareCloseTray!!
        }
        _shareCloseTray = Builder(name = "ShareCloseTray", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.75f)
                curveTo(2.0f, 18.9926f, 3.0074f, 20.0f, 4.25f, 20.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 20.0f, 22.0f, 18.9926f, 22.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 5.0074f, 20.9926f, 4.0f, 19.75f, 4.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 4.0f, 2.0f, 5.0074f, 2.0f, 6.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(4.25f, 18.5f)
                curveTo(3.8358f, 18.5f, 3.5f, 18.1642f, 3.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.8358f, 3.8358f, 5.5f, 4.25f, 5.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 5.5f, 20.5f, 5.8358f, 20.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(20.5f, 18.1642f, 20.1642f, 18.5f, 19.75f, 18.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(11.9997f, 16.7545f)
                curveTo(12.1987f, 16.7546f, 12.3896f, 16.6756f, 12.5303f, 16.5349f)
                lineTo(15.7848f, 13.2803f)
                curveTo(16.0777f, 12.9874f, 16.0777f, 12.5126f, 15.7848f, 12.2197f)
                curveTo(15.4919f, 11.9268f, 15.0171f, 11.9268f, 14.7242f, 12.2197f)
                lineTo(12.75f, 14.1939f)
                verticalLineTo(7.7472f)
                curveTo(12.75f, 7.333f, 12.4142f, 6.9972f, 12.0f, 6.9972f)
                curveTo(11.5858f, 6.9972f, 11.25f, 7.333f, 11.25f, 7.7472f)
                verticalLineTo(14.1921f)
                lineTo(9.2807f, 12.2201f)
                curveTo(8.988f, 11.927f, 8.5131f, 11.9266f, 8.22f, 12.2193f)
                curveTo(7.9269f, 12.512f, 7.9266f, 12.9869f, 8.2193f, 13.28f)
                lineTo(11.4693f, 16.5345f)
                curveTo(11.6099f, 16.6753f, 11.8007f, 16.7545f, 11.9997f, 16.7545f)
                close()
            }
        }
        .build()
        return _shareCloseTray!!
    }

private var _shareCloseTray: ImageVector? = null
