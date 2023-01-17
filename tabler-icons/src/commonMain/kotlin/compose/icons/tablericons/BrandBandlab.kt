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

public val TablerIcons.BrandBandlab: ImageVector
    get() {
        if (_brandBandlab != null) {
            return _brandBandlab!!
        }
        _brandBandlab = Builder(name = "BrandBandlab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.885f, 7.0f)
                lineToRelative(-2.536f, 4.907f)
                curveToRelative(-2.021f, 3.845f, -2.499f, 8.775f, 3.821f, 9.093f)
                horizontalLineToRelative(6.808f)
                curveToRelative(4.86f, -0.207f, 7.989f, -2.975f, 4.607f, -9.093f)
                lineToRelative(-2.988f, -4.907f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.078f, 4.0f)
                horizontalLineToRelative(-5.136f)
                lineToRelative(3.678f, 8.768f)
                curveToRelative(0.547f, 1.14f, 0.847f, 1.822f, 0.162f, 2.676f)
                curveToRelative(-0.053f, 0.093f, -1.332f, 1.907f, -3.053f, 1.495f)
                curveToRelative(-0.825f, -0.187f, -1.384f, -0.926f, -1.32f, -1.74f)
                curveToRelative(0.04f, -0.91f, 0.62f, -1.717f, 1.488f, -2.074f)
                arcToRelative(4.463f, 4.463f, 0.0f, false, true, 2.723f, -0.358f)
            }
        }
        .build()
        return _brandBandlab!!
    }

private var _brandBandlab: ImageVector? = null
