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

public val RemixIcons.CollageLine: ImageVector
    get() {
        if (_collageLine != null) {
            return _collageLine!!
        }
        _collageLine = Builder(name = "CollageLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(11.189f, 13.158f)
                lineTo(5.0f, 14.25f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(7.218f)
                lineToRelative(-1.03f, -5.842f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-7.219f)
                lineToRelative(2.468f, 14.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 5.0f)
                close()
                moveTo(9.75f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(7.218f)
                lineToRelative(5.842f, -1.03f)
                lineTo(9.75f, 5.0f)
                close()
            }
        }
        .build()
        return _collageLine!!
    }

private var _collageLine: ImageVector? = null