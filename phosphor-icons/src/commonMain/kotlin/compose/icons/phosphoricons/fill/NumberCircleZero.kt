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

public val FillGroup.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) {
            return _numberCircleZero!!
        }
        _numberCircleZero = Builder(name = "NumberCircleZero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 128.0f)
                curveToRelative(0.0f, 14.9f, -5.1f, 40.0f, -24.0f, 40.0f)
                reflectiveCurveToRelative(-24.0f, -25.1f, -24.0f, -40.0f)
                reflectiveCurveToRelative(5.1f, -40.0f, 24.0f, -40.0f)
                reflectiveCurveTo(152.0f, 113.1f, 152.0f, 128.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(168.0f, 128.0f)
                curveToRelative(0.0f, -27.9f, -12.4f, -56.0f, -40.0f, -56.0f)
                reflectiveCurveToRelative(-40.0f, 28.1f, -40.0f, 56.0f)
                reflectiveCurveToRelative(12.4f, 56.0f, 40.0f, 56.0f)
                reflectiveCurveTo(168.0f, 155.9f, 168.0f, 128.0f)
                close()
            }
        }
        .build()
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
