package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SurroundSoundLine: ImageVector
    get() {
        if (_surroundSoundLine != null) {
            return _surroundSoundLine!!
        }
        _surroundSoundLine = Builder(name = "SurroundSoundLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(7.05f, 7.121f)
                lineToRelative(1.414f, 1.415f)
                arcTo(4.984f, 4.984f, 0.0f, false, false, 7.0f, 12.07f)
                curveToRelative(0.0f, 1.38f, 0.56f, 2.63f, 1.464f, 3.536f)
                lineTo(7.05f, 17.02f)
                arcTo(6.978f, 6.978f, 0.0f, false, true, 5.0f, 12.07f)
                curveToRelative(0.0f, -1.933f, 0.784f, -3.683f, 2.05f, -4.95f)
                close()
                moveTo(16.95f, 7.121f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, true, 2.05f, 4.95f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, true, -2.05f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                arcTo(4.984f, 4.984f, 0.0f, false, false, 17.0f, 12.07f)
                curveToRelative(0.0f, -1.38f, -0.56f, -2.63f, -1.464f, -3.535f)
                lineTo(16.95f, 7.12f)
                close()
                moveTo(12.0f, 13.071f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(12.0f, 15.071f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _surroundSoundLine!!
    }

private var _surroundSoundLine: ImageVector? = null
