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

public val TablerIcons.BrandSolidjs: ImageVector
    get() {
        if (_brandSolidjs != null) {
            return _brandSolidjs!!
        }
        _brandSolidjs = Builder(name = "BrandSolidjs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 17.5f)
                curveToRelative(4.667f, 3.0f, 8.0f, 4.5f, 10.0f, 4.5f)
                curveToRelative(2.5f, 0.0f, 4.0f, -1.5f, 4.0f, -3.5f)
                reflectiveCurveToRelative(-1.5f, -3.5f, -4.0f, -3.5f)
                curveToRelative(-2.0f, 0.0f, -5.333f, 0.833f, -10.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 13.5f)
                curveToRelative(4.667f, -1.667f, 8.0f, -2.5f, 10.0f, -2.5f)
                curveToRelative(2.5f, 0.0f, 4.0f, 1.5f, 4.0f, 3.5f)
                curveToRelative(0.0f, 0.738f, -0.204f, 1.408f, -0.588f, 1.96f)
                lineToRelative(-2.883f, 3.825f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 6.5f)
                curveToRelative(-4.0f, -3.0f, -8.0f, -4.5f, -10.0f, -4.5f)
                curveToRelative(-2.04f, 0.0f, -2.618f, 0.463f, -3.419f, 1.545f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 17.5f)
                lineToRelative(3.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 6.5f)
                lineToRelative(-3.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.581f, 3.545f)
                lineToRelative(-2.953f, 3.711f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.416f, 12.662f)
                curveToRelative(-1.51f, -0.476f, -2.416f, -1.479f, -2.416f, -3.162f)
                curveToRelative(0.0f, -2.5f, 1.5f, -3.5f, 4.0f, -3.5f)
                curveToRelative(1.688f, 0.0f, 5.087f, 1.068f, 8.198f, 3.204f)
                arcToRelative(114.76f, 114.76f, 0.0f, false, true, 1.802f, 1.296f)
                lineToRelative(-2.302f, 0.785f)
            }
        }
        .build()
        return _brandSolidjs!!
    }

private var _brandSolidjs: ImageVector? = null
