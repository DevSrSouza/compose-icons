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

public val SimpleIcons.Vonage: ImageVector
    get() {
        if (_vonage != null) {
            return _vonage!!
        }
        _vonage = Builder(name = "Vonage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.279f, 11.617f)
                lineToRelative(-4.54f, -10.07f)
                lineTo(0.0f, 1.547f)
                lineToRelative(6.797f, 15.296f)
                arcToRelative(0.084f, 0.084f, 0.0f, false, false, 0.153f, 0.0f)
                close()
                moveTo(19.177f, 1.547f)
                reflectiveCurveToRelative(-6.148f, 13.868f, -6.917f, 15.565f)
                curveToRelative(-1.838f, 4.056f, -3.2f, 5.07f, -4.588f, 5.289f)
                arcToRelative(0.026f, 0.026f, 0.0f, false, false, 0.004f, 0.052f)
                horizontalLineToRelative(4.34f)
                curveToRelative(1.911f, 0.0f, 3.219f, -1.285f, 5.06f, -5.341f)
                curveTo(17.72f, 15.694f, 24.0f, 1.547f, 24.0f, 1.547f)
                close()
            }
        }
        .build()
        return _vonage!!
    }

private var _vonage: ImageVector? = null
