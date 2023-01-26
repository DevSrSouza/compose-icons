package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Style: ImageVector
    get() {
        if (_style != null) {
            return _style!!
        }
        _style = Builder(name = "Style", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.87f, 20.21f)
                verticalLineToRelative(-9.03f)
                lineToRelative(-3.19f, 7.7f)
                lineToRelative(3.19f, 1.33f)
                close()
                moveTo(22.79f, 17.78f)
                lineTo(16.31f, 2.14f)
                lineTo(5.26f, 6.71f)
                lineToRelative(6.48f, 15.64f)
                lineToRelative(11.05f, -4.57f)
                close()
                moveTo(7.88f, 8.75f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(5.88f, 21.75f)
                horizontalLineToRelative(3.45f)
                lineToRelative(-3.45f, -8.34f)
                verticalLineToRelative(8.34f)
                close()
            }
        }
        .build()
        return _style!!
    }

private var _style: ImageVector? = null
