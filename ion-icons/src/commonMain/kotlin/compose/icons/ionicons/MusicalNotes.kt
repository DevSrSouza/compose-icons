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

public val IonIcons.MusicalNotes: ImageVector
    get() {
        if (_musicalNotes != null) {
            return _musicalNotes!!
        }
        _musicalNotes = Builder(name = "MusicalNotes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.84f, 37.37f)
                arcToRelative(25.86f, 25.86f, 0.0f, false, false, -22.6f, -4.46f)
                lineTo(199.92f, 86.49f)
                arcTo(32.3f, 32.3f, 0.0f, false, false, 176.0f, 118.0f)
                verticalLineToRelative(226.0f)
                curveToRelative(0.0f, 6.74f, -4.36f, 12.56f, -11.11f, 14.83f)
                lineToRelative(-0.12f, 0.05f)
                lineToRelative(-52.0f, 18.0f)
                curveTo(92.88f, 383.53f, 80.0f, 402.0f, 80.0f, 423.91f)
                arcToRelative(55.54f, 55.54f, 0.0f, false, false, 23.23f, 45.63f)
                arcTo(54.78f, 54.78f, 0.0f, false, false, 135.34f, 480.0f)
                arcToRelative(55.82f, 55.82f, 0.0f, false, false, 17.75f, -2.93f)
                lineToRelative(0.38f, -0.13f)
                lineTo(175.31f, 469.0f)
                arcTo(47.84f, 47.84f, 0.0f, false, false, 208.0f, 423.91f)
                verticalLineToRelative(-212.0f)
                curveToRelative(0.0f, -7.29f, 4.77f, -13.21f, 12.16f, -15.07f)
                lineToRelative(0.21f, -0.06f)
                lineTo(395.0f, 150.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, 3.86f)
                verticalLineTo(295.93f)
                curveToRelative(0.0f, 6.75f, -4.25f, 12.38f, -11.11f, 14.68f)
                lineToRelative(-0.25f, 0.09f)
                lineToRelative(-50.89f, 18.11f)
                arcTo(49.09f, 49.09f, 0.0f, false, false, 304.0f, 375.92f)
                arcToRelative(55.67f, 55.67f, 0.0f, false, false, 23.23f, 45.8f)
                arcToRelative(54.63f, 54.63f, 0.0f, false, false, 49.88f, 7.35f)
                lineToRelative(0.36f, -0.12f)
                lineTo(399.31f, 421.0f)
                arcTo(47.83f, 47.83f, 0.0f, false, false, 432.0f, 375.92f)
                verticalLineTo(58.0f)
                arcTo(25.74f, 25.74f, 0.0f, false, false, 421.84f, 37.37f)
                close()
            }
        }
        .build()
        return _musicalNotes!!
    }

private var _musicalNotes: ImageVector? = null
