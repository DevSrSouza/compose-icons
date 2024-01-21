package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandNuxt: ImageVector
    get() {
        if (_brandNuxt != null) {
            return _brandNuxt!!
        }
        _brandNuxt = Builder(name = "BrandNuxt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.146f, 8.583f)
                lineToRelative(-1.3f, -2.09f)
                arcToRelative(1.046f, 1.046f, 0.0f, false, false, -1.786f, 0.017f)
                lineToRelative(-5.91f, 9.908f)
                arcToRelative(1.046f, 1.046f, 0.0f, false, false, 0.897f, 1.582f)
                horizontalLineToRelative(3.913f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.043f, 18.0f)
                curveToRelative(0.743f, 0.0f, 1.201f, -0.843f, 0.82f, -1.505f)
                lineToRelative(-4.044f, -7.013f)
                arcToRelative(0.936f, 0.936f, 0.0f, false, false, -1.638f, 0.0f)
                lineToRelative(-4.043f, 7.013f)
                curveToRelative(-0.382f, 0.662f, 0.076f, 1.505f, 0.819f, 1.505f)
                horizontalLineToRelative(8.086f)
                close()
            }
        }
        .build()
        return _brandNuxt!!
    }

private var _brandNuxt: ImageVector? = null
