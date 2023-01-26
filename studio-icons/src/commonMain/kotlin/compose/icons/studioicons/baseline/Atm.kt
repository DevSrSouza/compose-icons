package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Atm: ImageVector
    get() {
        if (_atm != null) {
            return _atm!!
        }
        _atm = Builder(name = "Atm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.25f)
                lineTo(10.25f, 15.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                lineTo(14.0f, 10.5f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                lineTo(5.5f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(5.5f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                lineTo(5.5f, 12.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                lineTo(18.0f, 14.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.51f)
                horizontalLineToRelative(1.0f)
                lineTo(20.5f, 15.0f)
                lineTo(22.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _atm!!
    }

private var _atm: ImageVector? = null
