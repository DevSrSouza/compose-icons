package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Quickbooks: ImageVector
    get() {
        if (_quickbooks != null) {
            return _quickbooks!!
        }
        _quickbooks = Builder(name = "Quickbooks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.642f, 4.1335f)
                curveToRelative(0.9554f, 0.0f, 1.7296f, 0.776f, 1.7296f, 1.7332f)
                verticalLineToRelative(9.0667f)
                horizontalLineToRelative(1.6f)
                curveToRelative(1.614f, 0.0f, 2.9275f, -1.3156f, 2.9275f, -2.933f)
                curveToRelative(0.0f, -1.6173f, -1.3136f, -2.9333f, -2.9276f, -2.9333f)
                horizontalLineToRelative(-0.6654f)
                lineTo(15.3061f, 7.3334f)
                horizontalLineToRelative(0.6654f)
                curveToRelative(2.5722f, 0.0f, 4.6577f, 2.0897f, 4.6577f, 4.667f)
                curveToRelative(0.0f, 2.5774f, -2.0855f, 4.6666f, -4.6577f, 4.6666f)
                lineTo(12.642f, 16.667f)
                close()
                moveTo(7.9837f, 7.333f)
                horizontalLineToRelative(3.3291f)
                verticalLineToRelative(12.533f)
                curveToRelative(-0.9555f, 0.0f, -1.73f, -0.7759f, -1.73f, -1.7332f)
                lineTo(9.5828f, 9.0662f)
                lineTo(7.9837f, 9.0662f)
                curveToRelative(-1.6146f, 0.0f, -2.9277f, 1.316f, -2.9277f, 2.9334f)
                curveToRelative(0.0f, 1.6175f, 1.3131f, 2.9333f, 2.9277f, 2.9333f)
                horizontalLineToRelative(0.6654f)
                verticalLineToRelative(1.7332f)
                horizontalLineToRelative(-0.6654f)
                curveToRelative(-2.5725f, 0.0f, -4.6577f, -2.0892f, -4.6577f, -4.6665f)
                curveToRelative(0.0f, -2.5771f, 2.0852f, -4.6666f, 4.6577f, -4.6666f)
                close()
            }
        }
        .build()
        return _quickbooks!!
    }

private var _quickbooks: ImageVector? = null
