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

public val OutlineGroup.HdrAuto: ImageVector
    get() {
        if (_hdrAuto != null) {
            return _hdrAuto!!
        }
        _hdrAuto = Builder(name = "HdrAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(11.01f, 6.0f)
                lineTo(6.88f, 17.0f)
                horizontalLineToRelative(1.9f)
                lineToRelative(1.0f, -2.81f)
                horizontalLineToRelative(4.44f)
                lineTo(15.21f, 17.0f)
                horizontalLineToRelative(1.9f)
                lineTo(12.98f, 6.0f)
                horizontalLineTo(11.01f)
                close()
                moveTo(10.35f, 12.59f)
                lineToRelative(1.6f, -4.55f)
                horizontalLineToRelative(0.09f)
                lineToRelative(1.6f, 4.55f)
                horizontalLineTo(10.35f)
                close()
            }
        }
        .build()
        return _hdrAuto!!
    }

private var _hdrAuto: ImageVector? = null
