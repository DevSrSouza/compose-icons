package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Rotate90DegreesCcw: ImageVector
    get() {
        if (_rotate90DegreesCcw != null) {
            return _rotate90DegreesCcw!!
        }
        _rotate90DegreesCcw = Builder(name = "Rotate90DegreesCcw", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.34f, 6.41f)
                lineTo(0.86f, 12.9f)
                lineToRelative(6.49f, 6.48f)
                lineToRelative(6.49f, -6.48f)
                lineToRelative(-6.5f, -6.49f)
                close()
                moveTo(3.69f, 12.9f)
                lineToRelative(3.66f, -3.66f)
                lineTo(11.0f, 12.9f)
                lineToRelative(-3.66f, 3.66f)
                lineToRelative(-3.65f, -3.66f)
                close()
                moveTo(19.36f, 6.64f)
                curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f)
                lineTo(13.0f, 0.76f)
                lineTo(8.76f, 5.0f)
                lineTo(13.0f, 9.24f)
                lineTo(13.0f, 6.0f)
                curveToRelative(1.79f, 0.0f, 3.58f, 0.68f, 4.95f, 2.05f)
                curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0.0f, 9.9f)
                curveTo(16.58f, 19.32f, 14.79f, 20.0f, 13.0f, 20.0f)
                curveToRelative(-0.97f, 0.0f, -1.94f, -0.21f, -2.84f, -0.61f)
                lineToRelative(-1.49f, 1.49f)
                curveTo(10.02f, 21.62f, 11.51f, 22.0f, 13.0f, 22.0f)
                curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f)
                curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f)
                close()
            }
        }
        .build()
        return _rotate90DegreesCcw!!
    }

private var _rotate90DegreesCcw: ImageVector? = null
