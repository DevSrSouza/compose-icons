package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TapAndPlay: ImageVector
    get() {
        if (_tapAndPlay != null) {
            return _tapAndPlay!!
        }
        _tapAndPlay = Builder(name = "TapAndPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(2.0f, 20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -6.08f, -4.92f, -11.0f, -11.0f, -11.0f)
                close()
                moveTo(5.0f, 1.0f)
                verticalLineToRelative(9.37f)
                curveToRelative(0.69f, 0.16f, 1.36f, 0.37f, 2.0f, 0.64f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(0.52f, 1.25f, 0.84f, 2.59f, 0.95f, 4.0f)
                lineTo(19.0f, 22.0f)
                lineTo(19.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                close()
            }
        }
        .build()
        return _tapAndPlay!!
    }

private var _tapAndPlay: ImageVector? = null
