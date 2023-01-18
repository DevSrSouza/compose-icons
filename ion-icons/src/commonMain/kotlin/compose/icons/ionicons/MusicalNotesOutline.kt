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

public val IonIcons.MusicalNotesOutline: ImageVector
    get() {
        if (_musicalNotesOutline != null) {
            return _musicalNotesOutline!!
        }
        _musicalNotesOutline = Builder(name = "MusicalNotesOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 218.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -14.84f, 10.0f, -27.0f, 24.24f, -30.59f)
                lineToRelative(174.59f, -46.68f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 416.0f, 154.0f)
                verticalLineTo(176.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 295.94f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 13.91f, -8.93f, 25.59f, -22.0f, 30.0f)
                lineToRelative(-22.0f, 8.0f)
                curveToRelative(-25.9f, 8.72f, -52.0f, -10.42f, -52.0f, -38.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(33.37f, 33.37f, 0.0f, false, true, 23.0f, -32.0f)
                lineToRelative(51.0f, -18.15f)
                curveToRelative(13.07f, -4.4f, 22.0f, -15.94f, 22.0f, -29.85f)
                verticalLineTo(58.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -12.6f, -9.61f)
                lineTo(204.0f, 102.0f)
                arcToRelative(16.48f, 16.48f, 0.0f, false, false, -12.0f, 16.0f)
                verticalLineToRelative(226.0f)
                curveToRelative(0.0f, 13.91f, -8.93f, 25.6f, -22.0f, 30.0f)
                lineToRelative(-52.0f, 18.0f)
                curveToRelative(-13.88f, 4.68f, -22.0f, 17.22f, -22.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 27.58f, 26.52f, 46.55f, 52.0f, 38.0f)
                lineToRelative(22.0f, -8.0f)
                curveToRelative(13.07f, -4.4f, 22.0f, -16.08f, 22.0f, -30.0f)
                verticalLineToRelative(-80.0f)
            }
        }
        .build()
        return _musicalNotesOutline!!
    }

private var _musicalNotesOutline: ImageVector? = null
