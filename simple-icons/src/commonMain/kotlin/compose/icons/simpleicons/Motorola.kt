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

public val SimpleIcons.Motorola: ImageVector
    get() {
        if (_motorola != null) {
            return _motorola!!
        }
        _motorola = Builder(name = "Motorola", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveTo(24.002f, 5.375f, 18.632f, 0.002f, 12.007f, 0.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(19.327f, 18.065f)
                reflectiveCurveToRelative(-0.581f, -2.627f, -1.528f, -4.197f)
                curveToRelative(-0.514f, -0.857f, -1.308f, -1.553f, -2.368f, -1.532f)
                curveToRelative(-0.745f, 0.0f, -1.399f, 0.423f, -2.2f, 1.553f)
                curveToRelative(-0.469f, 0.77f, -0.882f, 1.573f, -1.235f, 2.403f)
                curveToRelative(0.0f, 0.0f, -0.29f, -0.675f, -0.63f, -1.343f)
                arcToRelative(8.038f, 8.038f, 0.0f, false, false, -0.605f, -1.049f)
                curveToRelative(-0.804f, -1.13f, -1.455f, -1.539f, -2.2f, -1.553f)
                curveToRelative(-1.049f, -0.021f, -1.854f, 0.675f, -2.364f, 1.528f)
                curveToRelative(-0.948f, 1.574f, -1.528f, 4.197f, -1.528f, 4.197f)
                horizontalLineToRelative(-0.864f)
                lineToRelative(4.606f, -15.12f)
                lineToRelative(3.56f, 11.804f)
                lineToRelative(0.024f, 0.021f)
                lineToRelative(0.024f, -0.021f)
                lineToRelative(3.56f, -11.804f)
                lineToRelative(4.61f, 15.113f)
                horizontalLineToRelative(-0.862f)
                close()
            }
        }
        .build()
        return _motorola!!
    }

private var _motorola: ImageVector? = null
