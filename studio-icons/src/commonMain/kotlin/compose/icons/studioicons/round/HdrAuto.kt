package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.HdrAuto: ImageVector
    get() {
        if (_hdrAuto != null) {
            return _hdrAuto!!
        }
        _hdrAuto = Builder(name = "HdrAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.04f, 8.04f)
                lineToRelative(-0.09f, 0.0f)
                lineToRelative(-1.6f, 4.55f)
                lineToRelative(3.29f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.0f, 16.41f)
                lineToRelative(-0.78f, -2.22f)
                horizontalLineTo(9.78f)
                lineToRelative(-0.79f, 2.22f)
                curveTo(8.87f, 16.76f, 8.53f, 17.0f, 8.16f, 17.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.62f, 0.0f, -1.05f, -0.62f, -0.83f, -1.2f)
                lineToRelative(3.34f, -8.88f)
                curveTo(10.88f, 6.37f, 11.4f, 6.0f, 12.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.59f, 0.0f, 1.12f, 0.37f, 1.33f, 0.92f)
                lineToRelative(3.34f, 8.88f)
                curveToRelative(0.22f, 0.58f, -0.21f, 1.2f, -0.83f, 1.2f)
                horizontalLineToRelative(0.0f)
                curveTo(15.46f, 17.0f, 15.12f, 16.76f, 15.0f, 16.41f)
                close()
            }
        }
        .build()
        return _hdrAuto!!
    }

private var _hdrAuto: ImageVector? = null
