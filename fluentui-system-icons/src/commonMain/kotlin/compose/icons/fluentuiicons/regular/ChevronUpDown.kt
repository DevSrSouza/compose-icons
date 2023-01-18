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

public val RegularGroup.ChevronUpDown: ImageVector
    get() {
        if (_chevronUpDown != null) {
            return _chevronUpDown!!
        }
        _chevronUpDown = Builder(name = "ChevronUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5406f, 2.2302f)
                curveTo(12.3992f, 2.0831f, 12.204f, 2.0f, 12.0f, 2.0f)
                curveTo(11.796f, 2.0f, 11.6008f, 2.0831f, 11.4594f, 2.2302f)
                lineTo(5.2094f, 8.7302f)
                curveTo(4.9223f, 9.0288f, 4.9316f, 9.5035f, 5.2302f, 9.7906f)
                curveTo(5.5287f, 10.0777f, 6.0035f, 10.0684f, 6.2906f, 9.7698f)
                lineTo(12.0f, 3.8321f)
                lineTo(17.7094f, 9.7698f)
                curveTo(17.9965f, 10.0684f, 18.4713f, 10.0777f, 18.7698f, 9.7906f)
                curveTo(19.0684f, 9.5035f, 19.0777f, 9.0288f, 18.7906f, 8.7302f)
                lineTo(12.5406f, 2.2302f)
                close()
                moveTo(12.5406f, 21.7698f)
                curveTo(12.3992f, 21.9169f, 12.204f, 22.0f, 12.0f, 22.0f)
                curveTo(11.796f, 22.0f, 11.6008f, 21.9169f, 11.4594f, 21.7698f)
                lineTo(5.2094f, 15.2698f)
                curveTo(4.9223f, 14.9713f, 4.9316f, 14.4965f, 5.2302f, 14.2094f)
                curveTo(5.5287f, 13.9223f, 6.0035f, 13.9316f, 6.2906f, 14.2302f)
                lineTo(12.0f, 20.1679f)
                lineTo(17.7094f, 14.2302f)
                curveTo(17.9965f, 13.9316f, 18.4713f, 13.9223f, 18.7698f, 14.2094f)
                curveTo(19.0684f, 14.4965f, 19.0777f, 14.9713f, 18.7906f, 15.2698f)
                lineTo(12.5406f, 21.7698f)
                close()
            }
        }
        .build()
        return _chevronUpDown!!
    }

private var _chevronUpDown: ImageVector? = null
