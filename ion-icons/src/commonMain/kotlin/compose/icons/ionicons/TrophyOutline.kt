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

public val IonIcons.TrophyOutline: ImageVector
    get() {
        if (_trophyOutline != null) {
            return _trophyOutline!!
        }
        _trophyOutline = Builder(name = "TrophyOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 464.0f)
                lineTo(336.0f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 464.0f)
                lineTo(256.0f, 336.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 224.0f)
                curveToRelative(0.0f, -50.64f, -0.08f, -134.63f, -0.12f, -160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineToRelative(-223.79f, 0.26f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 15.95f)
                curveToRelative(0.0f, 30.58f, -0.13f, 129.17f, -0.13f, 159.79f)
                curveToRelative(0.0f, 64.28f, 83.0f, 112.0f, 128.0f, 112.0f)
                reflectiveCurveTo(384.0f, 288.28f, 384.0f, 224.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                horizontalLineTo(48.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 55.22f, 33.55f, 112.0f, 80.0f, 112.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 55.22f, -33.55f, 112.0f, -80.0f, 112.0f)
            }
        }
        .build()
        return _trophyOutline!!
    }

private var _trophyOutline: ImageVector? = null
