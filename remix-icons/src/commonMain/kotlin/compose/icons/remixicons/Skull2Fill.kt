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

public val RemixIcons.Skull2Fill: ImageVector
    get() {
        if (_skull2Fill != null) {
            return _skull2Fill!!
        }
        _skull2Fill = Builder(name = "Skull2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                verticalLineToRelative(3.764f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.106f, 1.789f)
                lineTo(18.0f, 19.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineTo(14.95f, 23.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.044f, -0.33f)
                lineTo(15.0f, 22.5f)
                lineTo(15.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, -1.995f)
                lineTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.171f, 0.017f, 0.339f, 0.05f, 0.5f)
                lineTo(9.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-2.894f, -1.447f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 15.763f)
                lineTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(16.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _skull2Fill!!
    }

private var _skull2Fill: ImageVector? = null