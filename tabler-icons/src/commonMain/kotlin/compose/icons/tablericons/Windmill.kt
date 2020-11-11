package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Windmill: VectorAsset
    get() {
        if (_windmill != null) {
            return _windmill!!
        }
        _windmill = VectorAssetBuilder(name = "Windmill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.01f, 5.0f, -4.5f)
                reflectiveCurveTo(14.76f, 3.0f, 12.0f, 3.0f)
                verticalLineToRelative(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(0.0f, 2.76f, 2.01f, 5.0f, 4.5f, 5.0f)
                reflectiveCurveToRelative(4.5f, -2.24f, 4.5f, -5.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.01f, -5.0f, 4.5f)
                reflectiveCurveTo(9.24f, 21.0f, 12.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(0.0f, -2.76f, -2.01f, -5.0f, -4.5f, -5.0f)
                reflectiveCurveTo(3.0f, 9.24f, 3.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _windmill!!
    }

private var _windmill: VectorAsset? = null
