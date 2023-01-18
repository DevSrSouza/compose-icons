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

public val RemixIcons.Suitcase2Fill: ImageVector
    get() {
        if (_suitcase2Fill != null) {
            return _suitcase2Fill!!
        }
        _suitcase2Fill = Builder(name = "Suitcase2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 9.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _suitcase2Fill!!
    }

private var _suitcase2Fill: ImageVector? = null
