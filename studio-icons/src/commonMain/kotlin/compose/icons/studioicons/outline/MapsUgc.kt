package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MapsUgc: ImageVector
    get() {
        if (_mapsUgc != null) {
            return _mapsUgc!!
        }
        _mapsUgc = Builder(name = "MapsUgc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-1.18f, 0.0f, -2.34f, -0.26f, -3.43f, -0.78f)
                curveToRelative(-0.27f, -0.13f, -0.56f, -0.19f, -0.86f, -0.19f)
                curveToRelative(-0.19f, 0.0f, -0.38f, 0.03f, -0.56f, 0.08f)
                lineToRelative(-3.2f, 0.94f)
                lineToRelative(0.94f, -3.2f)
                curveToRelative(0.14f, -0.47f, 0.1f, -0.98f, -0.11f, -1.42f)
                curveTo(4.26f, 14.34f, 4.0f, 13.18f, 4.0f, 12.0f)
                curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.54f, 0.36f, 2.98f, 0.97f, 4.29f)
                lineTo(1.0f, 23.0f)
                lineToRelative(6.71f, -1.97f)
                curveTo(9.02f, 21.64f, 10.46f, 22.0f, 12.0f, 22.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                lineTo(12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 8.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mapsUgc!!
    }

private var _mapsUgc: ImageVector? = null
