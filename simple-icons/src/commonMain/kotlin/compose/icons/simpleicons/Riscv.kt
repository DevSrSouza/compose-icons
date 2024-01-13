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

public val SimpleIcons.Riscv: ImageVector
    get() {
        if (_riscv != null) {
            return _riscv!!
        }
        _riscv = Builder(name = "Riscv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9495f, 0.0513f)
                horizontalLineToRelative(16.9479f)
                verticalLineToRelative(6.2099f)
                lineToRelative(-10.4248f, 14.7424f)
                lineToRelative(-0.5237f, 0.7343f)
                lineToRelative(-5.7888f, -6.8415f)
                curveToRelative(4.1031f, -0.7395f, 6.2099f, -3.8965f, 6.2099f, -7.3705f)
                curveToRelative(0.0f, -3.4754f, -2.1068f, -7.0534f, -6.4204f, -7.4745f)
                close()
                moveTo(1.4752f, 13.4212f)
                lineToRelative(8.7391f, 10.5275f)
                lineTo(0.0f, 23.9487f)
                lineTo(0.0f, 3.4188f)
                horizontalLineToRelative(5.4743f)
                curveToRelative(2.9451f, 0.0f, 4.4215f, 1.9989f, 4.4215f, 4.107f)
                curveToRelative(0.0f, 2.1068f, -1.4765f, 4.2097f, -4.4215f, 4.2097f)
                lineTo(1.4752f, 11.7355f)
                verticalLineToRelative(1.6857f)
                close()
                moveTo(15.5445f, 23.9487f)
                lineTo(24.0f, 23.9487f)
                lineTo(24.0f, 12.1566f)
                lineToRelative(-7.6851f, 10.738f)
                lineToRelative(-0.7705f, 1.0541f)
                close()
            }
        }
        .build()
        return _riscv!!
    }

private var _riscv: ImageVector? = null
