package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CreditCard24: ImageVector
    get() {
        if (_creditCard24 != null) {
            return _creditCard24!!
        }
        _creditCard24 = Builder(name = "CreditCard24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 3.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 4.75f)
                verticalLineToRelative(14.5f)
                curveTo(0.0f, 20.216f, 0.784f, 21.0f, 1.75f, 21.0f)
                horizontalLineToRelative(20.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 24.0f, 19.25f)
                lineTo(24.0f, 4.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 22.25f, 3.0f)
                lineTo(1.75f, 3.0f)
                close()
                moveTo(1.5f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(20.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                lineTo(22.5f, 8.5f)
                horizontalLineToRelative(-21.0f)
                lineTo(1.5f, 4.75f)
                close()
                moveTo(1.5f, 10.0f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(20.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(22.5f, 10.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
        }
        .build()
        return _creditCard24!!
    }

private var _creditCard24: ImageVector? = null
