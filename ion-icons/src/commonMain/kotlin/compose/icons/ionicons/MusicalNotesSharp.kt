package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MusicalNotesSharp: ImageVector
    get() {
        if (_musicalNotesSharp != null) {
            return _musicalNotesSharp!!
        }
        _musicalNotesSharp = Builder(name = "MusicalNotesSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.46f, 32.07f)
                curveToRelative(-23.6f, 6.53f, -205.55f, 58.81f, -250.54f, 71.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.92f, 3.83f)
                verticalLineToRelative(247.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.33f, 1.89f)
                lineToRelative(-27.85f, 9.55f)
                curveToRelative(-19.0f, 7.44f, -66.82f, 16.68f, -66.82f, 59.19f)
                curveToRelative(0.0f, 35.54f, 24.63f, 51.54f, 45.86f, 54.28f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 7.81f, 0.8f)
                curveToRelative(7.37f, 0.0f, 36.38f, -7.08f, 53.3f, -18.08f)
                curveTo(208.0f, 448.25f, 208.0f, 448.0f, 208.0f, 412.0f)
                verticalLineTo(202.0f)
                curveToRelative(0.0f, -0.9f, 0.62f, -0.84f, 1.48f, -1.07f)
                lineToRelative(188.0f, -51.92f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.53f, 2.0f)
                verticalLineTo(306.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.36f, 1.89f)
                curveToRelative(-8.9f, 3.0f, -19.23f, 6.5f, -26.48f, 9.12f)
                curveTo(341.39f, 328.68f, 304.0f, 335.65f, 304.0f, 376.0f)
                curveToRelative(0.0f, 38.51f, 28.26f, 54.58f, 46.3f, 55.83f)
                arcToRelative(87.37f, 87.37f, 0.0f, false, false, 21.33f, -1.0f)
                curveToRelative(9.0f, -1.38f, 24.09f, -5.9f, 38.14f, -14.86f)
                curveTo(432.0f, 401.79f, 432.0f, 401.51f, 432.0f, 360.0f)
                verticalLineTo(34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 429.46f, 32.07f)
                close()
            }
        }
        .build()
        return _musicalNotesSharp!!
    }

private var _musicalNotesSharp: ImageVector? = null
