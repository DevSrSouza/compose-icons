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

public val SimpleIcons.Razorpay: ImageVector
    get() {
        if (_razorpay != null) {
            return _razorpay!!
        }
        _razorpay = Builder(name = "Razorpay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.436f, 0.0f)
                lineToRelative(-11.91f, 7.773f)
                lineToRelative(-1.174f, 4.276f)
                lineToRelative(6.625f, -4.297f)
                lineTo(11.65f, 24.0f)
                horizontalLineToRelative(4.391f)
                lineToRelative(6.395f, -24.0f)
                close()
                moveTo(14.26f, 10.098f)
                lineTo(3.389f, 17.166f)
                lineTo(1.564f, 24.0f)
                horizontalLineToRelative(9.008f)
                lineToRelative(3.688f, -13.902f)
                close()
            }
        }
        .build()
        return _razorpay!!
    }

private var _razorpay: ImageVector? = null
