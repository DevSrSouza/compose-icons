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

public val IonIcons.WalkOutline: ImageVector
    get() {
        if (_walkOutline != null) {
            return _walkOutline!!
        }
        _walkOutline = Builder(name = "WalkOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(314.21f, 482.32f)
                lineTo(257.44f, 367.58f)
                lineToRelative(-44.89f, -57.39f)
                arcToRelative(72.82f, 72.82f, 0.0f, false, true, -10.13f, -37.05f)
                verticalLineTo(144.0f)
                horizontalLineToRelative(15.67f)
                arcToRelative(40.22f, 40.22f, 0.0f, false, true, 40.23f, 40.22f)
                verticalLineTo(367.58f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(127.9f, 293.05f)
                verticalLineTo(218.53f)
                reflectiveCurveTo(165.16f, 144.0f, 202.42f, 144.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(370.1f, 274.42f)
                lineTo(304.0f, 231.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(170.53f, 478.36f)
                lineTo(224.0f, 400.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(258.32f, 69.48f)
                moveToRelative(-37.26f, 0.0f)
                arcToRelative(37.26f, 37.26f, 0.0f, true, true, 74.52f, 0.0f)
                arcToRelative(37.26f, 37.26f, 0.0f, true, true, -74.52f, 0.0f)
            }
        }
        .build()
        return _walkOutline!!
    }

private var _walkOutline: ImageVector? = null
