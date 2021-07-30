package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.894f, 0.0f, -1.662f, -0.857f, -1.761f, -2.0f)
                curveToRelative(-0.296f, -3.45f, -0.749f, -6.0f, -2.749f, -6.0f)
                reflectiveCurveToRelative(-2.5f, 3.582f, -2.5f, 8.0f)
                reflectiveCurveToRelative(-0.5f, 8.0f, -2.5f, 8.0f)
                reflectiveCurveToRelative(-2.452f, -2.547f, -2.749f, -6.0f)
                curveToRelative(-0.1f, -1.147f, -0.867f, -2.0f, -1.763f, -2.0f)
                horizontalLineToRelative(-2.0f)
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
