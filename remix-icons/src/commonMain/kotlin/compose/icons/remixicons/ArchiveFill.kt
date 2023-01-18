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

public val RemixIcons.ArchiveFill: ImageVector
    get() {
        if (_archiveFill != null) {
            return _archiveFill!!
        }
        _archiveFill = Builder(name = "ArchiveFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(10.004f)
                curveToRelative(0.0f, 0.55f, -0.445f, 0.996f, -0.993f, 0.996f)
                lineTo(3.993f, 21.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 3.0f, 20.004f)
                lineTo(3.0f, 10.0f)
                close()
                moveTo(9.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.455f, -1.0f, 0.992f, -1.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.444f, 0.992f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 4.0f)
                close()
            }
        }
        .build()
        return _archiveFill!!
    }

private var _archiveFill: ImageVector? = null
