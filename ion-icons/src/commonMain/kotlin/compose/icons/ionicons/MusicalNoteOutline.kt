package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MusicalNoteOutline: ImageVector
    get() {
        if (_musicalNoteOutline != null) {
            return _musicalNoteOutline!!
        }
        _musicalNoteOutline = Builder(name = "MusicalNoteOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 343.31f)
                verticalLineTo(424.0f)
                arcToRelative(32.28f, 32.28f, 0.0f, false, true, -21.88f, 30.65f)
                lineToRelative(-21.47f, 7.23f)
                curveToRelative(-25.9f, 8.71f, -52.65f, -10.75f, -52.65f, -38.32f)
                horizontalLineToRelative(0.0f)
                arcTo(34.29f, 34.29f, 0.0f, false, true, 167.25f, 391.0f)
                lineToRelative(50.87f, -17.12f)
                arcTo(32.29f, 32.29f, 0.0f, false, false, 240.0f, 343.24f)
                verticalLineTo(92.0f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, true, 12.06f, -15.66f)
                lineTo(360.49f, 48.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 368.0f, 54.0f)
                verticalLineToRelative(57.76f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, true, -12.12f, 15.67f)
                lineToRelative(-91.64f, 23.13f)
                arcTo(32.25f, 32.25f, 0.0f, false, false, 240.0f, 181.91f)
                verticalLineTo(221.3f)
            }
        }
        .build()
        return _musicalNoteOutline!!
    }

private var _musicalNoteOutline: ImageVector? = null
