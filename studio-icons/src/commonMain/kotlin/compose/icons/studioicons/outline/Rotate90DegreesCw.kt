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

public val OutlineGroup.Rotate90DegreesCw: ImageVector
    get() {
        if (_rotate90DegreesCw != null) {
            return _rotate90DegreesCw!!
        }
        _rotate90DegreesCw = Builder(name = "Rotate90DegreesCw", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f)
                curveToRelative(1.76f, 0.0f, 3.4f, -0.51f, 4.79f, -1.38f)
                lineToRelative(-1.46f, -1.46f)
                curveTo(13.34f, 19.69f, 12.2f, 20.0f, 11.0f, 20.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                horizontalLineToRelative(0.17f)
                lineTo(9.59f, 7.59f)
                lineTo(11.0f, 9.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(9.58f, 2.41f)
                lineTo(11.17f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(6.03f, 4.0f, 2.0f, 8.03f, 2.0f, 13.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(11.0f, 13.0f)
                close()
                moveTo(17.0f, 16.17f)
                lineTo(13.83f, 13.0f)
                lineTo(17.0f, 9.83f)
                lineTo(20.17f, 13.0f)
                lineTo(17.0f, 16.17f)
                close()
            }
        }
        .build()
        return _rotate90DegreesCw!!
    }

private var _rotate90DegreesCw: ImageVector? = null
