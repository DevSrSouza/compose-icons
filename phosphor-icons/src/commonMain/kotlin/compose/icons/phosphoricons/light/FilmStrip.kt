package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) {
            return _filmStrip!!
        }
        _filmStrip = Builder(name = "FilmStrip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(38.0f, 86.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(84.0f)
                lineTo(38.0f, 170.0f)
                close()
                moveTo(134.0f, 74.0f)
                lineTo(134.0f, 54.0f)
                horizontalLineToRelative(36.0f)
                lineTo(170.0f, 74.0f)
                close()
                moveTo(122.0f, 74.0f)
                lineTo(86.0f, 74.0f)
                lineTo(86.0f, 54.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(122.0f, 182.0f)
                verticalLineToRelative(20.0f)
                lineTo(86.0f, 202.0f)
                lineTo(86.0f, 182.0f)
                close()
                moveTo(134.0f, 182.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(20.0f)
                lineTo(134.0f, 202.0f)
                close()
                moveTo(134.0f, 170.0f)
                lineTo(134.0f, 86.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(84.0f)
                close()
                moveTo(218.0f, 56.0f)
                lineTo(218.0f, 74.0f)
                lineTo(182.0f, 74.0f)
                lineTo(182.0f, 54.0f)
                horizontalLineToRelative(34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 218.0f, 56.0f)
                close()
                moveTo(40.0f, 54.0f)
                lineTo(74.0f, 54.0f)
                lineTo(74.0f, 74.0f)
                lineTo(38.0f, 74.0f)
                lineTo(38.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
                moveTo(38.0f, 200.0f)
                lineTo(38.0f, 182.0f)
                lineTo(74.0f, 182.0f)
                verticalLineToRelative(20.0f)
                lineTo(40.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 200.0f)
                close()
                moveTo(216.0f, 202.0f)
                lineTo(182.0f, 202.0f)
                lineTo(182.0f, 182.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f)
                close()
            }
        }
        .build()
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
