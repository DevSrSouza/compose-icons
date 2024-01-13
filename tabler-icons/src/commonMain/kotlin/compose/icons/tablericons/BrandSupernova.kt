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

public val TablerIcons.BrandSupernova: ImageVector
    get() {
        if (_brandSupernova != null) {
            return _brandSupernova!!
        }
        _brandSupernova = Builder(name = "BrandSupernova", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.038f, 0.0f, 5.5f, -1.343f, 5.5f, -3.0f)
                reflectiveCurveToRelative(-2.462f, -3.0f, -5.5f, -3.0f)
                curveToRelative(-1.836f, 0.0f, -3.462f, 0.49f, -4.46f, 1.245f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.038f, 0.0f, -5.5f, 1.343f, -5.5f, 3.0f)
                reflectiveCurveToRelative(2.462f, 3.0f, 5.5f, 3.0f)
                curveToRelative(1.844f, 0.0f, 3.476f, -0.495f, 4.474f, -1.255f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.038f, -1.343f, -5.5f, -3.0f, -5.5f)
                reflectiveCurveToRelative(-3.0f, 2.462f, -3.0f, 5.5f)
                curveToRelative(0.0f, 1.833f, 0.49f, 3.457f, 1.241f, 4.456f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 3.038f, 1.343f, 5.5f, 3.0f, 5.5f)
                reflectiveCurveToRelative(3.0f, -2.462f, 3.0f, -5.5f)
                curveToRelative(0.0f, -1.842f, -0.494f, -3.472f, -1.252f, -4.47f)
            }
        }
        .build()
        return _brandSupernova!!
    }

private var _brandSupernova: ImageVector? = null
