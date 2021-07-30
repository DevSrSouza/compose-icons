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

public val SimpleIcons.Bigcartel: ImageVector
    get() {
        if (_bigcartel != null) {
            return _bigcartel!!
        }
        _bigcartel = Builder(name = "Bigcartel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.068f)
                verticalLineToRelative(-1.006f)
                curveToRelative(0.0f, -0.63f, 0.252f, -1.256f, 0.88f, -1.508f)
                lineToRelative(7.79f, -4.9f)
                curveToRelative(0.503f, -0.252f, 0.755f, -0.88f, 0.755f, -1.51f)
                verticalLineTo(0.0f)
                lineTo(12.0f, 6.03f)
                lineTo(2.575f, 0.0f)
                verticalLineToRelative(12.69f)
                curveToRelative(0.0f, 3.394f, 1.51f, 6.284f, 4.02f, 7.917f)
                lineTo(11.875f, 24.0f)
                lineToRelative(5.28f, -3.393f)
                curveToRelative(2.513f, -1.51f, 4.02f, -4.398f, 4.02f, -7.916f)
                verticalLineTo(7.036f)
                lineTo(12.0f, 13.068f)
                close()
            }
        }
        .build()
        return _bigcartel!!
    }

private var _bigcartel: ImageVector? = null
