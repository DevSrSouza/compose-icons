package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.WeightHanging: ImageVector
    get() {
        if (_weightHanging != null) {
            return _weightHanging!!
        }
        _weightHanging = Builder(name = "WeightHanging", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.28f, 445.86f)
                lineToRelative(-73.03f, -292.13f)
                curveToRelative(-3.8f, -15.19f, -16.44f, -25.72f, -30.87f, -25.72f)
                horizontalLineToRelative(-60.25f)
                curveToRelative(3.57f, -10.05f, 5.88f, -20.72f, 5.88f, -32.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 42.98f, -96.0f, 96.0f)
                curveToRelative(0.0f, 11.28f, 2.3f, 21.95f, 5.88f, 32.0f)
                horizontalLineToRelative(-60.25f)
                curveToRelative(-14.43f, 0.0f, -27.08f, 10.54f, -30.87f, 25.72f)
                lineTo(1.72f, 445.86f)
                curveTo(-6.61f, 479.17f, 16.38f, 512.0f, 48.03f, 512.0f)
                horizontalLineToRelative(415.95f)
                curveToRelative(31.64f, 0.0f, 54.63f, -32.83f, 46.3f, -66.14f)
                close()
                moveTo(256.0f, 128.0f)
                curveToRelative(-17.64f, 0.0f, -32.0f, -14.36f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.36f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.36f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.36f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _weightHanging!!
    }

private var _weightHanging: ImageVector? = null
