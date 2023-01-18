package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.4f, 52.4f)
                curveTo(175.0f, 28.6f, 153.8f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveTo(81.0f, 28.6f, 66.6f, 52.4f)
                curveTo(54.6f, 72.1f, 48.0f, 99.0f, 48.0f, 128.0f)
                reflectiveCurveToRelative(6.6f, 55.8f, 18.6f, 75.6f)
                curveTo(81.0f, 227.4f, 102.2f, 240.0f, 128.0f, 240.0f)
                reflectiveCurveToRelative(47.0f, -12.6f, 61.4f, -36.4f)
                curveTo(201.4f, 183.8f, 208.0f, 157.0f, 208.0f, 128.0f)
                reflectiveCurveTo(201.4f, 72.1f, 189.4f, 52.4f)
                close()
                moveTo(128.0f, 224.0f)
                curveToRelative(-44.2f, 0.0f, -64.0f, -48.2f, -64.0f, -96.0f)
                reflectiveCurveToRelative(19.8f, -96.0f, 64.0f, -96.0f)
                reflectiveCurveToRelative(64.0f, 48.2f, 64.0f, 96.0f)
                reflectiveCurveTo(172.2f, 224.0f, 128.0f, 224.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
