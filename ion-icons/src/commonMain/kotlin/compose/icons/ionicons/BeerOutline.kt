package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BeerOutline: ImageVector
    get() {
        if (_beerOutline != null) {
            return _beerOutline!!
        }
        _beerOutline = Builder(name = "BeerOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 200.0f)
                verticalLineTo(440.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(136.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, true, -40.0f, -40.0f)
                verticalLineTo(224.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 224.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, true, 56.0f, 56.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, true, -56.0f, 56.0f)
                horizontalLineTo(352.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                lineTo(224.0f, 416.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(288.0f, 256.0f)
                lineTo(288.0f, 416.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 256.0f)
                lineTo(160.0f, 416.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, 96.0f)
                curveToRelative(-13.25f, 0.0f, -29.31f, -7.31f, -38.0f, -16.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-8.0f, 22.0f, -27.0f, 32.0f, -48.0f, 32.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                arcToRelative(47.91f, 47.91f, 0.0f, false, true, 26.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(91.86f, 132.43f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 60.46f, -52.0f)
                reflectiveCurveTo(160.0f, 91.0f, 160.0f, 96.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(145.83f, 64.71f)
                curveTo(163.22f, 44.89f, 187.57f, 32.0f, 216.0f, 32.0f)
                curveToRelative(52.38f, 0.0f, 94.0f, 42.84f, 94.0f, 95.21f)
                arcTo(95.0f, 95.0f, 0.0f, false, true, 308.33f, 145.0f)
            }
        }
        .build()
        return _beerOutline!!
    }

private var _beerOutline: ImageVector? = null
