package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DualSim2Line: ImageVector
    get() {
        if (_dualSim2Line != null) {
            return _dualSim2Line!!
        }
        _dualSim2Line = Builder(name = "DualSim2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineToRelative(4.707f, 4.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.707f)
                lineTo(20.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(14.171f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 7.829f)
                lineTo(14.171f, 4.0f)
                close()
                moveTo(12.0f, 7.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.009f, 5.228f)
                lineToRelative(-0.008f, -0.008f)
                lineToRelative(0.006f, 0.01f)
                lineTo(12.595f, 14.0f)
                lineTo(15.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(-1.453f)
                lineToRelative(3.67f, -3.304f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 11.0f, 10.5f)
                lineTo(9.0f, 10.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _dualSim2Line!!
    }

private var _dualSim2Line: ImageVector? = null
