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

public val SimpleIcons.K6: ImageVector
    get() {
        if (_k6 != null) {
            return _k6!!
        }
        _k6 = Builder(name = "K6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.646f)
                lineTo(0.0f, 23.646f)
                lineTo(7.99f, 6.603f)
                lineToRelative(4.813f, 3.538f)
                lineTo(19.08f, 0.354f)
                close()
                moveTo(15.2f, 19.965f)
                horizontalLineToRelative(0.052f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, false, 1.593f, -0.64f)
                arcToRelative(2.088f, 2.088f, 0.0f, false, false, 0.685f, -1.576f)
                arcToRelative(1.912f, 1.912f, 0.0f, false, false, -0.66f, -1.511f)
                arcToRelative(2.008f, 2.008f, 0.0f, false, false, -1.37f, -0.59f)
                horizontalLineToRelative(-0.04f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, false, -0.199f, 0.027f)
                lineToRelative(1.267f, -1.883f)
                lineToRelative(-1.01f, -0.705f)
                lineToRelative(-0.477f, 0.705f)
                lineToRelative(-1.22f, 1.864f)
                curveToRelative(-0.21f, 0.31f, -0.386f, 0.582f, -0.495f, 0.77f)
                curveToRelative(-0.112f, 0.2f, -0.21f, 0.41f, -0.29f, 0.625f)
                arcToRelative(1.942f, 1.942f, 0.0f, false, false, -0.138f, 0.719f)
                arcToRelative(2.086f, 2.086f, 0.0f, false, false, 0.676f, 1.558f)
                curveToRelative(0.422f, 0.411f, 0.989f, 0.641f, 1.578f, 0.64f)
                close()
                moveTo(9.835f, 17.938f)
                lineTo(11.233f, 19.916f)
                horizontalLineToRelative(1.496f)
                lineToRelative(-1.645f, -2.295f)
                lineToRelative(1.46f, -2.029f)
                lineToRelative(-0.97f, -0.671f)
                lineToRelative(-0.427f, 0.565f)
                lineToRelative(-1.314f, 1.853f)
                verticalLineToRelative(-3.725f)
                lineToRelative(-1.31f, -1.068f)
                verticalLineToRelative(7.37f)
                horizontalLineToRelative(1.31f)
                verticalLineToRelative(-1.98f)
                close()
                moveTo(15.202f, 18.73f)
                arcToRelative(0.963f, 0.963f, 0.0f, true, true, 0.0f, -1.927f)
                horizontalLineToRelative(0.009f)
                arcToRelative(0.941f, 0.941f, 0.0f, false, true, 0.679f, 0.29f)
                arcToRelative(0.897f, 0.897f, 0.0f, false, true, 0.29f, 0.668f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, true, -0.977f, 0.967f)
                close()
            }
        }
        .build()
        return _k6!!
    }

private var _k6: ImageVector? = null
