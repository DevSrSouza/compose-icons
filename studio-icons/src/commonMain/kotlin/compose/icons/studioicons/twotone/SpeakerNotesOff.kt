package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SpeakerNotesOff: ImageVector
    get() {
        if (_speakerNotesOff != null) {
            return _speakerNotesOff!!
        }
        _speakerNotesOff = Builder(name = "SpeakerNotesOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 9.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(10.17f)
                lineTo(5.17f, 16.0f)
                lineTo(13.0f, 16.0f)
                lineToRelative(-5.0f, -5.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 4.0f)
                lineTo(6.66f, 4.0f)
                lineTo(10.0f, 7.34f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.34f)
                lineToRelative(1.0f, 1.0f)
                lineTo(18.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(5.0f, 5.0f)
                lineTo(20.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.34f)
                lineToRelative(1.91f, 1.91f)
                curveTo(21.39f, 17.66f, 22.0f, 16.9f, 22.0f, 16.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(4.66f, 2.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 4.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(-6.34f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.34f)
                lineToRelative(0.66f, 0.66f)
                close()
                moveTo(1.41f, 1.59f)
                lineTo(0.0f, 3.0f)
                lineToRelative(2.0f, 2.01f)
                lineTo(2.0f, 22.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(5.73f, 5.73f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.59f)
                close()
                moveTo(5.17f, 16.0f)
                lineTo(4.0f, 17.17f)
                lineTo(4.0f, 7.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(5.0f, 5.0f)
                lineTo(5.17f, 16.0f)
                close()
            }
        }
        .build()
        return _speakerNotesOff!!
    }

private var _speakerNotesOff: ImageVector? = null
