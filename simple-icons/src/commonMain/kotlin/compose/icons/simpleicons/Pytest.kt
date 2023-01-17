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

public val SimpleIcons.Pytest: ImageVector
    get() {
        if (_pytest != null) {
            return _pytest!!
        }
        _pytest = Builder(name = "Pytest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6152f, 0.0f)
                verticalLineToRelative(0.8867f)
                horizontalLineToRelative(3.8399f)
                lineTo(6.4551f, 0.0f)
                close()
                moveTo(7.6367f, 0.0f)
                verticalLineToRelative(0.8867f)
                horizontalLineToRelative(3.8418f)
                lineTo(11.4785f, 0.0f)
                close()
                moveTo(12.5937f, 0.0f)
                verticalLineToRelative(0.8867f)
                horizontalLineToRelative(3.8418f)
                lineTo(16.4355f, 0.0f)
                close()
                moveTo(17.5293f, 0.0f)
                verticalLineToRelative(0.8867f)
                horizontalLineToRelative(3.8418f)
                lineTo(21.3711f, 0.0f)
                close()
                moveTo(2.4473f, 1.8945f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, false, -0.9356f, 0.9356f)
                curveToRelative(0.0f, 0.517f, 0.4185f, 0.9375f, 0.9356f, 0.9375f)
                horizontalLineToRelative(19.1054f)
                curveToRelative(0.5171f, 0.0f, 0.9356f, -0.4204f, 0.9356f, -0.9375f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, false, -0.9356f, -0.9356f)
                close()
                moveTo(2.6153f, 4.7422f)
                lineTo(2.6153f, 24.0f)
                lineTo(6.455f, 24.0f)
                lineTo(6.455f, 4.7422f)
                close()
                moveTo(7.6367f, 4.7422f)
                lineTo(7.6367f, 20.543f)
                horizontalLineToRelative(3.8418f)
                lineTo(11.4785f, 4.7422f)
                close()
                moveTo(12.5937f, 4.7422f)
                lineTo(12.5937f, 15.291f)
                horizontalLineToRelative(3.8497f)
                lineTo(16.4434f, 4.7422f)
                close()
                moveTo(17.5293f, 4.7422f)
                verticalLineToRelative(6.4941f)
                horizontalLineToRelative(3.8418f)
                lineTo(21.3711f, 4.7422f)
                close()
            }
        }
        .build()
        return _pytest!!
    }

private var _pytest: ImageVector? = null
