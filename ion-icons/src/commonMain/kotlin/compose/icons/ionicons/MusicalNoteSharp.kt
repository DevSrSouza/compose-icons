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

public val IonIcons.MusicalNoteSharp: ImageVector
    get() {
        if (_musicalNoteSharp != null) {
            return _musicalNoteSharp!!
        }
        _musicalNoteSharp = Builder(name = "MusicalNoteSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.55f, 32.05f)
                curveToRelative(-18.13f, 4.28f, -126.57f, 31.07f, -156.0f, 38.19f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 224.0f, 72.18f)
                verticalLineTo(353.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.32f, 1.88f)
                lineTo(182.0f, 369.88f)
                curveToRelative(-29.82f, 10.66f, -54.0f, 18.94f, -54.0f, 59.06f)
                curveToRelative(0.0f, 32.47f, 23.53f, 47.18f, 37.95f, 50.0f)
                arcToRelative(81.77f, 81.77f, 0.0f, false, false, 15.0f, 1.08f)
                curveToRelative(8.89f, 0.0f, 31.0f, -3.59f, 47.52f, -14.24f)
                curveTo(256.0f, 448.0f, 256.0f, 448.0f, 256.0f, 415.93f)
                verticalLineTo(169.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.49f, -1.94f)
                lineToRelative(125.0f, -33.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.49f, -1.94f)
                verticalLineTo(34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 381.55f, 32.05f)
                close()
            }
        }
        .build()
        return _musicalNoteSharp!!
    }

private var _musicalNoteSharp: ImageVector? = null
