package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.StorefrontOutline: ImageVector
    get() {
        if (_storefrontOutline != null) {
            return _storefrontOutline!!
        }
        _storefrontOutline = Builder(name = "StorefrontOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 448.0f)
                lineTo(448.0f, 240.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 240.0f)
                lineTo(64.0f, 448.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(382.47f, 48.0f)
                horizontalLineTo(129.53f)
                curveTo(107.74f, 48.0f, 88.06f, 60.0f, 79.6f, 78.46f)
                lineTo(36.3f, 173.0f)
                curveToRelative(-14.58f, 31.81f, 9.63f, 67.85f, 47.19f, 69.0f)
                quadToRelative(1.0f, 0.0f, 2.0f, 0.0f)
                curveToRelative(31.4f, 0.0f, 56.85f, -25.18f, 56.85f, -52.23f)
                curveToRelative(0.0f, 27.0f, 25.46f, 52.23f, 56.86f, 52.23f)
                reflectiveCurveTo(256.0f, 218.62f, 256.0f, 189.77f)
                curveToRelative(0.0f, 27.0f, 25.45f, 52.23f, 56.85f, 52.23f)
                reflectiveCurveToRelative(56.86f, -23.38f, 56.86f, -52.23f)
                curveToRelative(0.0f, 28.85f, 25.45f, 52.23f, 56.85f, 52.23f)
                quadToRelative(1.0f, 0.0f, 1.95f, 0.0f)
                curveToRelative(37.56f, -1.17f, 61.77f, -37.21f, 47.19f, -69.0f)
                lineTo(432.4f, 78.46f)
                curveTo(423.94f, 60.0f, 404.26f, 48.0f, 382.47f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 464.0f)
                lineTo(480.0f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(136.0f, 288.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                horizontalLineTo(112.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                verticalLineTo(312.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 136.0f, 288.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(288.0f, 464.0f)
                verticalLineTo(312.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineTo(464.0f)
            }
        }
        .build()
        return _storefrontOutline!!
    }

private var _storefrontOutline: ImageVector? = null
