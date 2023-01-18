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

public val RemixIcons.ArchiveDrawerFill: ImageVector
    get() {
        if (_archiveDrawerFill != null) {
            return _archiveDrawerFill!!
        }
        _archiveDrawerFill = Builder(name = "ArchiveDrawerFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(8.002f)
                curveToRelative(0.0f, 0.551f, -0.445f, 0.998f, -0.993f, 0.998f)
                lineTo(3.993f, 22.0f)
                arcTo(0.995f, 0.995f, 0.0f, false, true, 3.0f, 21.002f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(3.0f, 2.998f)
                curveTo(3.0f, 2.447f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineToRelative(16.014f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.446f, 0.993f, 0.998f)
                lineTo(21.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                lineTo(3.0f, 2.998f)
                close()
                moveTo(9.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 16.0f)
                close()
            }
        }
        .build()
        return _archiveDrawerFill!!
    }

private var _archiveDrawerFill: ImageVector? = null
