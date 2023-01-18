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

public val FillGroup.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) {
            return _numberSquareZero!!
        }
        _numberSquareZero = Builder(name = "NumberSquareZero", defaultWidth = 256.0.dp,
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
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
