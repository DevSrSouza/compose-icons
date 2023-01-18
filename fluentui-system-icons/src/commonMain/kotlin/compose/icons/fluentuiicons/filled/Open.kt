package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Open: ImageVector
    get() {
        if (_open != null) {
            return _open!!
        }
        _open = Builder(name = "Open", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2499f, 4.75f)
                curveTo(5.4215f, 4.75f, 4.7499f, 5.4216f, 4.7499f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.7499f, 18.5784f, 5.4215f, 19.25f, 6.2499f, 19.25f)
                horizontalLineTo(17.7496f)
                curveTo(18.578f, 19.25f, 19.2496f, 18.5784f, 19.2496f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(19.2496f, 13.1977f, 19.6973f, 12.75f, 20.2496f, 12.75f)
                curveTo(20.8018f, 12.75f, 21.2496f, 13.1977f, 21.2496f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(21.2496f, 19.683f, 19.6826f, 21.25f, 17.7496f, 21.25f)
                horizontalLineTo(6.2499f)
                curveTo(4.317f, 21.25f, 2.75f, 19.683f, 2.75f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(2.75f, 4.317f, 4.317f, 2.75f, 6.2499f, 2.75f)
                horizontalLineTo(10.2498f)
                curveTo(10.8021f, 2.75f, 11.2498f, 3.1977f, 11.2498f, 3.75f)
                curveTo(11.2498f, 4.3023f, 10.8021f, 4.75f, 10.2498f, 4.75f)
                horizontalLineTo(6.2499f)
                close()
                moveTo(12.7498f, 3.75f)
                curveTo(12.7498f, 3.1977f, 13.1975f, 2.75f, 13.7497f, 2.75f)
                horizontalLineTo(20.25f)
                curveTo(20.8023f, 2.75f, 21.25f, 3.1977f, 21.25f, 3.75f)
                verticalLineTo(10.25f)
                curveTo(21.25f, 10.8023f, 20.8023f, 11.25f, 20.25f, 11.25f)
                curveTo(19.6978f, 11.25f, 19.25f, 10.8023f, 19.25f, 10.25f)
                verticalLineTo(6.1642f)
                lineTo(14.4568f, 10.9571f)
                curveTo(14.0663f, 11.3476f, 13.4331f, 11.3476f, 13.0426f, 10.9571f)
                curveTo(12.6521f, 10.5665f, 12.6521f, 9.9334f, 13.0427f, 9.5429f)
                lineTo(17.8359f, 4.75f)
                horizontalLineTo(13.7497f)
                curveTo(13.1975f, 4.75f, 12.7498f, 4.3023f, 12.7498f, 3.75f)
                close()
            }
        }
        .build()
        return _open!!
    }

private var _open: ImageVector? = null
