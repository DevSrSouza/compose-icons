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

public val IonIcons.EyedropOutline: ImageVector
    get() {
        if (_eyedropOutline != null) {
            return _eyedropOutline!!
        }
        _eyedropOutline = Builder(name = "EyedropOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(262.51f, 204.22f)
                lineTo(70.0f, 396.69f)
                curveTo(57.56f, 409.15f, 48.0f, 464.0f, 48.0f, 464.0f)
                reflectiveCurveToRelative(54.38f, -9.09f, 67.31f, -22.0f)
                lineTo(307.8f, 249.51f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(285.141f, 136.284f)
                lineTo(375.714f, 226.857f)
                arcTo(32.025f, 32.03f, 134.994f, false, true, 375.717f, 272.151f)
                lineTo(375.717f, 272.151f)
                arcTo(32.025f, 32.03f, 134.994f, false, true, 330.424f, 272.147f)
                lineTo(239.85f, 181.574f)
                arcTo(32.025f, 32.03f, 134.994f, false, true, 239.847f, 136.28f)
                lineTo(239.847f, 136.28f)
                arcTo(32.025f, 32.03f, 134.994f, false, true, 285.141f, 136.284f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(289.91f, 141.0f)
                reflectiveCurveToRelative(20.57f, 8.57f, 37.22f, -8.08f)
                lineTo(381.8f, 62.29f)
                curveToRelative(18.5f, -19.41f, 49.26f, -18.69f, 67.94f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(18.68f, 18.68f, 19.34f, 48.81f, 0.0f, 67.93f)
                lineToRelative(-70.68f, 54.67f)
                curveToRelative(-15.65f, 15.65f, -8.08f, 37.22f, -8.08f, 37.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(115.31f, 442.0f)
                reflectiveCurveToRelative(-26.48f, 17.34f, -44.56f, -0.73f)
                reflectiveCurveTo(70.0f, 396.69f, 70.0f, 396.69f)
            }
        }
        .build()
        return _eyedropOutline!!
    }

private var _eyedropOutline: ImageVector? = null
