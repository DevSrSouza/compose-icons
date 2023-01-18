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

public val RemixIcons.DraftFill: ImageVector
    get() {
        if (_draftFill != null) {
            return _draftFill!!
        }
        _draftFill = Builder(name = "DraftFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.757f)
                lineToRelative(-8.999f, 9.0f)
                lineToRelative(-0.006f, 4.238f)
                lineToRelative(4.246f, 0.006f)
                lineTo(21.0f, 15.242f)
                lineTo(21.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(21.778f, 8.808f)
                lineToRelative(1.414f, 1.414f)
                lineTo(15.414f, 18.0f)
                lineToRelative(-1.416f, -0.002f)
                lineToRelative(0.002f, -1.412f)
                lineToRelative(7.778f, -7.778f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _draftFill!!
    }

private var _draftFill: ImageVector? = null
